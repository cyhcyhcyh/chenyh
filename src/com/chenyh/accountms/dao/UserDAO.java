package com.chenyh.accountms.dao;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.*;
public class UserDAO {
	private DBOpenHelper helper;// ����DBOpenHelper����
	private SQLiteDatabase db;// ����SQLiteDatabase����

	public UserDAO(Context context)// ���幹�캯��
	{
		helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����
	}
	/**
	 *����û���Ϣ
	 * @param tb_User
	 */
	public void insert (tb_User tb_User){
		db=helper.getWritableDatabase();
		String sql="insert into tb_User (UserName,Password,Depict) values (?,?,?)";
		db.execSQL(sql, new Object[] {
				tb_User.getUserName(),
				tb_User.getPassword(),
				tb_User.getDepict()});
	};
	/**
	 * �޸��û�����
	 * @param tb_User
	 */
	public void update(tb_User tb_User){
		db=helper.getWritableDatabase();
		String sql="update tb_User set Password=? where UserID=? ";
		db.execSQL(sql, new Object[]{
				tb_User.getPassword(),
				tb_User.getUserID()
		} );
	}
}
