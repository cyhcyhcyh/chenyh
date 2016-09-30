package com.chenyh.accountms.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_PayType;
public class PayTypeDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public PayTypeDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}
	/**
	 *新增支出类别
	 * @param tb_PayType
	 */
	public void insert(tb_PayType tb_PayType){
		db=helper.getWritableDatabase();
		String sql="insert into tb_PayType (TypeName,Depict) values (?,?)";
		db.execSQL(sql, new Object[]{
				tb_PayType.getTypeName(),
				tb_PayType.getDepict()
		});
	}
	/**
	 * 修改支出类别
	 * @param tb_PayType
	 */
	public void update(tb_PayType tb_PayType){
		db=helper.getWritableDatabase();
		String sql="update tb_PayType set TypeName=? where Depict=? ";
		db.execSQL(sql, new Object[]{
				tb_PayType.getTypeName(),
				tb_PayType.getDepict()
		} );
	}
	/**
	 * 删除支出类别
	 * @param tb_PayType
	 */
	public void delete(tb_PayType tb_PayType){
		db=helper.getWritableDatabase();
		String sql="delete from tb_PayType where TypeID=?";
		db.execSQL(sql, new Object[]{
				tb_PayType.getTypeID()
		});
	}
	/**
	 * 查询支出类别信息
	 * @param tb_PayType
	 */
	public void retrieve(tb_PayType tb_PayType){
		db=helper.getWritableDatabase();
		String sql="select * from tb_PayType";
		Cursor cursor=db.rawQuery(sql, null);
		   while(cursor.moveToNext()){  
               String _TypeName = cursor.getString(cursor.getColumnIndex("TypeName"));  
               String _Depict = cursor.getString(cursor.getColumnIndex("Depict"));   
               tb_PayType.setTypeName(_TypeName);  
               tb_PayType.setDepict(_Depict);  
           } 
	}
}
