package jp.ac.fjb.sotukenD.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jp.ac.fjb.sotukenD.bean.UserEditBean;
import jp.ac.fjb.sotukenD.model.UserEditModel;


public class ForUserEditServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				HttpSession s = req.getSession();
				String progId = req.getParameter("progId");
				if (progId == null) {
				}else if(progId.equals("0")){
				}

				String userId = req.getParameter("editButton");
				UserEditModel model = new UserEditModel();

				UserEditBean user = model.getUserEdit(userId);


			s.setAttribute("LOGIN_EDIT", user);

			RequestDispatcher dp = req
					.getRequestDispatcher("/userManagement/userEdit.jsp");
			dp.forward(req, resp);

//		}
	}
}
