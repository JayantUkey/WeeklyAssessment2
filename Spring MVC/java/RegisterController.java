package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	
	@RequestMapping("/register")
	 public String display(@RequestParam("empno") String empno,@RequestParam("name") String name,@RequestParam("designation") String designation,@RequestParam("sal") int sal, @RequestParam("ph") int ph, Model m)
	  {
		  String m1 = "Hello "+name +" you registered successfully";
		  String m2 = "Your's";
		  String m3 = "Employee No : "+empno;
		  String m4 = "Designation : "+designation;
		  String m5 = "Salary : "+sal;
		  String m6 = "Phone No : "+ph;
		  
		  m.addAttribute("first",m1);
		  m.addAttribute("second",m2);
		  m.addAttribute("third",m3);
		  m.addAttribute("fourth",m4);
		  m.addAttribute("fifth",m5);
		  m.addAttribute("sixth",m6);
		  
		  return "viewpage";
		  
	  }
}
