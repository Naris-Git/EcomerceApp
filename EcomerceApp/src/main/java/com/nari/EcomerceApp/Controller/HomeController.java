package com.nari.EcomerceApp.Controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/")
public class HomeController {
	
	@GetMapping(" ")
	public String greet(HttpServletRequest request) {

		return "Hello Nari welcome to Ecomerce App.."+request.getSession().getId();
	}

	@GetMapping("csrf-token")
	public CsrfToken getCSRFToken(HttpServletRequest request){

		return  (CsrfToken) request.getAttribute("_csrf");


	}
	
}
