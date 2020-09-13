package org.studyeasy;



public class employee {
	private int id;
	private String name;
	private int dept_id;
	private String department_name;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public employee(int id, String name, int dept_id, String department_name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.department_name = department_name;
		this.salary = salary;
	}
	
}
