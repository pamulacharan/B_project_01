/**
 * 
 */
package Pamula;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings({ "serial" })
public class Adding extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i =	Integer.parseInt(req.getParameter("num1"));
		int j =	Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		PrintWriter out = res.getWriter();
		out.println("The Sum of "+i+" and "+j+" is "+k);
	}
	
}
