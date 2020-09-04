package com.appstart.dao;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appstart.entity.products;

@Repository
public interface Dataaccess extends CrudRepository<products,Integer>{
  products findById(int id);
  // between case to find the range of prices
  List<products> findByPriceBetween(double price1,double price2);
  // greater than in select query to check the larger discount price
  List<products> findByDiscountGreaterThan(double price);
  // list out the first 3 least discount products
  List<products> findFirst3ByOrderByDiscountAsc();
  // list top 5  products by id in descending order
  List<products>findFirst5ByOrderByIdDesc();
  // find by name or id
  products findByNameOrId(String name,int id);
}
