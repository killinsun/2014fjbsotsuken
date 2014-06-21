package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.model.UserMenteModel;

public class MenuServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();			// セッション
		String jspName = "";						// 遷移先JSP名
		String progId = req.getParameter("progId");	// プログラムIDを取得


		// 【モデルの呼び出し】プログラムIDに応じた処理
		if ( progId.equals("0") ) {
			// ユーザ一覧を取得
			UserMenteModel model = new UserMenteModel();
			ArrayList list = model.getUserList();

			// セッションにセット
			s.setAttribute("MENTE_USER_LIST", list);

			// 遷移先JSPをユーザメンテ画面に設定
			jspName = "U003UserMente.jsp";

		} else if ( progId.equals("1") ) {

			// 遷移先JSPを商品メンテ画面に設定
			jspName = "U004SyohinMente.jsp";

		} else if ( progId.equals("2") ) {

			// 遷移先JSPを売上情報メンテ画面に設定
			jspName = "U005UriageMente.jsp";

		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
