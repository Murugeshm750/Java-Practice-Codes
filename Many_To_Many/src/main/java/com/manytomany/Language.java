package com.manytomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Language {
	
	@Id
	int L_id;
	String L_name;
	
	@ManyToMany
	List<Person> person;

	public void setL_id(int l_id) {
		L_id = l_id;
	}

	public void setL_name(String l_name) {
		L_name = l_name;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public Language(int l_id, String l_name, List<Person> person) {
		super();
		L_id = l_id;
		L_name = l_name;
		this.person = person;
	}

	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}





















