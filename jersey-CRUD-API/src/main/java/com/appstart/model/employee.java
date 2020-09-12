package com.appstart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="employer")
public class employee {
@Id
@Column(name="emp_id")
private int id;
@Column(name="emp_name",columnDefinition="varchar(34)")
private String name;
@Column(name="dept_id")
private int dept_id;
@Column(name="dept_name",columnDefinition="varchar(21)")
private String department_name;
@Column(name="payslip",precision=5,scale=3)
private double salary;
@Transient
private Links link;

public Links getLink() {
	return link;
}
public void setLink(Links link) {
	this.link = link;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public employee(int id, String name, int dept_id, String department_name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept_id = dept_id;
	this.department_name = department_name;
	this.salary = salary;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
