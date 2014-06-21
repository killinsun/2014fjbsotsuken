package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.rmi.runtime.GetThreadPoolAction;

import jp.ac.fjb.eLearning.bean.MondaiMenuBean;
import jp.ac.fjb.eLearning.bean.QuestionInputBean;
import jp.ac.fjb.eLearning.bean.listeningFormBean;
import jp.ac.fjb.eLearning.model.MondaiModel;

public class ListeningServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名



		//String Lbtn = req.getParameter("Lbtn");
		String title = req.getParameter("title");
		String kinou = req.getParameter("kinou");
		String hyogen = req.getParameter("hyogen");
		String kamokuID = req.getParameter("kamokuID");

		s.setAttribute("KAMOKUID:", kamokuID);

		//System.out.println("レッスン名"+ Lbtn);
		System.out.println("タイトル"+ title);
		System.out.println("機能"+ kinou);
		System.out.println("表現"+ hyogen);

		MondaiModel model = new MondaiModel();
		ArrayList<MondaiMenuBean> Mondai = model.getMondaiMenu(kamokuID);
		s.setAttribute("Mondai", Mondai);


		 //問題の数だけ、得点のbeanを作ってリストに格納（初期値は０点）
		ArrayList<listeningFormBean> tokuten = (ArrayList<listeningFormBean>)s.getAttribute("TENSU_LISTENING");

		if (tokuten == null) {
			tokuten = new ArrayList();
			for (int i=0; i<Mondai.size(); i++) {
				MondaiMenuBean bean1 = Mondai.get(i);
				listeningFormBean bean2 = new listeningFormBean();
				bean2.setBunyaID(bean1.getTangen());
				tokuten.add(bean2);
			}
			s.setAttribute("TENSU_LISTENING", tokuten);
		}




		jspName = "Listening.jsp";




		// 【ビューの呼び出し】
				RequestDispatcher dp = req.getRequestDispatcher(jspName);
				dp.forward(req, resp);
	}

}
