package jp.ac.fjb.sotuken.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.HotelBean;
import jp.ac.fjb.sotuken.bean.KankouchiBean;
import jp.ac.fjb.sotuken.bean.KenBean;
import jp.ac.fjb.sotuken.bean.StationBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.NewPlanPressModel;

public class BbsButtonServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();					// セッション
		String jspName = "";								//遷移先の入れ物
		String bbsProgId = req.getParameter("bbsProgId");	// プログラムIDを取得
		String bbsInfo = req.getParameter("bbsInfo");		//掲示板情報を取得
		System.out.println("プランID" + bbsInfo);
		String bbsInfo2 = req.getParameter("bbsInfo2");		//掲示板情報を取得
		System.out.println("プラン名" + bbsInfo2);

		if(bbsInfo == null){
			bbsInfo="";
		}

		//ユーザーIDを取得
		UserBean loginUser = (UserBean)s.getAttribute("LOGIN_USER");

		if(bbsProgId.equals("0")){

			if(loginUser != null){
				// 県名一覧を取得
				NewPlanPressModel pModel = new NewPlanPressModel();
				ArrayList<KenBean> kenList = pModel.getKenList();
				s.setAttribute("KEN", kenList);
				//観光地一覧を取得
				ArrayList<KankouchiBean> kankochiList = pModel.getKankochiList();
				s.setAttribute("KANKOCHI", kankochiList);
				//駅一覧を取得
				ArrayList <StationBean> stationList=pModel.getStationList();
				s.setAttribute("STATION", stationList);
				//宿泊先一覧を取得
				ArrayList<HotelBean> hList = pModel.getHotelList();
				s.setAttribute("HOTEL", hList);

				jspName = "newPlanPress.jsp";

			}else{
				//未ログインの場合はログイン画面に遷移
				jspName = "LoginServlet";
			}

			//コメントボタンが押された場合
		}else if(bbsProgId.equals("1")){
			//識別後、bbsNoのみを取得しセッションにセット
			s.setAttribute("BBS_NO", bbsInfo);
			System.out.println(bbsInfo);

			jspName = "comment.jsp";

			//詳細ボタンを押された場合
		}else if(bbsProgId.equals("2")){
			//識別後、planIdとプラン名を取得しセッションにセット
			s.setAttribute("PLAN_ID", bbsInfo);
			s.setAttribute("PLAN_NAME", bbsInfo2);

			jspName = "SearchResultServlet";
		}

		RequestDispatcher dp = req.getRequestDispatcher("/" + jspName);
		dp.forward(req, resp);
	}

}
