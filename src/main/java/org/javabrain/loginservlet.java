package org.javabrain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;

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
                String idToken = req.getParameter("id_token");
                GoogleIdToken.Payload payLoad = IdTokenVerifierAndParser.getPayload(idToken);
                String name = (String) payLoad.get("name");
                String email = payLoad.getEmail();
                System.out.println("User name: " + name);
                System.out.println("User email: " + email);

                HttpSession session = req.getSession(true);
                session.setAttribute("userName", name);
                req.getServletContext()
                   .getRequestDispatcher("/profile.jsp").forward(req, resp);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

