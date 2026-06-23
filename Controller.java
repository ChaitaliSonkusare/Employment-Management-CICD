package com.company.employee;


import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {


@GetMapping("/employee")

public String employee(){

return "Employee Management Application Running";

}


}
