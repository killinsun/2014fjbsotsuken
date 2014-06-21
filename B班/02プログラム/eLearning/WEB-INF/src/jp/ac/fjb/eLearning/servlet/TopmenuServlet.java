package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.bean.UserBean;
import jp.ac.fjb.eLearning.model.LoginModel;
import jp.ac.fjb.eLearning.model.MenteModel;
import jp.ac.fjb.eLearning.model.NewsModel;
import jp.ac.fjb.eLearning.model.OsiraseModel;

public class TopmenuServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {


			HttpSession s = req.getSession();	// セッション
			String jspName = "";				// 遷移先JSP名

			// IDとパスワードを取得
			String userId = req.getParameter("ID");
			String password = req.getParameter("PASS");

			System.out.println("ユーザID:"   + userId);
			System.out.println("パスワード:" + password);
			s.setAttribute("userId", userId);


			// 【モデルの呼び出し】ログイン判定
			LoginModel model = new LoginModel();
			UserBean user = model.getUser(userId, password);



			if ( user == null ) {
				// ユーザを取得出来なかった場合、エラーメッセージをセット
				req.setAttribute("ERROR_LOGIN", "IDまたはパスワードが違います");

				// ログイン画面に戻す
				jspName = "Topmenu.jsp";

			} else {



				// メニュー画面に遷移
				jspName = "/MainmenuServlet";
			}
			//お知らせモデル
			OsiraseModel modelO= new OsiraseModel();
			// Modelからリスト型のデータを取り出し
			ArrayList oshiraseList = modelO.getOsirase(userId);

			req.setAttribute("oshirase", oshiraseList);

			//ニュースモデル
			NewsModel modelN= new NewsModel();
			// Modelからリスト型のデータを取り出し
			ArrayList newsList = modelN.getNews();

			req.setAttribute("news", newsList);

			//ニュースモデル
			MenteModel modelMN= new MenteModel();
			// Modelからリスト型のデータを取り出し
			ArrayList menteList = modelMN.getMente();

			req.setAttribute("mente", menteList);



		// 【ビューの呼び出し（ログインの次の画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}