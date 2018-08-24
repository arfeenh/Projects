package com;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String referer = request.getHeader("referer");
		
		//response.sendRedirect("Form.html");
		if(referer.contains("registrationform.html")) {
			String pic=null;
			int role=-1;
			if(request.getParameter("role").equals("Customer")) {
				role=0;
			}
			else {
				role=1;
			}
			int gender=-1;
			if(request.getParameter("gender").equals("male")) {
				gender=0;
			}
			else if(request.getParameter("gender").equals("female")) {
				gender=1;
			}
			else {
				gender=2;
			}
		String dob = request.getParameter("dob");
		/*try {
				dob = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			System.out.println(request.getParameter("dob"));
			String pass = request.getParameter("password");
			String name = request.getParameter("full_name");
			String phone= request.getParameter("number");
			pic= request.getParameter("pic");
			String email = request.getParameter("email");
			System.out.println(email);
			try {
				model.registerUser(email, pass, role, name, gender, phone, pic, dob);
				response.sendRedirect("login.html");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		else if(referer.contains("passwordform.html")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			String newpass = request.getParameter("password1");

			
			try {
				model.updatePass(email, pass, newpass);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(referer.contains("login.html")){
			boolean log=false;
			String name = request.getParameter("full_name");
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			System.out.println(name);
			int role=-1;
			if(request.getParameter("role").equals("customer")) {
				role=0;
			}
			else {
				role=1;
			}			
	
			try {
				log = model.validateUser(email, pass, role);
				if(log) {
					getServletContext().setAttribute("name", name);					
					RequestDispatcher view = request.getRequestDispatcher("success.jsp");
					view.forward(request, response);

					//response.sendRedirect("success.html");
				}
				else {
					response.sendRedirect("error.html");
					System.out.println(log);
				}

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
