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
					res.println("ɾ���ɹ�");
				}
			} catch (Exception e) {
				e.printStackTrace();
				res.println("ɾ��ʧ��");
				res.close();
			}
		}else{
			res.println("ɾ��ʧ��");
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
	 * ��ɾ����Ӧjson����µ�list�洢���ļ��и���ԭ������
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
	 * �õ�ȫ��json���ݣ���List���ϵ���ʽ
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
