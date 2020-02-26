package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.api.Animal;
import com.example.rest.api.Bird;
import com.example.rest.api.miscellaneous.AnimalCount; 

@RestController
 

public class Rest
{
		
	 @RequestMapping(method = RequestMethod.GET, value = "/animal/getCount")
	    @ResponseBody

		 public String getFlyingAnimalCount(@RequestBody String animals) {   
		 String t1="I can fly";
		 int result = stringCompare(animals, t1);
		 System.out.println(result);		 
		 String  t ="";
		 if (result==0) {
			 Bird bird = new Bird();
			 bird.callSound();
		     t = new String( "I am a bird");
			 System.out.println(t);
		 } 
				 return  animals+" & "+t;
	    }
	 
	 public static int stringCompare(String str1, String str2) 
	    { 
	  
	        int l1 = str1.length(); 
	        int l2 = str2.length(); 
	        int lmin = Math.min(l1, l2); 
	  
	        for (int i = 0; i < lmin; i++) { 
	            int str1_ch = (int)str1.charAt(i); 
	            int str2_ch = (int)str2.charAt(i); 
	  
	            if (str1_ch != str2_ch) { 
	                return str1_ch - str2_ch; 
	            } 
	        } 
	  
	        // Edge case for strings like 
	        // String 1="Geeks" and String 2="Geeksforgeeks" 
	        if (l1 != l2) { 
	            return l1 - l2; 
	        } 
	  
	        // If none of the above conditions is true, 
	        // it implies both the strings are equal 
	        else { 
	            return 0; 
	        } 
	    } 
	
}
