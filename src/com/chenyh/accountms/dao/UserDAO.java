package com.chenyh.accountms.dao;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.chenyh.accountms.db.DBOpenHelper;
import com.chenyh.accountms.model.*;
public class UserDAO {
	private DBOpenHelper helper;// 创建DBOpenHelper对象
	private SQLiteDatabase db;// 创建SQLiteDatabase对象

	public UserDAO(Context context)// 定义构造函数
	{
		helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象
	}
	/**
	 *添加用户信息
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
	 * 修改用户密码
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
