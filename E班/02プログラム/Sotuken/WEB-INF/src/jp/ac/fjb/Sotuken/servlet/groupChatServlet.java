package jp.ac.fjb.Sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.Sotuken.bean.groupChatBean;
import jp.ac.fjb.Sotuken.bean.stampBean;
import jp.ac.fjb.Sotuken.model.chatSousinModel;
import jp.ac.fjb.Sotuken.model.groupChatModel;

public class groupChatServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String messageIn = req.getParameter("message_in");
		String progId = req.getParameter("progId");
		String groupId = req.getParameter("GroupID");
		String stampID = req.getParameter("stamp_Id");
		String jspName = "groupChat.jsp";

		//セッションをいただこう
		HttpSession s = req.getSession();

		System.out.println("セッション受け取り↓");
		String userID = (String)s.getAttribute("USER_ID");
		s.setAttribute("USER_ID", userID);
		System.out.println("ユーザID" + userID);

		if(progId == null){

			groupChatModel model = new groupChatModel();
			ArrayList<groupChatBean> list = model.getGroupChat(groupId);
			s.setAttribute("CHAT_SELECT", list);

			//グループIDの引き継ぎ
			s.setAttribute("GroupID2", groupId);
			//グループIDの引き継ぎテストだよ 最後に消す！
			System.out.println("#################################################" + groupId);

			//デバック用 最後に消す！
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆初回のメッセージ受信");



		}else if(progId.equals("0")){

			//メッセージ送信処理
			chatSousinModel model2 = new chatSousinModel();
			//未実装！ユーザIDはセッションから   groupId=
			model2.chatSousin(messageIn, userID, (String)s.getAttribute("GroupID2")); //(messageIn, userID,groupId);
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆メッセージ送信の終わり");

		}else if(progId.equals("1")){

			//スタンプ取得処理
			jspName = "stamp.jsp";
			//s.setAttribute("GroupID2", groupId);
			groupChatModel model3 = new groupChatModel();
			ArrayList<stampBean> list = model3.getStampSelect();
			s.setAttribute("STAMP_SELECT", list);
			System.out.println("ωωωωωωωωωωωωωωωωωωωωスタン窓表示終");

		}else if(progId.equals("2")){

			//スタンプin処理
			chatSousinModel model4 = new chatSousinModel();
			model4.chatStamp(stampID, userID, (String)s.getAttribute("GroupID2"));
			System.out.println("凹凸凹凸凹凸凹凸凹凸凹凸凹凸凹凸凹凸凹凸スタンプ挿入終わり");

		}

		if(progId != null){


			groupChatModel model = new groupChatModel();
			ArrayList<groupChatBean> list = model.getGroupChat((String)s.getAttribute("GroupID2"));

			s.setAttribute("CHAT_SELECT", list);
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆送信後のメッセージ受信");

		}

		// 【ビューの呼び出し】
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□ビューの呼び出し");
		System.out.println("□□□□□□□□□□□□□□□□□□□□スタンプID" + stampID);
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}
