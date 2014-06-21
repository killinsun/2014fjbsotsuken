package jp.ac.fjb.Sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.LoginBean;
import jp.ac.fjb.Sotuken.bean.MailSakuseiBean;
import jp.ac.fjb.Sotuken.model.MailSakuseiModel;

public class MailSakuseiServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("MailSakuseiServlet in GET");

		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();			// セッション
		LoginBean user = (LoginBean)s.getAttribute("LOGIN_USER");

		////////////////////////////////////////////////////////////////////////////
		//画面の入力値を取得
		String SendContent   = req.getParameter("sendAddress");
		System.out.println("宛先:" + SendContent);

		String subjectContent   = req.getParameter("subjectLine");
		System.out.println("件名:" + subjectContent);

		String mailContent   = req.getParameter("mailLine");
		System.out.println("メール内容:" + mailContent);

		String mt   = "MT9";
		System.out.println("メール種別:" + mt);


		if(SendContent != null && subjectContent != null){

			////////////////////////////////////////////////////////////////////////////
			MailSakuseiModel mailPost = new MailSakuseiModel();
			mailPost.insertMail(SendContent,subjectContent,mailContent,user.getUserId(),mt);
			////////////////////////////////////////////////////////////////////////////


			mt = "MT1";
		}else{

			mt = "MT2";
		}


		//画面遷移
		String jsp = "";
		if (mt.equals("MT1")) {
			jsp = "/016statusDisplay.jsp";
		}else{
			jsp = "/015mailsakusei.jsp";
		}


		System.out.println("MailSakuseiServlet out GET jsp="+jsp);

		RequestDispatcher dp = req.getRequestDispatcher(jsp);
		dp.forward(req, resp);


	}

}
