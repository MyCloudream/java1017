package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.bean.User;
import cn.ucai.util.DBUtil;

/**
 * JDBC的使用步骤：
 * 1、打开cmd    加载驱动包
 * 2、连接数据库 mysql -hlocalhost -P3306 -uroot -proot +  use ucai_db
 * 3、查询数据库 select * from t_user;
 * 4、返回处理结果集 
 * 5、遍历结果（取出每一个结果） 查询结果封装为对象
 * 6、断开连接
 */
public class TestJDBC {
	public static void main(String[] args) {
		for(User u : getUser()){
			System.out.println(u);
		}
	}
	
	public static boolean login(String name,String password){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			// ？ 占位符  \'
			// select * from t_user where name = \'zhangsan\' and password = \'123456\' or \'1\'=\'1\'
			ps = conn.prepareStatement("select * from t_user where name = ? and password = ?");
			ps.setString(1, name);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{// 关闭资源
			DBUtil.closeAll(rs, ps, conn);
		}
		return false;
	}
	
	public static List<User> getUser(){
		List<User> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			// 获取操作数据库的类
			ps = conn.prepareStatement("select * from t_user");
			// 操作数据库，得到结果集
			rs = ps.executeQuery();
			list = new ArrayList<User>();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				User user = new User(id, name, password);
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{// 关闭资源
			DBUtil.closeAll(rs, ps, conn);
		}
		return list;
	}
}
