package com.skl;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calcultor")
public class Calculator extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{		PrintWriter out=res.getWriter();
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		
		String op =req.getParameter("op");
	
		
		if(op.equals("+"))
		{
		out.println("sum is" +(i+j));	
		}
		else if(op.equals("-"))
		{
		out.println("Difference is" +(i-j));	
		}
		else if(op.equals("*"))
		{
			out.println("Product is" +(i*j));
		}
		else 
		{
			out.println("Division is" +(i/j));
		}
		out.close();
	}
}
