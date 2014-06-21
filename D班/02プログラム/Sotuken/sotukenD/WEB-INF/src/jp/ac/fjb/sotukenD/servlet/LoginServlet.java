package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.model.LoginModel;
import jp.ac.fjb.sotukenD.bean.LoginFormBeans;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名

		String userId = req.getParameter("userID");
		String password = req.getParameter("userPass");

		System.out.println("ユーザID:"   + userId);
		System.out.println("パスワード:" + password);

		// 【モデルの呼び出し】ログイン判定
		LoginModel model = new LoginModel();
		LoginFormBeans user = model.getUser(userId, password);

		if ( user == null ) {
			// ユーザを取得出来なかった場合、エラーメッセージをセット
			s.setAttribute("ERROR_LOGIN", "IDまたはパスワードが違います");

			// ログイン画面に戻す
			jspName = "login.jsp";

		} else {
			// ユーザを取得できた場合、ユーザ情報をセッションにセット
			s.setAttribute("LOGIN_USER", user);

			// メニュー画面に遷移
			jspName = "MainServlet";
		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}
