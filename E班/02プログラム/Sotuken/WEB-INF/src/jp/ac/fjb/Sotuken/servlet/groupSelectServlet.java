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
import jp.ac.fjb.Sotuken.bean.groupSelectBean;
import jp.ac.fjb.Sotuken.model.groupSelectModel;

public class groupSelectServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//入れるとエラーでる 文字化けしないからいらないかもしれない
		//req.setCharacterEncoding("UTF-8");

		//セッションゲット どこから？なにを？
		HttpSession s = req.getSession();

		//嘘だから後で消すこと!
		//String userID = <String>s.getAttribute(ここに受け取るセッション名);
		String userID = ((LoginBean) s.getAttribute("LOGIN_USER")).getUserId();//ログインユーザの取得
		//String userID = "0000002";
		s.setAttribute("USER_ID", userID);

		//最初エラーでるよ！でも実行できるよ！
		groupSelectModel model = new groupSelectModel();
		ArrayList<groupSelectBean> list = model.getGroupSelect(userID);

		s.setAttribute("GROUP_SELECT", list);

		//ビューの先は同じだと思う
		RequestDispatcher dp = req.getRequestDispatcher("groupSelect.jsp");
		dp.forward(req, resp);

	}
}