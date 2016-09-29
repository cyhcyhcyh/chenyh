package com.chenyh.accountms.model;

import android.R.interpolator;
//输入信息实体类
public class tb_IncomeInfo {
	//默认的构造函数
	public tb_IncomeInfo(){
		
	}
	// 定义有参构造函数，用来初始化用户实体类中的各个字段
	public tb_IncomeInfo(int IncomeID,int ID,int TypeID,Double Money,String Time,String payment,String Depict){
		this.IncomeID=IncomeID;
		this.ID=ID;
		this.TypeID=TypeID;
		this.Money=Money;
		this.Time=Time;
		this.payment=payment;
		this.Depict=Depict;
		
	}
	private int IncomeID;//收入编号
	private int ID;//成员编号
	private int TypeID;//收入类别
	private double Money;//输入金额
	private String Time;//输入时间
	private String payment;//收款方式
	private String Depict;//输入备注
	
	//设置输入编号的可读属性
	public int getIncomeID() {
		return IncomeID;
	}
	
	//设置输入编号的可写属性
	public void setIncomeID(int incomeID) {
		IncomeID = incomeID;
	}
	
	//设置成员编号的可读属性
	public int getID() {
		return ID;
	}
	
	//设置成员编号的可写属性
	public void setID(int iD) {
		ID = iD;
	}
	
	//设置输入类别的可读属性
	public int getTypeID() {
		return TypeID;
	}
	
	//设置输入类别的可写属性
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	
	//设置输入金额的可读属性
	public double getMoney() {
		return Money;
	}
	
	//设置输入金额的可写属性
	public void setMoney(double money) {
		Money = money;
	}
	
	//设置输入时间的可读属性
	public String getTime() {
		return Time;
	}
	
	//设置输入时间的可写属性
	public void setTime(String time) {
		Time = time;
	}
	
	//设置收款方式的可读属性
	public String getPayment() {
		return payment;
	}
	
	//设置收款方式的可写属性
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	//设置输入备注的可读属性
	public String getDepict() {
		return Depict;
	}
	
	//设置输入备注的可写属性
	public void setDepict(String depict) {
		Depict = depict;
	}
}
