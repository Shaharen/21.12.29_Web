package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = true, urlPatterns = { "/Ex01Request" })
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// request(��û��ü) : ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		// ���� : IP, ������ ����(����, ���, ���ڵ� ��� ��� ), ����ڰ� �Է��� ������ ��
		
		// ip �޾ƿ�
		String ip = request.getRemoteAddr();
		
		System.out.println("������ IP : "+ip);
		
		// IP�� Ȯ���Ͽ� �ٸ� ��¹��� �������� �����Ͻÿ�~!
		// ���� �Ǵ� ¦�� ���� �� : OO�� ȯ���մϴ�!
		// ���� ���� �� : ����� ȯ���մϴ�!
		// �̿� ���� �� : �մ� ȯ���մϴ�!
		//*IPȮ���� ���ڿ��� �޼ҵ� Ȱ���� ��
		
		if (ip.equals("211.63.240.114")) {
			System.out.println("���� ����~");
		} else if (ip.equals("222.102.104.240")) {
			System.out.println("�� �����̳�");
		} else if (ip.equals("59.0.124.191")) {
			System.out.println("���� ����~");
		} else if (ip.equals("210.183.87.89")) {
			System.out.println("���̽���!!!");
		} else if (ip.equals("59.0.236.207")) {
			System.out.println("����� ȯ���մϴ�");
		} else {
			System.out.println("�մ� ȯ���մϴ�");
		}
	}

}
