package org.spring;



	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.AbstractController;
	@Controller
	public class hellocontroller {
	
		@RequestMapping("/welcome")
		public ModelAndView helloworld(){
			
			ModelAndView modelandview = new ModelAndView("hellopage");
			modelandview.addObject("welcome1","hi user this is spring app");
			
			return modelandview;
			
		}
		@RequestMapping("/queschoose")
		public ModelAndView hello(){
			
			ModelAndView model = new ModelAndView("quespage");
			model.addObject("welcome","hi user this is spring app");
			SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
			 Session session =	sessionFactory.openSession();
  	         session.beginTransaction();
  	       Query queryResult = session.createQuery("from questions");
			
			
			return model;
	}
			
		
		
	}

