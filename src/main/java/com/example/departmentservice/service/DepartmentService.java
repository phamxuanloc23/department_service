package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department derpartment) {
        log.info("Inside saveDepartment of Service! ");
        return departmentRepository.save(derpartment);
    }

    public Department findDeparmentById(Long departmentId) {
        log.info("inside findDeparmentById ");
        return departmentRepository.findById(departmentId).get();
    }
}
