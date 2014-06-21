package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotukenD.bean.UserContactBean;
import jp.ac.fjb.sotukenD.bean.UserEditBean;
import jp.ac.fjb.sotukenD.bean.UserListBean;
import jp.ac.fjb.sotukenD.bean.UserSignBean;
import jp.ac.fjb.sotukenD.model.ContactModel;
import jp.ac.fjb.sotukenD.model.UserListModel;
import jp.ac.fjb.sotukenD.model.UserSignModel;

public class ForUserListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();
		String progId = req.getParameter("progId");

		// ここからエラー
		if (progId == null) {

		} else if (progId.equals("0")) {

			// 登録ボタンが押されたとき
		} else if (progId.equals("1")) {

			// 入力値を取得
			req.setCharacterEncoding("UTF-8");
			String userId = req.getParameter("idS");
			String userPass = req.getParameter("passS");
			String userName = req.getParameter("nameS");
			String userHuri = req.getParameter("huriS");
			String userYY = req.getParameter("yyS");
			String userMM = req.getParameter("mmS");
			String userDD = req.getParameter("ddS");
			String userHome = req.getParameter("homeS");
			String userTell = req.getParameter("tellS");
			String userMail = req.getParameter("mailS");

			String userSex = req.getParameter("sexS");
			String userKen = req.getParameter("kenS");

			// Beanに入力値を詰め込む
			UserSignBean user = new UserSignBean();
			user.setSignUserIdS(userId);
			user.setSignUserPassS(userPass);
			user.setSignUserNameS(userName);
			user.setSignUserHuriS(userHuri);
			user.setSignUserBirthYYS(userYY);
			user.setSignUserBirthMMS(userMM);
			user.setSignUserBirthDDS(userDD);
			user.setSignUserHomeS(userHome);
			user.setSignUserTellS(userTell);
			user.setSignUserAddressS(userMail);

			user.setSignUserSexS(userSex);
			user.setSignUserKenS(userKen);

			// INSERT文を実行
			UserSignModel model1 = new UserSignModel();
			model1.signUser(user);

		} else if (progId.equals("2")) {

			String userId = req.getParameter("deleteButton");

			// 削除ボタンが押された時のデリート文
			UserListModel model1 = new UserListModel();

			model1.delUserList(userId);

		 }else if(progId.equals("3")){
			 String userIde = req.getParameter("beforeId");
				// 入力値を取得
				req.setCharacterEncoding("UTF-8");
				String userIdE = req.getParameter("editIdJ");
				String userPassE = req.getParameter("editPassJ");
				String userNameE = req.getParameter("editNameJ");
				String userHuriE = req.getParameter("editHuriJ");
				String userSexE = req.getParameter("editSexJ");
				String userBirthE = req.getParameter("editBirthJ");
				String userHomeE = req.getParameter("editHomeJ");
				String userMailE = req.getParameter("editMailJ");
				String userKenE = req.getParameter("editKenJ");

				// Beanに入力値を詰め込む
				UserEditBean userE = new UserEditBean();
				userE.setEditUserIdE(userIdE);
				userE.setEditUserPassE(userPassE);
				userE.setEditUserNameE(userNameE);
				userE.setEditUserHuriE(userHuriE);
				userE.setEditUserSexE(userSexE);
				userE.setEditUserBirthE(userBirthE);
				userE.setEditUserHomeE(userHomeE);
				userE.setEditUserAddressE(userMailE);
				userE.setEditUserKenE(userKenE);

				//UPDATA文を実行
				UserListModel model2 = new UserListModel();
				model2.editUser(userIde,userE);
		 }

		// リストを自動的に取得して表示
		UserListModel model = new UserListModel();
		ArrayList<UserListBean> decisionContact = model.getUserList();

		s.setAttribute("USER_LIST", decisionContact);

		RequestDispatcher dp = req
				.getRequestDispatcher("/userManagement/userList.jsp");
		dp.forward(req, resp);

	}

}
