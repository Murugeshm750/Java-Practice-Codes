package com.manytomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory= cfg.buildSessionFactory();
    	
    //Creating object of Person
    	Person p1 = new Person();
    	Person p2 = new Person();
    	Person p3 = new Person();
    	Person p4 = new Person();
    	
    //Creating object of Person
    	Language l1 = new Language();
    	Language l2 = new Language();
    	Language l3 = new Language();
    	Language l4 = new Language();
    	
    //Creating list of languages for person-1 : Mugesh
    	List<Language> Llist1 = new ArrayList<Language>();
    	Llist1.add(l1);
    	Llist1.add(l2);
    	Llist1.add(l3);
    	Llist1.add(l4);

    //Creating list of languages for person-1 : Navin
    	List<Language> Llist2 = new ArrayList<Language>();
    	Llist1.add(l1);
    	Llist1.add(l2);

    //Creating list of languages for person-1 : Amar
    	List<Language> Llist3 = new ArrayList<Language>();
    	Llist1.add(l3);
    	Llist1.add(l4);
    	
    //Creating list of languages for person-1 : Prathap
    	List<Language> Llist4 = new ArrayList<Language>();
    	Llist1.add(l1);
    	Llist1.add(l3);
    	
    //Creating list of Person for Language-1 : Tamil
    	List<Person> Plist1 = new ArrayList<Person>();
    	Plist1.add(p1);
    	Plist1.add(p2);
    	Plist1.add(p4);
    	
    //Creating list of Person for Language-2 : Malayalam
    	List<Person> Plist2 = new ArrayList<Person>();
    	Plist1.add(p1);
    	Plist1.add(p2);

   	//Creating list of Person for Language-3 : Telugu
    	List<Person> Plist3 = new ArrayList<Person>();
    	Plist3.add(p1);
    	Plist3.add(p3);
    	Plist3.add(p4);

    //Creating list of Person for Language-4 : English
    	List<Person> Plist4 = new ArrayList<Person>();
    	Plist4.add(p1);
    	Plist4.add(p3);
    	
    //Setting values to person-1 : Mugesh	
    	p1.setP_id(11);
    	p1.setP_name("Mugesh");
    	p1.setLanguage(Llist1);
    	
    //Setting values to person-2 : Navin	
    	p2.setP_id(12);
    	p2.setP_name("Navin");
    	p2.setLanguage(Llist2);
    	
    //Setting values to person-3 : Amar	
    	p3.setP_id(13);
    	p3.setP_name("Amar");
    	p3.setLanguage(Llist3);
    	
    //Setting values to person-4 : Prathap	
    	p4.setP_id(14);
    	p4.setP_name("Prathap");
    	p4.setLanguage(Llist4);
    
    //Setting values to Language-1 : Tamil
    	l1.setL_id(111);
    	l1.setL_name("Tamil");
    	l1.setPerson(Plist1);
    	
    //Setting values to Language-2 : Malayalam
    	l2.setL_id(222);
    	l2.setL_name("Malayalam");
    	l2.setPerson(Plist2);
    	
    //Setting values to Language-3 : Telugu
    	l3.setL_id(333);
    	l3.setL_name("Telugu");
    	l3.setPerson(Plist3);
    	
    //Setting values to Language-4 : English
    	l4.setL_id(444);
    	l4.setL_name("English");
    	l4.setPerson(Plist4);
    	
    	
    	Session ss = factory.openSession();
    	Transaction tran = ss.beginTransaction();
    	
    //Saving the Object in Table	
    	ss.save(p1);
    	ss.save(p2);
    	ss.save(p3);
    	ss.save(p4);
    	ss.save(l1);
    	ss.save(l2);
    	ss.save(l3);
    	ss.save(l4);
    	tran.commit();
    }
}
































