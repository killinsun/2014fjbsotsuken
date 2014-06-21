package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import jp.ac.fjb.sotuken.bean.PlanKeywordBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.LoginModel;
import jp.ac.fjb.sotuken.model.PlanKeywordModel;

public class SerchOkServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			HttpSession s = req.getSession();	// セッション
			String pi=req.getParameter("pi");
			String planKeyword = "";

		if(pi.equals("0")){
			//キーワードを格納
			planKeyword = req.getParameter("soa");

		}else if(pi.equals("1")){
			//キーワードを格納
			planKeyword = req.getParameter("key");

		}

		//モデル
		PlanKeywordModel model = new PlanKeywordModel();
		ArrayList<PlanKeywordBean> list = model.getPlan(planKeyword);
		s.setAttribute("SEA",list);

		RequestDispatcher dp = req.getRequestDispatcher("/searchResult.jsp");
		dp.forward(req, resp);

	}

}
