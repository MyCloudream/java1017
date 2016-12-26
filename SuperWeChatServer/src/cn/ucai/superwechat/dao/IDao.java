package cn.ucai.superwechat.dao;

import java.util.List;

import cn.ucai.superwechat.bean.UserAvatar;
import cn.ucai.superwechat.pojo.User;

public interface IDao {
	/**
	 * �����û��������û���ͷ����Ϣ
	 * @param name
	 * @return
	 */
	public abstract UserAvatar getUserAvatarByName(String name);

	/**
	 * �����û��������ǳ���Ϣ
	 * @param name
	 * @param newNick
	 * @return
	 */
	public abstract boolean updateNick(String name, String newNick);

	/**
	 * ��ҳ����ָ���û��ĺ��Ѽ�ͷ����Ϣ
	 * @param name
	 * @param niPageId
	 * @param niPageSize
	 * @return
	 */
	public abstract List<UserAvatar> downLoadContactPageList(String name, int niPageId, int niPageSize);

	/**
	 * ע���û�
	 * @param user
	 * @return
	 */
	public abstract boolean register(User user);
}
