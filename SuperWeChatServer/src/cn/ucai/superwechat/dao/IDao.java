package cn.ucai.superwechat.dao;

import java.util.List;

import cn.ucai.superwechat.bean.UserAvatar;
import cn.ucai.superwechat.pojo.User;

public interface IDao {
	/**
	 * 根据用户名查找用户及头像信息
	 * @param name
	 * @return
	 */
	public abstract UserAvatar getUserAvatarByName(String name);

	/**
	 * 根据用户名更新昵称信息
	 * @param name
	 * @param newNick
	 * @return
	 */
	public abstract boolean updateNick(String name, String newNick);

	/**
	 * 分页下载指定用户的好友及头像信息
	 * @param name
	 * @param niPageId
	 * @param niPageSize
	 * @return
	 */
	public abstract List<UserAvatar> downLoadContactPageList(String name, int niPageId, int niPageSize);

	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public abstract boolean register(User user);
}
