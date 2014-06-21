package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.RirekiBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.UserMenuModel;

public class UserMenuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession s = req.getSession();
		UserBean loginUser = (UserBean)s.getAttribute("LOGIN_USER");
		String jspName = "";				//遷移先の入れ物

		if(loginUser != null){
			UserMenuModel model = new UserMenuModel();
			ArrayList<RirekiBean> rireki = model.getRireki(loginUser.getUserId());
			s.setAttribute("RIREKI", rireki);

			jspName = "usermenu.jsp";
		}else{
			//未ログインの場合はログイン画面に遷移
			jspName = "login.jsp";
		}

		RequestDispatcher dp = req.getRequestDispatcher("/"+ jspName);
		dp.forward(req, resp);
	}

}
