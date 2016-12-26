package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.ucai.bean.User;
import cn.ucai.util.DBUtil;

/**
 * 批量插入
 * .batch 
 */
public class TestBatInsert {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User("a","a"));
		list.add(new User("b","b"));
		list.add(new User("c","c"));
		list.add(new User("d","d"));
		list.add(new User("e","e"));
		list.add(new User("f","f"));
		
		insertListUser(list);
	}
	
	public static void insertListUser(List<User> list){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("insert into t_user(name,password) values(?,?)");
			for(int i=0;i<list.size();i++){
				ps.setString(1, list.get(i).getName());
				ps.setString(2, list.get(i).getPassword());
				ps.addBatch();
			}
			int[] arr= ps.executeBatch();
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{// 关闭资源
			DBUtil.closeAll(null, ps, conn);
		}
	}
}
