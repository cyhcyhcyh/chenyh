package com.chenyh.accountms.dao;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.*;
public class PayInfoDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public PayInfoDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}
	/**
	 * ����֧����Ϣ
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
	 * �޸�֧����Ϣ
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
	 * ɾ��֧����Ϣ
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
	 * ��ȡ֧����Ϣ
	 * 
	 * @param start
	 *            ��ʼλ��
	 * @param count
	 *            ÿҳ��ʾ����
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
	 * ��ȡ�ܼ�¼��
	 * 
	 * @return
	 */
	public long getCount() {
		db = helper.getWritableDatabase();// ��ʼ��SQLiteDatabase����
		Cursor cursor = db.rawQuery("select count(_id) from tb_outaccount",
				null);// ��ȡ֧����Ϣ�ļ�¼��
		if (cursor.moveToNext())// �ж�Cursor���Ƿ�������
		{
			return cursor.getLong(0);// �����ܼ�¼��
		}
		return 0;// ���û�����ݣ��򷵻�0
	}

	/**
	 * ��ȡ֧�������
	 * 
	 * @return
	 */
	public int getMaxId() {
		db = helper.getWritableDatabase();// ��ʼ��SQLiteDatabase����
		Cursor cursor = db.rawQuery("select max(_id) from tb_outaccount", null);// ��ȡ֧����Ϣ���е������
		while (cursor.moveToLast()) {// ����Cursor�е����һ������
			return cursor.getInt(0);// ��ȡ���ʵ������ݣ��������
		}
		return 0;// ���û�����ݣ��򷵻�0
	}
	
}
