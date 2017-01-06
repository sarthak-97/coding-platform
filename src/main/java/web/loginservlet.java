package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrain.userdet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet(urlPatterns = {"/login"})
@Repository
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
  }

       @Autowired
	

		@Override
        protected void doPost (HttpServletRequest req,
                            HttpServletResponse resp)
                            throws ServletException, IOException {

    

            try {
                String idToken = req.getParameter("t2");
                GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(idToken);
                String name = (String) payLoad.get("name");
                String email = payLoad.getEmail();
                String avatar= (String) payLoad.get("picture");
                System.out.println("User name: " + name);
                System.out.println("User email: " + email);
                System.out.println("avatar" + avatar);
                SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
                Session session =	sessionFactory.openSession();
      	         session.beginTransaction();
      	       Query queryResult = session.createQuery("from userdet");
    	       java.util.List allUsers;
    	       String pa,na,a,b,c;
    	       
    	       allUsers = queryResult.list();
    	       int f;
    	       f=0;
    	       for (int i = 0; i < allUsers.size(); i++) {
    	        userdet user = (userdet) allUsers.get(i);
    	        pa=user.getEmailid();
    	        na=user.getName();
    	        a=user.getBranch();
    	        b=user.getYear();
    	        if(email.equals(pa) ){
    	         if( b==null){
    	        	 f=2;
    	        	 break;
    	         }
    	         else 
    	         {
    	        	 f=1;
    	         }
    	         break; 
    	         }
    	        }
    	         
    	           if(f!=1 & f!=2){
    	        	   
    	        	   
    	        userdet user= new userdet();  
    	      user.setName(name);
    	      user.setEmailid(email);
    	      user.setAvatar(avatar);
    	      session.save(user);
    	      session.getTransaction().commit();
    	      session.close();
    	      user=null;
    	       System.out.println(name);
    	       req.setAttribute("t4", name);
		       req.getRequestDispatcher("/profile.jsp").forward(req, resp);
	         
    	}
    	           else
    	           { 
    	        	   if(f==2){
                           System.out.println("no year record found");
    				       req.setAttribute("t4", name);
    				       req.getRequestDispatcher("/profile.jsp").forward(req, resp);
    	    	         
    	        		   
    	        	   }
    	        	   else{
    	        	   System.out.println("duplicate");
    	         
			       req.setAttribute("t4", name);
			       req.getRequestDispatcher("/dash.jsp").forward(req, resp);
    	         
    	           }
    	           }
      	      
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

