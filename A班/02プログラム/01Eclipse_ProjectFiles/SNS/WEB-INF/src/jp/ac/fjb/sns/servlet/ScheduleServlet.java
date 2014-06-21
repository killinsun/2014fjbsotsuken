package jp.ac.fjb.sns.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sns.bean.ScheduleBean;
import jp.ac.fjb.sns.model.ScheduleModel;

@SuppressWarnings("serial")
public class ScheduleServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 遷移先JSPをイベントスケジュール画面に設定
		HttpSession s = req.getSession();	// セッション
		String jspName = "U005Event.jsp";	// 遷移先JSP名
		String pId = req.getParameter("pid");    //プログラムIDを取得
		String starthours = req.getParameter("starthours");
		String startminutes = req.getParameter("startminutes");
		String endhours = req.getParameter("endhours");
		String endminutes = req.getParameter("endminutes");
		String newevent = req.getParameter("newevent");

		System.out.println("プログラムID:" + pId);

		ScheduleModel schedule = new ScheduleModel();

		  // プログラムIDに応じた処理
		if( pId.equals("90") ) {
			  ScheduleBean bean = new ScheduleBean();
			  if (starthours.length() == 1) {
				  starthours = "0" + starthours;
			  };
			  if (startminutes.length() == 1) {
				  startminutes = "0" + startminutes;
			  };
			  if (endhours.length() == 1) {
				  endhours = "0" + endhours;
			  };
			  if (endminutes.length() == 1) {
				  endminutes = "0" + endminutes;
			  };
			  bean.setStartHour(starthours + ":" + startminutes);
			  bean.setFinHour(endhours + ":" +endminutes);
			  bean.setTitle(newevent);

			  schedule.insertSchedule("x11g000","2013-11-29",bean);

		  } else if( pId.equals("91") ) {

		  } else if( pId.equals("92") ) {

		  };

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}
}
