package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MenuServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String jspName = "";						// 遷移先JSP名
		String progId = req.getParameter("progId");	// プログラムIDを取得


		// 【モデルの呼び出し】プログラムIDに応じた処理
		if ( progId.equals("0") ) {

			jspName = "index.jsp";

		} else if ( progId.equals("1") ) {

			jspName = "search.jsp";

		}else if (progId.equals("2")){
			jspName = "UserMenuServlet";
		}else if(progId.equals("3")){
			jspName = "BbsServlet";
		}else if(progId.equals("4")){
			jspName = "makePlan.jsp";
		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher("/"+jspName);
		dp.forward(req, resp);
	}

}
