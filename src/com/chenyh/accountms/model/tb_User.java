package com.chenyh.accountms.model;
//�û�ʵ����
public class tb_User {
	//Ĭ�ϵĹ��캯��
	public tb_User()
	{
		
	}
	// �����вι��캯����������ʼ���û�ʵ�����еĸ����ֶ�
	public tb_User(int UserID,String UserName,String Password,String Depict  ){
		this.UserID=UserID;
		this.UserName=UserName;
		this.Password=Password;
		this.Depict=Depict;
	}
	private int UserID;//�û����
	private String UserName;//�û���
	private String Password;//�û�����
	private String Depict;//��ע
	
	// �����û���ŵĿɶ�����
	public int getUserID() {
		return UserID;
	}
	
	//�����û���ŵĿ�д����
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	//�����û����Ŀɶ�����
	public String getUserName() {
		return UserName;
	}
	
	//�����û����Ŀ�д����
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	//��������Ŀɶ�����
	public String getPassword() {
		return Password;
	}
	
	//��������Ŀ�д����
	public void setPassword(String password) {
		Password = password;
	}
	
	//���ñ�ע�Ŀɶ�����
	public String getDepict() {
		return Depict;
	}
	
	//���ñ�ע�Ŀ�д����
	public void setDepict(String depict) {
		Depict = depict;
	}
}
