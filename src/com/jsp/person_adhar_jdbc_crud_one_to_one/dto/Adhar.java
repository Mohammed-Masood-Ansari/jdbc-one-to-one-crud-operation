package com.jsp.person_adhar_jdbc_crud_one_to_one.dto;

public class Adhar {

	private long adharNumber;
	private String adharAddress;
	private String fatherName;
	private int houseNumber;

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getAdharAddress() {
		return adharAddress;
	}

	public void setAdharAddress(String adharAddress) {
		this.adharAddress = adharAddress;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

}
