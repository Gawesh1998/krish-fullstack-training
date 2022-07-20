package com.gawesh.training.salesmanager.repository;

import com.gawesh.training.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
