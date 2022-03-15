package com.acn.nemo.controller;


import com.acn.nemo.entity.Department;
import com.acn.nemo.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Into saveDepartments method of DepartmentController");
        return departmentService.saveDepartments(department);
    }

    @GetMapping("/allDepartments")
    public List<Department> allDepartments(){
        log.info("Into allDepartments method of DepartmentController");
        return departmentService.allDepartments();
    }

    @GetMapping("/department/{id}")
    public Department retriveDepartment(@PathVariable ("id") Long departmentId){
        log.info("Into retriveDepartment method of DepartmentController");
        return departmentService.retriveDepartment(departmentId);
    }
}
