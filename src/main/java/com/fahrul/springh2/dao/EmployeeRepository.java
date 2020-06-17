package com.fahrul.springh2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springh2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findByDept(String dept);

}
