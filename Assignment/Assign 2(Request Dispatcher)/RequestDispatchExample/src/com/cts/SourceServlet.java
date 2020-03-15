package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("from doGet sourceservlet");
		String custName = req.getParameter("CustomerName");
		int term = Integer.parseInt(req.getParameter("term"));
		int premiumamount = Integer.parseInt(req.getParameter("primium"));
		req.setAttribute("CustomerName", custName);
		req.setAttribute("noofYears", term);
		req.setAttribute("amount", premiumamount);
		System.out.println("your paid amount==" + (premiumamount * term));
		PrintWriter pw=resp.getWriter();
		pw.write("<h1> your paid amount &nbsp; &nbsp;"+(premiumamount*term)+"</h1>");
		
		
		resp.sendRedirect("https://www.w3schools.com/java/");
		/*
		 * RequestDispatcher dispatcher = req.getRequestDispatcher("//http://localhost:8080/WebApp2/login.html");
		 * dispatcher.include(req, resp);
		 */
	}
}