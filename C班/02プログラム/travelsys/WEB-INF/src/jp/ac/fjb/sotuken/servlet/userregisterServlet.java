package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.userregisterFormBean;

public class userregisterServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 入力値の取得
		req.setCharacterEncoding("UTF-8");
        String login_id = req.getParameter("login_id");
        String login_pw = req.getParameter("login_pw");
        String email = req.getParameter("email");
        String name1 = req.getParameter("name1");
        String name2 = req.getParameter("name2");
        String year = req.getParameter("year");
        String month = req.getParameter("month");
        String day = req.getParameter("day");
        String sex = req.getParameter("sex");
        String postcode = req.getParameter("postcode");
        String address = req.getParameter("address");
        String tel = req.getParameter("tel");

        userregisterFormBean user = new userregisterFormBean();
        user.setLogin_id(login_id);
        user.setLogin_pw(login_pw);
        user.setEmail(email);
        user.setName1(name1);
        user.setName2(name2);
        user.setYear(year);
        user.setMonth(month);
        user.setDay(day);
        user.setSex(sex);
        user.setPostcode(postcode);
        user.setAddress(address);
        user.setTel(tel);

        HttpSession s = req.getSession();
        s.setAttribute("REGISTER_USER", user);


		// 【ビューの呼び出し（次の画面に遷移）】
		RequestDispatcher dp = req.getRequestDispatcher("/userkakunin.jsp");
		dp.forward(req, resp);
	}

}
