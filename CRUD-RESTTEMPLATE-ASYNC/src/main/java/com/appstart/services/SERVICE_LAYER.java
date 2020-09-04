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

public java.util.concurrent.CompletableFuture<products> getdetails(int id) {
	return da.findById(id);
}

}
