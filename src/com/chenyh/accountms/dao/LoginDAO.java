package com.chenyh.accountms.dao;
import com.chenyh.accountms.model.tb_User;
import com.chenyh.accountms.db.*;

import android.R.string;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
public class LoginDAO {

	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public LoginDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}
	
	public boolean UserInfo(tb_User tb_User)
	{
		db=helper.getWritableDatabase();
		String sql="select count(*) from tb_User where UserName=? and Password=? ";
		return true;
	}
}
