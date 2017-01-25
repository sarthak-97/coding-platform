
package web;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class h1
 */@WebServlet(urlPatterns = {"/h1"})
public class h1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String a,lang;
		a=request.getParameter("source");
        lang=request.getParameter("lang");	

	       System.out.println(a);
	       System.out.println(lang); 
	       

	   
	   		

	   	    // HTTP POST request
	   	  

	   	        String url = "http://api.hackerrank.com/checker/submission.json";
	   	        URL obj = new URL(url);
	   	        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	   	        //add request header
	   	        con.setRequestMethod("POST");
	   	     con.setRequestProperty("User-Agent","chrome");
	   	        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

	   	        String urlParameters = "source=print 1&lang=5&testcases=[\"1\"]&api_key=hackerrank|1466488-1173|ece751e6f0df6c5c8fc1e8c3498da5c1b5d73f86";

	   	        // Send post request
	   	        con.setDoOutput(true);
	   	        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	   	        wr.writeBytes(urlParameters);
	   	        wr.flush();
	   	        wr.close();

	   	        int responseCode = con.getResponseCode();
	   	        System.out.println("\nSending 'POST' request to URL : " + url);
	   	        System.out.println("Post parameters : " + urlParameters);
	   	        System.out.println("Response Code : " + responseCode);

	   	        BufferedReader in = new BufferedReader(
	   	                new InputStreamReader(con.getInputStream()));
	   	        String inputLine;
	   	        StringBuffer responses = new StringBuffer();

	   	        while ((inputLine = in.readLine()) != null) {
	   	            responses.append(inputLine);
	   	        }
	   	        in.close();

	   	        //print result
	   	        System.out.println(responses.toString());

	   	    }

	        
	

}
 


 