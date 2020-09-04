package com.appstart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.appstart.dao.Dataaccess;
import com.appstart.entity.products;
@Service
public class SERVICE_LAYER {
@Autowired
 Dataaccess da;

public products findbyid(int id) {
	// TODO Auto-generated method stub
	return da.findById(id);
}

public List<products> range(double price1, double price2) {
	
	return da.findByPriceBetween(price1, price2);
}

public List<products> discounts(double price) {
	return da.findByDiscountGreaterThan(price);
}

public List<products> topdiscount() {
	return da.findFirst3ByOrderByDiscountAsc();
}

public List<products> call_by_id() {
	// TODO Auto-generated method stub
	return da.findFirst5ByOrderByIdDesc();
}

public products findval(int id, String name) {
	
	return da.findByNameOrId(name, id);
}



}
