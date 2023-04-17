package com.onetomany.bi.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "EmployeeDetails")
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Employee_ID")
	private String employeeId;

	@Column(name = "Employee_Name")
	private String employeeName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	@JoinColumn(name = "Project_ID", referencedColumnName = "Project_ID")
	private List<Project> projects = new ArrayList<>();
}
