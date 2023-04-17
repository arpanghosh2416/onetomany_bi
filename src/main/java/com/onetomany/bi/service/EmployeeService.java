package com.onetomany.bi.service;

import java.util.List;

import com.onetomany.bi.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployess();

	public Employee registerEmployee(Employee employee);

	public Employee getEmployeebyId(String employeeId);

	public Employee updateEmployeeDetails(String employeeName, Employee employee);

}
