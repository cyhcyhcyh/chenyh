package com.chenyh.accountms.dao;

import com.chenyh.accountms.db.DBOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class FamilyDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public FamilyDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}

}
