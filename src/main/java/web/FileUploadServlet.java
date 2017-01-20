package web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrain.questions;

@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
             maxFileSize=1024*1024*10,      // 10MB
             maxRequestSize=1024*1024*50)

public class FileUploadServlet extends HttpServlet {
	String a,b,c,d,e,f,g;
private static final String SAVE_DIR="images";
private String extractFileName(Part part) {
	 for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf('=') + 1).trim().replace("\"", "");
	        }
	        System.out.println(content);
	    }         
	    return null;
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,  IOException {
	
	a=request.getParameter("t1");
	b=request.getParameter("t2");
	c=request.getParameter("t3");
	d=request.getParameter("t4");
	e=request.getParameter("t5");
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
        String savePath = "C:" + File.separator + SAVE_DIR; //specify your path here
            File fileSaveDir=new File(savePath);
            if(!fileSaveDir.exists()){
                fileSaveDir.mkdir();
            }   
       /* 
        //You need this loop if you submitted more than one file
         * */
           
            PrintWriter out1 = response.getWriter();
        for (Part part : request.getParts()) {
        String fileName = extractFileName(part);
        part.write(savePath + File.separator + fileName);
    
      //you can change this part acc. to your requirements
        

// file name of the upload file is included in content-disposition header like this:
//form-data; name="dataFile"; filename="PHOTO.JPG"
String photo="";
String path="images";


InputStream filecontent = null;



try { 

filecontent = part.getInputStream();


int read = 0;
final byte[] bytes = new byte[1024];

while ((read = filecontent.read(bytes)) != -1) {


photo=path+"/"+fileName;


} 
System.out.println(photo);
}


catch(Exception e)
{

}





}
        out1.println ("<html><body><script>alert('Sucessfully Saved! Check the database and the path!');</script></body></html>");
}


}