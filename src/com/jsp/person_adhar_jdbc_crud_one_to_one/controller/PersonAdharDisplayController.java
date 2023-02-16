package com.jsp.person_adhar_jdbc_crud_one_to_one.controller;

import java.util.List;

import com.jsp.person_adhar_jdbc_crud_one_to_one.dao.PersonDao;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Adhar;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Person;

public class PersonAdharDisplayController {

	public static void main(String[] args) {
		
		PersonDao personDao = new PersonDao();
		
		List<Object>  objects=personDao.getPersonAdhar();
		
		
		
		for (Object object : objects) {
			
			
			if(object instanceof Person) {
				
				Person persons = (Person)object;
				
				
					System.out.println("...............Person..................Details................");
					
					System.out.println("personId = "+persons.getPersonId());
					System.out.println("personName = "+persons.getPersonName());
					System.out.println("personPhone = "+persons.getPersonPhone());
					
					System.out.println("...............Adhar..................Details................");
					
					System.out.println("AdharNumber = "+persons.getAdhar().getAdharNumber());
					System.out.println("AdharAddress = "+persons.getAdhar().getAdharAddress());
					System.out.println("FatherName = "+persons.getAdhar().getFatherName());
					System.out.println("HouseNumber = "+persons.getAdhar().getHouseNumber());
				
			}
			
			
		}
	}
}
