package cn.ucai.superwechat.biz;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ucai.superwechat.bean.Result;
import cn.ucai.superwechat.pojo.User;

public interface IBiz {
	/**
	 * 13�������û��������û����û�ͷ����Ϣ
	 * @param name ָ���û���
	 * @return
	 */
	public abstract Result findUser(String name);

	/**
	 * 7�������û��ǳ�
	 * @param name 
	 * @param newNick ���ǳ�
	 * @return 
	 */
	public abstract Result updateNick(String name, String newNick);

	/**
	 * �����û���Ⱥ��ͷ��
	 * @param nameOrHxid �û�����Ⱥ�黷��ID
	 * @param avatarType ͷ������ user_avatar���û���group_icon��ʾ��Ⱥ��ͷ��
	 * @param response ��Ӧ
	 */
	public abstract void downloadAvatar(String nameOrHxid, String avatarType, HttpServletResponse response);

	/**
	 * ��ҳ����ָ���û��ĺ��Ѽ�ͷ����Ϣ
	 * @param name
	 * @param pageId
	 * @param pageSize
	 * @return
	 */
	public abstract Result downLoadContactPageList(String name, String pageId, String pageSize);

	/**
	 * 2��ע���û�
	 * @param user
	 * @param request
	 * @return
	 */
	public abstract Result register(User user, HttpServletRequest request);
}
