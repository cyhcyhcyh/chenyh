package com.chenyh.accountms.model;

import android.R.string;

//֧����Ϣʵ����
public class tb_PayInfo {
	//Ĭ�ϵĹ��캯��
	public tb_PayInfo(){
		
	}
	// �����вι��캯����������ʼ��֧����Ϣʵ�����еĸ����ֶ�
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
	private int PayID;//֧�����
	private int ID;//��Ա���
	private int TypeID;//֧�����
	private double Money;//���
	private String Time;//ʱ��
	private String Payment;//���ʽ
	private String Address;//�ص�
	private String Depict;//��ע
	
	//����֧����ŵĿɶ�����
	public int getPayID() {
		return PayID;
	}
	
	//����֧����ŵĿ�д����
	public void setPayID(int payID) {
		PayID = payID;
	}
	
	//���ó�Ա��ŵĿɶ�����
	public int getID() {
		return ID;
	}

	//���ó�Ա��ŵĿ�д����
	public void setID(int iD) {
		ID = iD;
	}

	//����֧�����Ŀɶ�����
	public int getTypeID() {
		return TypeID;
	}

	//����֧�����Ŀ�д����
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}

	//����֧�����Ŀɶ�����
	public double getMoney() {
		return Money;
	}

	//����֧�����Ŀ�д����
	public void setMoney(double money) {
		Money = money;
	}

	//����֧��ʱ��Ŀɶ�����
	public String getTime() {
		return Time;
	}

	//����֧��ʱ��Ŀ�д����
	public void setTime(String time) {
		Time = time;
	}

	//���ø��ʽ�Ŀɶ�����
	public String getPayment() {
		return Payment;
	}

	//���ø��ʽ�Ŀ�д����
	public void setPayment(String payment) {
		Payment = payment;
	}

	//����֧���ص�Ŀɶ�����
	public String getAddress() {
		return Address;
	}

	//����֧���ص�Ŀ�д����
	public void setAddress(String address) {
		Address = address;
	}

	//����֧����ע�Ŀɶ�����
	public String getDepict() {
		return Depict;
	}

	//����֧����ע�Ŀ�д����
	public void setDepict(String depict) {
		Depict = depict;
	}
}
