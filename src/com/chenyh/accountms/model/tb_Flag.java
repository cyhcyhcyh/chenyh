package com.chenyh.accountms.model;
//便签实体类
public class tb_Flag {
	//默认的构造函数
	public tb_Flag(){
		
	}
	//定义有参构造函数，用来初始化便签实体类中的各个字段
	public tb_Flag(int FlagID,String Title,String Content,String Time){
		this.FlagID=FlagID;
		this.Title=Title;
		this.Content=Content;
		this.Time=Time;
	}
	private int FlagID;//便签编号
	private String Title;//便签标题
	private String Content;//内容
	private String Time;//时间
	
	//设置便签编号的可读属性
	public int getFlagID() {
		return FlagID;
	}
	
	//设置便签编号的可写属性
	public void setFlagID(int flagID) {
		FlagID = flagID;
	}
	
	//设置标题的可读属性
	public String getTitle() {
		return Title;
	}
	
	//设置标题的可写属性
	public void setTitle(String title) {
		Title = title;
	}
	
	//设置内容的可读属性
	public String getContent() {
		return Content;
	}
	
	//设置内容的可写属性
	public void setContent(String content) {
		Content = content;
	}
	
	//设置时间的可读属性
	public String getTime() {
		return Time;
	}
	
	//设置时间的可写属性
	public void setTime(String time) {
		Time = time;
	}
}
