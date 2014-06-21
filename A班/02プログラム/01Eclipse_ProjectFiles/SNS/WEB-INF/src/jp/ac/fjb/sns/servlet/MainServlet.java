package jp.ac.fjb.sns.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sns.bean.ChatBean;
import jp.ac.fjb.sns.bean.EventBean;
import jp.ac.fjb.sns.bean.RoomBean;
import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.model.MainModel;

@SuppressWarnings("serial")
public class MainServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// セッションを取得する
		HttpSession s = req.getSession();

		// ログインユーザの情報を取得する
		UserBean user = (UserBean)s.getAttribute("LOGIN_USER");
		String userId = user.getUserId();

		// 所持しているルームID情報を格納しておく変数
		String roomId = null;

		// 遷移先のJSP情報を格納しておく変数(デフォルトはメイン画面)
		String link = "U002Main.jsp";

		// プログラムIDを取得する
		String pId = req.getParameter("pid");

		MainModel mainModel = new MainModel();

		// 初期表示
		if(pId == null) {
		ArrayList<RoomBean> roomList = mainModel.viewRoom(userId);
		ArrayList<EventBean> eventList = mainModel.event();
		s.setAttribute("HAVING_ROOM_LIST",roomList);
		s.setAttribute("HAVING_EVENT_LIST", eventList);
		roomId = "E";
		s.setAttribute("ROOM_ID", roomId);

		// ログアウトボタンが押された時
		} else if (pId != null && pId.equals("-1")) {
			// セッションを無効にして、ログイン画面に遷移
			s.invalidate();
			link = "U001Login.jsp";

		// 新規部屋作成時
		} else if (pId != null && pId.equals("1")) {
			// ルーム名、作成者IDを取得
			String roomName = req.getParameter("newRoomName");
			// DBにルームを登録
			mainModel.insertRoom(roomName , userId);
			// 登録された部屋番号を取得
			String maxRoomNo = mainModel.createRoomNo(userId);
			// 入室処理
			mainModel.chatRoom(maxRoomNo, userId);
			// 表示処理
			// 最新のルーム一覧リストを取得してセッションにセット
			ArrayList<RoomBean> list = mainModel.viewRoom(userId);
			s.setAttribute("HAVING_ROOM_LIST",list);

		// 発言時
		} else if (pId != null && pId.equals("2")) {
			// 発言内容を取得
			String chatText = req.getParameter("message");
			// ルームIDを取得
			roomId = (String)s.getAttribute("ROOM_ID");
			// DBに発言内容を挿入
			mainModel.insertChat(chatText, roomId, userId);
			// 最新の発言リストを取得してセッションにセット
			ArrayList<ChatBean> list = mainModel.chatlist(roomId);
			s.setAttribute("HAVING_CHAT_LIST",list);

		// ルーム選択時
		// 開くチャットルームと、チャット送信先の設定
		} else if (pId != null && pId.startsWith("R")) {
			ArrayList<ChatBean> list = mainModel.chatlist(pId);
			s.setAttribute("HAVING_CHAT_LIST",list);
			// セッションにルームのIDを入れる
			s.setAttribute("ROOM_ID", pId);

		// お知らせルーム選択時
		} else if (pId != null && pId.startsWith("E")) {
			ArrayList<EventBean> eventList = mainModel.event();
			s.setAttribute("HAVING_EVENT_LIST", eventList);
			roomId = "E";
			s.setAttribute("ROOM_ID", roomId);
		}

		// 遷移先JSPをメインチャット画面に設定
		RequestDispatcher dp = req.getRequestDispatcher(link);
		dp.forward(req, resp);
	}

}
