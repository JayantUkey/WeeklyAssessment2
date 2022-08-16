/*
	Query for creating Table in gl database
	create table employeeAssessment(empno INT, name VARCHAR(20), designation VARCHAR(20), salary FLOAT, age INT);
*/

package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeAssessment")
public class EmployeeEntity {
	
	 @Id
	  private int empno;
	  private String name;
	  private String designation;
	  private double salary;
	  private int age;
	  
	public EmployeeEntity(int empno, String name, String designation, double salary, int age) {
		super();
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
	}

	public EmployeeEntity() {
		super();
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSal() {
		return salary;
	}

	public void setSal(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	  
	 
	
}
