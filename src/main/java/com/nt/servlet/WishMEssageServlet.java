package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WishMEssageServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		//get printwriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//wri7te logic to generate the wish message
		LocalDateTime ldt=LocalDateTime.now();//now is static method of date and time api
		int hour=ldt.getHour();
		pw.println("<h1 style='color:red;text-align:centre'>"+ldt.toString()+"</h1>");
		if(hour<12)
			pw.println("<h1 style='color:orange;text-align:centre'>Goodmorning</h1");
		else if(hour<16)
			pw.println("<h1 style='color:orange;text-align:centre'>Good afternoon </h1");
		else if(hour<20)
			pw.println("<h1 style='color:orange;text-align:centre'>Good evneing</h1");
		else
			pw.println("<h1 style='color:orange;text-align:centre'>good night</h1");
			
		//add home hyperlink
		pw.println("<br> <a href=http://localhost:9090/WishApp/page.html>home</a>");
		//close streams
		pw.close();
	}

}
