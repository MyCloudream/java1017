package cn.ucai.superwechat.biz;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ucai.superwechat.bean.Result;
import cn.ucai.superwechat.pojo.User;

public interface IBiz {
	/**
	 * 13、根据用户名查找用户和用户头像信息
	 * @param name 指定用户名
	 * @return
	 */
	public abstract Result findUser(String name);

	/**
	 * 7、更新用户昵称
	 * @param name 
	 * @param newNick 新昵称
	 * @return 
	 */
	public abstract Result updateNick(String name, String newNick);

	/**
	 * 下载用户或群组头像
	 * @param nameOrHxid 用户名或群组环信ID
	 * @param avatarType 头像类型 user_avatar是用户，group_icon表示是群组头像。
	 * @param response 响应
	 */
	public abstract void downloadAvatar(String nameOrHxid, String avatarType, HttpServletResponse response);

	/**
	 * 分页下载指定用户的好友及头像信息
	 * @param name
	 * @param pageId
	 * @param pageSize
	 * @return
	 */
	public abstract Result downLoadContactPageList(String name, String pageId, String pageSize);

	/**
	 * 2、注册用户
	 * @param user
	 * @param request
	 * @return
	 */
	public abstract Result register(User user, HttpServletRequest request);
}
