package com.registrationapp.model;

import java.sql.*;

public class DAOServiceImpl implements DAOService{

	private Connection con;
	private Statement stmnt;
	
	
	@Override
	public void connectDB() {
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nov_reg_db","root","0000");
			stmnt = con.createStatement();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		// TODO Auto-generated method stub
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email = '"+email+"' and password = '"+password+"'");
			return result.next();
			
				
		} catch (Exception e) {
			e.printStackTrace();			
		}
		return false;
	}

	@Override
	public void createRegistration(String name, String course, String email, String mobile) {

		try {
			stmnt.executeUpdate("insert into registration values ('"+name+"' ,'"+course+"','"+email+"','"+mobile+"')");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteRegistration(String email) {
		try {
			stmnt.executeUpdate("delete from registration where email = '"+email+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateRegistration(String email, String mobile) {
	
		try {
			stmnt.executeUpdate("update registration set mobile = '"+mobile+"' where email = '"+email+"'") ;
								 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public ResultSet getAllRegistrations() {
		
		try {
			
			ResultSet result = stmnt.executeQuery("Select * from registration");
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	

}















