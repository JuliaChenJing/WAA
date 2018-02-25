package lab1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GuessNumber")
public class GuessNumberServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Guess A Number</title></head><body>");
		out.println("<form method='get'>");
		out.print("<p>Please Choose a number</p>");
		out.println("number=<input type=text name=number>");
		out.println("<input type=submit value='Try this number'>");
		out.println("</form>");
		out.print("</body></html>");

		final String targetNumber = "8";
		if (request.getParameter("number").equals(targetNumber)) {
			out.print("<p>You Got it </p>");
		} else
			out.print("<p>Wrong Number </p>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
