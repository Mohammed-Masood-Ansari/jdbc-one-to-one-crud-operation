package com.jsp.person_adhar_jdbc_crud_one_to_one.controller;

import com.jsp.person_adhar_jdbc_crud_one_to_one.service.PersonAdharService;

public class PersonAdharController {

	public static void main(String[] args) {
		PersonAdharService adharService = new PersonAdharService();
		adharService.deletePersonAdhar(321);
	}
}
