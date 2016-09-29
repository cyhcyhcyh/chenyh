package com.chenyh.accountms.dao;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_IncomeType;
public class IncomeTypeDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public IncomeTypeDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}
	
	/**
	 * 新增
	 * @param tb_IncomeType
	 */
	public void insert (tb_IncomeType tb_IncomeType) {
		db=helper.getWritableDatabase();
		String sql="insert into tb_IncomeType( TypeName, Depict) values(?,?)";
		db.execSQL(sql, new Object[]{
						tb_IncomeType.getTypeName(),
						tb_IncomeType.getDepict()});
		
	}
	
	
	private void update (tb_IncomeType tb_IncomeType) {
		db=helper.getWritableDatabase();
		String sql="update  tb_IncomeType set TypeName=?,Depict=? where TypeID=? ";
		db.execSQL(sql, new Object[]{
						tb_IncomeType.getTypeName(),
						tb_IncomeType.getDepict(),
						tb_IncomeType.getTypeID()});
	}
}
