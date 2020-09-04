package com.appstart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_cart")
public class products {
@Id
@Column(name="product_id")
private int id;
@Column(name="product_name",columnDefinition="varchar(27) not null",unique=true)
private String name;
@Column(name="stock")
private int stock;
@Column(name="price",nullable=false,precision=4,scale=3)
private double price;
@Column(name="offers",nullable=false,precision=2,scale=3)
private double discount;
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

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}

public products() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public products(int id, String name, int stock, double price, double discount) {
	super();
	this.id = id;
	this.name = name;
	this.stock = stock;
	this.price = price;
	this.discount = discount;
}
@Override
public String toString() {
	return "products [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + ", discount=" + discount
			+ "]";
}



}
