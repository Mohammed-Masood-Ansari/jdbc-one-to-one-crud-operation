package com.jsp.person_adhar_jdbc_crud_one_to_one.dto;

public class Person {

	private int personId;
	private String personName;
	private long personPhone;
	private Adhar adhar;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}

	public Adhar getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}

}
