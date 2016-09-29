package com.chenyh.accountms.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
public class SqlDB {
		private DBOpenHelper helper;// ����DBOpenHelper����
		private SQLiteDatabase db;// ����SQLiteDatabase����
		public SqlDB() {	
		}
		public SqlDB(Context context){
			helper = new DBOpenHelper(context);// ��ʼ��DBOpenHelper����	
		}
		/**
		 * ������ɾ�ĵķ���
		 * @param sql
		 */
		public void execSQL(String sql){
			db = helper.getWritableDatabase();// ��ʼ��SQLiteDatabase����
			db.execSQL(sql);
			db.close();
		}
		/**
		 * �����ѯ���ݵķ���
		 * @param sql
		 */
		public void rawQuery(String sql,Object[] objObject){
			db = helper.getWritableDatabase();// ��ʼ��SQLiteDatabase����
			db.rawQuery(sql,(String[]) objObject);
			db.close();
		}
}
