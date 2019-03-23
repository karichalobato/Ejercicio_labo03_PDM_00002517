package com.example.ejercicio_labo03_pdm_00002517;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private TextView nName, nPassword,nEmail;
    private Button nBtnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new);
        nName = findViewById(R.id.tv_name);
        nPassword = findViewById(R.id.tv_pass);
        nEmail = findViewById(R.id.tv_email);

        Intent mIntent = getIntent();

        if( mIntent != null){
            nName.setText("Name: " + mIntent.getStringExtra("name"));
            nPassword.setText("Password: " + mIntent.getStringExtra("password"));
            nEmail.setText("Email: " + mIntent.getStringExtra("email"));
        }

        nBtnShare = findViewById(R.id.btn_share);
        nBtnShare.setOnClickListener(v ->{
            String name = nName.getText().toString();
            String password = nPassword.getText().toString();
            String email = nEmail.getText().toString();
            Intent tIntent = new Intent();
            tIntent.setType("text/plain");
            tIntent.setAction(Intent.ACTION_SEND);
            tIntent.putExtra("name", name);
            tIntent.putExtra("password", password);
            tIntent.putExtra("email", email);
            startActivity(tIntent);
        });
    }
}
