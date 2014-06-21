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
import jp.ac.fjb.sotukenD.bean.ShiftCreateFormBean;
import jp.ac.fjb.sotukenD.bean.ShiftShowFormBean;
import jp.ac.fjb.sotukenD.model.ShiftCreateModel;
import jp.ac.fjb.sotukenD.model.shiftShowModel;

public class ForShiftCreateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		exe(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		exe(req,resp);
	}


	private void exe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// TODO 自動生成されたメソッド・スタブ

		req.setCharacterEncoding("UTF-8");
		String date = req.getParameter("day");



		System.out.println("年月日："+date);



		//作成のモデル読み込み
		ShiftCreateModel model1 = new ShiftCreateModel();
		ArrayList<ShiftCreateFormBean> userData =model1.getUserData();


		//ユーザーデータを取得
		HttpSession s = req.getSession();


		shiftShowModel model = new shiftShowModel();
		ArrayList<ShiftShowFormBean> decisionShift =model.getShiftFinsh(date);

		s.setAttribute("DECISION_SHIFT", decisionShift);
		s.setAttribute("USER_DATA", userData);
		s.setAttribute("DATE", date);

		//画面遷移
		RequestDispatcher dp = req.getRequestDispatcher("Shift/shiftCreate.jsp");
		dp.forward(req, resp);
	}


	}



