package lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RemoveName")
public class RemoveNameServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key = request.getParameter("key");
		HttpSession sess = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Person> personList = (ArrayList<Person>) sess.getAttribute("personList");
		Iterator<Person> iterator = personList.iterator();
		while (iterator.hasNext()) {

			if (iterator.next().getKey().equals(key)) {
				iterator.remove();
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("Name");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
