package com.chenyh.accountms.activity;

import com.chenyh.accountms.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.chenyh.accountms.dao.UserDAO;
import com.chenyh.accountms.model.tb_User;
public class MainActivity extends Activity {

	private EditText UserName;
	private EditText Password;
	private EditText PwdOK;
	private Button  btnregister;
	
	
	UserDAO userDAO=new UserDAO(null);
    tb_User User=new tb_User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        
       
        UserName=(EditText) findViewById(R.id.ETusername);
        Password=(EditText) findViewById(R.id.ETpwd);
        PwdOK=(EditText) findViewById(R.id.ETpwdok);
        
        User.setUserName(UserName.getText().toString());
        User.setPassword(Password.getText().toString());
        
        btnregister=(Button) findViewById(R.id.btnregister);
        		btnregister.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						 if(Password.getText().toString()!=PwdOK.getText().toString())
					        {
					        		userDAO.insert(User);
					        		Toast.makeText(MainActivity.this, "注册成功！", Toast.LENGTH_LONG).show();
					        }
					        else {
								Toast.makeText(MainActivity.this, "密码与确认密码不一致！请重新输入！", Toast.LENGTH_LONG).show();
								return ;
							}
						
					}
				});
       
        
    }

}
