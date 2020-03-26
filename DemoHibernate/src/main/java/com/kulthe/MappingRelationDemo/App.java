package com.kulthe.MappingRelationDemo;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{

	public static void main(String[] args) 
	{
		Laptop lapi = new Laptop();
		lapi.setLid(101);
		lapi.setLnm("dell");
		
		Student s = new Student();
		s.setSnm("varad");
		s.setRno(1);
		s.setMarks(75);
		//s.setLapObj(lapi);
		s.getLapObj().add(lapi);
		lapi.getStuddt().add(s);
		
		Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
		SessionFactory sf = conf.buildSessionFactory(reg);
		Session sess = sf.openSession();
		
		sess.beginTransaction();
		
		sess.save(lapi);
		sess.save(s);
		
		sess.getTransaction().commit();
		
	}

}
