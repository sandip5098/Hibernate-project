package com.Space.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Space.model.Collection;
import com.Space.model.User;
import com.Space.service.CollectionService;

@Controller
public class CollectionController {
@Autowired
CollectionService csc;

@GetMapping("/getcoll")
public ModelAndView ccss() {
	ModelAndView view = new ModelAndView();
	view.setViewName("home");
    List<Collection>  list =	csc.css();
	view.addObject("collection",list);
	return view;

}
@RequestMapping("/check")
public ModelAndView checkLogin(User user) {
	ModelAndView mv = new ModelAndView();
	String uname = user.getUsername();
	String pass = user.getPassword();
	if (uname!=null && pass!=null) {
		
	
	System.out.println(uname +" "+ pass);
}
	
	if ("Sandip".equals(uname) && "306616".equals(pass)) {
		System.out.println("Login Success");
		mv.setViewName("home");
	} else {
		System.out.println("Login failed");
		mv.setViewName("login");
	}
	

	return mv;
}
}
