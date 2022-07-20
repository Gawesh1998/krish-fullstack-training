package com.gawesh.training.salesmanager.config;

import com.gawesh.training.salesmanager.repository.EmployeeRepository;
import com.gawesh.training.salesmanager.repository.EmployeeRepositoryImpl;
import com.gawesh.training.salesmanager.service.EmployeeService;
import com.gawesh.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.krishantha")
@PropertySource("application.properties")
public class ApplicationConguration {

    @Bean(name = "employeeService")
    @Scope("prototype")
    public EmployeeService getEmployeeService() {
        //return new EmployeeServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        //employeeService.setEmployeeRepository(getEmployeeRepository());

        return employeeService;

    }

//    @Bean(name = "employeeRepository")
//    public EmployeeRepository getEmployeeRepository() {
//        return new EmployeeRepositoryImpl();
//    }

    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
