package com.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
