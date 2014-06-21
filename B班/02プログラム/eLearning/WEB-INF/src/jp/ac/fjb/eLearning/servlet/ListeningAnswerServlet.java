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
import jp.ac.fjb.eLearning.bean.listeningFormBean;
import jp.ac.fjb.eLearning.model.listeningModel;

public class ListeningAnswerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//super.doGet(req, resp);
		HttpSession s = req.getSession();	// セッション

		String bunyaId = (String) s.getAttribute("BUNYA_ID");

		System.out.println(bunyaId);

		String[] userKaitou = new String[5];

		for(int i=0; i<5; i++){
			userKaitou[i]=req.getParameter("UserAnswer" + i);
			System.out.println("ユーザの解答:" + userKaitou[i]);
		}



		ArrayList<listeningFormBean> listening = (ArrayList) s.getAttribute("listening");


			int tensu = 0;

			for(int i=0;i < 5; i++){
				listeningFormBean bean = listening.get(i);
				if (bean.getAnswer().equals(userKaitou[i])){
					tensu = tensu + 20;
				}
			}

			//System.out.print(tensu);
			//tensuをセッションにセット
			s.setAttribute("TEN",String.valueOf(tensu));

			//セッションから得点リストを取得する
			ArrayList<listeningFormBean> list1 = (ArrayList)s.getAttribute("TENSU_LISTENING");

			for(int i=0; i<list1.size(); i++) {
				listeningFormBean bean2 = list1.get(i);

				System.out.println("*********************"+bean2.getBunyaID());

				if(bean2.getBunyaID().equals(bunyaId)) {



					 bean2.setTensu(tensu);
					 break;
				}
			}
			//セッションに再セット
			s.setAttribute("TENSU_LISTENING", list1);

			s.setAttribute("MONDAI_LIST", listening);
		//}


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher("Listening_Lesson1_Answer.jsp");
		dp.forward(req, resp);
	}


	}
