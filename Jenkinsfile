pipeline {


agent any


environment {


IMAGE_NAME="employee-app"

CONTAINER_NAME="employee-container"


}



stages {



stage('Code Cloning'){


steps{


git branch: 'master',
url: 'https://github.com/ChaitaliSonkusare/Employment-Management-CICD.git'


}


}



stage('Build Application'){


steps{


echo "Building Maven Application"


sh "mvn clean package"


}


}




stage('Run Test'){


steps{


echo "Executing Test Cases"


sh "mvn test"


}


}




stage('Docker Build'){


steps{


echo "Creating Docker Image"


sh "docker build -t ${IMAGE_NAME} ."


}


}





stage('Stop Old Container'){


steps{


sh """

docker stop ${CONTAINER_NAME} || true

docker rm ${CONTAINER_NAME} || true


"""


}


}





stage('Deploy Container'){


steps{


sh """

docker run -d \
--name ${CONTAINER_NAME} \
-p 8080:8080 \
${IMAGE_NAME}


"""


}


}



}



post {


success {


echo "Pipeline Successful"


}



failure {


echo "Pipeline Failed"


}


}


}

