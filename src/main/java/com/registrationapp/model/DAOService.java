package com.registrationapp.model;

import java.sql.ResultSet;

public interface DAOService {		//Data Access Object
		

	public void connectDB();
	public boolean verifyLogin(String email, String password);
	public void createRegistration(String name, String course, String email, String moblie);
	public void deleteRegistration(String email);
	public void updateRegistration(String email, String moblie);
	public ResultSet getAllRegistrations();
	
}
