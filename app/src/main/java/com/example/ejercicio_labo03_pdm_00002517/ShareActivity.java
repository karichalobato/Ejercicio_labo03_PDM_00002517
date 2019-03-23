package com.example.ejercicio_labo03_pdm_00002517;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private TextView sName, sPassword, sEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        sName = findViewById(R.id.tv_name_share);
        sPassword = findViewById(R.id.tv_pass_share);
        sEmail = findViewById(R.id.tv_email_share);

        Intent sIntent = getIntent();

        if(sIntent != null){
            sName.setText(sIntent.getStringExtra("name"));
            sPassword.setText(sIntent.getStringExtra("password"));
            sEmail.setText(sIntent.getStringExtra("email"));
        }

    }
}
