package com.chenyh.accountms.model;
//用户实体类
public class tb_User {
	//默认的构造函数
	public tb_User()
	{
		
	}
	// 定义有参构造函数，用来初始化用户实体类中的各个字段
	public tb_User(int UserID,String UserName,String Password,String Depict  ){
		this.UserID=UserID;
		this.UserName=UserName;
		this.Password=Password;
		this.Depict=Depict;
	}
	private int UserID;//用户编号
	private String UserName;//用户名
	private String Password;//用户密码
	private String Depict;//备注
	
	// 设置用户编号的可读属性
	public int getUserID() {
		return UserID;
	}
	
	//设置用户编号的可写属性
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	//设置用户名的可读属性
	public String getUserName() {
		return UserName;
	}
	
	//设置用户名的可写属性
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	//设置密码的可读属性
	public String getPassword() {
		return Password;
	}
	
	//设置密码的可写属性
	public void setPassword(String password) {
		Password = password;
	}
	
	//设置备注的可读属性
	public String getDepict() {
		return Depict;
	}
	
	//设置备注的可写属性
	public void setDepict(String depict) {
		Depict = depict;
	}
}
