package com.chenyh.accountms.dao;

import com.chenyh.accountms.db.DBOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class FamilyDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public FamilyDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}
}
