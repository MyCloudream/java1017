package cn.ucai.superwechat.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.ucai.superwechat.bean.Result;

public class JsonUtil {
	private static final ObjectMapper mapper = new ObjectMapper();
	public static void writeJsonToClient(Result result , HttpServletResponse response){
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			mapper.writeValue(pw, result);
			// Ïàµ±ÓÚString str =mapper.writeValueAsString(result);
			// pw.println(str);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
}
