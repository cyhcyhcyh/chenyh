package com.chenyh.accountms.model;
//��ǩʵ����
public class tb_Flag {
	//Ĭ�ϵĹ��캯��
	public tb_Flag(){
		
	}
	//�����вι��캯����������ʼ����ǩʵ�����еĸ����ֶ�
	public tb_Flag(int FlagID,String Title,String Content,String Time){
		this.FlagID=FlagID;
		this.Title=Title;
		this.Content=Content;
		this.Time=Time;
	}
	private int FlagID;//��ǩ���
	private String Title;//��ǩ����
	private String Content;//����
	private String Time;//ʱ��
	
	//���ñ�ǩ��ŵĿɶ�����
	public int getFlagID() {
		return FlagID;
	}
	
	//���ñ�ǩ��ŵĿ�д����
	public void setFlagID(int flagID) {
		FlagID = flagID;
	}
	
	//���ñ���Ŀɶ�����
	public String getTitle() {
		return Title;
	}
	
	//���ñ���Ŀ�д����
	public void setTitle(String title) {
		Title = title;
	}
	
	//�������ݵĿɶ�����
	public String getContent() {
		return Content;
	}
	
	//�������ݵĿ�д����
	public void setContent(String content) {
		Content = content;
	}
	
	//����ʱ��Ŀɶ�����
	public String getTime() {
		return Time;
	}
	
	//����ʱ��Ŀ�д����
	public void setTime(String time) {
		Time = time;
	}
}
