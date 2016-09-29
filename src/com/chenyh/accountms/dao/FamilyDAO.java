package com.chenyh.accountms.dao;

import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_Family;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class FamilyDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public FamilyDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}

	
	/***
	 * ��Ӽ�ͥ��Ա��Ϣ
	 * @param tb_Family
	 */
	public void  insert(tb_Family tb_Family)
	{
		db=helper.getWritableDatabase();//��ʼ��SQLiteDatabase
		String sql="insert into tb_Family(ID,Name,Depict) values(?,?,?)";
		db.execSQL(sql, new Object[]{
						tb_Family.getID(),
						tb_Family.getName(),
						tb_Family.getDepict()});
		
	}
	
	/***
	 * ���¼�ͥ��Ա��Ϣ
	 * @param tb_Family
	 */
	public  void update(tb_Family tb_Family)
	{
		db=helper.getWritableDatabase();
		String sql="update tb_Family set Name=?,Depict=? where ID=?";
		db.execSQL(sql, new Object[]{
						tb_Family.getName(),
						tb_Family.getDepict(),
						tb_Family.getID()});
	}
	
	
	/**
	 * ɾ����ͥ��Ա��Ϣ
	 * @param tb_Family
	 */
	public void delete(tb_Family tb_Family)
	{
		db=helper.getWritableDatabase();
		String sql="delete from tb_Family where ID=?";
		db.execSQL(sql, new Object[]{
						tb_Family.getID()});
		
	}
	
	/**
	 * ���Ҽ�ͥ��Ա��Ϣ
	 * @return tb_Family
	 */
	 public tb_Family selectAll()
	 {
		 db=helper.getWritableDatabase();
		 String sql=" select * from tb_Family";
		 
		 Cursor  cursor=db.rawQuery(sql,null);// �������м�ͥ��Ա��Ϣ�����洢��Cursor����
		 if(cursor.moveToNext())//�������ҵ��ļ�ͥ��Ա��Ϣ
		 {
			// ���������ı�ǩ��Ϣ�洢��tb_Family����
			 return new tb_Family(cursor.getInt(cursor.getColumnIndex("ID")),
					 cursor.getString(cursor.getColumnIndex("Name")),
					 cursor.getString(cursor.getColumnIndex("Depict")));
		 }
		 
		return null;//���û����Ϣ���򷵻�null
	 }
	
}
