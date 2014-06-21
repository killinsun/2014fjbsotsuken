package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.model.WritingModel;

public class WritingquestionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		HttpSession s = req.getSession(); //セッション
		String jspName = "";			  //遷移先JSP名

		//【モデルの呼び出し】問題文表示
		WritingModel model = new WritingModel();
		ArrayList list = model.getKaitouList();

		//問題を取得できた場合、問題情報をセッションにセット

		s.setAttribute("MONDAI",list);

		//解答画面に遷移
		RequestDispatcher dp = req.getRequestDispatcher("Writing question.jsp");
		dp.forward(req, resp);
	}

}
