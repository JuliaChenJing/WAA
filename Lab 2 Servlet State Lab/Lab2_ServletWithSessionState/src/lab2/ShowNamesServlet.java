package lab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowNames")
public class ShowNamesServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static ArrayList<Person> personList = new ArrayList<Person>();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><title> Names</title></head><body>");
		out.print("<h1> Show Names</h1>");
		for (Person p : personList) {
			out.print("<p>key :   " + p.getKey() + "</p>");
			out.print("<p>first name : " + p.getFirstName() + "</p>");
			out.print("<p>last name :  " + p.getLastName() + "</p>");
		}
		out.print("</body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	static void removePersonByKey(String deletedKey) {
		for (Person p : personList) {
			if (p.getKey().equals(deletedKey)) {
				personList.remove(p);
			}
		}
	}
}
