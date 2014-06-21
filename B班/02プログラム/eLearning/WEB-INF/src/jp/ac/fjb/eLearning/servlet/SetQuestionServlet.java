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

public class SetQuestionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		HttpSession s = req.getSession(); //セッション

		 s.getAttribute("DOUGA");

		String kyokaID = (String) s.getAttribute("KyoukaId");
		String kamokuID = (String) s.getAttribute("KAMOKUID");
		String bunyaID = (String) s.getAttribute("BUNYA_ID");

		//【モデルの呼び出し】問題文表示
		QuestionModel model = new QuestionModel();
		ArrayList<QuestionInputBean> list = model.getKaitouList(kyokaID,kamokuID,bunyaID);

		//問題情報をセッションにセット
		s.setAttribute("MONDAI_LIST",list);


		//問題画面に遷移
		RequestDispatcher dp = req.getRequestDispatcher("Writing question.jsp");
		dp.forward(req, resp);
	}

}
