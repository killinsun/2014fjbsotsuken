package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.LoginFormBeans;
import jp.ac.fjb.sotukenD.bean.MailSFormBeans;
import jp.ac.fjb.sotukenD.model.MailSModel;

public class MailSServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();

		MailSModel model = new MailSModel();

		LoginFormBeans user = (LoginFormBeans)s.getAttribute("LOGIN_USER");

		String title = req.getParameter("subject");

		ArrayList<MailSFormBeans> list = model.getUser(user.getUserId());

		s.setAttribute("USER_LIST", list);

		RequestDispatcher dp = req.getRequestDispatcher("/mail/mailS.jsp");
		dp.forward(req, resp);
	}

}
