package com.diegofdez.urbanart.batch;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/gato/*"}, loadOnStartup = 1)
public class JettyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException
	{
		response.getOutputStream().print("Hello World");
	}
	
}
