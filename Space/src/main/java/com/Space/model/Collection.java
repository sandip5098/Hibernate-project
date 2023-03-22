package com.Space.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Collection {
	int id;
	String name;
	String blood;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	@Override
	public String toString() {
		return "Collection [id=" + id + ", name=" + name + ", blood=" + blood + "]";
	}
	
	

}
