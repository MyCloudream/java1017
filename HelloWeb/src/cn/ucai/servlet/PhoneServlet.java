package cn.ucai.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/phone")
public class PhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PhoneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		// 1、接收用户get请求的参数,也即手机号码
		String phoneNum = request.getParameter("phone");
		// 2、模拟手机号码归属地的查询：从本地文件中直接把15210011578对应的json数据给拿到。
		PrintWriter pw = response.getWriter();
		String strJson = null;
		try {
			strJson = getText("E:/abc/person.json");
			// 3、将上述json数据写回给客户端。
			pw.println(strJson);
		} catch (ServerException e) {
			// 如果服务器本身有问题，将异常信息写回给客户端
			pw.println("errNum:1,errMsg:error,msg:");
		}
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public String getText(String strFile) throws ServerException{
		File file = new File(strFile);
		BufferedReader br = null;
		StringBuilder builder = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
			String str = null;
			while((str=br.readLine())!=null){
				builder.append(str);
				builder.append("\r\n");
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		return null;
		throw new ServerException("服务器异常，请联系管理员");
	}
}
