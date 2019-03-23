package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import utils.keys;

public class Main2Activity extends AppCompatActivity {

    private TextView mUser, mPass, mEmail, mGender;
    private Button mShare;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mUser = findViewById(R.id.user);
        mPass = findViewById(R.id.pass);
        mEmail = findViewById(R.id.email);
        mGender = findViewById(R.id.gender);

        mShare = findViewById(R.id.btn_share);

        Intent mIntent = getIntent();

        if(mIntent!= null) {
            mUser.setText(mIntent.getStringExtra(keys.userKey));
            mPass.setText(mIntent.getStringExtra(keys.passKey));
            mEmail.setText(mIntent.getStringExtra(keys.emailKey));
            mGender.setText(mIntent.getStringExtra(keys.genderKey));
        }

        mShare.setOnClickListener( v -> {
            Intent mIntent2 = new Intent();

            mIntent2.putExtra(keys.userKey,mUser.getText().toString());
            mIntent2.putExtra(keys.passKey,mPass.getText().toString());
            mIntent2.putExtra(keys.emailKey,mEmail.getText().toString());
            mIntent2.putExtra(keys.genderKey,mGender.getText().toString());

            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.setType("text/plain");
            startActivity(mIntent2);
        });
    }
}
