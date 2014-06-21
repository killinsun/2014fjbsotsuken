package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.bean.QuestionInputBean;

import jp.ac.fjb.eLearning.model.QuestionModel;
import jp.ac.fjb.eLearning.model.QuestionModel_Reading;

public class ReadingAnswerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション
		String jspName = "Reading_A.jsp";				// 遷移先JSP名

		//教科科目分野のID取得
		String kyoukaID =(String)s.getAttribute("KyoukaId");
		String kamokuID =(String)s.getAttribute("KAMOKUID:");
		String bunyaID = req.getParameter("bunyaId");

		//問題の取出し
		QuestionModel_Reading model = new QuestionModel_Reading();
		ArrayList<QuestionInputBean> Mondai = model.getKaitouList(kyoukaID, kamokuID, bunyaID);


		s.setAttribute("Reading", Mondai);
		jspName = "Reading_Q.jsp";


		// 【ビューの呼び出し】
				RequestDispatcher dp = req.getRequestDispatcher(jspName);
				dp.forward(req, resp);
	}

}
