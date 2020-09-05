package com.employees.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employees.entities.*;
@Repository
public interface DOA_EMPLOYEE extends CrudRepository<employee,Integer>{

}
