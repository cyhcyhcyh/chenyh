package com.chenyh.accountms.model;
//��������ʵ����
public class tb_IncomeType {
	//Ĭ�ϵĹ��캯��
	public tb_IncomeType(){
		
	}
	// �����вι��캯����������ʼ����������ʵ�����еĸ����ֶ�
	public tb_IncomeType(int TypeID,String TypeName,String Depict){
		 this.TypeID=TypeID;
		 this.TypeName=TypeName;
		 this.Depict=Depict;
	}
	
	private int TypeID;//�����
	private String TypeName;//�������
	private String Depict;//��ע
	
	//��������ŵĿɶ�����
	public int getTypeID() {
		return TypeID;
	}
	
	//��������ŵĿ�д����
	public void setTypeID(int typeID) {
		TypeID = typeID;
	}
	
	//����������ƵĿɶ�����
	public String getTypeName() {
		return TypeName;
	}
	
	//����������ƵĿ�д����
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
	
	//���ñ�ע�Ŀɶ�����
	public String getDepict() {
		return Depict;
	}
	
	//���ñ�ע�Ŀ�д����
	public void setDepict(String depict) {
		Depict = depict;
	}
	
}
