package jp.ac.fjb.sns.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.model.LoginModel;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

	req.setCharacterEncoding("UTF-8");

	HttpSession s = req.getSession();
	String link = "";
	String id = req.getParameter("id");
	String pswd = req.getParameter("pass");

	System.out.println("id:" + id);
	System.out.println("pass:" + pswd);

	LoginModel model = new LoginModel();
	UserBean user = model.getUser(id, pswd);

	if (user == null) {
		// ログインできなかった
		s.setAttribute("ERROR_LOGIN", "IDまたはパスワードが違います");
		// 遷移先JSPを検索画面に設定
		link = "U001Login.jsp";
	} else {
		// ログイン成功時
		s.setAttribute("ERROR_LOGIN", "");
		s.setAttribute("LOGIN_USER", user);
		// 遷移先をメインチャット画面に設定
		link = "MainServlet";
	}

	// 遷移先JSPを受け渡す
    RequestDispatcher dp = req.getRequestDispatcher(link);
    dp.forward(req, resp);







 }
}
