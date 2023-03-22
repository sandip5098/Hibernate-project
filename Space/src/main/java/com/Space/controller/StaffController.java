package com.Space.controller;



import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Space.model.Staffs;
import com.Space.service.StaffService;

@RestController
public class StaffController {
	@Autowired
	StaffService sff;
//Q1.
//	@GetMapping("/getone")
//	public List scc() {
//		sff.sss();
//		return sff.sss();
//	}
//	Q2.
//	@PostMapping("/sfsf")
//	public String sc(@ RequestBody List<Staffs> st) {
//	String msg= sff.ss1(st);
//		return msg;
//}
//Q3.
//	@GetMapping("/get3")
//	public List sfc () {
//		sff.ssff();
//		return sff.ssff();
//	}
//Q4.
//	@GetMapping("/gt20000")
//	public List gtc () {
//		sff.gt1();
//		return sff.gt1();
//	}
//Q5.
//	@GetMapping("/between")
//	public List bt2() {
//		sff.bt();
//		return sff.bt();
//	}
//Q6.
//	@PostMapping("/update")
//	public String up ( @RequestBody List<Staffs> sl) {
//	String msg = sff.update(sl);
//		return msg;
//	}
//Q7.
//	@GetMapping("/trainer")
//	public List trainer2() {
//		sff.trainer1();
//		return sff.trainer1();
//	}
//Q8.
	@GetMapping("/nottrainer")
	public List ntr() {
		sff.nt();
		return sff.nt();
	}
	}




