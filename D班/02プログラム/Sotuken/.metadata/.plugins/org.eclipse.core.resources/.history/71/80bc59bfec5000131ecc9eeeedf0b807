package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.UserMenteModel;

public class UserMenteKakuninServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();			// セッション
		String jspName = "";						// 遷移先JSP名
		String progId = req.getParameter("progId");	// プログラムIDを取得
		String process = (String)s.getAttribute("MENTE_PROCESS");	// メンテナンス処理区分を取得（登録・更新・削除の区別）

		// プログラムIDに応じた処理
		if ( progId.equals("0") ) {
			// 確認ボタンが押された場合

			// メンテユーザの情報を取得
			UserBean user = (UserBean)s.getAttribute("MENTE_USER");

			//【モデルの呼び出し】処理区分に応じてメソッドを呼び出す
			UserMenteModel model = new UserMenteModel();

			if ( process.equals("TOUROKU") ) {
				model.insertUser( user );

			} else if ( process.equals("HENKOU") ) {
				model.updateUser( user );

			} else if (  process.equals("SAKUJO")  ) {
				model.deleteUser( user );

			}

			// 処理後のユーザ一覧を取得
			ArrayList list = model.getUserList();

			// セッションにセット
			s.setAttribute("MENTE_USER_LIST", list);

			// 遷移先JSPを一覧画面に指定
			jspName = "U003UserMente.jsp";

		} else if ( progId.equals("1") ) {
			// 戻るボタンが押された場合

			// 処理に応じて前画面に戻る
			if ( process.equals("TOUROKU") ) {
				jspName = "U004UserMenteTouroku.jsp";

			} else if ( process.equals("HENKOU") ) {
				jspName = "U005UserMenteHenkou.jsp";

			} else if (  process.equals("SAKUJO")  ) {
				jspName = "U003UserMente.jsp";

			}

		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
