package cn.ucai.superwechat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ucai.superwechat.bean.Result;
import cn.ucai.superwechat.biz.IBiz;
import cn.ucai.superwechat.biz.IBizImpl;
import cn.ucai.superwechat.pojo.User;
import cn.ucai.superwechat.util.I;
import cn.ucai.superwechat.util.JsonUtil;

@WebServlet("/Server")
public class ServerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IBiz biz = new IBizImpl();
    public ServerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���������������
		request.setCharacterEncoding("utf-8");
		// �����Ӧ��������
		response.setContentType("text/html;charset=utf-8");
		// 1�������û����ͻ��ˣ��ύ����request���������ݲ������ж��û�����Ϊ��
		String strReq = request.getParameter("request");
		if(strReq==null){
			return;
		}
		System.out.println(strReq);
		switch (strReq) {
		// 1����ȡ������״̬
		case I.REQUEST_SERVERSTATUS:
			serverStatus(response);
			break;
		// 5�������û���Ⱥ���ͷ��
		case I.REQUEST_DOWNLOAD_AVATAR:
			downloadAvatar(request,response);
			break;
		// 7�������û��ǳ�
		case I.REQUEST_UPDATE_USER_NICK:
			updateNick(request,response);
			break;
		// 10����ҳ����ָ���û��ĺ��Ѽ�ͷ����Ϣ
		case I.REQUEST_DOWNLOAD_CONTACT_PAGE_LIST:
			downLoadContactPageList(request,response);
			break;
		// 13�������û����û�ͷ����Ϣ
		case I.REQUEST_FIND_USER:
			findUser(request,response);
			break;
		default:
			break;
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���������������
		request.setCharacterEncoding("utf-8");
		// �����Ӧ��������
		response.setContentType("text/html;charset=utf-8");
		// 1�������û����ͻ��ˣ��ύ����request���������ݲ������ж��û�����Ϊ��
		String strReq = request.getParameter("request");
		if(strReq==null){
			return;
		}
		System.out.println(strReq);
		switch (strReq) {
		case I.REQUEST_REGISTER:
			register(request,response);
			break;
			
		}
	}

	/**
	 * 2��ע���û�
	 * @param request
	 * @param response
	 */
	private void register(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter(I.User.USER_NAME);
		String password = request.getParameter(I.User.PASSWORD);
		String nick = request.getParameter(I.User.NICK);
		User user = new User(name,password,nick);
		Result result = biz.register(user,request);
		JsonUtil.writeJsonToClient(result, response);
	}

	/**
	 * ��ҳ�����û�������Ϣ
	 * @param request
	 * @param response
	 */
	private void downLoadContactPageList(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter(I.Contact.USER_NAME);
		String pageId = request.getParameter(I.PAGE_ID);
		String pageSize = request.getParameter(I.PAGE_SIZE);
		Result result = biz.downLoadContactPageList(name,pageId,pageSize);
		JsonUtil.writeJsonToClient(result, response);
	}

	private void downloadAvatar(HttpServletRequest request, HttpServletResponse response) {
		// 1�������û�����
		String nameOrHxid = request.getParameter(I.NAME_OR_HXID);
		String avatarType = request.getParameter(I.AVATAR_TYPE);
		// 2������biz����
		biz.downloadAvatar(nameOrHxid,avatarType,response);
	}

	/**
	 * 7�������û��ǳ�
	 * @param request
	 * @param response
	 */
	private void updateNick(HttpServletRequest request, HttpServletResponse response) {
		// 1��������������
		String name = request.getParameter(I.User.USER_NAME);
		String newNick = request.getParameter(I.User.NICK);
		// 2������biz
		Result result = biz.updateNick(name,newNick);
		// 3��תjson�����ͻ���
		JsonUtil.writeJsonToClient(result, response);
	}

	/**
	 * �����û��������û����û�ͷ����Ϣ
	 * @param request
	 * @param response
	 */
	private void findUser(HttpServletRequest request, HttpServletResponse response) {
		// 1����request�л�ȡ��������ݣ��û�����
		String name = request.getParameter(I.User.USER_NAME);
		// 2�������û����������ݿ��в�ѯ�û����û�ͷ�����Ϣ�����������飩
		// 3������ѯ�����װΪUserAvatar����󣬲��ٴη�װΪResult����
		Result result = biz.findUser(name);
		// 4����Result����תΪjson�������͸��ͻ��ˡ�
		JsonUtil.writeJsonToClient(result, response);
	}

	private void serverStatus(HttpServletResponse response) {
		// 1���½�Result����
		Result result = new Result(true,I.MSG_SUCCESS);
		// 2����result����תjson�����͸��ͻ��ˡ�
		JsonUtil.writeJsonToClient(result, response);
	}

}
