package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
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

public class ShiftConserveServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();
		String date = req.getParameter("day");
		ShiftCreateModel model = new ShiftCreateModel();

		for(int i= 0;i<12;i++){
			String srInt = String.format("%02d", i);
			String userId = req.getParameter(srInt +"userID");
			String start = req.getParameter(srInt +"start");
			String end = req.getParameter(srInt +"end");
			String del =req.getParameter(srInt+"del");

			if(userId.equals("none")){

			}else{
				boolean check =  model.searchShift(userId,date);	//存在判定
				if(check){
					model.setUpdateShift(userId, date, start, end); // 以前に存在するならUPDATE
					System.out.println("以前に存在するのでUPDATEだお～");
				}else {
					model.setInsertShift(userId,date,start,end); //存在しないならINSART
					System.out.println("新規データなのでINSERTだお～");
				}
			}
			if(del != null){
				model.setDeleteShift(userId, date);
				System.out.println("消すお！");

			}

		}

		req.setCharacterEncoding("UTF-8");

		shiftShowModel model1 = new shiftShowModel();
		ArrayList<ShiftShowFormBean> decisionShift =model1.getShiftFinsh(date);

		s.setAttribute("DECISION_SHIFT", decisionShift);

		RequestDispatcher dp = req.getRequestDispatcher("Shift/shiftCreate.jsp");
		dp.forward(req, resp);

	}



}
