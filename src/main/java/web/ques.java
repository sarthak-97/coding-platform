package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrain.questions;

/**
 * Servlet implementation class ques
 */
public class ques extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a,b,c,d,e,f,g;
		a=request.getParameter("t1");
		b=request.getParameter("t2");
		c=request.getParameter("t3");
		d=request.getParameter("t4");
		e=request.getParameter("t5");
		f=request.getParameter("t6");
		g=request.getParameter("t7");
		System.out.println(a);
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	     
	      Session session =	sessionFactory.openSession();
	      session.beginTransaction();	
	      questions user = new questions();
	      user.setTitle(a);
	      user.setDetail(b);
	      user.setConstraints(c);
	      user.setSampletestcase(d);
	      user.setInputtestcase(e);
	      user.setOutputtestcase(f);
	      user.setInputformat(g);
	      session.save(user);
	      session.getTransaction().commit();
	      session.close();
	      
	}

}
