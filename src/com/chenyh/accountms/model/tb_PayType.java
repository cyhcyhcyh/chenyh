package com.chenyh.accountms.model;

//支出类型实体类
public class tb_PayType {
	//默认的构造函数
	public tb_PayType(){
		
	}
	
	// 定义有参构造函数，用来初始化支出类型实体类中的各个字段
	public tb_PayType(int TypeID,String TypeName,String Depict){
		this.TypeID=TypeID;
		this.TypeName=TypeName;
		this.Depict=Depict;
	}
	private int TypeID;//类别编号
	private String TypeName;//类别名称
	private String Depict;//备注
	
	//设置类别编号的可读属性
	public int getTypeID() {
		return TypeID;
	}

	//设置类别编号的可写属性
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	
	//设置类别名称的可读属性
	public String getTypeName() {
		return TypeName;
	}

	
	//设置类别名称的可写属性
	public void setTypeName(String typeName) {
		TypeName = typeName;
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
