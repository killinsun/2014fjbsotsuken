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
import jp.ac.fjb.sotukenD.bean.MailSendFormBeans;
import jp.ac.fjb.sotukenD.bean.MainFormBeans;
import jp.ac.fjb.sotukenD.model.MailSendModel;
import jp.ac.fjb.sotukenD.model.MainModel;

public class MailSendServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();
		String jspName = "";						// 遷移先JSP名


			// 画面の入力値を取得
			req.setCharacterEncoding("UTF-8");
			String title = req.getParameter("title");
			String main = req.getParameter("mainText");
			String sendAddress = req.getParameter("sendAddress");

			// Beanに入力値を詰める
			MailSendFormBeans user = new MailSendFormBeans();
			user.setMailAddress(sendAddress);
			user.setTitle(title);
			user.setMain(main);

			MailSendModel sendModel = new MailSendModel();
			sendModel.insertMail(user);

			// 受信メールを再取得
			MainModel model = new MainModel();
			ArrayList<MainFormBeans> mailj = model.getUser(((LoginFormBeans)s.getAttribute("LOGIN_USER")).getUserId());

			// セッションにセット
			s.setAttribute("USER_MAIL", mailj);


			// 遷移先のJSPを確認画面にする
			jspName = "main.jsp";

			// 【ビューの呼び出し】
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);

	}

}
