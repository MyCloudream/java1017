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
 * JDBC��ʹ�ò��裺
 * 1����cmd    ����������
 * 2���������ݿ� mysql -hlocalhost -P3306 -uroot -proot +  use ucai_db
 * 3����ѯ���ݿ� select * from t_user;
 * 4�����ش������� 
 * 5�����������ȡ��ÿһ������� ��ѯ�����װΪ����
 * 6���Ͽ�����
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
			// �� ռλ��  \'
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
		}finally{// �ر���Դ
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
			// ��ȡ�������ݿ����
			ps = conn.prepareStatement("select * from t_user");
			// �������ݿ⣬�õ������
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
		} finally{// �ر���Դ
			DBUtil.closeAll(rs, ps, conn);
		}
		return list;
	}
}
