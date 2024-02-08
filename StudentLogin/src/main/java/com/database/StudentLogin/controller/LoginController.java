package com.database.StudentLogin.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.StudentLogin.model.Student;


@RestController
@RequestMapping("/student")
public class LoginController 
{
	
	Student student;
	
     @GetMapping("{id}")
	 public Student getStudDetails(String id)
	 {
		 
		return  student;
		//("q1","kunal" ,"kun@gmail.com", "Ujj","ind", "12","male");
		 
	 }
     
     @PostMapping
     public String createStudDetails(@RequestBody Student student)
     {  
    	 this.student=student;
    	 return "create successfully";
    	 
     }
      
     @PutMapping
     public String updateStudDetails(@RequestBody Student student)
     {  
    	 this.student=student;
    	 return "Update successfully";
    	 
     }
     
     @DeleteMapping("{id}")
     public String deleteStudDetails(String id)
     {  
    	 this.student=null;
    	 return "delete successfully";
    	 
     }


}
