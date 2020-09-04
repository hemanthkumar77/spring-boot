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

public List<products> get_by_id(int id) {
	return da.ID(id);
}

public List<products> getall() {
	// TODO Auto-generated method stub
	return da.retriveall();
}

public List<products> discounts(double price) {
	return da.discount(price);
}

}
