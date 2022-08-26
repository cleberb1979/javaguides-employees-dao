package com.employees.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.dao.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
