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
		// 解决请求乱码问题
		request.setCharacterEncoding("utf-8");
		// 解决响应乱码问题
		response.setContentType("text/html;charset=utf-8");
		// 1、接收用户（客户端）提交来的request参数，根据参数，判断用户的行为。
		String strReq = request.getParameter("request");
		if(strReq==null){
			return;
		}
		System.out.println(strReq);
		switch (strReq) {
		// 1、获取服务器状态
		case I.REQUEST_SERVERSTATUS:
			serverStatus(response);
			break;
		// 5、下载用户或群组的头像
		case I.REQUEST_DOWNLOAD_AVATAR:
			downloadAvatar(request,response);
			break;
		// 7、更新用户昵称
		case I.REQUEST_UPDATE_USER_NICK:
			updateNick(request,response);
			break;
		// 10、分页下载指定用户的好友及头像信息
		case I.REQUEST_DOWNLOAD_CONTACT_PAGE_LIST:
			downLoadContactPageList(request,response);
			break;
		// 13、查找用户和用户头像信息
		case I.REQUEST_FIND_USER:
			findUser(request,response);
			break;
		default:
			break;
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 解决请求乱码问题
		request.setCharacterEncoding("utf-8");
		// 解决响应乱码问题
		response.setContentType("text/html;charset=utf-8");
		// 1、接收用户（客户端）提交来的request参数，根据参数，判断用户的行为。
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
	 * 2、注册用户
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
	 * 分页下载用户好友信息
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
		// 1、接收用户数据
		String nameOrHxid = request.getParameter(I.NAME_OR_HXID);
		String avatarType = request.getParameter(I.AVATAR_TYPE);
		// 2、交给biz处理
		biz.downloadAvatar(nameOrHxid,avatarType,response);
	}

	/**
	 * 7、更新用户昵称
	 * @param request
	 * @param response
	 */
	private void updateNick(HttpServletRequest request, HttpServletResponse response) {
		// 1、接收请求数据
		String name = request.getParameter(I.User.USER_NAME);
		String newNick = request.getParameter(I.User.NICK);
		// 2、交给biz
		Result result = biz.updateNick(name,newNick);
		// 3、转json，给客户端
		JsonUtil.writeJsonToClient(result, response);
	}

	/**
	 * 根据用户名查找用户和用户头像信息
	 * @param request
	 * @param response
	 */
	private void findUser(HttpServletRequest request, HttpServletResponse response) {
		// 1、从request中获取请求的数据（用户名）
		String name = request.getParameter(I.User.USER_NAME);
		// 2、根据用户名，从数据库中查询用户和用户头像的信息（两个表联查）
		// 3、将查询结果封装为UserAvatar类对象，并再次封装为Result对象
		Result result = biz.findUser(name);
		// 4、将Result对象转为json，并发送给客户端。
		JsonUtil.writeJsonToClient(result, response);
	}

	private void serverStatus(HttpServletResponse response) {
		// 1、新建Result对象
		Result result = new Result(true,I.MSG_SUCCESS);
		// 2、将result对象转json并发送给客户端。
		JsonUtil.writeJsonToClient(result, response);
	}

}
