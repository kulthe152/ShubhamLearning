package com.kulthe.hibe_object_state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
	public static void main(String args[])
	{
		 Configuration conf = new Configuration().configure().addAnnotatedClass(twowheeler.class);
	     ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
	     SessionFactory sf = conf.buildSessionFactory(reg);
	     Session ses = sf.openSession();
	     ses.beginTransaction();
	     

	    twowheeler tw = new twowheeler();
		tw.setBike_id(10);
		tw.setBike_name("activaa");
		tw.setPrice(85000);
		  
	    ses.save(tw);
	    tw.setPrice(79000);
	    
	   // ses.delete(tw);
	     
	    ses.getTransaction().commit();
	    ses.evict(tw);
	    tw.setPrice(60000);
	    
	}
}