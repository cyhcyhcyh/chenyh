package com.chenyh.accountms.model;
//��ͥ��Աʵ����
public class tb_Family {
	//Ĭ�ϵĹ��캯��
	public tb_Family()
	{
		
	}
	// �����вι��캯����������ʼ���û�ʵ�����еĸ����ֶ�
	public tb_Family(int ID,String Name,String Depict){
		this.ID=ID;
		this.Name=Name;
		this.Depict=Depict;
		
	}
	private int ID;//�û����
	private String Name;//����
	private String Depict;//��ע
	
	// �����û���ŵĿɶ�����
	public int getID() {
		return ID;
	}
	
	// �����û���ŵĿ�д����
	public void setID(int iD) {
		ID = iD;
	}
	
	// ���������Ŀɶ�����
	public String getName() {
		return Name;
	}
	
	// ���������Ŀ�д����
	public void setName(String name) {
		Name = name;
	}
	
	// ���ñ�ע�Ŀɶ�����
	public String getDepict() {
		return Depict;
	}
	
	// ���ñ�ע�Ŀ�д����
	public void setDepict(String depict) {
		Depict = depict;
	}
}
