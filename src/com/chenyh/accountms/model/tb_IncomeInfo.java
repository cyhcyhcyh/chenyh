package com.chenyh.accountms.model;

import android.R.interpolator;
//������Ϣʵ����
public class tb_IncomeInfo {
	//Ĭ�ϵĹ��캯��
	public tb_IncomeInfo(){
		
	}
	// �����вι��캯����������ʼ���û�ʵ�����еĸ����ֶ�
	public tb_IncomeInfo(int IncomeID,int ID,int TypeID,Double Money,String Time,String payment,String Depict){
		this.IncomeID=IncomeID;
		this.ID=ID;
		this.TypeID=TypeID;
		this.Money=Money;
		this.Time=Time;
		this.payment=payment;
		this.Depict=Depict;
		
	}
	private int IncomeID;//������
	private int ID;//��Ա���
	private int TypeID;//�������
	private double Money;//������
	private String Time;//����ʱ��
	private String payment;//�տʽ
	private String Depict;//���뱸ע
	
	//���������ŵĿɶ�����
	public int getIncomeID() {
		return IncomeID;
	}
	
	//���������ŵĿ�д����
	public void setIncomeID(int incomeID) {
		IncomeID = incomeID;
	}
	
	//���ó�Ա��ŵĿɶ�����
	public int getID() {
		return ID;
	}
	
	//���ó�Ա��ŵĿ�д����
	public void setID(int iD) {
		ID = iD;
	}
	
	//�����������Ŀɶ�����
	public int getTypeID() {
		return TypeID;
	}
	
	//�����������Ŀ�д����
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	
	//����������Ŀɶ�����
	public double getMoney() {
		return Money;
	}
	
	//����������Ŀ�д����
	public void setMoney(double money) {
		Money = money;
	}
	
	//��������ʱ��Ŀɶ�����
	public String getTime() {
		return Time;
	}
	
	//��������ʱ��Ŀ�д����
	public void setTime(String time) {
		Time = time;
	}
	
	//�����տʽ�Ŀɶ�����
	public String getPayment() {
		return payment;
	}
	
	//�����տʽ�Ŀ�д����
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	//�������뱸ע�Ŀɶ�����
	public String getDepict() {
		return Depict;
	}
	
	//�������뱸ע�Ŀ�д����
	public void setDepict(String depict) {
		Depict = depict;
	}
}
