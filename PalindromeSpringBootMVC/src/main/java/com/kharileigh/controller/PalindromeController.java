/**
 *
 * @author kharileigh
 * <----- 2nd : Instatiate Service to use calculatePalindrome function ----->
 */

package com.kharileigh.controller;

import com.kharileigh.model.service.PalindromeService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PalindromeController {
    
    
    @Autowired
    private PalindromeService service;
    
    // 1st View - Main
    @RequestMapping("/")
    public ModelAndView mainController() {
        
        return new ModelAndView("index");
    }
    
    // 2nd View - Palindrome
    @RequestMapping("/calculate")
    public ModelAndView palindromeController(HttpServletRequest request) {
    
        ModelAndView modelAndView = new ModelAndView();
        
        int inputNum = Integer.parseInt(request.getParameter("number"));
        boolean palindrome = service.isPalindrome(inputNum);
        
        if(palindrome == true) {
            System.out.println("This number is a Palindrome");
        } else {
            System.out.println("This number is NOT a Palindrome");
        }
        
        
        modelAndView.addObject("palin", palindrome);
        modelAndView.setViewName("Output");
        
        return modelAndView;
    }
}
