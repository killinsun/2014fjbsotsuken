package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.UserHensyuModel;

public class UserHensyuEndServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名

		// IDとパスワードを取得
		String hid = req.getParameter("henkouloginid");
		String hpass = req.getParameter("henkouloginpass");
		String hmailaddress=req.getParameter("henkoumailaddress");
		String hname=req.getParameter("henkouname");
		String hhurigana=req.getParameter("henkouhurigana");
		String hyear=req.getParameter("henkouyear");
		String hmonth=req.getParameter("henkoumonth");
		String hday=req.getParameter("henkouday");
		String hsex=req.getParameter("henkousex");
		if(hsex.equals("on")){
			hsex="男";
		}else{
			hsex="女";
		}
		String hyubin=req.getParameter("henkouyubin");
		String haddress=req.getParameter("henkouaddress");
		String htell=req.getParameter("henkoutell");


		// 【モデルの呼び出し】ログイン判定
		UserHensyuModel model= new UserHensyuModel();
		int count=0;
		try {
			count = model.henkouUser(hid,hpass,hmailaddress,hname,hhurigana,hyear,hmonth,hday,hsex,hyubin,haddress,htell);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		if ( count==0 ) {
			// ユーザを取得出来なかった場合、エラーメッセージをセット
			s.setAttribute("ERROR_UPDATE", "変更できませんでした");

			// ログイン画面に戻す
			jspName = "userhensyu.jsp";

		} else {


			UserBean loginUser = (UserBean)s.getAttribute("LOGIN_USER");
			loginUser.setPassWord(hpass);
			loginUser.setMailAddress(hmailaddress);
			loginUser.setUserName(hname);
			loginUser.setHurigana(hhurigana);
			loginUser.setBirthDay(hyear+"-"+hmonth+"-"+hday);
			loginUser.setSeibetu(hsex);
			loginUser.setYubin(hyubin);
			loginUser.setAddress(haddress);
			loginUser.setTell(htell);
			// メニュー画面に遷移
			jspName = "UserMenuServlet";
		}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
