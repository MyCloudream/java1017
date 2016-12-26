package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.ucai.util.DBUtil;

/**
 * Transaction:事务
 * 事务：数据库中针对数据的一系列的操作。
 * 
 */
public class TestTransaction {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);// 关闭自动提交
			ps = conn.prepareStatement("insert into t_user(name,password) values(?,?)");
			ps.setString(1, "e");
			ps.setString(2,"e");
			ps.executeUpdate();
			ps.close();
			
			ps = conn.prepareStatement("update t_cont set count = ?");
			ps.setInt(1, 5);
			ps.executeUpdate();
			conn.commit();// 提交，将缓冲区中的内容一次性全部提交给数据库服务器
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// 回滚 : 清空缓冲区，让所有的sql语句全部失效。
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{// 关闭资源
			DBUtil.closeAll(null, ps, conn);
		}
	}
}
