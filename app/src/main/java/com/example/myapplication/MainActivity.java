package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import utils.keys;

public class MainActivity extends AppCompatActivity {

    private EditText mUser, mPass, mEmail, mGender;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = findViewById(R.id.user);
        mPass = findViewById(R.id.pass);
        mEmail = findViewById(R.id.email);
        mGender = findViewById(R.id.gender);
        mSubmit = findViewById(R.id.btn_submit);

        mSubmit.setOnClickListener(v ->{
            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra(keys.userKey,mUser.getText().toString());
            mIntent.putExtra(keys.passKey,mPass.getText().toString());
            mIntent.putExtra(keys.emailKey,mEmail.getText().toString());
            mIntent.putExtra(keys.genderKey,mGender.getText().toString());
            startActivity(mIntent);
        });

    }
}
