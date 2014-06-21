package jp.ac.fjb.sns.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sns.bean.EventBean;
import jp.ac.fjb.sns.bean.ScheduleBean;
import jp.ac.fjb.sns.model.EventModel;
import jp.ac.fjb.sns.model.ScheduleModel;

import org.omg.PortableInterceptor.ForwardRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class EventServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// セッションを取得する
		HttpSession s = req.getSession();
		String jspName = "U005Event.jsp";
		String pId = req.getParameter("pid");    //プログラムIDを取得

		EventModel event = new EventModel();
		//テストデータ
		ArrayList<EventBean> list = event.getEvent("2013/11/29");

		s.setAttribute("EVENT_LIST", list);

		ScheduleModel schedule = new ScheduleModel();
		//テストデータ
		ArrayList<ScheduleBean> list2 = schedule.getSchedule("x11g000","2013/11/29");

		s.setAttribute("SCHEDULE_LIST", list2);


		// 遷移先JSPをイベントスケジュール画面に設定
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req,resp);

	}
}
