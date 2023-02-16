package com.jsp.person_adhar_jdbc_crud_one_to_one.controller;

import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Adhar;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Person;
import com.jsp.person_adhar_jdbc_crud_one_to_one.service.PersonAdharService;

public class PersonAdharInsertController {

	public static void main(String[] args) {
		
		Adhar adhar = new Adhar();
		
		adhar.setAdharNumber(821354678954l);
		adhar.setAdharAddress("Noida-sector-126");
		adhar.setFatherName("Mallikarjun");
		adhar.setHouseNumber(420);
		
		Person person = new Person();
		
		person.setPersonId(321);
		person.setPersonName("Ram");
		person.setPersonPhone(4567432677l);
		person.setAdhar(adhar);//this line will create the foreign key
		
		PersonAdharService adharService = new PersonAdharService();
		
		adharService.insertPersonAdhar(person, adhar);
	}
}
