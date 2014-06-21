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
import jp.ac.fjb.eLearning.model.MondaiModel;

public class Reading_QServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名

		//タイトルの取得
		//String Lbtn = req.getParameter("Lbtn");
		String kamokuID = req.getParameter("kamokuID");
		String bunyaId = req.getParameter("bunyaId");

		//System.out.println("単元"+ Lbtn);

		//単元の取出し
		MondaiModel model = new MondaiModel();
		ArrayList<MondaiMenuBean> mondai = model.getMondaiMenu(kamokuID);


		s.setAttribute("Reading", mondai);
		jspName = "Reading_Q.jsp";


		// 【ビューの呼び出し】
				RequestDispatcher dp = req.getRequestDispatcher(jspName);
				dp.forward(req, resp);
	}

}
