package cn.ucai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorldServlet() {
        super();
    }

    // ����get����
    // ͨ��request�������ǿ���ȡ����������ȫ������
    // ͨ��response�������ǿ��԰����ݡ�ͼƬ����Ӧ���ͻ��ˡ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// PrintWriter���ַ��������һ�����ų���һ�����ű����ļ�
		// PrintWriter pw0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File("E:/abc/a.txt"))));
		// �ַ��������һ�����ų���һ��������Ӧ��body
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("Hello Servlet !<br/>");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("Hello Servlet !");
		pw.println("</html>");
		pw.close();
	}

	// ����post����
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}