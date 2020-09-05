package com.employees.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class employee {
@Id
@Column(name="emp_id")
private int emp_id;

@Column(name="emp_name",columnDefinition="varchar(18) not null")
private String wmp_name;

@Column(name="emp_dept",columnDefinition="varchar(18) not null")
private String emp_dept;

@Column(name="emp_salary",precision=5,scale=3)
private double emp_salary;

@Column(nullable=false ,name="emp_project")
private String emp_project;

public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getWmp_name() {
	return wmp_name;
}
public void setWmp_name(String wmp_name) {
	this.wmp_name = wmp_name;
}
public String getEmp_dept() {
	return emp_dept;
}
public void setEmp_dept(String emp_dept) {
	this.emp_dept = emp_dept;
}
public double getEmp_salary() {
	return emp_salary;
}
public void setEmp_salary(double emp_salary) {
	this.emp_salary = emp_salary;
}
public String getEmp_project() {
	return emp_project;
}
public void setEmp_project(String emp_project) {
	this.emp_project = emp_project;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(int emp_id, String wmp_name, String emp_dept, double emp_salary, String emp_project) {
	super();
	this.emp_id = emp_id;
	this.wmp_name = wmp_name;
	this.emp_dept = emp_dept;
	this.emp_salary = emp_salary;
	this.emp_project = emp_project;
}
@Override
public String toString() {
	return "employee [emp_id=" + emp_id + ", wmp_name=" + wmp_name + ", emp_dept=" + emp_dept + ", emp_salary="
			+ emp_salary + ", emp_project=" + emp_project + "]";
}



}
