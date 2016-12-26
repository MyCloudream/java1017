package cn.ucai.superwechat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.superwechat.bean.UserAvatar;
import cn.ucai.superwechat.pojo.User;
import cn.ucai.superwechat.util.DBUtil;
import cn.ucai.superwechat.util.I;

public class IDaoImpl implements IDao {

	@Override
	public UserAvatar getUserAvatarByName(String name) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select " + I.User.USER_NAME + "," + I.User.NICK + "," + I.Avatar.AVATAR_ID + ","
					+ I.Avatar.AVATAR_PATH + "," + I.Avatar.AVATAR_TYPE + "," + I.Avatar.UPDATE_TIME + " from "
					+ I.User.TABLE_NAME + "," + I.Avatar.TABLE_NAME + " where " + I.User.USER_NAME + " = "
					+ I.Avatar.USER_NAME + " and " + I.Avatar.AVATAR_TYPE + " = 0" + " and " + I.User.USER_NAME
					+ " = ?";
			System.out.println("sql :" + sql);
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if (rs.next()) {
				// 将数据库的查询结果封装为UserAvatar类
				UserAvatar ua = new UserAvatar(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getInt(5), rs.getString(6));
				return ua;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, conn);
		}
		return null;
	}

	@Override
	public boolean updateNick(String name, String newNick) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("update t_superwechat_user set m_user_nick = ? where m_user_name = ?");
			ps.setString(1, newNick);
			ps.setString(2, name);
			int n = ps.executeUpdate();
			return n != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(null, ps, conn);
		}
		return false;
	}

	@Override
	public List<UserAvatar> downLoadContactPageList(String name, int niPageId, int niPageSize) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT m_user_name,m_user_nick,m_avatar_id,m_avatar_path,m_avatar_type,m_avatar_last_update_time"
					+ " FROM t_superwechat_user u,t_superwechat_contact c,t_superwechat_avatar a"
					+ " WHERE u.m_user_name = a.m_avatar_user_name" 
					+ " AND u.m_user_name = c.m_contact_cname"
					+ " AND c.m_contact_user_name = ? limit ?,?";
			System.out.println("sql :" + sql);
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, (niPageId-1)*niPageSize);
			ps.setInt(3, niPageSize);
			rs = ps.executeQuery();
			List<UserAvatar> list = new ArrayList<UserAvatar>();
			while(rs.next()) {
				// 将数据库的查询结果封装为UserAvatar类
				UserAvatar ua = new UserAvatar(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getInt(5), rs.getString(6));
				/*String sname = rs.getString("m_user_name");
				ua.setMUserName(sname);*/
				list.add(ua);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, ps, conn);
		}
		return null;
	}

	/**
	 * 用户的注册：
	 * 1、在用户表中插入一条数据
	 * 2、在头像表中插入一条数据
	 * 
	 * 事务操作。
	 */
	@Override
	public boolean register(User user) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement("insert into t_superwechat_user values(?,?,?)");
			ps.setString(1, user.getMUserName());
			ps.setString(2, user.getMUserPassword());
			ps.setString(3, user.getMUserNick());
			ps.executeUpdate();
			ps.close();
			
			ps = conn.prepareStatement(
					"insert into t_superwechat_avatar(m_avatar_user_name,m_avatar_suffix,m_avatar_path,"
					+ "m_avatar_type,m_avatar_last_update_time) values(?,?,?,?,?)");
			ps.setString(1, user.getMUserName());
			ps.setString(2, ".jpg");
			ps.setString(3, "user_avatar");
			ps.setInt(4,0);
			ps.setString(5,System.currentTimeMillis()+"");
			ps.executeUpdate();
			conn.commit();
			return true;
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			DBUtil.closeAll(null, ps, conn);
		}
		return false;
	}

}
