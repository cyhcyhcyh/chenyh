package com.chenyh.accountms.dao;

import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_Family;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class FamilyDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public FamilyDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}

	
	/***
	 * 添加家庭成员信息
	 * @param tb_Family
	 */
	public void  insert(tb_Family tb_Family)
	{
		db=helper.getWritableDatabase();//初始化SQLiteDatabase
		String sql="insert into tb_Family(Name,Depict) values(?,?)";
		db.execSQL(sql, new Object[]{
						tb_Family.getName(),
						tb_Family.getDepict()});
		
	}
	
	/***
	 * 更新家庭成员信息
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
	 * 删除家庭成员信息
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
	 * 查找家庭成员信息
	 * @return tb_Family
	 */
	 public tb_Family selectAll()
	 {
		 db=helper.getWritableDatabase();
		 String sql=" select * from tb_Family";
		 
		 Cursor  cursor=db.rawQuery(sql,null);// 查找所有家庭成员信息，并存储到Cursor类中
		 if(cursor.moveToNext())//遍历查找到的家庭成员信息
		 {
			// 将遍历到的便签信息存储到tb_Family类中
			 return new tb_Family(cursor.getInt(cursor.getColumnIndex("ID")),
					 cursor.getString(cursor.getColumnIndex("Name")),
					 cursor.getString(cursor.getColumnIndex("Depict")));
		 }
		 
		return null;//如果没有信息，则返回null
	 }
	
}
