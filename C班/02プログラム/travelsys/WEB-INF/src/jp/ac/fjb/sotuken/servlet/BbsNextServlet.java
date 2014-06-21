package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BbsNextServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();			// セッション
		int pageEnd=0;								//ぺージ数

		/////////////////ページ///////////////////////////
		//ページ操作のリンクが押されたか
		String button = req.getParameter("bt");
		if(s.getAttribute("PAGE")==null){
			s.setAttribute("PAGE","1");
			System.out.println("現在のページ：" + s.getAttribute("PAGE"));
		}
		if(s.getAttribute("STARTCNT")==null){
			s.setAttribute("STARTCNT","0");
			s.setAttribute("ENDCNT","5");
		}
			int page = Integer.parseInt(req.getParameter("page").toString());
			System.out.println(page);

			int ds = Integer.parseInt(s.getAttribute("STARTCNT").toString());
			int de = Integer.parseInt(s.getAttribute("ENDCNT").toString());
			pageEnd = Integer.parseInt(s.getAttribute("PAGEEND").toString());

			int startCnt = 0;
			int endCnt = 0;

			if(button==null){
				button="";
			}

			if(button.equals("n")){
				if(page < pageEnd){
					startCnt = ds +5;
					endCnt = de +5;
					page++;
				System.out.println("プラス");
				}else{
					startCnt = ds;
					endCnt = de;
					page = pageEnd;
					System.out.println("維持");
				}
			}else if(button.equals("b")){
				if(page > 1){
				startCnt = ds -5;
				endCnt = de -5;
				page--;
				}else{
					startCnt = ds;
					endCnt = de;
					page = 1;
				}
			}else{
					startCnt = page * 5 - 5;
					endCnt = page * 5;
			}

			System.out.println("はじめ：" + startCnt);
			System.out.println("おわり：" + endCnt);
			System.out.println("ページ：" + page);

			s.setAttribute("STARTCNT",startCnt);
			s.setAttribute("ENDCNT",endCnt);
			s.setAttribute("PAGE", page);
		//////////////////////////////////////////////////

		RequestDispatcher dp = req.getRequestDispatcher("/bbs.jsp");
		dp.forward(req, resp);

	}
}
