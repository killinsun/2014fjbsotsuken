package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.ShiftShowFormBean;
import jp.ac.fjb.sotukenD.model.shiftShowModel;

public class ForShiftShowServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			exe(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			exe(req,resp);




	}

	private void exe(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();
		String date = req.getParameter("day"); //前画面などから日付取得
//		String date = "2014-01-25";


		shiftShowModel model = new shiftShowModel();
		ArrayList<ShiftShowFormBean> decisionShift =model.getShiftFinsh(date);

		s.setAttribute("DECISION_SHIFT", decisionShift);

		RequestDispatcher dp = req.getRequestDispatcher("/Shift/shiftShow.jsp");
		dp.forward(req, resp);

	}

}
