package com.appstart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="shop_cart")
@DynamicUpdate
@NamedNativeQueries(value= {@NamedNativeQuery(name="products.getbyid",query="select * from shop_cart where product_id=?1",resultClass=products.class),
		@NamedNativeQuery(name="products.getall",query="select * from shop_cart order by product_name",resultClass=products.class),
		@NamedNativeQuery(name="products.discount",query="select * from shop_cart where offers >= ?1 ",resultClass=products.class)})
public class products {
@Id
@Column(name="product_id")
private int id;
@Column(name="product_name",columnDefinition="varchar(27) not null",unique=true)
private String name;
@Column(name="stock")
private int in_stock;
@Column(name="price",nullable=false,precision=4,scale=3)
private double price_per_unit;
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
public int getIn_stock() {
	return in_stock;
}
public void setIn_stock(int in_stock) {
	this.in_stock = in_stock;
}
public double getPrice_per_unit() {
	return price_per_unit;
}
public void setPrice_per_unit(double price_per_unit) {
	this.price_per_unit = price_per_unit;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public products(int id, String name, int in_stock, double price_per_unit, double discount) {
	super();
	this.id = id;
	this.name = name;
	this.in_stock = in_stock;
	this.price_per_unit = price_per_unit;
	this.discount = discount;
}
public products() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "products [id=" + id + ", name=" + name + ", in_stock=" + in_stock + ", price_per_unit=" + price_per_unit
			+ ", discount=" + discount + "]";
}

}
