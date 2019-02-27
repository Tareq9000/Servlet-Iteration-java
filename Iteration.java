package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Iteration
 */
@WebServlet("/Iteration")
public class Iteration extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.print("<!DOCTYPE html><html><head>");
			out.print("<link href=\"Iteration.css\" rel=\"stylesheet\" type=\"text/css\"> ");
			out.print("<title>Iteration</title></head><body>");
			out.print("<table style=\"width:100%\"><tr><th>Zahl</th><th>Summe</th><th>Fakultät</th><th>Wurzel</th></tr>");
			for(int i = 1; i < 6; i++) {
				out.print("<tr>");
				out.print("<td>" + i + "</td>");
				Fakultät fak = new Fakultät();
				out.print("<td>" + fak.summe(i) + "</td>");
				out.print("<td>" + fak.fakultät(i) + "</td>");
				out.print("<td>" + Math.round(Math.sqrt(i)*100)/100.0 + "</td>");
				out.print("</tr>");
			}
			out.print("</body></html>");
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
