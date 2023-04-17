package com.nt.List;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		//Creating a List  
		 List<String> li=new ArrayList<String>();  

		 
	//Adding elements in the List  
		 li.add("Mango");  
		 li.add("Apple");  
		 li.add("Banana");  
		 li.add("Grapes");  
		 
	//Iterating the List element using for-each loop  
		  for(String fruit:li)  
		  System.out.println(fruit);  
		  
		}  
		
		
		

	}


