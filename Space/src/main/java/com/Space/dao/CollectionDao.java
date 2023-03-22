package com.Space.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Space.model.Collection;

@Repository
public class CollectionDao {
	@Autowired
	SessionFactory sf;
	
	public List<Collection> cd() {
		
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Collection.class);
	  return criteria.list();
		
	}
	

}
