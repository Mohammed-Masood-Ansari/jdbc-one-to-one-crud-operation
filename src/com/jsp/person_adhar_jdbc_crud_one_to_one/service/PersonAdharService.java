package com.jsp.person_adhar_jdbc_crud_one_to_one.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.person_adhar_jdbc_crud_one_to_one.connection.JDBCConnection;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dao.PersonDao;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Adhar;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Person;

public class PersonAdharService {

	PersonDao dao = new PersonDao();

	// insertPersonAdhar
	public void insertPersonAdhar(Person person, Adhar adhar) {

		dao.insertPersonAdhar(person, adhar);
	}

	// delete Method for
	public void deletePersonAdhar(int id) {
		dao.deletePersonAdhar(id);
	}
}
