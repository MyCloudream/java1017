package cn.ucai.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class GetAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String FILE_PATH = "E:/test/stus.json";
    public GetAllStudent() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter res = response.getWriter();
		String json = null;;
		try {
			json = getAllStudentJson();
			if(json!=null){
				res.println(json);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getAllStudentJson() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILE_PATH)), "utf-8"));
		String str = null;
		StringBuffer buffer = new StringBuffer();
		while((str=br.readLine())!=null){
			buffer.append(str);
		}
		br.close();
		return buffer.toString();
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
