package com.acn.nemo.service;

import com.acn.nemo.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartments(Department department);

    List<Department> allDepartments();

    Department retriveDepartment(Long departmentId);
}
