package com.chenyh.accountms.dao;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_IncomeInfo;
public class IncomeInfoDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public IncomeInfoDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}

	

	/***
	 * ����������Ϣ
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
	 * ����������Ϣ
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
	 * ɾ��������Ϣ
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
	 * ��ȡ������Ϣ
	 * 
	 * @param start
	 *            ��ʼλ��
	 * @param count
	 *            ÿҳ��ʾ����
	 * @return
	 */
	public List<tb_IncomeInfo> getScrollData(int start, int count) {
		List<tb_IncomeInfo> lisTb_flags = new ArrayList<tb_IncomeInfo>();// �������϶���
		db = helper.getWritableDatabase();// ��ʼ��SQLiteDatabase����
		// ��ȡ���б�ǩ��Ϣ
		Cursor cursor = db.rawQuery("select * from tb_IncomeInfo limit ?,?",
				new String[] { String.valueOf(start), String.valueOf(count) });
		while (cursor.moveToNext())// �������еı�ǩ��Ϣ
		{
			// ���������ı�ǩ��Ϣ��ӵ�������
			lisTb_flags.add(new tb_IncomeInfo());
		}
		return lisTb_flags;// ���ؼ���
	}

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @return
	 */
	public long getCount() {
		db = helper.getWritableDatabase();// ��ʼ��SQLiteDatabase����
		Cursor cursor = db.rawQuery("select count(IncomeID) from tb_IncomeInfo", null);// ��ȡ��ǩ��Ϣ�ļ�¼��
		if (cursor.moveToNext())// �ж�Cursor���Ƿ�������
		{
			return cursor.getLong(0);// �����ܼ�¼��
		}
		return 0;// ���û�����ݣ��򷵻�0
	}
}
