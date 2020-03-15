package com.cts.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookiesHandler1")
public class CookiesHandler1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String creditCardNumber =req.getParameter("creditCardNumber");
		String password=req.getParameter("password");
		Cookie cookie =new Cookie(creditCardNumber, password);
		cookie.setMaxAge(24*365*7);
		resp.addCookie(cookie);
	RequestDispatcher rd=req.getRequestDispatcher("/CookiesHandler2");
	rd.forward(req, resp);
	}
}
