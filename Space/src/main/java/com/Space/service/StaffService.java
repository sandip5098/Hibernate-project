package com.Space.service;


import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Space.dao.StaffDao;
import com.Space.model.Staffs;


@Service
public class StaffService {
	@Autowired
	StaffDao sdao;
//Q1.
//public List sss () {
//	sdao.std();
//	return sdao.std();
//}
//Q2.
//public String ss1(List<Staffs> st) {
//	String msg = sdao.d1(st);
//	return msg;
//}
//Q3.
//public List ssff () {
//	sdao.sdd();
//	return sdao.sdd();
//}
//Q4.
//	public List gt1() {
//		sdao.a1();
//		return sdao.a1();
//	}
//Q5.
//	public List bt() {
//		sdao.a2();
//		return sdao.a2();
//	}
//Q6.
//	public String update(List<Staffs>sl) {
//	String msg =	sdao.a3(sl);
//		return msg;
//	}
//Q7.	
//	public List trainer1() {
//		sdao.trainer();
//		return sdao.trainer();
//	}
//Q8.
	public List nt() {
		sdao.nottrainer();
		return sdao.nottrainer();
	}
}








