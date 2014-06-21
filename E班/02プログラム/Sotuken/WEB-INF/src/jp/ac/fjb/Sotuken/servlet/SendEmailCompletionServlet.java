package jp.ac.fjb.Sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.SingnUpBean;
import jp.ac.fjb.Sotuken.model.SingnModel;

public class SendEmailCompletionServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "";		// 遷移先JSP名
		//String progId = req.getParameter("progId");	// プログラムIDを取得
		String process =(String)s.getAttribute("MENTE_PROCESS");


		//if ( progId.equals("0") ) {
			// 同意して送信の場合

			// 画面の入力値を取得
			req.setCharacterEncoding("UTF-8");
			String Name = req.getParameter("lastName");   			// 名前
			String kanaji = req.getParameter("lastName_kana");  	 //フリガナ
			String Gender = req.getParameter("gender");  			 // 性別
			String Birthday = req.getParameter("birthday"); 		 //生年月日
			String MemberId = req.getParameter("memberId"); 		// メンバーID
			String PassWord = req.getParameter("passWord");    		//PASSWORD
			String PassWord2 = req.getParameter("passWord2");  		// PASSWORD2
			String MailAddress = req.getParameter("emailAddress");  //メールアドレス
			String PostCode = req.getParameter("postalCode");  		 //郵便番号
			String Shusshin = req.getParameter("address"); 	 		//出身地
			String Busho = req.getParameter("post");  				//部署

			// Beanに入力値を詰める
			SingnUpBean user = new SingnUpBean();
			user.setName(Name);
			user.setKanaji(kanaji);
			user.setGender(Gender);
			user.setBirthday(Birthday);
			user.setMemberId(MemberId);
			user.setPassWord(PassWord);
			user.setPassWord2(PassWord2);
			user.setMailAddress(MailAddress);
			user.setPostCode(PostCode);
			user.setShusshin(Shusshin);
			user.setBusho(Busho);

			//【モデルの呼び出し】処理区分に応じてメソッドを呼び出す
			SingnModel model = new SingnModel();

				model.insertUser( user );

			// セッションにセット
			s.setAttribute("MENTE_USER", user);
			// 遷移先のJSPを確認画面にする
						jspName = "003sendEmailCompletion.jsp";

		RequestDispatcher dp = req.getRequestDispatcher("003sendEmailCompletion.jsp");
		dp.forward(req, resp);
	}
}
