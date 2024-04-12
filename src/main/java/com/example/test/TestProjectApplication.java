package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.test.entity.Employee;
import com.example.test.service.EmployeeService;

@SpringBootApplication
public class TestProjectApplication implements CommandLineRunner  {
	
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> emplist=employeeService.getallemployees();
		emplist.stream().forEach(s->{
			Employee emp=s;
			System.out.println(emp.toString());
		});
		
	}

}
