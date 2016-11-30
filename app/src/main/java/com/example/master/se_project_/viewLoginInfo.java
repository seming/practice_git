package com.example.master.se_project_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class viewLoginInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_login_info);

        TextView printId = (TextView)findViewById(R.id.printId);
        TextView printPassword = (TextView)findViewById(R.id.printPassword);

        Intent intentLoginInfo = getIntent();

        String id = intentLoginInfo.getStringExtra("입력한 아이디");
        String password = intentLoginInfo.getStringExtra("입력한 비밀번호");

        printId.setText(String.valueOf(id));
        printPassword.setText(String.valueOf(password));
    }

}
