package com.onetomany.bi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.bi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
