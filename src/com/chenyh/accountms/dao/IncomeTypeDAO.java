package com.chenyh.accountms.dao;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_IncomeType;
public class IncomeTypeDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public IncomeTypeDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}
	
	/**
	 * �����������
	 * @param tb_IncomeType
	 */
	public void insert (tb_IncomeType tb_IncomeType) {
		db=helper.getWritableDatabase();
		String sql="insert into tb_IncomeType( TypeName, Depict) values(?,?)";
		db.execSQL(sql, new Object[]{
						tb_IncomeType.getTypeName(),
						tb_IncomeType.getDepict()});
		
	}
	
	/***
	 * �����������
	 * @param tb_IncomeType
	 */
	public void update (tb_IncomeType tb_IncomeType) {
		db=helper.getWritableDatabase();
		String sql="update  tb_IncomeType set TypeName=?,Depict=? where TypeID=? ";
		db.execSQL(sql, new Object[]{
						tb_IncomeType.getTypeName(),
						tb_IncomeType.getDepict(),
						tb_IncomeType.getTypeID()});
	}
	
	/**
	 * ɾ���������
	 * @param tb_IncomeType
	 */
	public void delete(tb_IncomeType tb_IncomeType)
	{
		db=helper.getWritableDatabase();
		String  sql="delete from tb_IncomeType where TypeID=? ";
		db.execSQL(sql, new Object[]{
							tb_IncomeType.getTypeID()});
		
	}
	
	/***
	 * ��ѯtb_IncomeType���������Ϣ
	 * @param tb_IncomeType
	 * @return
	 */
	public tb_IncomeType selectAll(tb_IncomeType tb_IncomeType)
	{
		db=helper.getWritableDatabase();
		String sql=" select * from tb_IncomeType";
		Cursor cursor=db.rawQuery(sql, null);	
		  while(cursor.moveToNext()){
			  
			  return  new tb_IncomeType(cursor.getInt(cursor.getColumnIndex("TypeID")),
					  cursor.getString(cursor.getColumnIndex("TypeName")),
					  cursor.getString(cursor.getColumnIndex("Depict"))
					  );
		  }
		  return null;
	}

	
}
