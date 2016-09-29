package com.chenyh.accountms.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBOpenHelper extends SQLiteOpenHelper {
	  /**
     * �������ݿ�Ĺ��췽��
     * @param context(Ӧ�ó��������ģ��������ܶ����ݿ���в���)
     * name ���ݿ������
     * factory ��ѯ���ݿ���α깤��һ���������sdkĬ�ϵ�
     * version ���ݿ�İ汾һ�����0
     */
	public DBOpenHelper(Context context) {
		super(context, "account.bd", null, 1);
	}
	
	/**
     * ���δ������ݿ�ʱ�Żᱻ����(�����û���,��ͥ��Ա��,��ǩ��,������Ϣ��,��������,֧����Ϣ��,֧������)
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
     * ���ݿ�İ汾�����仯ʱ�ᱻ����
     * @param db
     * @param oldVersion
     * @param newVersion
     */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		 db.execSQL("alter table base_info add column other String");
	}

}
