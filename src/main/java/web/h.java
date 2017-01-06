
package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class h
 */@WebServlet(urlPatterns = {"/h"})
public class h extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String a,lang;
		a=request.getParameter("editor2");
        lang=request.getParameter("lang");	

	       request.setAttribute("t2",lang );
<<<<<<< HEAD
	      
	       request.getRequestDispatcher("/NewFile.html").forward(request, response);
=======
	       request.setAttribute("t3",a ); 
	       request.getRequestDispatcher("NewFile.jsp").forward(request, response);
>>>>>>> c2aa80f0de55303e83c063fe678894b1d73212b1
	        
	}

}

