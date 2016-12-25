package web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrain.userdet;

/**
 * Servlet implementation class hello
 */
public class ques extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a,b,c,d,e,f;
		a=request.getParameter("t1");
		b=request.getParameter("t2");
		c=request.getParameter("t3");
		d=request.getParameter("t4");
		e=request.getParameter("t5");
		f=request.getParameter("t6");
	
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	     
	      Session session =	sessionFactory.openSession();
	      session.beginTransaction();	
	}
}