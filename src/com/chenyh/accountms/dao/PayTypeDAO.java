package com.chenyh.accountms.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_PayType;
public class PayTypeDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public PayTypeDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}
	/**
	 *����֧�����
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
	 * �޸�֧�����
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
	 * ɾ��֧�����
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
	 * ��ѯ֧�������Ϣ
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
