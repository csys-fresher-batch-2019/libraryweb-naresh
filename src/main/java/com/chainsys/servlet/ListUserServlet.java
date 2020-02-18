package com.chainsys.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListUserServlet
 */
@WebServlet("/ListUserServlet")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<String> list = new ArrayList<String>();
		list.add("naresh");
		list.add("siva");
		
		request.setAttribute("USERS", list);
		
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
	}

}
