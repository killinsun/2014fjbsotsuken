package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class englishmenuServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		   HttpSession s = req.getSession();                // セッション
		    String jspName = "";                                // 遷移先JSP名
		    String KyoukaId = req.getParameter("KyoukaId");    // 科目IDを取得
			// 画面から取得した教科IDをセッションに格納
			s.setAttribute("KyoukaId",KyoukaId);

		    RequestDispatcher dp = req.getRequestDispatcher("englishmenu.jsp");
		    dp.forward(req, resp);
	}

}