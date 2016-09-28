package com.chenyh.accountms.model;
//家庭成员实体类
public class tb_Family {
	//默认的构造函数
	public tb_Family()
	{
		
	}
	// 定义有参构造函数，用来初始化用户实体类中的各个字段
	public tb_Family(int ID,String Name,String Depict){
		this.ID=ID;
		this.Name=Name;
		this.Depict=Depict;
		
	}
	private int ID;//用户编号
	private String Name;//姓名
	private String Depict;//备注
	
	// 设置用户编号的可读属性
	public int getID() {
		return ID;
	}
	
	// 设置用户编号的可写属性
	public void setID(int iD) {
		ID = iD;
	}
	
	// 设置姓名的可读属性
	public String getName() {
		return Name;
	}
	
	// 设置姓名的可写属性
	public void setName(String name) {
		Name = name;
	}
	
	// 设置备注的可读属性
	public String getDepict() {
		return Depict;
	}
	
	// 设置备注的可写属性
	public void setDepict(String depict) {
		Depict = depict;
	}
}
