package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.userregisterFormBean;
import jp.ac.fjb.sotuken.model.UsertourokuModel;

public class userkakuninServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//セッションからユーザー情報を取得
		  HttpSession s = req.getSession();
		  userregisterFormBean user = (userregisterFormBean)s.getAttribute("REGISTER_USER");

		//ユーザー情報の登録
        UsertourokuModel model = new UsertourokuModel();
		int count = model.insertUser(user);

		// 【ビューの呼び出し（次の画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher("/userend.jsp");
		dp.forward(req, resp);
	}

}

