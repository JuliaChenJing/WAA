package lab3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSPServlet
 */
@WebServlet("/Guess")
public class GuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("guess.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final int targetNumber = 8;
		String output = "";

		try {
			int numberInput = Integer.parseInt(request.getParameter("number"));
			if (numberInput == targetNumber) {
				output = "Correct, Congratulations";
			} else if (numberInput > targetNumber) {
				output = "Too high, try again ";
			} else if (numberInput < targetNumber) {
				output = "Too low, try again";
			} else
				output = "Are you sure it is an integer? ";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			output = "Are you sure it is an integer? ";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("guess.jsp");
		request.setAttribute("output", output);
		dispatcher.forward(request, response);
	}

}