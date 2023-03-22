package com.Space.dao; 

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Space.model.Staffs;


@Repository
public class StaffDao {
@Autowired
SessionFactory sf;

// Q1.Write an api to get all the staff record.
//public List std () {
//	Session session = sf.openSession();
//	Criteria criteria = session.createCriteria(Staffs.class);
//	
//	return criteria.list();	
//}

// Q2. insert five and one staff record.
//public String d1(List<Staffs> st) {
//	Session session = sf.openSession();
//	Transaction tr = session.beginTransaction();
//	for (Staffs staff : st) {
//		session.save(staff);		
//	}
//	tr.commit();
//	return "Data inserted successfully";
//}

//Q3.Write an api to get record  whose staffed is 3.
//public List sdd () {
//	Session session = sf.openSession();
//	Criteria criteria = session.createCriteria(Staffs.class);
//	 criteria.add(Restrictions.eq("staffid", 3));
//	 return criteria.list();
//}

// Q4.write an api to get the list of staff who is/are having salary more than 20000
//public List a1() {
//	Session session = sf.openSession();
//	Criteria criteria = session.createCriteria(Staffs.class);
//	criteria.add(Restrictions.gt("salary", "20000"));
//	return criteria.list();	
//}

//Q5.Write an api to get the list of staff who is/are having the experience between 10 to 20.
//public List a2() {
//	Session session = sf.openSession();
//    Criteria criteria = session.createCriteria(Staffs.class);
//    criteria.add(Restrictions.between("experience", 10, 20));
//    return criteria.list();
//}

// Q6.write an api to update the salary for staff whose id is 4.
//public String a3(List<Staffs> sl) {
//	Session session = sf.openSession();
//	Transaction tr = session.beginTransaction();
//	for (Staffs staffs : sl) {
//		session.update(staffs);
//	}	
//	tr.commit();
//	return "Data updated successfully";	
//}

// Q7.write an api to get the list of staff whose are having profile as a trainer.
//public List trainer() {
//	Session session = sf.openSession();
//	Criteria criteria = session.createCriteria(Staffs.class);
//	criteria.add(Restrictions.eq("profile", "Trainer"));
//	return criteria.list();
//}

//Q8.write an api to get the list of staff whose are having profile as a trainer.
 public List nottrainer() {
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(Staffs.class);
	criteria.add(Restrictions.ne("profile", "Trainer"));
	return criteria.list();
}

}















