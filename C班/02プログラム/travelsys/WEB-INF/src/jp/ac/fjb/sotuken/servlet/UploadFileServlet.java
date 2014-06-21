package jp.ac.fjb.sotuken.servlet;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.sotuken.bean.BbsBean;
import jp.ac.fjb.sotuken.bean.UserBean;
import jp.ac.fjb.sotuken.model.BbsModel;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFileServlet extends HttpServlet {

	// Beanに入力値を詰める
	BbsBean newPlan = new BbsBean();

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession s = request.getSession();	// セッション

		// 画面の入力値を取得
		request.setCharacterEncoding("UTF-8");

		//ユーザーIDを取得
		UserBean loginUser = (UserBean)s.getAttribute("LOGIN_USER");
		String loginId = loginUser.getUserId();

		if (ServletFileUpload.isMultipartContent(request)) {

			// ファクトリー生成
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1426);

			// 一時的に保存する際のディレクトリ
			factory.setRepository(new File("I:\\temp\\file_up"));


			// アップロード可能なファイルサイズの設定
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setSizeMax(-1);
			upload.setFileSizeMax(-1);

			List items;
			try {
				items = upload.parseRequest(request);
			} catch (FileUploadException e) {
				throw new ServletException(e);
			}

			// 全フィールドに対するループ
			for (Object val : items) {
				FileItem item = (FileItem) val;
				if (item.isFormField()) {
					// type="file"以外のフィールド
					processFormField(item);
				} else {
					// type="file"のフィールド
					processUploadedFile(item);
				}
			}
		}

				// 掲示板情報を登録
				BbsModel bModel = new BbsModel();
				bModel.insertNewPlan(newPlan, loginId);

				RequestDispatcher dp = request.getRequestDispatcher("/BbsServlet");
				dp.forward(request, response);

	}

	private void processUploadedFile(FileItem item) throws IOException,
			ServletException {
		File f = new File(item.getName());
		try {
			item.write(new File("I:\\Sotuken\\travelsys\\images", f.getName()));
			newPlan.setBbsImage(f.getName());
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void processFormField(FileItem item) throws ServletException {

		System.out.println(item.getFieldName());
		try {
			String fieldName = item.getFieldName();
			System.out.println(item.getString("UTF-8"));

			if(fieldName.equals("name")){
				newPlan.setPressUserName(item.getString("UTF-8"));

			}else if(fieldName.equals("todofuken")){
				newPlan.setKenName(item.getString("UTF-8"));

			}else if(fieldName.equals("chiiki")){
				newPlan.setChiiki(item.getString("UTF-8"));

			}else if(fieldName.equals("kankochi")){
				newPlan.setKankochi(item.getString("UTF-8"));

			}else if(fieldName.equals("planName")){
				newPlan.setPlanName(item.getString("UTF-8"));

			}else if(fieldName.equals("datestart")){
				newPlan.setDateStart(item.getString("UTF-8"));

			}else if(fieldName.equals("dateremit")){
				newPlan.setDateRemit(item.getString("UTF-8"));

			}else if(fieldName.equals("people")){
				newPlan.setPeople(item.getString("UTF-8"));

			}else if(fieldName.equals("message")){
				newPlan.setPlanPressSt(item.getString("UTF-8"));

			}else if(fieldName.equals("hotel")){
				newPlan.setHotel(item.getString("UTF-8"));

			}else if(fieldName.equals("syukuhakuNum")){
				newPlan.setSyukuhakuDay(item.getString("UTF-8"));

			}else if(fieldName.equals("price")){
				newPlan.setPrice(item.getString("UTF-8"));

			}else if(fieldName.equals("startstation")){
				newPlan.setGo(item.getString("UTF-8"));

			}else if(fieldName.equals("arrivestation")){
				newPlan.setArrive(item.getString("UTF-8"));

			}else if(fieldName.equals("keyword")){
				newPlan.setKeyWord(item.getString("UTF-8"));

			}

		} catch (UnsupportedEncodingException e) {
			throw new ServletException(e);
		}
	}
}
