package com.appstart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class employee {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}


}
