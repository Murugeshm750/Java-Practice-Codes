package com.kodnest.HibernateProject;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory= cfg.buildSessionFactory();
    	System.out.println(factory);
    	Teacher t = new Teacher(17, "prathap", "css");
    	Session ss = factory.openSession();
    	Transaction tran = ss.beginTransaction();
    	ss.save(t);
    	tran.commit();
    	
    }
}























