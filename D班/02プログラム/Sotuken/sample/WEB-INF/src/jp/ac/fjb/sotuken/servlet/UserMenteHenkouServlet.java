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

public class UserMenteHenkouServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();			// セッション
		String jspName = "";						// 遷移先JSP名
		String progId = req.getParameter("progId");	// プログラムIDを取得


		// プログラムIDに応じた処理
		if ( progId.equals("0") ) {
			// 変更の場合

			// 画面の入力値を取得
			req.setCharacterEncoding("UTF-8");
			String userName = req.getParameter("userName");
			String userType = req.getParameter("userType");
			String passWord = req.getParameter("passWord");
			String passWord2 = req.getParameter("passWord2");
			String mailAddress = req.getParameter("mailAddress");
			String birthDay = req.getParameter("birthDay");
			String address = req.getParameter("address");

			// セッションからメンテ対象のユーザを取得
			UserBean user = (UserBean)s.getAttribute("MENTE_USER");

			// 画面の入力値で書き換え
			user.setUserName(userName);
			user.setUserType(userType);
			user.setPassWord(passWord);
			user.setMailAddress(mailAddress);
			user.setBirthDay(birthDay);
			user.setAddress(address);

			// セッションにセット
			s.setAttribute("MENTE_USER", user);

			// 遷移先のJSPを確認画面にする
			jspName = "U006UserMenteKakunin.jsp";

		} else if ( progId.equals("1") ) {
			// 戻るの場合、遷移先を一覧画面に設定
			jspName = "U003UserMente.jsp";

		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
