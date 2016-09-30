package com.chenyh.accountms.dao;
import com.chenyh.accountms.model.tb_User;
import com.chenyh.accountms.db.*;

import android.R.integer;
import android.R.string;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
public class LoginDAO {

	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public LoginDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}
	
	public void UserInfo(tb_User tb_User)
	{
		db=helper.getWritableDatabase();
		String sql="select count(*) from tb_User where UserName=? and Password=? ";
		
		db.execSQL(sql, new Object[]{
						tb_User.getUserName(),
						tb_User.getPassword()});
//		if()
//		{
//			
//		}
//		else {
//			
//		}
	}
}
