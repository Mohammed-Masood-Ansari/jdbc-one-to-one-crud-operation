package com.jsp.person_adhar_jdbc_crud_one_to_one.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPathEvaluationResult.XPathResultType;

import com.jsp.person_adhar_jdbc_crud_one_to_one.connection.JDBCConnection;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Adhar;
import com.jsp.person_adhar_jdbc_crud_one_to_one.dto.Person;

public class PersonDao {

	Connection connection = null;

	// insertPersonAdhar
	public void insertPersonAdhar(Person person, Adhar adhar) {

		connection = JDBCConnection.getJdbcConnection();

		PreparedStatement preparedStatement=null;
		
		if (connection != null) {

			try {
				
				String adharInsertQuery = "insert into adhar values(?,?,?,?)";
			    preparedStatement = connection.prepareStatement(adharInsertQuery);
				preparedStatement.setLong(1, adhar.getAdharNumber());
				preparedStatement.setString(2, adhar.getAdharAddress());
				preparedStatement.setString(3, adhar.getFatherName());
				preparedStatement.setInt(4, adhar.getHouseNumber());
				
				preparedStatement.execute();
				
				System.out.println("Adhar-----Data----Inserted----Successfully---");
				
				String personInsertQuery = "insert into person values(?,?,?,?)";
				preparedStatement = connection.prepareStatement(personInsertQuery);
				preparedStatement.setInt(1, person.getPersonId());
				preparedStatement.setString(2, person.getPersonName());
				preparedStatement.setLong(3, person.getPersonPhone());
				preparedStatement.setLong(4, person.getAdhar().getAdharNumber());
				preparedStatement.execute();
				
				System.out.println("Person-----Data----Inserted----Successfully---");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("Please check your url or username or password");
		}

	}
	
	//display person and adhar method
	public List<Object> getPersonAdhar(){
		
		connection = JDBCConnection.getJdbcConnection();

		PreparedStatement preparedStatement=null;
		
		if (connection != null) {

			try {
				
				String displayLaptopEmployeeQuery = "Select person.*,adhar.* from person "
						+ "INNER JOIN adhar "
						+ "where person.adharnumber=adhar.adharnumber";
				
				preparedStatement = connection.prepareStatement(displayLaptopEmployeeQuery);
				
				ResultSet resultSet=preparedStatement.executeQuery();
				
				List<Object> objects = new ArrayList<Object>();
 				
				while(resultSet.next()) {
					
					Adhar adhar = new Adhar();
					
					adhar.setAdharNumber(resultSet.getLong("adharnumber"));
					adhar.setFatherName(resultSet.getString("fathername"));
					adhar.setHouseNumber(resultSet.getInt("housenumber"));
					adhar.setAdharAddress(resultSet.getString("adharaddress"));
					
					Person person = new Person();
					
					person.setPersonId(resultSet.getInt("personid"));
					person.setPersonName(resultSet.getString("personname"));
					person.setPersonPhone(resultSet.getLong("personphone"));
					person.setAdhar(adhar);
					
					objects.add(person);
					objects.add(adhar);
					
				}
				
				return objects;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("Please check your url or username or password");
		}
		return null;
	}
	
	//delete Method for 
	public void deletePersonAdhar(int id) {
		
		connection = JDBCConnection.getJdbcConnection();

		PreparedStatement preparedStatement=null;
		
		if(connection!=null) {
			
			String deletePersonAdharQuery = "delete person,adhar from"
					+ " person inner join adhar on person.adharnumber=adhar.adharnumber "
					+ "where personid=?";
			try {
				
				preparedStatement=connection.prepareStatement(deletePersonAdharQuery);
				
				preparedStatement.setInt(1, id);
				
			    preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else {
			System.out.println("Please check your url or username or password");
		}
	}
	
	//updatePersonAdhar
	public void updatePersonAdhar(int id,String personName,double laptopPrice) {
		
		connection = JDBCConnection.getJdbcConnection();

		PreparedStatement preparedStatement=null;
		
		if(connection!=null) {
			
			String updateLaptopEmployee = "";
			
			try {
				
				preparedStatement=connection.prepareStatement(updateLaptopEmployee);
				
				preparedStatement.setInt(1, id);
				
			    preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else {
			System.out.println("Please check your url or username or password");
		}
	}
}
