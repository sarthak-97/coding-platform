package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import org.hibernate.Query;
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
		

	        try {
	            String idToken = request.getParameter("id_token");
	            GoogleIdToken.Payload payLoad = IdToken.getPayload(idToken);
	            String name = (String) payLoad.get("name");
	            String email = payLoad.getEmail();
	            System.out.println("User name: " + name);
	            System.out.println("User email: " + email);

	            HttpSession session = request.getSession(true);
	            session.setAttribute("user_id", name);
	            request.getServletContext()
	               .getRequestDispatcher("profile.jsp").forward(request, response);

	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
}
