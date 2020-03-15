package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("from doget of targetservlet");
		String customerName = (String) req.getAttribute("CustomerName");
		Integer term = (Integer) req.getAttribute("noofYears");
		Integer premiumamount = (Integer) req.getAttribute("amount");
		double sumAssured = (premiumamount * term) + (premiumamount * term) * 20 / 100;
		System.out.println("Amount after maturity==" + sumAssured);
		
		PrintWriter pw=resp.getWriter();
		pw.write("<h1> Amount after Maturity &nbsp; &nbsp;"+sumAssured+"</h1>");
		
		
		

	}
}