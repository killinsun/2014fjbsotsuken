package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.eLearning.bean.QuestionInputBean;
import jp.ac.fjb.eLearning.model.QuestionModel;

public class Reading_SaitenServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession(); // セッション


		//文字列配列の宣言
		String[] userKaitou = new String[3];

		// ユーザの解答を取得
		for(int i=0; i<3; i++){
			userKaitou[i]=req.getParameter("kaitou"+i);
			System.out.println(userKaitou[i]);
			System.out.println("ユーザの解答:" + userKaitou[i]);
		}

		// 前のセッションから情報を取ってくる
		ArrayList<QuestionInputBean> list = (ArrayList) s.getAttribute("Reading");

		String kyoukaId = (String) s.getAttribute("KYOUKA_ID");
		String kamokuId = (String) s.getAttribute("KAMOKU_ID");
		String bunyaId = (String) s.getAttribute("BUNYA_ID");

		// 問題の照らし合わせ
		int tensu = 0;
		for(int i=0;i < 3; i++){
			QuestionInputBean bean = list.get(i);
			System.out.println("tensu:" + bean.getKaitou() + ":"+userKaitou[i]);
			if (bean.getKaitou().equals(userKaitou[i])){
				tensu = tensu + 30;
			}

			if(tensu == 90){
				tensu = 100;
			}
		}
		//tensuをセッションにセット
		s.setAttribute("TEN",String.valueOf(tensu));

		//セッションから得点リストを取得する
		ArrayList<QuestionInputBean> list1 = (ArrayList)s.getAttribute("TENSU");

		for(int i=0; i<list.size(); i++) {
			QuestionInputBean bean2 = list.get(i);

			if(bean2.getTangen().equals(bunyaId)) {
				 bean2.setTensu(tensu);
				 break;
			}
		}
		//セッションに再セット
		s.setAttribute("BUNYAID", list);


		// 解答解説情報をセッションにセット
		s.setAttribute("MONDAI_LIST", list);

		// 解答解説画面に遷移
		RequestDispatcher dp = req.getRequestDispatcher("Reading_A.jsp");
		dp.forward(req, resp);

	}

}
