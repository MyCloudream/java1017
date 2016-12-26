package cn.ucai.superwechat.biz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ucai.superwechat.bean.Pager;
import cn.ucai.superwechat.bean.Result;
import cn.ucai.superwechat.bean.UserAvatar;
import cn.ucai.superwechat.dao.IDao;
import cn.ucai.superwechat.dao.IDaoImpl;
import cn.ucai.superwechat.pojo.User;
import cn.ucai.superwechat.util.I;

public class IBizImpl implements IBiz{
	private IDao dao = new IDaoImpl();
	@Override
	public Result findUser(String name) {
		Result result = new Result();
		UserAvatar ua = dao.getUserAvatarByName(name);
		if(ua==null){
			result.setRetMsg(false);
			result.setRetCode(I.MSG_USER_SEARCH_FAIL);
		}else{
			result.setRetCode(I.MSG_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(ua);
		}
		return result;
	}
	
	@Override
	public Result updateNick(String name, String newNick) {
		Result result = new Result();
		UserAvatar ua = dao.getUserAvatarByName(name);// abc
		if(ua.getMUserNick().equals(newNick)){
			result.setRetMsg(false);
			result.setRetCode(I.MSG_USER_SAME_NICK);
		}else{
			// 1、更新成功 失败
			if(dao.updateNick(name,newNick)){// def
				result.setRetCode(I.MSG_SUCCESS);
				result.setRetMsg(true);
				// 设置ua中的昵称为最新的昵称
				ua.setMUserNick(newNick);
				result.setRetData(ua);
			}else{
				result.setRetMsg(false);
				result.setRetCode(I.MSG_USER_UPDATE_NICK_FAIL);
			}
		}
		return result;
	}

	@Override
	public void downloadAvatar(String nameOrHxid, String avatarType, HttpServletResponse response) {
		// 建立两个流，输入流从本地文件读取到程序中。输出流从程序写入到客户端。
		// E:/test/user_avatar/zhangsan.jpg
		// 设置响应给客户端的MIME类型为图片
		response.setContentType("image/jpg");
		FileInputStream fis = null;
		OutputStream os = null;
		try {
			fis = new FileInputStream(new File("E:/test/"+avatarType+"/"+nameOrHxid+".jpg"));
			os = response.getOutputStream();
			byte[] byArr = new byte[1024*4];
			int b = 0;
			while((b=fis.read(byArr))!=-1){
				os.write(byArr, 0, b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(os!=null){
					os.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 1、调用dao的插入的方法，如果插入失败，则返回失败。
	// 2、如果成功，则根据用户名，查找第13接口的dao中的根据用户名查找用户及头像信息的方法
	// 并封装为result对象，返回给Servlet层。
	
	@Override
	public Result downLoadContactPageList(String name, String pageId, String pageSize) {
		Result result = new Result();
		int niPageId = Integer.parseInt(pageId);
		int niPageSize = Integer.parseInt(pageSize);
		List<UserAvatar> list = dao.downLoadContactPageList(name,niPageId,niPageSize);
		if(list!=null){
			result.setRetCode(I.MSG_SUCCESS);
			result.setRetMsg(true);
			Pager pager = getPage(niPageId, list);
			result.setRetData(pager);
		}else{
			result.setRetCode(I.MSG_GET_CONTACT_PAGES_FAIL);
			result.setRetMsg(false);
		}
		return result;
	}
	
	public Pager getPage(int pageId,List<?> list){
		Pager pager = new Pager();
		pager.setCurrentPage(pageId);
		pager.setMaxRecord(list.size());
		pager.setPageData(list);
		return pager;
	}

	@Override
	public Result register(User user, HttpServletRequest request) {
		Result result = new Result();
		if(uploadAvatar(user,request)){// 1、接收图片，如果成功了：
			if(dao.register(user)){// 调用dao层的插入数据的方法，如果成功了，返回result
				result.setRetCode(I.MSG_SUCCESS);
				result.setRetMsg(true);
			}else{// dao层插入失败，则删除已经上传成功的图片
				deleteFile("E:/test/user_avatar/"+user.getMUserName()+".jpg");
				result.setRetMsg(false);
				result.setRetCode(I.MSG_REGISTER_FAIL);
			}
		}else{// 如果接收图片失败，则返回result
			result.setRetMsg(false);
			result.setRetCode(I.MSG_REGISTER_UPLOAD_AVATAR_FAIL);
		}
		return result;
	}
	
	public void deleteFile(String path){
		File file = new File(path);
		if(file.exists()){
			file.delete();
		}
	}

	/**
	 * 完成图片的上传
	 * @param user
	 * @param request
	 * @return
	 */
	private boolean uploadAvatar(User user, HttpServletRequest request){
		InputStream is = null;
		FileOutputStream fos = null;
		try {
			is = request.getInputStream();
			fos = new FileOutputStream(new File("E:/test/user_avatar/",user.getMUserName()+".jpg"));
			byte[] byArr = new byte[1024*4];
			int b = 0;
			while((b=is.read(byArr))!=-1){
				fos.write(byArr, 0, b);
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(is!=null){
					is.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
}
