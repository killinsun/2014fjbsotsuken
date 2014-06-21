package jp.ac.fjb.sns.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sns.bean.PostBean;
import jp.ac.fjb.sns.model.AdviceModel;

@SuppressWarnings("serial")
public class AdviceServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession s = req.getSession();

		// プログラムIDの取得
		String pId = req.getParameter("pid");
		String text = req.getParameter("text");
		String itemId = req.getParameter("example");
		String res = req.getParameter("hentou");

		System.out.println("プログラムID:" + pId);

		AdviceModel model = new AdviceModel();

		if (pId != null && pId.equals("")) {
			// 初期表示の場合
			ArrayList<PostBean> list = model.getPost();

			// セッションにセット
			s.setAttribute("POST_LIST", list);

		} else if (pId != null && pId.equals("1")) {
			// 投稿の場合
			model.insertContent(itemId, text);

			ArrayList<PostBean> list = model.getPost();

			// セッションにセット
			s.setAttribute("POST_LIST", list);

		} else if(pId != null && pId.startsWith("Q")){
			String contentId = req.getParameter("contentId");
			//返答表に投稿内容表示
			ArrayList<PostBean> list = (ArrayList<PostBean>)s.getAttribute("POST_LIST");

			for(int i=0; i<list.size(); i++) {
				PostBean a = (PostBean)list.get(i);
				if (a.getPostId().equals(contentId)){
					s.setAttribute("SELECT_BEAN", a);
					break;
				}
			}
			// 返答投稿の場合
			ArrayList<PostBean> list2 = model.getRes(contentId);

			// セッションにセット
			s.setAttribute("RES_LIST", list2);

		} else if(pId != null && pId.equals("2")){
			//項目の取得
			String item = req.getParameter("res");
			String content = req.getParameter("resText");

			PostBean bean = (PostBean)s.getAttribute("SELECT_BEAN");

			// 返事の場合
			model.insertRes(bean.getPostId(), item, content);

			// 返答を再取得
			ArrayList<PostBean> list = model.getRes(bean.getPostId());

			// セッションにセット
			s.setAttribute("RES_LIST", list);

			ArrayList<PostBean> list3 = model.getPost();
			s.setAttribute("POST_LIST", list3);
		}

		// 遷移先JSPをアドバイス画面に設定
		RequestDispatcher dp = req.getRequestDispatcher("U004Advice.jsp");
		dp.forward(req, resp);
	}
}
