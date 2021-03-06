package lab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Name")
public class AllNamesServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Person> personList = (ArrayList<Person>) sess.getAttribute("personList");
		if (personList == null) {
			personList = new ArrayList<Person>();
			sess.setAttribute("personList", personList);
		}

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		// show all names
		out.print("<h1> Show all Names</h1>");
		out.println("<form action=Name method='get'>");
		out.println("<input type=submit value='Show Names'></form>");
		for (Person p : personList) {
			out.print("<p>key :   " + p.getKey() + "</p>");
			out.print("<p>first name : " + p.getFirstName() + "</p>");
			out.print("<p>last name :  " + p.getLastName() + "</p><br>");
		}

		// add
		out.print("<h1>Add a Name</h1>");
		out.println("<form action=AddName method='get'>");
		out.println("Key=<input type=text name=key> <br>");
		out.println("First Name=<input type=text name=firstName> <br>");
		out.println("Last Name=<input type=text name=lastName >");
		out.println("<input type=submit value='Add'>");
		out.println("</form>  <br>");

		// remove
		out.print("<h1>Remove a Name</h1>");
		out.println("<form action=RemoveName method='get'>");
		out.println("Key=<input type=text name=key> <br>");
		out.println("<input   type=submit value='Remove'>");
		out.println("</form></body>");
		out.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
