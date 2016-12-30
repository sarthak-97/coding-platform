package org.spring;



	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.AbstractController;
	
	public class hellocontroller {
	
		@RequestMapping("/welcome")
		public ModelAndView helloworld(){
			
			ModelAndView modelandview = new ModelAndView("hellopage");
			modelandview.addObject("welcome","hi user this is spring app");
			
			return modelandview;
			
		}
		@RequestMapping("/index")
		public ModelAndView hello(){
			
			ModelAndView model = new ModelAndView("index");
			model.addObject("welcome","hi user this is spring app");
			
			return model;
	}
			
		@RequestMapping(value = "/profile", method = RequestMethod.GET)
		public ModelAndView redirect() {

		  return new ModelAndView("redirect:profile");
		}
		
	}

