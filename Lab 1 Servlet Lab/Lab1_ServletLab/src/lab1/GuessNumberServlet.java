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

		final int targetNumber = 8;
		int numberInput = Integer.parseInt(request.getParameter("number"));
		if (numberInput == targetNumber) {
			out.print("<p>Correct, Congratulations</p>");
		} else if (numberInput > targetNumber) {
			out.print("<p>Too high, try again </p>");
		} else if (numberInput < targetNumber) {
			out.print("<p>Too low, try again </p>");
		} else
			out.print("<p>Are you sure it is an integer? </p>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
