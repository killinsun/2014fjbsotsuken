package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jp.ac.fjb.sotukenD.bean.LoginFormBeans;
import jp.ac.fjb.sotukenD.bean.ShiftMainBean;
import jp.ac.fjb.sotukenD.bean.ShiftTeiFormBean;
import jp.ac.fjb.sotukenD.model.ShiftMainModel;
import jp.ac.fjb.sotukenD.model.ShiftTeiModel;
import jp.ac.fjb.sotukenD.util.DBManager;

public class ForShiftMainServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//String userID = "U101";
		HttpSession s = req.getSession();	// セッション
		String jspName = "shiftTei.jsp";// 遷移先JSP名
		LoginFormBeans loginUser = (LoginFormBeans)s.getAttribute("LOGIN_USER");




		Calendar now = Calendar.getInstance();
		int y = now.get(now.YEAR);          //年を取得
		int m = now.get(now.MONTH) + 1;     //月を取得
		int d = now.get(now.DATE);          //日を取得

		ShiftMainModel model = new ShiftMainModel();
		//ArrayList<ShiftMainBean> dayList =model.farstShow(userID);
		s.setAttribute("DAY_LIST", model.farstShow(loginUser.getUserId()));

		RequestDispatcher dp = req.getRequestDispatcher("/Shift/shiftMain.jsp");
		dp.forward(req, resp);

	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp){

		RequestDispatcher dp = req.getRequestDispatcher("/sotukenD/ForShiftCreateServlet");
		try {
			dp.forward(req, resp);
		} catch (ServletException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}



}
