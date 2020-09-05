package com.employees.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.employees.entities.employee;
import com.employees.dao.*;
@Service("ser")
public class service {
    @Autowired
	private DOA_EMPLOYEE dao;
    
	public employee createemployee(employee emp) {
		return dao.save(emp);
	}
    @Cacheable(value="employee",key="#emp_id",unless="#result==null")
	public employee finddetails(int emp_id) {
		return dao.findOne(emp_id);
	}

	public Iterable<employee> getall() {
		return dao.findAll();
	}
    @CacheEvict(value="employee",key="#id")
	public void delete(int id) {
	 dao.delete(id);	
	}
    @CachePut(value="employee",key="#emp_id")
	public void update(int emp_id, double sal) {
		employee emp=dao.findOne(emp_id);
		emp.setEmp_salary(sal);
		dao.save(emp);
	}
}
