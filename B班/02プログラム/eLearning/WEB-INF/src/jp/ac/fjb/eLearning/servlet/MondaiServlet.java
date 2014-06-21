package jp.ac.fjb.eLearning.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MondaiServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		String mondaiId = request.getParameter("mondaiId");

		response.setContentType("text/html; charset=Windows-31J");
		response.setCharacterEncoding("Windows-31J");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>問題</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>取得された問題番号は"+ mondaiId +"です</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
