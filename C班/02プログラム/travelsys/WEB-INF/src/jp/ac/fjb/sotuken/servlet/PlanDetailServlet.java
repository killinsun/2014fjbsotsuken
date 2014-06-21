package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.HotelBean;
import jp.ac.fjb.sotuken.bean.PlanDetailBean;
import jp.ac.fjb.sotuken.bean.HotelChangeBean;
import jp.ac.fjb.sotuken.model.PlanDetailModel;
import jp.ac.fjb.sotuken.model.HotelChangeModel;


public class PlanDetailServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション

		//プランネームをもらう
		req.setCharacterEncoding("UTF-8");
		String planName = req.getParameter("planName");
		String planId = req.getParameter("planId");
		System.out.println(planName);
		System.out.println(planId);



		PlanDetailModel model = new PlanDetailModel();
		ArrayList<PlanDetailBean> list = model.getPlan(planName);

		s.setAttribute("DET",list);





		HotelChangeModel model2 = new HotelChangeModel();
		HotelBean list2 = model2.getDefaultPlan(planId);

		s.setAttribute("CAG",list2);




		RequestDispatcher dp = req.getRequestDispatcher("/planDetail.jsp");
		dp.forward(req, resp);

	}

}
