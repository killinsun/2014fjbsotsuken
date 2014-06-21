package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jp.ac.fjb.eLearning.bean.MenteBean;
import jp.ac.fjb.eLearning.bean.NewsBean;
import jp.ac.fjb.eLearning.bean.OsiraseBean;
import jp.ac.fjb.eLearning.model.MenteModel;
import jp.ac.fjb.eLearning.model.NewsModel;
import jp.ac.fjb.eLearning.model.OsiraseModel;

public class MainmenuServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession(); //セッション
		String jspName = "";			  //遷移先JSP名

		//【お知らせモデルの呼び出し】
		OsiraseModel model = new OsiraseModel();
		ArrayList<OsiraseBean>osirase=model.getOsirase( (String)s.getAttribute("userId") );

		s.setAttribute("OsiraseList",osirase );

		//【ニュースモデルの呼び出し】
		NewsModel modelN = new NewsModel();
		ArrayList<NewsBean>news=modelN.getNews( );

		s.setAttribute("NewsList",news );

		//【メンテナンスモデルの呼び出し】
		MenteModel modelP = new MenteModel();
		ArrayList<MenteBean>mente=modelP.getMente( );

		s.setAttribute("MenteList",mente );

		// 【ビューの呼び出し（ログインの次の画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher("Mainmenu.jsp");
		dp.forward(req, resp);
	}

}