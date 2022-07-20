package com.gawesh.training.salesmanager.service;

import com.gawesh.training.salesmanager.model.Employee;
import com.gawesh.training.salesmanager.repository.EmployeeRepository;
import com.gawesh.training.salesmanager.repository.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    //private EmployeeRepository employeeRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("overloaded constructor executed");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeServiceImpl() {
        System.out.println("default constructor executed");
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("setter injection fired");
        this.employeeRepository = employeeRepository;
    }
    //EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

}
