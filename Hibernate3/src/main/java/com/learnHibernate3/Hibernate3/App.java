package com.learnHibernate3.Hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	Person pr1=new Person(11,"Amit",22);
    	Person pr2=new Person(12,"Anuj",23);
    	Person pr3=new Person(13,"rohit",24);
    	session.save(pr1);
    	session.save(pr2);
    	session.save(pr3);
    	Bike b1=new Bike(123,"honda",67000.8f);
    	Bike b2=new Bike(124,"ktm",97900.8f);
    	Bike b3=new Bike(125,"palser",68900.8f);
    	session.save(b1);
    	session.save(b2);
    	session.save(b3);
    	tr.commit();
        System.out.println( "Hibernate is created" );
    }
}
