package com.example.ejercicio_labo03_pdm_00002517;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mName, mPassword, mEmail;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.name_text_box);
        mPassword = findViewById(R.id.pass_text_box);
        mEmail = findViewById(R.id.email_text_box);
        mNext = findViewById(R.id.btn_next);

        mNext.setOnClickListener(v -> {
            String name = mName.getText().toString();
            String password = mPassword.getText().toString();
            String email = mEmail.getText().toString();
            Intent mIntent = new Intent(MainActivity.this,NewActivity.class);
            mIntent.putExtra("name",name);
            mIntent.putExtra("password",password);
            mIntent.putExtra("email",email);
            startActivity(mIntent);

        });
    }
}