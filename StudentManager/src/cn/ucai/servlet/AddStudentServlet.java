package cn.ucai.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.ucai.bean.Student;

public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String FILE_PATH = "E:/test/stus.json";
    public AddStudentServlet() {
    
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter res = response.getWriter();
		if(id!=null&&name!=null&&age!=null){
			if(age.matches("\\d{1,3}")){
				int niAge = Integer.parseInt(age);
				Student stu = new Student(id,name,niAge);
				ObjectMapper om = new ObjectMapper();
				String result = om.writeValueAsString(stu);
				File file = new File(FILE_PATH);
				PrintWriter pw = new PrintWriter(
						new OutputStreamWriter(
								new FileOutputStream(file,true)));
				pw.println(result);
				pw.close();
				res.println("success");
				res.close();
			}
		}else{
			res.println("field");
			res.close();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
