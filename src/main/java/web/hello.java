package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrain.userdet;

/**
 * Servlet implementation class hello
 */
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a,b,c;
		a=request.getParameter("user_id");
		b=request.getParameter("user_email");
		c=request.getParameter("user_img");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	      userdet user = new userdet();
	      Session session =	sessionFactory.openSession();
	      session.beginTransaction();	
	      user.setName(a);
	      user.setEmailid(b);
	      user.setAvatar(c);
	      session.save(user);
	      session.getTransaction().commit();
	      session.close();
	}

}
