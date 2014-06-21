package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.HotelChangeBean;
import jp.ac.fjb.sotuken.bean.UkewatasiBean;
import jp.ac.fjb.sotuken.model.HotelChangeModel;


public class HotelChangeServlet  extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション

		//プランネームをもらう
		req.setCharacterEncoding("UTF-8");
		String kenName = req.getParameter("kenName");
		System.out.println(kenName);

		HotelChangeModel model = new HotelChangeModel();
		ArrayList<HotelChangeBean> list = model.getKen(kenName);

		s.setAttribute("HTC",list);

		String jspName = "";				// 遷移先JSP名

		String a = req.getParameter("aId");
		String date = req.getParameter("date");
		String ninzu = req.getParameter("ninzu");

		if(a.equals("0")){
			UkewatasiBean uk=new UkewatasiBean();
			uk.setDate(date);
			uk.setNinzu(ninzu);
			s.setAttribute("UKEWATASI", uk);
			jspName = "/hotelChange.jsp";
		}else{
			jspName = "/dammy.jsp";
		}

		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);


	}

}
