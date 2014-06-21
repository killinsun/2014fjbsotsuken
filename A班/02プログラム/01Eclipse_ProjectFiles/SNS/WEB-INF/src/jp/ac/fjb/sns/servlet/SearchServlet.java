package jp.ac.fjb.sns.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sns.bean.InputSearchFormBean;
import jp.ac.fjb.sns.bean.OutputSearchResultBean;
import jp.ac.fjb.sns.bean.RoomBean;
import jp.ac.fjb.sns.bean.UserBean;
import jp.ac.fjb.sns.model.MainModel;
import jp.ac.fjb.sns.model.SearchModel;

@SuppressWarnings("serial")
public class SearchServlet extends HttpServlet{

	@Override
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 初期表示の処理
		// セッションを取得する
		HttpSession s = req.getSession();
		UserBean uBean = (UserBean)s.getAttribute("LOGIN_USER");
		String userId = (String)uBean.getUserId();
		String pId = req.getParameter("pid");
		String uId = req.getParameter("uid");

		// ログインユーザが入室している部屋名と人数を取得して表示する
		MainModel mainModel = new MainModel();
		ArrayList<RoomBean> roomList = (ArrayList<RoomBean>)mainModel.viewRoom(userId);
		s.setAttribute("HAVING_ROOM_LIST", roomList);

		// 他ページから遷移してきた時に、前回の検索結果と選択中ユーザのリストをクリア
		if (pId == null || pId.equals("")) {
			s.removeAttribute("RESULT_USER_LIST");
			s.removeAttribute("SELECTED_USER_LIST");
		}

		// 検索キーワードを受け取る
		String nameSearch = req.getParameter("nameSearch");
		String selectGender = req.getParameter("selectGender");
		String selectAge = req.getParameter("selectAge");
		String selectSection = req.getParameter("selectSection");
		String numCarrier = req.getParameter("numCarrier");
		String freeWordSearch = req.getParameter("freeWordSearch");
		String[] checkLisence = req.getParameterValues("checkLisence");

		// 検索キーワードをBeanに詰める
		InputSearchFormBean isfb = new InputSearchFormBean();
		isfb.setUserName(nameSearch);
		isfb.setGender(selectGender);
		isfb.setAge(selectAge);
		isfb.setSection(selectSection);
		isfb.setCarrier(numCarrier);
		isfb.setFreeSpace(freeWordSearch);


		//AddButtonクリック時の処理
		if (uId != null && !uId.equals("") && pId.equals("0")) {
			ArrayList<OutputSearchResultBean> resultList = (ArrayList<OutputSearchResultBean>)s.getAttribute("RESULT_USER_LIST");
			OutputSearchResultBean osrb = null;

			for (int i = 0; i < resultList.size(); i++) {
				osrb = resultList.get(i);
				// クリックされたユーザを検索結果リストから削除
				if (osrb.getResultUserId().equals(uId)) {
					resultList.remove(i);
					s.setAttribute("RESULT_USER_LIST", resultList);
					break;
				}
			}
			// 削除したユーザを選択中ユーザリストへ追加
			ArrayList<OutputSearchResultBean> selectedList = (ArrayList<OutputSearchResultBean>)s.getAttribute("SELECTED_USER_LIST");
			selectedList.add(osrb);
		}

		// DelButtonクリック時の処理
		if (uId != null && !uId.equals("") && pId.equals("2")) {
			ArrayList<OutputSearchResultBean> resultList = (ArrayList<OutputSearchResultBean>)s.getAttribute("RESULT_USER_LIST");
			ArrayList<OutputSearchResultBean> selectedList = (ArrayList<OutputSearchResultBean>)s.getAttribute("SELECTED_USER_LIST");
			OutputSearchResultBean osrb2 = null;

			for (int i = 0; i < selectedList.size(); i++) {
				osrb2 = selectedList.get(i);
				// クリックされたユーザを選択中ユーザリストから削除
				if (osrb2.getResultUserId().equals(uId)) {
					selectedList.remove(i);
					s.setAttribute("SELECTED_USER_LIST", selectedList);
					break;
				}
			}
			// 削除したユーザを検索結果リストへ追加
			resultList.add(osrb2);
		}

		// 検索ボタンクリック時の処理
		if (pId != null && pId.equals("1")){
			// モデルを呼び出し、格納した値をSQLで使えるように引き渡す
			SearchModel searchModel = new SearchModel();
			ArrayList<OutputSearchResultBean> resultList = searchModel.searchUser(nameSearch, selectGender, selectAge, selectSection, numCarrier, checkLisence, freeWordSearch);
			ArrayList<OutputSearchResultBean> selectedList = new ArrayList<OutputSearchResultBean>();
	        	// セッションに検索結果リストと選択中ユーザリストを格納する
				s.setAttribute("RESULT_USER_LIST", resultList);
				s.setAttribute("SELECTED_USER_LIST", selectedList);
		}

		// 新規部屋作成ボタンクリック時の処理
		if (pId != null && pId.equals("3")) {
			// 格納した部屋名をSQLで使えるように引き渡す
			// ルーム名、作成者IDを取得
			String roomName = req.getParameter("newRoomName");
			// DBにルームを登録
			mainModel.insertRoom(roomName , userId);
			// 登録された部屋番号を取得
			String maxRoomNo = mainModel.createRoomNo(userId);
			// 入室処理
			mainModel.chatRoom(maxRoomNo, userId);
			// ユーザが現在持っている部屋名および人数を取得する
			ArrayList<RoomBean> list = mainModel.viewRoom(userId);
			// セッションへ格納
			s.setAttribute("HAVING_ROOM_LIST",list);
		}

		// 追加ボタンクリック時の処理
		if (pId != null && pId.equals("4")) {
			// 選択中ユーザのリストを取得
			ArrayList<OutputSearchResultBean> selectedList = (ArrayList<OutputSearchResultBean>)s.getAttribute("SELECTED_USER_LIST");
			String roomId = req.getParameter("selectRoom");
			mainModel.joinRoom(roomId, selectedList);
			// ユーザが現在持っている部屋名および人数を取得する
			ArrayList<RoomBean> list = mainModel.viewRoom(userId);
			// セッションへ格納
			s.setAttribute("HAVING_ROOM_LIST",list);
		}

		// 遷移先JSPをユーザ検索画面に設定
		RequestDispatcher dp = req.getRequestDispatcher("U003Search.jsp");
		dp.forward(req, resp);

	}

}
