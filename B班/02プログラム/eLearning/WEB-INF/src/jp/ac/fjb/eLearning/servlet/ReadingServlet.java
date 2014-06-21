package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.bean.MondaiMenuBean;
import jp.ac.fjb.eLearning.bean.QuestionInputBean;
import jp.ac.fjb.eLearning.model.MondaiModel;

public class ReadingServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名

		//タイトルの取得
		String Lbtn = req.getParameter("Lbtn");
		String kamokuID = req.getParameter("kamokuID");

		s.setAttribute("KAMOKUID:", kamokuID);

		System.out.println("単元"+ Lbtn);

		//単元の取出し
		MondaiModel model = new MondaiModel();
		ArrayList<MondaiMenuBean> mondai = model.getMondaiMenu(kamokuID);
		s.setAttribute("Mondai", mondai);

		// 問題の数だけ、得点のbeanを作ってリストに格納（初期値は０点）
		ArrayList<QuestionInputBean> tokuten = (ArrayList<QuestionInputBean>)s.getAttribute("TENSU");

		if (tokuten == null) {
			tokuten = new ArrayList();
			for (int i=0; i<mondai.size(); i++) {
				MondaiMenuBean bean1 = mondai.get(i);
				QuestionInputBean bean2 = new QuestionInputBean();
				bean2.setTangen(bean1.getTangen());
				tokuten.add(bean2);
			}
			s.setAttribute("TENSU", tokuten);
		}


		jspName = "Reading.jsp";


		// 【ビューの呼び出し】
				RequestDispatcher dp = req.getRequestDispatcher(jspName);
				dp.forward(req, resp);
	}

}
