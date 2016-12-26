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

public class GetStudentById extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String FILE_PATH = "E:/test/stus.json";
    public GetStudentById() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		// Servlet ¹ýÂËÆ÷ Filter 
		response.setContentType("text/html;charset=utf-8");
		PrintWriter res = response.getWriter();
		if(id!=null){
			String json;
			try {
				json = getStudentJsonById(id);
				if(json!=null){
					res.println(json);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			res.println("field");
			res.close();
		}
	}
	
	public String getStudentJsonById(String id) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILE_PATH)), "utf-8"));
		String str = null;
		while((str=br.readLine())!=null){
			JSONObject jsonObject = new JSONObject(str);
			String rid = jsonObject.getString("id");
			if(rid!=null&&rid.equals(id)){
				br.close();
				return str;
			}
		}
		br.close();
		return null;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
