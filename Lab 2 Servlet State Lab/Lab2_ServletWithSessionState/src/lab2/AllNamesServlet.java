package lab2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AllNames")
public class AllNamesServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form method='get'>");
		out.println("Username=<input type=text name=username> <br>");
		out.println("Password=<input type=text name=password >");
		out.println("<input type=submit value='Logon'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

		if (request.getParameter("username").equals("user") && request.getParameter("password").equals("pass")) {
			out.print("<p>You are logged in </p>");
			doPost(request, response);
		} else {
			out.print("<p>Wrong user id or password! Please try again </p>");
		}
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>Start the Basic Get Post Demo</h1>");
		out.print("<a href='GuessNumber'> Start the Guess Number app</a>");
		out.print("</body></html>");
	}
}
