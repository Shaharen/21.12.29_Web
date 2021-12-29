package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String ip = request.getRemoteAddr();

		out.print("<html>");
		out.print("<head><title>Request & Response 실습</title></head>");
		out.print("<body>");
		if (ip.equals("211.63.240.114")) {
			out.println("<h1>건하 하이~</h1>");
		} else if (ip.equals("222.102.104.240")) {
			out.println("<h1>너 밴</h1>");
		} else if (ip.equals("59.0.124.191")) {
			out.println("<h1>희태 하이~</h1>");
		} else if (ip.equals("210.183.87.89")) {
			out.println("<h1>붉은색!!!!!!! 푸른색!!!!</h1>");
		} else if (ip.equals("211.33.239.153")) {
			out.println("<h1>호에에엥? 후에엥!! 꾸앵!</h1>");
		} else if (ip.equals("220.80.203.113")) {
			out.println("<h1>고마워요 스피드웨건!!!</h1>");
		} else if (ip.equals("220.80.88.62")) {
			out.println("<h1>아 형!? 맞는거 같아요 </h1>");
		} else if (ip.equals("59.0.236.207")) {
			out.println("<h1>강사님 환영합니다</h1>");
		} else {
			out.println("손님 환영합니다");
		}
	}

}
