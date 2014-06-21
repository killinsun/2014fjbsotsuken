package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.BbsBean;
import jp.ac.fjb.sotuken.bean.CommentBean;
import jp.ac.fjb.sotuken.model.BbsModel;
import jp.ac.fjb.sotuken.model.CommentModel;

public class BbsServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		display(req,resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		display(req,resp);
	}

	public void display(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		HttpSession s = req.getSession();			// セッション
		String chiikiName = req.getParameter("name");
		String progId = req.getParameter("progId");
		int pageEnd = 0;
		ArrayList<BbsBean> List;

		if(progId == null){
			progId = "0";
		}

		//地域名が取れなかった場合は空白
		if(chiikiName == null){
			chiikiName = "";
		}
		//格納内容表示
		System.out.println(chiikiName);

		if(chiikiName.equals("北海道") || chiikiName.equals("東北") || chiikiName.equals("北関東") || chiikiName.equals("首都圏") || chiikiName.equals("甲信越") || chiikiName.equals("北陸") || chiikiName.equals("近畿") || chiikiName.equals("東海") || chiikiName.equals("山陰・山陽") || chiikiName.equals("四国") || chiikiName.equals("九州") || chiikiName.equals("沖縄")){
			BbsModel bmodel = new BbsModel();
			List = bmodel.getChiikiList(chiikiName);
			pageEnd = List.size()/5;
			if(List.size()%5 != 0){
				pageEnd++;
			}

		}else{
			// 掲示板一覧を取得
			BbsModel bModel = new BbsModel();
			List = bModel.getBbsList();
			pageEnd = List.size()/5;
			if(List.size()%5 != 0){
				pageEnd++;
			}
		}

		s.setAttribute("BBS", List);
		s.setAttribute("STARTCNT","0");
		s.setAttribute("ENDCNT","5");
		s.setAttribute("PAGE", "1");

		//ページ数をセット
		s.setAttribute("PAGEEND", pageEnd);
		System.out.println("マックスページ数：" + pageEnd);

		//コメントを取得
		CommentModel cModel = new CommentModel();
		ArrayList<CommentBean> cList = cModel.getCommentList();
		s.setAttribute("COMMENT", cList);

		RequestDispatcher dp = req.getRequestDispatcher("/bbs.jsp");
		dp.forward(req, resp);
	}
}
