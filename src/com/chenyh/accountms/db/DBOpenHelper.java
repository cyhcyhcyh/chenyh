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
     * ���δ������ݿ�ʱ�Żᱻ����
     * @param db
     */
	@Override
	public void onCreate(SQLiteDatabase db) {
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
