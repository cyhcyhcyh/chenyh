package com.chenyh.accountms.model;

import android.R.interpolator;
//������Ϣʵ����
public class tb_IncomeInfo {
	//Ĭ�ϵĹ��캯��
	public tb_IncomeInfo(){
		
	}
	// �����вι��캯����������ʼ���û�ʵ�����еĸ����ֶ�
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
	private int IncomeID;//������
	private int ID;//��Ա���
	private int TypeID;//�������
	private double Money;//������
	private String Time;//����ʱ��
	private String payment;//�տʽ
	private String Address;//����ص�
	private String Depict;//���뱸ע
	
	//���������ŵĿɶ�����
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
