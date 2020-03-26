package com.kulthe.HQLdemo;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
	public static void main(String args[])
	{
		 Configuration conf = new Configuration().configure().addAnnotatedClass(student_zeal.class);
	     ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
	     SessionFactory sf = conf.buildSessionFactory(reg);
	     Session ses = sf.openSession();
	     
	     ses.beginTransaction();  
//	     Random r = new Random();
//	     
//	     for(int i=0;i<=50;i++)
//	     {
//	    	 student_zeal sz = new student_zeal();
//	    	 sz.setRollno(i);
//	    	 sz.setSnm("Name  "+i);
//	    	 sz.setMarks(r.nextInt(100));
//	    	 ses.save(sz);
//	     }
	     
	     /// below fetch the record using HQL
	     
//	     Query q1 = ses.createQuery("from student_zeal where marks > 50");
//	     List<student_zeal> stu_zl = q1.list();
//	     
//	     for(student_zeal s : stu_zl)
//	     {
//	    	 System.out.println(s);
//	     }
	     
	     // below code is SELECT use in HQL
	     
//	     Query q1 = ses.createQuery("select rollno,marks,snm from student_zeal where rollno = 7");
//	     Object[] studdz = (Object[]) q1.uniqueResult();
//	     System.out.println(studdz[0] + " : " + studdz[1] + " : " + studdz[2]);
//	     
	     
	     //when i remove where clause it will not give 1 record , it will give u entire table , so we used list
	     
//	     Query q1 = ses.createQuery("select rollno,marks,snm from student_zeal");
//	     List<Object[]> studdzs = (List<Object[]>) q1.list();
//	     for(Object[] studdd : studdzs)
//	     {
//	    	  System.out.println(studdd[0] + " : " + studdd[1] + " : " + studdd[2]); 
//	     }
	     
	     //SQL query work in Hibernare
	     //Native query
//	     SQLQuery qry = ses.createSQLQuery("select * from student_zeal where marks>60");
//	     qry.addEntity(student_zeal.class);
//	     List<student_zeal> sd = qry.list();
//	     
//	     for(student_zeal o : sd)
//	     {
//	    	 System.out.println(o);
//	     }
	     
	     //Fetching only specific column of value , not entire row.
	     
	     SQLQuery qry = ses.createSQLQuery("select snm,marks from student_zeal where marks>60");
	     qry.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP); //convert output into map format.
	     List sdl = qry.list();
	     
	     for(Object o : sdl)
	     {
	    	 Map m = (Map)o;
	    	 System.out.println(m.get("snm")+ " : " +m.get("marks"));
	     }
	      
	     
	     
	     
	     
	     
	     
	     
	     
	     ses.getTransaction().commit();
	     
	}
}
