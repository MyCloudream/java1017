package cn.ucai.superwechat.util;

public interface I {

	public static interface User {
		String TABLE_NAME							=		"t_superwechat_user";
		String USER_NAME 							= 		"m_user_name";					//�û��˺�
		String PASSWORD 							= 		"m_user_password";				//�û�����
		String NICK 								= 		"m_user_nick";					//�û��ǳ�
	}
	
	public static interface Contact {
		String TABLE_NAME 							= 		"t_superwechat_contact";
		String CONTACT_ID 							= 		"m_contact_id";					//����
		String USER_NAME 							= 		"m_contact_user_name";			//�û��˺�
		String CU_NAME 								= 		"m_contact_cname";				//�����˺�
	}
	
	public static interface Group {
		String TABLE_NAME 							= 		"t_superwechat_group";
		String GROUP_ID 							= 		"m_group_id";					// ����
		String HX_ID 								= 		"m_group_hxid";					//����Ⱥ��id
		String NAME 								= 		"m_group_name";					//Ⱥ������
		String DESCRIPTION 							= 		"m_group_description";			//Ⱥ����
		String OWNER 								= 		"m_group_owner";				//Ⱥ�������ߣ��û��˺�
		String MODIFIED_TIME 						= 		"m_group_last_modified_time";	//����޸�ʱ��
		String MAX_USERS 							= 		"m_group_max_users";			//�������
		String AFFILIATIONS_COUNT 					= 		"m_group_affiliations_count";	//Ⱥ������
		String IS_PUBLIC 							= 		"m_group_is_public";			//Ⱥ���Ƿ񹫿�
		String ALLOW_INVITES 						= 		"m_group_allow_invites";		//�Ƿ��������
	}
	
	public static interface Member {
		String TABLE_NAME 							= 		"t_superwechat_member";
		String MEMBER_ID 							= 		"m_member_id";					//����
		String USER_NAME 							= 		"m_member_user_name";			//�û��˺�
		String GROUP_ID 							= 		"m_member_group_id";			//Ⱥ��id
		String GROUP_HX_ID 							= 		"m_member_group_hxid";			//Ⱥ�黷��id
		String PERMISSION 							= 		"m_member_permission";			//�û���Ⱥ���Ȩ��\n0:��ͨ�û�\n1:Ⱥ��������
	}
	
	public static interface Avatar {
		String TABLE_NAME 							= 		"t_superwechat_avatar";
		String AVATAR_ID 							= 		"m_avatar_id";					//����
		String USER_NAME 							= 		"m_avatar_user_name";			//�û��˺Ż���Ⱥ���˺�
		String AVATAR_PATH 							= 		"m_avatar_path";				//����·��
		String AVATAR_TYPE 							= 		"m_avatar_type";				//ͷ�����ͣ�\n0:�û�ͷ��\n1:Ⱥ��ͷ��
		String UPDATE_TIME 							= 		"m_avatar_last_update_time";	//������ʱ��
	}
	
	public static interface Location {
		String TABLE_NAME 							= 		"t_superwechat_location";
		String LOCATION_ID 							= 		"m_location_id";				//����
		String USER_NAME 							= 		"m_location_user_name";			//�û��˺�
		String LATITUDE 							= 		"m_location_latitude";			//γ��
		String LONGITUDE 							= 		"m_location_longitude";			//����
		String IS_SEARCHED 							= 		"m_location_is_searched";		//�Ƿ���Ա�������
		String UPDATE_TIME 							= 		"m_location_last_update_time";	//������ʱ��
	}

//	String AVATAR_PATH 								= 		"E:/test/";
	String ISON8859_1 								= 		"iso8859-1";
	String UTF_8 									= 		"utf-8";
	String PAGE_ID 									= 		"page_id";						//��ҳ����ʼ�±�
	String PAGE_SIZE 								= 		"page_size";					//��ҳ��ÿҳ����
	int DEFAULT_DISTANCE = 100; // ���Ҹ�������ʱ��Ĭ�Ͼ���Ϊ100KM
	int ID_DEFAULT									=		0;								//IDĬ��ֵ
	int UN_READ_MSG_COUNT_DEFAULT					=		0;								//δ����Ϣ����Ĭ��ֵ
	int GROUP_MAX_USERS_DEFAULT 					= 		-1;								//Ⱥ���������Ĭ��ֵ
	int GROUP_AFFILIATIONS_COUNT_DEFAULT 			= 		1;								//Ⱥ������Ĭ��ֵ
	int PERMISSION_NORMAL							= 		0;								//��ͨ�û�Ⱥ��Ȩ��
	int PERMISSION_OWNER							= 		1;								//Ⱥ��������Ⱥ��Ȩ��
	int AVATAR_TYPE_USER							=		0;								//�û�ͷ��
	int AVATAR_TYPE_GROUP							=		1;								//Ⱥ��ͷ��
	int GROUP_PUBLIC								=		1;								//����Ⱥ��
	int GROUP_NO_PUBLIC								=		0;								//�ǹ���Ⱥ��
	String BACKSLASH								= 		"/";							//��б��
	String AVATAR_TYPE_USER_PATH					= 		"user_avatar";					//�û�ͷ�񱣴�Ŀ¼
	String AVATAR_TYPE_GROUP_PATH 					=		"group_icon";					//Ⱥ��ͷ�񱣴�Ŀ¼
	String AVATAR_SUFFIX_PNG						=		".png";							//PNGͼƬ��׺��
	String AVATAR_SUFFIX_JPG						=		".jpg";							//JPGͼƬ��׺��
	int LOCATION_IS_SEARCH_ALLOW					=		1;								//���Ա�����������λ��
	int LOCATION_IS_SEARCH_INHIBIT					=		0;								//��ֹ������������λ��
	int MSG_SUCCESS						            =  		0;							    //Ĭ�ϳɹ�
	int MSG_REGISTER_USERNAME_EXISTS				=		101;							//�˺��Ѿ�����
	int MSG_REGISTER_FAIL							=		102;							//ע��ʧ��
	int MSG_UNREGISTER_FAIL							=		103;							//���ע��ʧ��
	int MSG_USER_SEARCH_FAIL		    			=		104;							// �����û�ʧ��
	int MSG_LOGIN_UNKNOW_USER						=		105;							//�˻�������
	int MSG_LOGIN_ERROR_PASSWORD					=		106;							//�˻��������
	int MSG_LOGIN_SUCCESS							=		107;							//��½�ɹ�
	int MSG_USER_SAME_NICK							=		108;							//�ǳ�δ�޸�
	int MSG_USER_UPDATE_NICK_FAIL					=		109;							//�ǳ��޸�ʧ��
	int MSG_USER_SAME_PASSWORD						=		110;							//����δ�޸�
	int MSG_USER_UPDATE_PASSWORD_FAIL				=		111;							//�����޸�ʧ��
	int MSG_LOCATION_UPLOAD_FAIL					=		112;							//�û��ϴ�����λ��ʧ��
	int MSG_LOCATION_UPDATE_FAIL					=		113;							//�û����µ���λ��ʧ��
	int MSG_REGISTER_UPLOAD_AVATAR_FAIL				=		201;							//�ϴ�ͷ��ʧ��
	int MSG_UPLOAD_AVATAR_FAIL						=		202;							//����ͷ��ʧ��
	int MSG_CONTACT_FIRENDED						=		301;							//�Ѿ��Ǻ��ѹ�ϵ
	int MSG_CONTACT_ADD_FAIL						=		302;							//���ѹ�ϵ���ʧ��
	int MSG_CONTACT_DEL_FAIL						=		303;							//���ѹ�ϵɾ��ʧ��
	int MSG_GET_CONTACT_ALL_FAIL					=		304;							// ��ȡȫ�������б�ʧ��
	int MSG_GET_CONTACT_PAGES_FAIL					=		305;							// ��ҳ��ȡ�����б�ʧ��
	int MSG_GROUP_HXID_EXISTS						=		401;							//Ⱥ�黷��ID�Ѿ�����
	int MSG_GROUP_CREATE_FAIL						=		402;							//����Ⱥ��ʧ��
	int MSG_GROUP_ADD_MEMBER_FAIL					=		403;							//���Ⱥ���Աʧ��
	int MSG_GROUP_GET_MEMBERS_FAIL					=		404;							//��ȡȺ��Աʧ��
	int MSG_GROUP_UNKONW							=		405;							//Ⱥ�鲻����
	int MSG_GROUP_SAME_NAME							=		406;							//����ͬȺ������
	int MSG_GROUP_UPDATE_NAME_FAIL					=		407;							//Ⱥ�������޸�ʧ��
	int MSG_GROUP_DELETE_MEMBER_FAIL				=		408;							//ɾ��Ⱥ���Աʧ��
	int MSG_GROUP_DELETE_MEMBERS_FAIL				=		409;							//ɾ����Ⱥ���Աʧ��
	int MSG_GROUP_DELETE_FAIL						=		410;							//ɾ��Ⱥ��ʧ��
	int MSG_GROUP_FIND_BY_GOURP_ID_FAIL				=		411;							//����Ⱥ��id����Ⱥ��ʧ��
	int MSG_GROUP_FIND_BY_HX_ID_FAIL				=		412;							//���ݻ���id����Ⱥ��ʧ��
	int MSG_GROUP_FIND_BY_USER_NAME_FAIL			=		413;							//�����û����Ʋ��Ҳ���Ⱥ��ʧ��
	int MSG_GROUP_FIND_BY_GROUP_NAME_FAIL			=		414;							//����Ⱥ�����Ʋ��Ҳ���Ⱥ��ʧ��
	int MSG_PUBLIC_GROUP_FAIL						=		415;							//���ҹ���Ⱥʧ��
	int MSG_LOCATION_GET_FAIL						=		501;							// ��ȡ��������ʧ��
	int MSG_UNKNOW									=		999;							//δ֪����
	int MSG_ILLEGAL_REQUEST							=		-1;							//�Ƿ�����

	String KEY_REQUEST 								= 		"request";
	/** �ϴ�ͼƬ�����ͣ�user_avatar��group_icon */
	String AVATAR_TYPE 								= 		"avatarType";
	/** �û�������hxid */
	String NAME_OR_HXID                             =       "name_or_hxid";
	/** ������״̬������ */
	String REQUEST_SERVERSTATUS 					= 		"server_status";
	/** �ͻ��˷��͵�ע������ */
	String REQUEST_REGISTER		 					= 		"register";
	/**  ����ȡ��ע������� */
	String REQUEST_UNREGISTER 						= 		"unregister";
	/** �ͻ����ϴ�ͷ������� */
	String REQUEST_UPLOAD_AVATAR 					= 		"upload_avatar";
	/** �ͻ��˸����û��ǳƵ����� */
	String REQUEST_UPDATE_USER_NICK 				= 		"update_nick";
	/** �ͻ����޸���������� */
	String REQUEST_UPDATE_USER_PASSWORD 			= 		"update_password";
	/** �ͻ��˷��͵ĵ�½���� */
	String REQUEST_LOGIN 							= 		"login";
	/** �ͻ��˷��͵������û�ͷ������ */
	String REQUEST_DOWNLOAD_AVATAR	 				= 		"download_avatar";
	/** �ͻ��˷��͵�������ϵ�����м������� */
	String REQUEST_DOWNLOAD_CONTACT_ALL_LIST 		= 		"download_contact_all_list";
	/** �ͻ��˷��͵�������ϵ�˼������� */
	String REQUEST_DOWNLOAD_CONTACT_PAGE_LIST 		= 		"download_contact_page_list";
	/** �ͻ��˷��͵�ɾ����ϵ������ */
	String REQUEST_DELETE_CONTACT 					= 		"delete_contact";
	/** �ͻ��˷��͵������ϵ������ */
	String REQUEST_ADD_CONTACT 						= 		"add_contact";
	/** �ͻ��˷��͵Ĳ����û����� */
	String REQUEST_FIND_USER 						= 		"find_user";
	/** �ͻ��˷��͵ĸ����û����ǳ�ģ�������û����� */
	String REQUEST_FIND_USERS_FOR_SEARCH			= 		"find_users_for_search";
	/** �ͻ��˷��͵��ϴ�λ������ */
	String REQUEST_UPLOAD_LOCATION 					= 		"upload_location";
	/** �ͻ��˷��͵ĸ���λ������ */
	String REQUEST_UPDATE_LOCATION 					= 		"update_location";
	/** �ͻ��˷��͵�����λ������ */
	String REQUEST_DOWNLOAD_LOCATION 				= 		"download_location";
	/** �ͻ��˷��͵Ĵ���Ⱥ������ */
	String REQUEST_CREATE_GROUP			 			= 		"create_group";
	/** �ͻ��˷��͵����Ⱥ��Ա���� */
	String REQUEST_ADD_GROUP_MEMBER 				= 		"add_group_member";
	/** �ͻ��˷��͵���Ӷ��Ⱥ��Ա���� */
	String REQUEST_ADD_GROUP_MEMBERS		 		= 		"add_group_members";
	/** �ͻ��˷��͵ĸ���Ⱥ�������� */
	String REQUEST_UPDATE_GROUP_NAME 				= 		"update_group_name";
	/** �ͻ��˷��͵����ض��Ⱥ��Ա���� */
	String REQUEST_DOWNLOAD_GROUP_MEMBERS 			= 		"download_group_members_by_groupid";
	/** �ͻ��˷��͵����ض��Ⱥ��Ա���� */
	String REQUEST_DOWNLOAD_GROUP_MEMBERS_BY_LIMIT 	= 		"download_group_members_by_limit";
	/** �ͻ��˷��͵����ض��Ⱥ��Ա���� */
	String REQUEST_DOWNLOAD_GROUP_MEMBERS_BY_HXID 	= 		"download_group_members_by_hxid";
	/** �ͻ��˷��͵����ض��Ⱥ��Ա���� */
	String REQUEST_DOWNLOAD_GROUP_MEMBERS_BY_HXID_LIMIT 	= 		"download_group_members_by_hxid_limit";
	/** �ͻ��˷��͵�ɾ��Ⱥ��Ա���� */
	String REQUEST_DELETE_GROUP_MEMBER 				= 		"delete_group_member";
	/** �ͻ��˷��͵�ɾ�����Ⱥ��Ա���� */
	String REQUEST_DELETE_GROUP_MEMBERS 			= 		"delete_group_members";
	/** �ͻ��˷��͵�ɾ��Ⱥ������ */
	String REQUEST_DELETE_GROUP 					= 		"delete_group";
	/** �ͻ��˷��͵����ع���ȹ���� */
	String REQUEST_FIND_PUBLIC_GROUPS 				= 		"download_public_groups";
	/** �ͻ��˷��͵ĸ���Ⱥ������ģ������Ⱥ������ */
	String REQUEST_FIND_GROUP_BY_GROUP_NAME 		= 		"find_group_by_group_name";
	/** �ͻ��˷��͵��û����������û����ڵ�Ⱥ������ */
	String REQUEST_FIND_GROUP_BY_USER_NAME 			= 		"find_group_by_user_name";
	/** �ͻ��˷��͵ĸ���Ⱥ���˺Ų���Ⱥ������ */
	String REQUEST_FIND_GROUP_BY_ID					= 		"find_group_by_group_id";
	/** �ͻ��˷��͵ĸ���Ⱥ�黷��id����Ⱥ������ */
	String REQUEST_FIND_GROUP_BY_HXID 				= 		"find_group_by_group_hxid";
	/** �ͻ��˷��͵ĸ���Ⱥ�黷��id���ҹ���Ⱥ������ */
	String REQUEST_FIND_PUBLIC_GROUP_BY_HXID 		= 		"find_public_group_by_group_hxid";
}
