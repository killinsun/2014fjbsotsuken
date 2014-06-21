package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserMenuNextServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String jspName = "";						// 遷移先JSP名
		String prog = req.getParameter("prog");	// プログラムIDを取得

		// 【モデルの呼び出し】プログラムIDに応じた処理
		if ( prog.equals("0") ) {

			jspName = "usermenuplan.jsp";

		} else if ( prog.equals("1") ) {

			jspName = "userhensyu.jsp";

		}else if (prog.equals("2")){
			jspName = "qurejit.jsp";
		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher("/"+jspName);
		dp.forward(req, resp);
	}

}
