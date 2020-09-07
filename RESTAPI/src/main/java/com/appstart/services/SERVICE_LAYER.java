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

public String save(products pro) {
  if (pro!=null)
  {
	da.save(pro);
	return "value saved successfully";
  }
  else
  {
	  return "cannot saved in DB";
  }
}

public List<products> retrive() {
 return	(List<products>) da.findAll();
}

public products getbyid(int id) {
	return da.findOne(id);
}

public String delete(int id) {
  if(da.findOne(id)!=null)
  {
	da.delete(id); 
	return "value deleted successfully";
  }
  else
  {
	  return "not in the db";
  }
}

public String update(int id, double price) {
	products pro=da.findOne(id);
	if(pro!=null)
	{
		pro.setPrice_per_unit(price);
		da.save(pro);
		return "values updated successfully";
	}
	else
	{
		return "values not found in the db";
	}
}

public String savefull(List<products> pro) {
	da.save(pro);
	return "values updated in db";
}



}
