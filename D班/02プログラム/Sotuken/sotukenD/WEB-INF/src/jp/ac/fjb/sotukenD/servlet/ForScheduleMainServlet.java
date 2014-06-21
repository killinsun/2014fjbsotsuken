package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.ScheduleForBean;
import jp.ac.fjb.sotukenD.model.ScheduleModel;

public class ForScheduleMainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		HttpSession s = req.getSession();
		String year = req.getParameter("year");
		String month = req.getParameter("monthA");

		// 初期表示の場合は現在の年月を入れる
		if(year == null){
			year = String.valueOf(Calendar.YEAR);
			month = String.valueOf(Calendar.MONTH + 1);
		}

		// セッションにセット
		s.setAttribute("YEAR", year);
		s.setAttribute("MONTH", month);

		ScheduleModel model = new ScheduleModel();
		ArrayList<ScheduleForBean> schedule = model.getScheduleList();

		s.setAttribute("SCHEDULE_DATA", schedule);

		RequestDispatcher dp = req
				.getRequestDispatcher("/Schedule/scheduleMain.jsp");
		dp.forward(req, resp);
	}

}
