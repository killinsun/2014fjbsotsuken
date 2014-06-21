package jp.ac.fjb.onsen.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.onsen.bean.OnsenBean;
import jp.ac.fjb.onsen.bean.OnsenYoyakuBean;
import jp.ac.fjb.onsen.model.OYoyakuModel;

public class OKakuninServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//エンコード
		req.setCharacterEncoding("UTF-8");

		//セッションの宣言
		HttpSession s = req.getSession();

		String jspName = "Login.jsp";
		if(s.getAttribute("LOGIN_USER") != null){

		//遷移先のJSP
		jspName = "onsenYoyaku.jsp";

		//beanの宣言
		OnsenYoyakuBean bean = new OnsenYoyakuBean();

		Calendar c = Calendar.getInstance();

		String alert = null;

		//画面で現在表示している年月を取得
		String year = req.getParameter("Y");
		String month = req.getParameter("M");

		//画面から取れない（戻った場合）は現在の年月を取得
		if (year == null) {
			year = String.valueOf(c.get(Calendar.YEAR));
			month = String.valueOf(c.get(Calendar.MARCH)+1);
		}

		//ボタンが押された場合
		String btn = req.getParameter("btn");
		if(btn != null){
			int y;	//年
			int m;	//月
			String[] yoyakuDay;	//予約日程

			//予約人数、予約部屋数をbeanにセット
			bean.setNinzu(Integer.parseInt(req.getParameter("ninzu")));
			bean.setHeyasuu(Integer.parseInt(req.getParameter("heya")));

			if(btn.equals("決定")){
				//現在の年月を取得
				y = c.get(Calendar.YEAR);
				m = c.get(Calendar.MARCH)+1;

				String ym1 = String.valueOf(year) + String.valueOf(m);	//今月
				String ym2="";	//翌月
				String ym3="";	//翌々月

				for(int i=0; i < 2; i++){
					m += 1;
					if(m > 12){
						m = 1;
						y += 1;
					}
					if(i == 0){
						ym2 = String.valueOf(y) + String.valueOf(m);
					}else{
						ym3 = String.valueOf(y) + String.valueOf(m);
					}
				}
				s.setAttribute(ym1, null);
				s.setAttribute(ym2, null);
				s.setAttribute(ym3, null);

			}else if(btn.equals("次月")){
				yoyakuDay = req.getParameterValues("yoyakuDay");
				s.setAttribute(year+month, yoyakuDay);

				//数値に変換
				y = Integer.parseInt(year);
				m = Integer.parseInt(month);

				m += 1;
				if(m > 12){
					m = 1;
					y += 1;
				}

				//文字に変換
				year = String.valueOf(y);
				month = String.valueOf(m);

			}else if(btn.equals("前月")){
				yoyakuDay = req.getParameterValues("yoyakuDay");
				s.setAttribute(year+month, yoyakuDay);

				//数値に変換
				y = Integer.parseInt(year);
				m = Integer.parseInt(month);

				m -= 1;
				if(m < 1){
					m = 12;
					y -= 1;
				}

				//文字に変換
				year = String.valueOf(y);
				month = String.valueOf(m);

			}else if(btn.equals("予約確認画面へ")){
				yoyakuDay = req.getParameterValues("yoyakuDay");
				s.setAttribute(year+month, yoyakuDay);

				//現在の年月を取得
				y = c.get(Calendar.YEAR);
				m = c.get(Calendar.MARCH)+1;

				String ym1 = String.valueOf(year) + String.valueOf(m);	//今月
				String ym2="";	//翌月
				String ym3="";	//翌々月

				for(int i=0; i < 2; i++){
					m += 1;
					if(m > 12){
						m = 1;
						y += 1;
					}
					if(i == 0){
						ym2 = String.valueOf(y) + String.valueOf(m);
					}else{
						ym3 = String.valueOf(y) + String.valueOf(m);
					}
				}

				ArrayList<String> yd = new ArrayList<String>();
				if(s.getAttribute(ym1) != null){
					yoyakuDay = (String[])s.getAttribute(ym1);
					for(int i=0; i < yoyakuDay.length; i++){
						yd.add(yoyakuDay[i]);
					}
				}
				if(s.getAttribute(ym2) != null){
					yoyakuDay = (String[])s.getAttribute(ym2);
					for(int i=0; i < yoyakuDay.length; i++){
						yd.add(yoyakuDay[i]);
					}
				}
				if(s.getAttribute(ym3) != null){
					yoyakuDay = (String[])s.getAttribute(ym3);
					for(int i=0; i < yoyakuDay.length; i++){
						yd.add(yoyakuDay[i]);
					}
				}

				//チェックが押されている場合
				if(yd.size() == 0){
					alert = "日付を選択してください";
				}else{
					bean.setYoyakuDay(yd);
					jspName="YoyakuKakuninn.jsp";
				}
			}
		}

		//空き部屋数取得
		OnsenBean ob  =(OnsenBean)s.getAttribute("ONSEN");
		String onsenNo =ob.getOnsenID();
		OYoyakuModel model = new OYoyakuModel();
		ArrayList<Integer> akiHeya = model.getAkiHeya(onsenNo, year, month);

		//セッションにセット
		s.setAttribute("ALERT", alert);
		s.setAttribute("OYBEAN", bean);
		s.setAttribute("Y", year);
		s.setAttribute("M", month);
		s.setAttribute("AKI_LIST", akiHeya);

		}

		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}