package com.appstart.model;
public class student {
private int id;
private String name;
private String dept_name;
private String gender;
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
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public student(int id, String name,String dept_name, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.dept_name = dept_name;
	this.gender = gender;
}
public student()
{
	
}
}
