package com.learnHibernate.Crud1.HibernateCURD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       create();
       fetchData();
      // deleteData();
    }
    public static void create()
    {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	//create object of entity class
    	Persion per1=new Persion(11,"sumit",22,"sumit@gmail.com",2341562856l);
    	Persion per2=new Persion(12,"Amit",23,"amit@gmail.com",23419065856l);
    	session.save(per1);
    	session.save(per2);
    	tr.commit();
    }
    public static void fetchData()
    {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	Persion pe=session.get(Persion.class, 12);
    	tr.commit();
    	System.out.println(pe);
    }
   /* public static void deleteData()
    {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	Persion pe1=new Persion();
    	session.delete(pe1);
    
    }*/
}
