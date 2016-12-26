package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.ucai.bean.User;
import cn.ucai.util.DBUtil;

/**
 * 数据的增删修查
 * 查：查询单个
 * 条件查询  关联查询 子查询
 * 查询全部
 * 
 * JDBC中，对于查询，使用executeQuery方法
 * 对于增删修，使用executeUpdate
 * 
 */
public class TestCRUD {
	public static void main(String[] args) {
		if(updateUserById(1,"abcdef")){
			System.out.println("修改密码成功");
		}else{
			System.out.println("修改密码失败");
		}
	}
	
	public static boolean updateUserById(int id,String newPassword){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("update t_user set password = ? where id = ? ");
			ps.setString(1,newPassword);
			ps.setInt(2, id);
			int n = ps.executeUpdate();
			System.out.println("n:"+n);
			return n==1;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{// 关闭资源
			DBUtil.closeAll(null, ps, conn);
		}
		return false;
	}
	
	public static boolean deleteUserById(int id){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("delete from t_user where id = ?");
			ps.setInt(1, id);
			int n = ps.executeUpdate();
			System.out.println("n:"+n);
			return n==1;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{// 关闭资源
			DBUtil.closeAll(null, ps, conn);
		}
		return false;
	}
	
	/**
	 * insert into t_user(name,password) values('','');
	 * @param user
	 * @return
	 */
	public static boolean insertUser(User user){
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("insert into t_user(name,password) values(?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			int n = ps.executeUpdate();
			return n==1;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{// 关闭资源
			DBUtil.closeAll(null, ps, conn);
		}
		return false;
	}
}
