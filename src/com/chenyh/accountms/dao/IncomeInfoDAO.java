package com.chenyh.accountms.dao;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_IncomeInfo;
public class IncomeInfoDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public IncomeInfoDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}

	

	/***
	 * 新增收入信息
	 * @param tb_IncomeInfo
	 */
	public void insert(tb_IncomeInfo tb_IncomeInfo)
	{
		db=helper.getWritableDatabase();
		String sql="insert into tb_IncomeInfo( ID, TypeID, Money, Time, payment, Depict) values(?,?,?,?,?,?,?)";
		db.execSQL(sql, new Object[]{
				tb_IncomeInfo.getID(),
				tb_IncomeInfo.getTypeID(),
				tb_IncomeInfo.getMoney(),
				tb_IncomeInfo.getTime(),
				tb_IncomeInfo.getPayment(),
				tb_IncomeInfo.getDepict()});
	}
	
	/**
	 * 更新收入信息
	 * @param tb_IncomeInfo
	 */
	public void update(tb_IncomeInfo tb_IncomeInfo)
	{
		db=helper.getWritableDatabase();
		String sql="update tb_IncomeInfo set ID=?," +
										"TypeID=?," +
										"Money=?," +
										"Time=?, " +
										"payment=?, " +
										"Depict=?" +
										"where IncomeID=? ";
		db.execSQL(sql, new Object[]{
				tb_IncomeInfo.getID(),
				tb_IncomeInfo.getTypeID(),
				tb_IncomeInfo.getMoney(),
				tb_IncomeInfo.getTime(),
				tb_IncomeInfo.getPayment(),
				tb_IncomeInfo.getDepict(),
				tb_IncomeInfo.getIncomeID()});
	}
	
	/**
	 * 删除收入信息
	 * @param tb_IncomeInfo
	 */
	public void delete(tb_IncomeInfo tb_IncomeInfo)
	{
		db=helper.getWritableDatabase();
		String sql="delete from tb_IncomeInfo where IncomeID=?";
		db.execSQL(sql, new Object[]{
				tb_IncomeInfo.getIncomeID()});
		
		
	}
	
	/**
	 * 获取收入信息
	 * 
	 * @param start
	 *            起始位置
	 * @param count
	 *            每页显示数量
	 * @return
	 */
	public List<tb_IncomeInfo> getScrollData(int start, int count) {
		List<tb_IncomeInfo> lisTb_flags = new ArrayList<tb_IncomeInfo>();// 创建集合对象
		db = helper.getWritableDatabase();// 初始化SQLiteDatabase对象
		// 获取所有便签信息
		Cursor cursor = db.rawQuery("select * from tb_IncomeInfo limit ?,?",
				new String[] { String.valueOf(start), String.valueOf(count) });
		while (cursor.moveToNext())// 遍历所有的便签信息
		{
			// 将遍历到的便签信息添加到集合中
			lisTb_flags.add(new tb_IncomeInfo());
		}
		return lisTb_flags;// 返回集合
	}

	/**
	 * 获取总记录数
	 * 
	 * @return
	 */
	public long getCount() {
		db = helper.getWritableDatabase();// 初始化SQLiteDatabase对象
		Cursor cursor = db.rawQuery("select count(IncomeID) from tb_IncomeInfo", null);// 获取便签信息的记录数
		if (cursor.moveToNext())// 判断Cursor中是否有数据
		{
			return cursor.getLong(0);// 返回总记录数
		}
		return 0;// 如果没有数据，则返回0
	}
}
