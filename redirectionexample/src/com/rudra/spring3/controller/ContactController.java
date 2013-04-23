package com.rudra.spring3.controller;
 
 
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rudra.spring.page.factory.IPageDetailsFactory;
import com.rudra.spring.page.factory.MessageFactory;
import com.rudra.spring.page.factory.PageDetailsFactory;
import com.rudra.spring.page.value.Message;
import com.rudra.spring3.form.Contact;
 
@Controller
@SessionAttributes
public class ContactController {
	
	IPageDetailsFactory factory = PageDetailsFactory.getFactory();
	Message message = new Message(); 
 
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
         
        System.out.println("First Name:" + contact.getFirstname() + 
                    "Last Name:" + contact.getLastname());
         
        return "redirect:contacts.gaur";
    }
    
    @RequestMapping("/contacts")
    public ModelAndView showContacts() {
         Contact co = new Contact();
         co.setFirstname("this is first nam");
        return new ModelAndView("contact", "command", co);
    }
    
    @RequestMapping("/home")
    public ModelAndView showHome() {
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("home"));
    }
    
    @RequestMapping("/aboutUS")
    public ModelAndView showAboutUS() {
    	return new ModelAndView("body", "pagedetails", factory.getPageDetails("aboutus"));
    }
    
    @RequestMapping("/events")
    public ModelAndView showEvents() {
    	return new ModelAndView("body", "pagedetails", factory.getPageDetails("events"));
    }
    
    @RequestMapping("/ourWork")
    public ModelAndView showourWork() {
    	return new ModelAndView("body", "pagedetails", factory.getPageDetails("ourwork"));
    }
    
    @RequestMapping("/contactUs")
    public ModelAndView showContactUs() {
    	return new ModelAndView("body", "pagedetails", factory.getPageDetails("contactUs"));
    }
    
    @RequestMapping("/thankYou")
    public ModelAndView showThankYou() {
    	return new ModelAndView("body", "pagedetails", factory.getPageDetails("thankYou"));
    }
    
    @RequestMapping("/contacts3")
    public ModelAndView showContacts3() {
    	 System.out.println("First Name:" );
        return new ModelAndView("contact3", "command", new Contact());
    }
}