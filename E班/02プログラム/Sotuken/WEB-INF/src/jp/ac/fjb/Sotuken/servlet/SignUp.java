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

public class SignUp extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "";		// 遷移先JSP名
		String progId = req.getParameter("progId");	// プログラムIDを取得
		String process =(String)s.getAttribute("MENTE_PROCESS");


		if ( progId.equals("0") ) {
			// 同意して送信の場合

			// 画面の入力値を取得
			req.setCharacterEncoding("UTF-8");
			String Name = req.getParameter("Name");
			String kanaji = req.getParameter("kanaji");
			String gender = req.getParameter("gender");
			String birthday = req.getParameter("birthday");
			String MemberId = req.getParameter("memberId");
			String passWord = req.getParameter("passWord");
			String passWord2 = req.getParameter("passWord2");
			String mailAddress = req.getParameter("mailAddress");
			String postCode = req.getParameter("postCode");
			String shusshin = req.getParameter("shusshin");
			String busho = req.getParameter("busho");

			// Beanに入力値を詰める
			SingnUpBean user = new SingnUpBean();
			user.setName(Name);
			user.setKanaji(kanaji);
			user.setGender(gender);
			user.setBirthday(birthday);
			user.setMemberId(MemberId);
			user.setPassWord(passWord);
			user.setPassWord2(passWord2);
			user.setMailAddress(mailAddress);
			user.setPostCode(postCode);
			user.setShusshin(shusshin);
			user.setBusho(busho);

			//【モデルの呼び出し】処理区分に応じてメソッドを呼び出す
			SingnModel model = new SingnModel();

			if ( process.equals("TOUROKU") ) {
				model.insertUser( user );
			}

			// セッションにセット
			s.setAttribute("MENTE_USER", user);
			// 遷移先のJSPを確認画面にする
						jspName = "003sendEmailCompletion.jsp";
		}


		// ビューの呼び出し
					RequestDispatcher dp = req.getRequestDispatcher("jspName");
					dp.forward(req, resp);
	}

}
