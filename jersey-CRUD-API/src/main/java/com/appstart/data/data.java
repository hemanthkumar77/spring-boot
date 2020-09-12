package com.appstart.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.appstart.model.employee;



public class data {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(employee.class).buildSessionFactory();

	public employee get_id(int id) {
		employee emp=null;
		try(Session session=factory.openSession())
		{session.beginTransaction();
		 
		String Hql="from employee where id=?1";
		Query<employee>query=session.createQuery(Hql,employee.class);
		 query.setParameter(1,id);
		emp=query.uniqueResult();
		 session.getTransaction().commit();
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emp;
	}

	public boolean create(employee emp) {
		boolean val=false;
	  try(Session session= factory.openSession())
	  {
		  session.beginTransaction();
		  int id=emp.getId();
		  employee empl=session.get(employee.class, id);
		  if(empl==null)
		  {
		  session.save(emp);
		  session.getTransaction().commit();
		  val=true;
		  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return val;
	}


	public boolean update(employee emp, int id) {
		boolean val=false;
		try(Session session=factory.openSession())
		{
			session.beginTransaction();
			employee empl=session.get(employee.class, id);
			if(empl!=null)
			{
				empl.setName(emp.getName());
				empl.setDept_id(emp.getDept_id());
				empl.setSalary(emp.getSalary());
				empl.setDepartment_name(emp.getDepartment_name());
				session.save(empl);
				val=true;
				session.getTransaction().commit();
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return val;
		}

	public boolean delete(int id) {
		boolean val=false;
		try(Session session=factory.openSession())
		{
			session.beginTransaction();
			employee empl=session.get(employee.class, id);
			if(empl!=null)
			{
				session.delete(empl);
				session.getTransaction().commit();
				val=true;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return val;
		}

	public List<employee> get_dept(int dept_id) {
		List<employee>emp=null;
	    try(Session session=factory.openSession())
	    {
	    	session.beginTransaction();
	    	String HQL="from employee where dept_id=?1";
	    	Query<employee>query=session.createQuery(HQL,employee.class);
	    	query.setParameter(1,dept_id);
	    	emp=query.list();
	    	session.getTransaction().commit();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		return emp;
	}

	public List<employee> get_by_sal(double sal) {
		List<employee>emp=null;
		try(Session session=factory.openSession())
		{
			session.beginTransaction();
			String HQL="from employee where salary>?1";
			Query<employee>query=session.createQuery(HQL,employee.class);
			query.setParameter(1,sal);
			emp=query.getResultList();
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return emp;
	}

	
	
	
	}	


