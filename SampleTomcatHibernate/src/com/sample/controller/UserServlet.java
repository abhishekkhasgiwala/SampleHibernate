package com.sample.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.daos.UserDAO;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(description = "User Controller", urlPatterns = { "/UserServlet" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("---> UserServlet Init");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---> UserServlet Service");
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---> UserServlet doGet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---> UserServlet doPost");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		String dob = request.getParameter("dob");
	
		
		String emailId = request.getParameter("emailId");
		String phoneNo = request.getParameter("phoneNo");
		String gender = request.getParameter("gender");

		HttpSession session = request.getSession(true);
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(userName, password, emailId, phoneNo, gender);
			response.sendRedirect("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
