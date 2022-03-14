package com.acn.nemo.service.impl;

import com.acn.nemo.entity.Department;
import com.acn.nemo.repository.DepartmentRepository;
import com.acn.nemo.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartments(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> allDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department retriveDepartment(Long departmentId) {
        log.info("Into retriveDepartment method of DepartmentServiceImpl");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
