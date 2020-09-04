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

public products get_by_id(int id) {
	return da.getbyid(id);
}

public List<products> get_all() {
	// TODO Auto-generated method stub
	return da.getall();
}

public List<products> getdeals(double price) {
	return da.discount(price);
}

}
