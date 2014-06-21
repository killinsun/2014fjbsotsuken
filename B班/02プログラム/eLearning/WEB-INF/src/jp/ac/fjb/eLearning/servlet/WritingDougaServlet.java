package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.bean.WritingDougaFormBean;
import jp.ac.fjb.eLearning.model.WritingDougaModel;

public class WritingDougaServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();
		String jspName = "";		// 遷移先JSP名


		String kyokaID = (String)s.getAttribute("KyoukaId");
		String kamokuID = (String)s.getAttribute("KAMOKUID");
		String bunyaID = req.getParameter("bunyaId");

		WritingDougaModel model = new WritingDougaModel();
		WritingDougaFormBean bean = model.getDouga(kyokaID, kamokuID, bunyaID);

		s.setAttribute("DOUGA", bean);
		s.setAttribute("BUNYA_ID", bunyaID);

		jspName = "Writing douga.jsp";


		// 【ビューの呼び出し（動画画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
