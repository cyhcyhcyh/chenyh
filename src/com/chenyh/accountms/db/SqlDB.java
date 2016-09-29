package com.chenyh.accountms.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
public class SqlDB {
		private DBOpenHelper helper;// 创建DBOpenHelper对象
		private SQLiteDatabase db;// 创建SQLiteDatabase对象
		public SqlDB() {	
		}
		public SqlDB(Context context){
			helper = new DBOpenHelper(context);// 初始化DBOpenHelper对象	
		}
		/**
		 * 定义增删改的方法
		 * @param sql
		 */
		public void execSQL(String sql){
			db = helper.getWritableDatabase();// 初始化SQLiteDatabase对象
			db.execSQL(sql);
			db.close();
		}
		/**
		 * 定义查询数据的方法
		 * @param sql
		 */
		public void rawQuery(String sql,Object[] objObject){
			db = helper.getWritableDatabase();// 初始化SQLiteDatabase对象
			db.rawQuery(sql,(String[]) objObject);
			db.close();
		}
}
