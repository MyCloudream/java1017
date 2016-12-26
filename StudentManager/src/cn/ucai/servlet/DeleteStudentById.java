package cn.ucai.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class DeleteStudentById extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String FILE_PATH = "E:/test/stus.json";
    public DeleteStudentById() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		PrintWriter res = response.getWriter();
		if(id!=null){
			boolean flag;
			try {
				flag = deleteStudentJsonById(id);
				if(flag){
					res.println("删除成功");
				}
			} catch (Exception e) {
				e.printStackTrace();
				res.println("删除失败");
				res.close();
			}
		}else{
			res.println("删除失败");
			res.close();
		}
	}
	
	public boolean deleteStudentJsonById(String id) throws Exception{
		List<String> list = getAllStudentJson();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String json = it.next();
			JSONObject jsonObject = new JSONObject(json);
			String rid = jsonObject.getString("id");
			if(rid!=null){
				if(rid.equals(id)){
					it.remove();
				}
			}
		}
		if(saveNewList(list)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 将删除对应json后的新的list存储到文件中覆盖原有内容
	 * @param list
	 * @return
	 */
	public boolean saveNewList(List<String> list){
		PrintWriter pw;
		try {
			pw = new PrintWriter(
					new OutputStreamWriter(
							new FileOutputStream(new File(FILE_PATH))));
			for(String s:list){
				pw.println(s);
			}
			pw.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 得到全部json数据，以List集合得形式
	 * @return
	 * @throws Exception
	 */
	public List<String> getAllStudentJson() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILE_PATH)), "utf-8"));
		String str = null;
		List<String> list = new ArrayList<String>();
		while((str=br.readLine())!=null){
			list.add(str);
		}
		br.close();
		return list;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
