package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet(urlPatterns = {"/login"})
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
  }

        @Override
        protected void doPost (HttpServletRequest req,
                            HttpServletResponse resp)
                            throws ServletException, IOException {

            resp.setContentType("text/html");

            try {
                String idToken = req.getParameter("t2");
                GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(idToken);
                String name = (String) payLoad.get("name");
                String email = payLoad.getEmail();
                System.out.println("User name: " + name);
                System.out.println("User email: " + email);

               

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

