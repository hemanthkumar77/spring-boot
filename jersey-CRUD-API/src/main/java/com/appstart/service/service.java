package com.appstart.service;

import java.util.List;

import com.appstart.data.data;
import com.appstart.model.employee;

public class service {
    data obj=new data();
	public employee get_by_id(int id) {
		return obj.get_id(id);
	}
	public boolean create(employee emp) {
	 
	return obj.create(emp);
	}
	
	public boolean update_record(employee emp, int id) {
	return obj.update(emp,id);
	}
	public boolean delete(int id) {
	 return	obj.delete(id);
	}
	public List<employee> get_by_dept(int dept_id) {
	return obj.get_dept(dept_id);
	}
	public List<employee> get_sal(double sal) {
		return obj.get_by_sal(sal);
	}

}
