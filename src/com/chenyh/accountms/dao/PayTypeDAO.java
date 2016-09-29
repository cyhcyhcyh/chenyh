package com.chenyh.accountms.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
public class PayTypeDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public PayTypeDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}
}
