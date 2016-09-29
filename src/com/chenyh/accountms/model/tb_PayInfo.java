package com.chenyh.accountms.model;
//支出信息实体类
public class tb_PayInfo {
	//默认的构造函数
	public tb_PayInfo(){
		
	}
	// 定义有参构造函数，用来初始化支出信息实体类中的各个字段
	public tb_PayInfo(int PayID,int ID,int TypeID ,double Money,String Time,String Payment,String Address,String Depict){
		this.PayID=PayID;
		this.ID=ID;
		this.TypeID=TypeID;
		this.Money=Money;
		this.Time=Time;
		this.Payment=Payment;
		this.Address=Address;
		this.Depict=Depict;
		
	}
	private int PayID;//支出编号
	private int ID;//成员编号
	private int TypeID;//支出类别
	private double Money;//金额
	private String Time;//时间
	private String Payment;//付款方式
	private String Address;//地点
	private String Depict;//备注
	
	//设置支出编号的可读属性
	public int getPayID() {
		return PayID;
	}
	
	//设置支出编号的可写属性
	public void setPayID(int payID) {
		PayID = payID;
	}
	
	//设置成员编号的可读属性
	public int getID() {
		return ID;
	}

	//设置成员编号的可写属性
	public void setID(int iD) {
		ID = iD;
	}

	//设置支出类别的可读属性
	public int getTypeID() {
		return TypeID;
	}

	//设置支出类别的可写属性
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}

	//设置支付金额的可读属性
	public double getMoney() {
		return Money;
	}

	//设置支付金额的可写属性
	public void setMoney(double money) {
		Money = money;
	}

	//设置支付时间的可读属性
	public String getTime() {
		return Time;
	}

	//设置支付时间的可写属性
	public void setTime(String time) {
		Time = time;
	}

	//设置付款方式的可读属性
	public String getPayment() {
		return Payment;
	}

	//设置付款方式的可写属性
	public void setPayment(String payment) {
		Payment = payment;
	}

	//设置支付地点的可读属性
	public String getAddress() {
		return Address;
	}

	//设置支付地点的可写属性
	public void setAddress(String address) {
		Address = address;
	}

	//设置支付备注的可读属性
	public String getDepict() {
		return Depict;
	}

	//设置支付备注的可写属性
	public void setDepict(String depict) {
		Depict = depict;
	}
}
