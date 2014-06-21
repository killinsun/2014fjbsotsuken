package jp.ac.fjb.Sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.LoginBean;
import jp.ac.fjb.Sotuken.bean.MyPageFormBean;
import jp.ac.fjb.Sotuken.model.LoginModel;
import jp.ac.fjb.Sotuken.model.MyPageModel;

public class IndexServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest reqp, HttpServletResponse respp) throws ServletException ,IOException {
		this.doPost(reqp, respp);

	};

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession(); // セッション
		String jspName = ""; // 遷移先JSP名

		// IDとパスワードを取得
		String Member = req.getParameter("userid");
		String PassWord = req.getParameter("password");

		System.out.println("メンバーID:" + Member);
		System.out.println("パスワード:" + PassWord);
		// 【モデルの呼び出し】ログイン判定
		LoginModel model = new LoginModel();
		LoginBean user = model.getUser(Member, PassWord);


		if (user == null) {
			// ユーザを取得出来なかった場合、エラーメッセージをセット
			s.setAttribute("ERROR_LOGIN", "IDまたはパスワードが違います");

			jspName = "index.jsp";

		} else {
			// ユーザを取得できた場合、ユーザ情報をセッションにセット
			s.setAttribute("LOGIN_USER", user);

			// エラーをクリア
			s.setAttribute("ERROR_LOGIN", "");

			// メニュー画面に遷移
			jspName = "004myPage.jsp";

			//モデルの呼び出し
			MyPageModel model2 = new MyPageModel();
			ArrayList<MyPageFormBean> mpfb = model2.getTweetList();


			//セッションにセット
			s.setAttribute("TWEET_LIST", mpfb);

		}

		// 【ビューの呼び出し（ログインの次の画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}
