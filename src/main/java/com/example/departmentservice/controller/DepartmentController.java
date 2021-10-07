package com.example.departmentservice.controller;


import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDeparment(@RequestBody Department derpartment){
        log.info("inside saveDeparment method if Department controller!");
        return departmentService.saveDepartment(derpartment);
    }

    @GetMapping("/{id}")
    public Department findDeparmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDeparmentById method if Department controller!");
        return departmentService.findDeparmentById(departmentId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello friends!";
    }
}
