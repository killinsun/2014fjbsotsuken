package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.ScheduleForBean;
import jp.ac.fjb.sotukenD.model.ScheduleModel;

public class ForScheduleEditServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		HttpSession s = req.getSession();
		String buttonId = req.getParameter("buttonId");
		String scheduleId = req.getParameter("scheduleId");
		String eventTitle = req.getParameter("eventTitle");
		String eventContent = req.getParameter("eventContent");
		String year1 = req.getParameter("year1");
		String manth1 = req.getParameter("manth1");
		String day1 = req.getParameter("day1");
		String year2 = req.getParameter("year2");
		String manth2 = req.getParameter("manth2");
		String day2 = req.getParameter("day2");

		ScheduleModel model = new ScheduleModel();
		ArrayList<ScheduleForBean> schedule = model.getScheduleList();

		if (buttonId == null) {

		} else if (buttonId.equals("0")) {
			String eventStart = year1 + "-" + manth1 + "-" + day1;
			String eventEnd;
			if (year2.equals("") || manth2.equals("") || day2.equals("")) {
				eventEnd = null;
			} else {
				eventEnd = "'" + year2 + "-" + manth2 + "-" + day2 + "'";
			}
			model.updateEvent(scheduleId, eventStart, eventEnd, eventContent, eventTitle);
			schedule = model.getScheduleList();

		} else if (buttonId.equals("1")) {
			model.deleteEvent(scheduleId);

			schedule = model.getScheduleList();

		} else if (buttonId.equals("2")) {
			String eventStart = year1 + "-" + manth1 + "-" + day1;
			String eventEnd;
			if (year2.equals("") || manth2.equals("") || day2.equals("")) {
				eventEnd = null;
			} else {
				eventEnd = "'" + year2 + "-" + manth2 + "-" + day2 + "'";
			}
			model.insertSchedule(eventStart, eventEnd, eventContent, eventTitle);

			schedule = model.getScheduleList();

		}

		s.setAttribute("SCHEDULE_DATA", schedule);

		RequestDispatcher dp = req
				.getRequestDispatcher("/Schedule/scheduleEdit.jsp");
		dp.forward(req, resp);
	}

}