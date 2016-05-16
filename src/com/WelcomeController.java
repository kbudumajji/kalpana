package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class WelcomeController 
{
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView helloworld()
    {
		System.out.println("hiiiiiiiiiiiiiiii");
        String message="Welcome to AppDev";
        return new ModelAndView("hellopage","msg",message);
    }
    

}
