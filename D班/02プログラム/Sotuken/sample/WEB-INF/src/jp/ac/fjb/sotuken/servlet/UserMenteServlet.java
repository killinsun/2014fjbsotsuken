package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.UserMenteModel;

public class UserMenteServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();			// セッション
		String jspName = "";						// 遷移先JSP名
		String progId = req.getParameter("progId");	// プログラムIDを取得


		// 【モデルの呼び出し】プログラムIDに応じた処理
		if ( progId.equals("0") ) {
			// 新規登録の場合、空のユーザをセッションにセットし、詳細画面へ
			UserBean user = new UserBean();
			s.setAttribute("MENTE_USER", user);

			// 実行する処理区分を記録
			s.setAttribute("MENTE_PROCESS", "TOUROKU");

			// 遷移先のJSP名
			jspName = "U004UserMenteTouroku.jsp";

		} else if ( progId.equals("1") || progId.equals("2") ) {
			// 変更・削除の場合、処理対象となるユーザ情報を取得
			UserMenteModel model = new UserMenteModel();
			UserBean user = model.getUser(req.getParameter("user"));
			s.setAttribute("MENTE_USER", user);

			if ( progId.equals("1") ) {
				// 実行する処理区分を記録
				s.setAttribute("MENTE_PROCESS", "HENKOU");

				// 遷移先のJSP名
				jspName = "U005UserMenteHenkou.jsp";

			} else if ( progId.equals("2") ) {
				// 実行する処理区分を記録
				s.setAttribute("MENTE_PROCESS", "SAKUJO");

				// 遷移先のJSP名
				jspName = "U006UserMenteKakunin.jsp";

			}

		} else if ( progId.equals("3") ) {
			// メニューに戻る
			jspName = "U002Menu.jsp";

		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
