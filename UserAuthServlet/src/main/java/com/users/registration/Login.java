package com.users.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatch = null;
		// Database code
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/topsproject", "root", "123456");
			PreparedStatement pst = con.prepareStatement("select * from users where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("name", rs.getString("name"));	
				dispatch = request.getRequestDispatcher("index.jsp");
			}
			else {
				request.setAttribute("status", "failed");
				dispatch = request.getRequestDispatcher("login.jsp");
			}
			dispatch.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
