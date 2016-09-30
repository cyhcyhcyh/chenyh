package com.chenyh.accountms.dao;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.tb_Flag;;
public class FlagDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public FlagDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper���� hhhh
	}
	
	
	/***
	 * ������ǩ
	 * @param tb_Flag
	 */
	public void insert(tb_Flag tb_Flag)
	{
		db=helper.getWritableDatabase();
		String  sql="insert into tb_Flag(Title, Content, Time) values(?,?,?) ";
		db.execSQL(sql, new Object[]{
						tb_Flag.getTitle(),
						tb_Flag.getContent(),
						tb_Flag.getTime()});
	}
	
	/***
	 *�༭��ǩ
	 * @param tb_Flag
	 */
	public void update(tb_Flag tb_Flag)
	{
		db=helper.getWritableDatabase();
		String sql="update tb_Flag set Title=?," +
									" Content=?, " +
									"Time=? " +
									"where FlagID=? ";
		db.execSQL(sql, new Object[]{
						tb_Flag.getTitle(),
						tb_Flag.getContent(),
						tb_Flag.getTime(),
						tb_Flag.getFlagID()});
		
	}
	
	/**
	 *ɾ����ǩ��Ϣ
	 * @param tb_Flag
	 */
	public void delete(tb_Flag tb_Flag)
	{
		 db=helper.getWritableDatabase();
		 String sql="delete from tb_Flag where FlagID=?";
		 db.execSQL(sql, new Object[]{
				 		tb_Flag.getFlagID()});
	}
	
	/**
	 * ��ѯ���б�ǩ
	 * @return
	 */
	public tb_Flag selectAll( )
	{
		db=helper.getWritableDatabase();
		String sql="select * from tb_Flag";
		Cursor cursor=db.rawQuery(sql, null);
		while (cursor.moveToNext()) {
			
			return new tb_Flag(cursor.getInt(cursor.getColumnIndex("FlagID")),
								cursor.getString(cursor.getColumnIndex("Title")),
								cursor.getString(cursor.getColumnIndex("Content")),
								cursor.getString(cursor.getColumnIndex("Time")));
		}
		return null;
	}
}
