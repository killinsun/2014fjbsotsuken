package jp.ac.fjb.onsen.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.UserBean;
import jp.ac.fjb.onsen.model.LoginModel;



public class LoginServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション
		String jspName = "Login.jsp";				// 遷移先JSP名
		s.removeAttribute("ERROR_LOGIN");
		s.removeAttribute("LOGIN_USER");
		s.removeAttribute("LOGIN_USERsei");

		// IDとパスワードを取得
		String userId = req.getParameter("id");
		String password = req.getParameter("pass");

		System.out.println("ユーザID:"   + userId);
		System.out.println("パスワード:" + password);

		// 【モデルの呼び出し】ログイン判定
		LoginModel model = new LoginModel();
		UserBean user = model.getUser(userId, password);
		if ( user == null ) {
			// ユーザを取得出来なかった場合、エラーメッセージをセット
			s.setAttribute("ERROR_LOGIN", "IDまたはパスワードが違います");

			// ログイン画面に戻す
			jspName = "Login.jsp";
		} else {
			// ユーザを取得できた場合、ユーザ情報をセッションにセット
			s.removeAttribute("ERROR_LOGIN");
			s.setAttribute("LOGIN_USER", user);
			s.setAttribute("LOGIN_USERsei", user.getSei());

			// メニュー画面に遷移
			jspName = "OnsenTop.jsp";
		}
		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}
}
