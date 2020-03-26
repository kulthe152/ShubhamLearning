package com.kulthe.DemoHibernate;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration; 
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args)
    {
       AlienName an = new AlienName();
       an.setFnm("awi");
       an.setLnm("bura");
       an.setMnm("ram");
       
       Alien a1 = new Alien();
       a1.setAid(104);
       a1.setAcol("black");
       a1.setAname(an);
       
       Configuration conf = new Configuration().configure().addAnnotatedClass(Alien.class);
       
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        
       SessionFactory sf = conf.buildSessionFactory(reg);
       
       
       
       //Transaction tx = ses.beginTransaction();
      // ses.save(a1);
       Session ses = sf.openSession();
       ses.beginTransaction();
       Query Q = ses.createQuery("from Alien where aid=101");
       Q.setCacheable(true);
       a1 = (Alien) Q.uniqueResult();
       System.out.println(a1);
       ses.getTransaction().commit();
       ses.close();
       
       Session ses2 = sf.openSession();
       ses2.beginTransaction();
       Query Q1 = ses2.createQuery("from Alien where aid=101");
       Q1.setCacheable(true);
       a1 = (Alien) Q1.uniqueResult();
       System.out.println(a1);
       ses2.getTransaction().commit();
       ses2.close();
//       
//       tx.commit();
//       
      
    } 
}
