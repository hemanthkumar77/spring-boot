package com.appstart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.appstart.dao.Dataaccess;
import com.appstart.entity.products;
@Service
public class SERVICE_LAYER {
@Autowired
 Dataaccess da;

public List<products> getdiscounts(double price, PageRequest pr) {
	return da.findByDiscountGreaterThan(price,pr);
}



}
