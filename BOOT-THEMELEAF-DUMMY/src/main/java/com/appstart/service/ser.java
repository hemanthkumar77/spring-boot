package com.appstart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.appstart.model.*;
@Service
public class ser {
List<student>stud=new ArrayList();
public List<student> getdetails()
{
	return stud;
}
public void add(student stu)
{
	stud.add(stu);
}
}
