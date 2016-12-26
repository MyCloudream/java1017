package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.ucai.util.DBUtil;

/**
 * Transaction:����
 * �������ݿ���������ݵ�һϵ�еĲ�����
 * 
 */
public class TestTransaction {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);// �ر��Զ��ύ
			ps = conn.prepareStatement("insert into t_user(name,password) values(?,?)");
			ps.setString(1, "e");
			ps.setString(2,"e");
			ps.executeUpdate();
			ps.close();
			
			ps = conn.prepareStatement("update t_cont set count = ?");
			ps.setInt(1, 5);
			ps.executeUpdate();
			conn.commit();// �ύ�����������е�����һ����ȫ���ύ�����ݿ������
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// �ع� : ��ջ������������е�sql���ȫ��ʧЧ��
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{// �ر���Դ
			DBUtil.closeAll(null, ps, conn);
		}
	}
}
