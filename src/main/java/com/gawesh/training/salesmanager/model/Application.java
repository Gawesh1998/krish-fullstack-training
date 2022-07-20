package com.gawesh.training.salesmanager.model;

import com.gawesh.training.salesmanager.config.ApplicationConguration;
import com.gawesh.training.salesmanager.service.EmployeeService;
import com.gawesh.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) { SpringApplication.run(Application.class, args);

	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConguration.class);
		//EmployeeService employeeService = new EmployeeServiceImpl();
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		List<Employee> employees = employeeService.getAllEmployees();

		for (Employee employee : employees){
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
		}

	}

}
