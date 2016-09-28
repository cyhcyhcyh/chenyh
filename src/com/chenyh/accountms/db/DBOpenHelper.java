package com.chenyh.accountms.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBOpenHelper extends SQLiteOpenHelper {
	  /**
     * 创建数据库的构造方法
     * @param context(应用程序上下文，有它才能对数据库进行操作)
     * name 数据库的名字
     * factory 查询数据库的游标工厂一般情况下用sdk默认的
     * version 数据库的版本一般大于0
     */
	public DBOpenHelper(Context context) {
		super(context, "account.bd", null, 1);
	}
	
	/**
     * 初次创建数据库时才会被调用
     * @param db
     */
	@Override
	public void onCreate(SQLiteDatabase db) {
	}
	 /**
     * 数据库的版本发生变化时会被调用
     * @param db
     * @param oldVersion
     * @param newVersion
     */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		 db.execSQL("alter table base_info add column other String");
	}

}
