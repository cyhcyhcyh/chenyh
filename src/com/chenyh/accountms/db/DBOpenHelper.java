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
     * 初次创建数据库时才会被调用(创建用户表,家庭成员表,便签表,输入信息表,输入类别表,支出信息表,支出类别表)
     * @param db
     */
	@Override
	public void onCreate(SQLiteDatabase db) {
		 String sql = "create table if not exists tb_User "  
	                + "(UserID integer primary key autoincrement,UserName varchar(32),Password varchar(100),Depict varchar(200)) go" +
	                "create table if not exists tb_Family" 
	                + "(ID integer primary key autoincrement,Name varchar(32),Depict varchar(200)) go"+ 
	                "create table if not exists tb_Flag"
	                + "(FlagID integer primary key autoincrement,Title varchar(50),Content varchar(200),Time varchar(50)) go"+
	                "create table if not exists tb_IncomeInfo"
	                + "(IncomeID integer primary key autoincrement,ID,TypeID,Money decimal,Time varchar(50),payment varchar (50),Depict varchar(200)) go"+
	                "create table if not exists tb_IncomeType"
	                +"(TypeID integer primary key autoincrement,TypeName varchar(30),Depict varchar(200)) go"+
	                "create table if not exists tb_PayInfo"
	                +"(PayID integer primary key autoincrement,ID,TypeID,Money decimal,Time,varchar(50),Payment,varchar (50),Address varchar(50),Depict varchar(200)) go"+
	                "create table if not exists tb_PayType"
	                +"(TypeID integer primary key autoincrement,TypeName varchar(30),Depict varchar(200))";  
	        db.execSQL(sql);
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
