package com.example.master.se_project_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Account extends AppCompatActivity {

    EditText idInput;
    EditText passwordInput;
    Button loginButton, signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }

    public void onClick_login(View v){
        idInput = (EditText)findViewById(R.id.idInput);
        passwordInput = (EditText)findViewById(R.id.passwordInput);

        String id = idInput.getText().toString();
        String password = passwordInput.getText().toString();

        Intent loginIntent = new Intent(getApplicationContext(), viewLoginInfo.class);

        loginIntent.putExtra("입력한 아이디", id);
        loginIntent.putExtra("입력한 비밀번호", password);

        startActivity(loginIntent);
    }
/*
    public void intent_login(View v){
        Intent intent_01 = new Intent(getApplicationContext(), viewLoginInfo.class);
        startActivity(intent_01);
    }
  */
    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        idInput = (EditText) findViewById(R.id.idInput);
        passwordInput=(EditText)findViewById(R.id.passwordInput);

    }

    private boolean login(){

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                idInput=
            }
        });

    }

    private void signUp(){


    }*/
}
