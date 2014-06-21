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
import jp.ac.fjb.sotukenD.bean.ShiftTeiFormBean;
import jp.ac.fjb.sotukenD.model.ShiftMainModel;
import jp.ac.fjb.sotukenD.model.ShiftTeiModel;
import jp.ac.fjb.sotukenD.util.DBManager;

public class ForShiftTeiServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//String userID = (String)s.getAttribute("userID");
		HttpSession s = req.getSession();	// セッション
		LoginFormBeans loginUser = (LoginFormBeans)s.getAttribute("LOGIN_USER");

		String jspName = "shiftTei.jsp";// 遷移先JSP名

		ShiftTeiModel model = new ShiftTeiModel();
		s.setAttribute("KIBOU_LIST", model.getShiftKibou(loginUser.getUserId()));

		RequestDispatcher dp = req.getRequestDispatcher("/Shift/shiftTei.jsp");
		dp.forward(req, resp);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp){

		String userID = "U101";
		HttpSession s = req.getSession();	// セッション

		ShiftTeiModel model = new ShiftTeiModel();
		s.setAttribute("KIBOU_LIST", model.setShiftKibou(userID,req));

		RequestDispatcher dp = req.getRequestDispatcher("/Shift/shiftTei.jsp");
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
