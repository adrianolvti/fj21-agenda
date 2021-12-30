/**
 * 
 * This worked for me:
 * 1 Project > Build Automatically (Make sure it's turned on)
 * 2 Project > Clean ...
 * 3 Right click Tomcat > Properties > General Tab > Switch Location (switch from workspace metadata to Server at localhost.server)
 * 4 Restart Eclipse
 * 5 Run Project As Server
 * 
 */


package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/OiMundo", "/oi" })
public class OiMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Primeira Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Primeira servlet</h1>");
		out.println("</body>");
		out.println("</html");
	}


}
