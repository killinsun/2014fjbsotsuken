package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForUserSignServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		String progId = req.getParameter("progId");
//		if (progId == null) {
//			if (progId.equals("4")) {
//			}

			RequestDispatcher dp = req
					.getRequestDispatcher("/userManagement/userSign.jsp");
			dp.forward(req, resp);

//		}
	}
}
