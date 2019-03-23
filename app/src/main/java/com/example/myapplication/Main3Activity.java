package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import utils.keys;

public class Main3Activity extends AppCompatActivity {

    private TextView mUser, mPass, mEmail, mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mUser = findViewById(R.id.user);
        mPass = findViewById(R.id.pass);
        mEmail = findViewById(R.id.email);
        mGender = findViewById(R.id.gender);

        Intent mIntent = getIntent();

        if(mIntent!= null) {
            mUser.setText(mIntent.getStringExtra(keys.userKey));
            mPass.setText(mIntent.getStringExtra(keys.passKey));
            mEmail.setText(mIntent.getStringExtra(keys.emailKey));
            mGender.setText(mIntent.getStringExtra(keys.genderKey));
        }
    }
}
