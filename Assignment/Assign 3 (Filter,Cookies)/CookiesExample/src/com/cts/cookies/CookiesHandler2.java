package com.cts.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesHandler2")
public class CookiesHandler2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		Cookie cookie[] =req.getCookies();
		if(cookie!=null) {
			for(Cookie cookie2:cookie) {
				out.write("<h2>" + cookie2.getName()+"&nbsp;&nbsp;&nbsp;"+cookie2.getValue());
				
			}
		}
		else {
			out.write("<h1> No cooies are associated with the current session </h1>");
		}
	}
	
	
	/**
	 * 
	 */
}



