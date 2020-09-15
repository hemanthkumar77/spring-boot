package org.studyeasy.model;

public class details {
private int id;
private String name;
private double salaray;
private String occupation;
private String gender;
public details(int id, String name, double salaray, String occupation, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.salaray = salaray;
	this.occupation = occupation;
	this.gender = gender;
}
public details() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "details [id=" + id + ", name=" + name + ", salaray=" + salaray + ", occupation=" + occupation + ", gender="
			+ gender + "]";
}


}
