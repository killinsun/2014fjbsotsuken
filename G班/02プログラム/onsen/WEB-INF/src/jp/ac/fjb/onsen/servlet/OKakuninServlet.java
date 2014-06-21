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

		//�G���R�[�h
		req.setCharacterEncoding("UTF-8");

		//�Z�b�V�����̐錾
		HttpSession s = req.getSession();

		String jspName = "Login.jsp";
		if(s.getAttribute("LOGIN_USER") != null){

		//�J�ڐ��JSP
		jspName = "onsenYoyaku.jsp";

		//bean�̐錾
		OnsenYoyakuBean bean = new OnsenYoyakuBean();

		Calendar c = Calendar.getInstance();

		String alert = null;

		//��ʂŌ��ݕ\�����Ă���N�����擾
		String year = req.getParameter("Y");
		String month = req.getParameter("M");

		//��ʂ�����Ȃ��i�߂����ꍇ�j�͌��݂̔N�����擾
		if (year == null) {
			year = String.valueOf(c.get(Calendar.YEAR));
			month = String.valueOf(c.get(Calendar.MARCH)+1);
		}

		//�{�^���������ꂽ�ꍇ
		String btn = req.getParameter("btn");
		if(btn != null){
			int y;	//�N
			int m;	//��
			String[] yoyakuDay;	//�\�����

			//�\��l���A�\�񕔉�����bean�ɃZ�b�g
			bean.setNinzu(Integer.parseInt(req.getParameter("ninzu")));
			bean.setHeyasuu(Integer.parseInt(req.getParameter("heya")));

			if(btn.equals("����")){
				//���݂̔N�����擾
				y = c.get(Calendar.YEAR);
				m = c.get(Calendar.MARCH)+1;

				String ym1 = String.valueOf(year) + String.valueOf(m);	//����
				String ym2="";	//����
				String ym3="";	//���X��

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

			}else if(btn.equals("����")){
				yoyakuDay = req.getParameterValues("yoyakuDay");
				s.setAttribute(year+month, yoyakuDay);

				//���l�ɕϊ�
				y = Integer.parseInt(year);
				m = Integer.parseInt(month);

				m += 1;
				if(m > 12){
					m = 1;
					y += 1;
				}

				//�����ɕϊ�
				year = String.valueOf(y);
				month = String.valueOf(m);

			}else if(btn.equals("�O��")){
				yoyakuDay = req.getParameterValues("yoyakuDay");
				s.setAttribute(year+month, yoyakuDay);

				//���l�ɕϊ�
				y = Integer.parseInt(year);
				m = Integer.parseInt(month);

				m -= 1;
				if(m < 1){
					m = 12;
					y -= 1;
				}

				//�����ɕϊ�
				year = String.valueOf(y);
				month = String.valueOf(m);

			}else if(btn.equals("�\��m�F��ʂ�")){
				yoyakuDay = req.getParameterValues("yoyakuDay");
				s.setAttribute(year+month, yoyakuDay);

				//���݂̔N�����擾
				y = c.get(Calendar.YEAR);
				m = c.get(Calendar.MARCH)+1;

				String ym1 = String.valueOf(year) + String.valueOf(m);	//����
				String ym2="";	//����
				String ym3="";	//���X��

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

				//�`�F�b�N��������Ă���ꍇ
				if(yd.size() == 0){
					alert = "���t��I�����Ă�������";
				}else{
					bean.setYoyakuDay(yd);
					jspName="YoyakuKakuninn.jsp";
				}
			}
		}

		//�󂫕������擾
		OnsenBean ob  =(OnsenBean)s.getAttribute("ONSEN");
		String onsenNo =ob.getOnsenID();
		OYoyakuModel model = new OYoyakuModel();
		ArrayList<Integer> akiHeya = model.getAkiHeya(onsenNo, year, month);

		//�Z�b�V�����ɃZ�b�g
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