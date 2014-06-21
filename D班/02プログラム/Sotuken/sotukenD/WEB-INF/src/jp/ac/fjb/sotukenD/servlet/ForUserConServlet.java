package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.UserContactBean;
import jp.ac.fjb.sotukenD.model.ContactModel;

public class ForUserConServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();

		ContactModel model = new ContactModel();
		ArrayList<UserContactBean> decisionContact =model.getUserList();

		s.setAttribute("USER_CONTACT", decisionContact);

		RequestDispatcher dp = req.getRequestDispatcher("/userManagement/contactList.jsp");
		dp.forward(req, resp);

	}

}
