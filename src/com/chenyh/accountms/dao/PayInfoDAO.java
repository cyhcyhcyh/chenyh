package com.chenyh.accountms.dao;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.*;
public class PayInfoDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public PayInfoDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}
	/**
	 * 新增支出信息
	 * @param tb_PayInfo
	 */
	public void insert(tb_PayInfo tb_PayInfo){
		db=helper.getWritableDatabase();
		String sql="insert into tb_PayInfo (ID,TypeID,Money,Time,Payment,Address,Depict) values (?,?,?,?,?,?,?)";
		db.execSQL(sql,new Object[]{
				tb_PayInfo.getID(),
				tb_PayInfo.getTypeID(),
				tb_PayInfo.getMoney(),
				tb_PayInfo.getTime(),
				tb_PayInfo.getPayment(),
				tb_PayInfo.getAddress(),
				tb_PayInfo.getDepict()
		});
	}
	/**
	 * 修改支出信息
	 * @param tb_PayInfo
	 */
	public void update(tb_PayInfo tb_PayInfo){
		db=helper.getWritableDatabase();
		String sql="update tb_PayInfo set ID=?,TypeID=?,Money=?,Time=?,Payment=?,Address=?,Depict=? where PayID=";
		db.execSQL(sql, new Object[]{
				tb_PayInfo.getID(),
				tb_PayInfo.getTypeID(),
				tb_PayInfo.getMoney(),
				tb_PayInfo.getTime(),
				tb_PayInfo.getPayment(),
				tb_PayInfo.getAddress(),
				tb_PayInfo.getDepict(),
				tb_PayInfo.getID()
		});
	}
	/**
	 * 删除支出信息
	 * @param tb_PayInfo
	 */
	public void delete (tb_PayInfo tb_PayInfo){
		db=helper.getWritableDatabase();
		String sql="delete from tb_PayInfo where PayID=?";
		db.execSQL(sql, new Object[]{
				tb_PayInfo.getPayID()
		});
	}

	/**
	 * 获取支出信息
	 * 
	 * @param start
	 *            起始位置
	 * @param count
	 *            每页显示数量
	 * @return
	 */
	public tb_PayInfo selectAll( )
	{
		db=helper.getWritableDatabase();
		String sql="select * from tb_PayInfo";
		Cursor cursor=db.rawQuery(sql, null);
		while (cursor.moveToNext()) {
			
			
		}
		return null;
	}
	/**
	 * 获取总记录数
	 * 
	 * @return
	 */
	public long getCount() {
		db = helper.getWritableDatabase();// 初始化SQLiteDatabase对象
		Cursor cursor = db.rawQuery("select count(_id) from tb_outaccount",
				null);// 获取支出信息的记录数
		if (cursor.moveToNext())// 判断Cursor中是否有数据
		{
			return cursor.getLong(0);// 返回总记录数
		}
		return 0;// 如果没有数据，则返回0
	}

	/**
	 * 获取支出最大编号
	 * 
	 * @return
	 */
	public int getMaxId() {
		db = helper.getWritableDatabase();// 初始化SQLiteDatabase对象
		Cursor cursor = db.rawQuery("select max(_id) from tb_outaccount", null);// 获取支出信息表中的最大编号
		while (cursor.moveToLast()) {// 访问Cursor中的最后一条数据
			return cursor.getInt(0);// 获取访问到的数据，即最大编号
		}
		return 0;// 如果没有数据，则返回0
	}
	
}
