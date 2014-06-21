package jp.ac.fjb.Sotuken.servlet;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.LoginBean;
import jp.ac.fjb.Sotuken.bean.UserMailBean;
import jp.ac.fjb.Sotuken.model.ContentDisplayModel;

public class ContentDisplayServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();			// セッション

		// ●●●①セッションからユーザIDを取得●●●
		String userId = ((LoginBean)s.getAttribute("LOGIN_USER")).getUserId();	//ユーザIDを取得
		//LoginBean UserContent   = (LoginBean)s.getAttribute("LOGIN_USER");
		System.out.println("ユーザID:" + userId);

		////////////////////////////////////////////////////////////////////////////
		//画面の入力値を取得

		String MailContent   = req.getParameter("MailId");
		System.out.println("メールID:" + MailContent);


		////////////////////////////////////////////////////////////////////////////
		ContentDisplayModel display = new ContentDisplayModel();


		UserMailBean umb = display.getContentDisplay(userId, MailContent);
		System.out.println("CDSevlet.umb->"+umb);

		// ②●●●●取得したメールをセッションに入れる●●●
		s.setAttribute("MAIL_USER",umb);


		////////////////////////////////////////////////////////////////////////////

		//画面遷移
		RequestDispatcher dp = req.getRequestDispatcher("014ContentDisplay.jsp");
		dp.forward(req, resp);


	}

}
