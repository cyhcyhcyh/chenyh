package com.chenyh.accountms.dao;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
public class PayInfoDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public PayInfoDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}

}
