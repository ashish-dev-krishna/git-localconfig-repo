package com.example.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.entity.Employee;

@Service
public interface EmployeeService {
	List<Employee> getallemployees();
}
