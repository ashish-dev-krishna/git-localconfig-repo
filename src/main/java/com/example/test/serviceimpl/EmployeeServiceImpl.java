package com.example.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.test.entity.Employee;
import com.example.test.service.EmployeeService;
import com.example.test.repository.*;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getallemployees() {
		List<Employee> emplist=	employeeRepository.findAll();
		return emplist;
	}

}
