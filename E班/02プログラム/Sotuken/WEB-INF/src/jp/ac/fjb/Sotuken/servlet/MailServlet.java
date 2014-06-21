package jp.ac.fjb.Sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.bean.LoginBean;

import jp.ac.fjb.Sotuken.model.UserMailModel;

public class MailServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		exe(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		exe(req, resp);
	}

	public void exe(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession(); // セッション
		String jspName = ""; // 遷移先JSP名
		String progId = req.getParameter("progId"); // プログラムIDを取得
		String[] mail = req.getParameterValues("mail"); // メール情報取得
		String userId = ((LoginBean) s.getAttribute("LOGIN_USER")).getUserId(); // ログインユーザの取得
		// String userId = req.getParameter("userId");
		System.out.println("ユーザID" + userId); // ユーザIDを取得
		// String userId = "0000001";
		// String progId = "0";
		// String[] mail = {"M000010","M000013"};

		UserMailModel model = new UserMailModel();

		// IDに応じたプログラムの処理
		if (progId == null || progId.equals("0")) {

			// メール一覧の取得
			ArrayList<UserMailBean> list = model.getMailList(userId, "MT0");

			// セッションにセット
			s.setAttribute("MAIL_LIST", list);

			// 遷移先JSPを受信箱に設定
			jspName = "010mail.jsp";

		} else if (progId.equals("1")) {

			// 削除をされた際の処理
			model.updateMail(mail, userId, "MT3");

			// メール一覧の取得
			ArrayList<UserMailBean> list = model.getMailList(userId, "MT0");

			// セッションにセット
			s.setAttribute("MAIL_LIST", list);

			// 遷移先JSPを受信箱に設定
			jspName = "010mail.jsp";

			// } else if (progId.equals("2")) {

			// // メール一覧の取得
			// ArrayList<UserMailBean> list = model.getMailList(userId, "MT3");
			//
			// // セッションにセット
			// s.setAttribute("MAIL_LIST", list);
			//
			// // 遷移先JSPを受信箱に設定
			// jspName = "010mail.jsp";
		}

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}
