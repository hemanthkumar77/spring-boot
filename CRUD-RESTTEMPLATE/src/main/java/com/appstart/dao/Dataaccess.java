package com.appstart.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appstart.entity.products;

@Repository
public interface Dataaccess extends CrudRepository<products,Integer>{

}
