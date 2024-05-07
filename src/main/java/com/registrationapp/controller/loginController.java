package com.registrationapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registrationapp.model.DAOServiceImpl;

@WebServlet("/verifyLogin")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public loginController() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");		
		String pass = request.getParameter("pass");
		
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		
		boolean status = service.verifyLogin(user, pass);
		if(status) {
			HttpSession session = request.getSession(true);
			session.setAttribute("email", user);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_registration.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("errorMsg", "Invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}

}






















