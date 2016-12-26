package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.ucai.bean.User;
import cn.ucai.util.DBUtil;

/**
 * ���ݵ���ɾ�޲�
 * �飺��ѯ����
 * ������ѯ  ������ѯ �Ӳ�ѯ
 * ��ѯȫ��
 * 
 * JDBC�У����ڲ�ѯ��ʹ��executeQuery����
 * ������ɾ�ޣ�ʹ��executeUpdate
 * 
 */
public class TestCRUD {
	public static void main(String[] args) {
		if(updateUserById(1,"abcdef")){
			System.out.println("�޸�����ɹ�");
		}else{
			System.out.println("�޸�����ʧ��");
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
		}finally{// �ر���Դ
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
		}finally{// �ر���Դ
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
		}finally{// �ر���Դ
			DBUtil.closeAll(null, ps, conn);
		}
		return false;
	}
}
