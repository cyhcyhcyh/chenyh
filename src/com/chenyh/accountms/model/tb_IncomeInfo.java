package com.chenyh.accountms.model;

import android.R.interpolator;
//输入信息实体类
public class tb_IncomeInfo {
	//默认的构造函数
	public tb_IncomeInfo(){
		
	}
	// 定义有参构造函数，用来初始化用户实体类中的各个字段
	public tb_IncomeInfo(int IncomeID,int ID,int TypeID,Double Money,String Time,String payment,String Address,String Depict){
		this.IncomeID=IncomeID;
		this.ID=ID;
		this.TypeID=TypeID;
		this.Money=Money;
		this.Time=Time;
		this.payment=payment;
		this.Address=Address;
		this.Depict=Depict;
		
	}
	private int IncomeID;//收入编号
	private int ID;//成员编号
	private int TypeID;//收入类别
	private double Money;//输入金额
	private String Time;//输入时间
	private String payment;//收款方式
	private String Address;//输入地点
	private String Depict;//输入备注
	
	//设置输入编号的可读属性
	public int getIncomeID() {
		return IncomeID;
	}
	
	public void setIncomeID(int incomeID) {
		IncomeID = incomeID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTypeID() {
		return TypeID;
	}
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDepict() {
		return Depict;
	}
	public void setDepict(String depict) {
		Depict = depict;
	}

}
