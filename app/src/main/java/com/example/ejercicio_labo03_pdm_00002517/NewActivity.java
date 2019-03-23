package com.example.ejercicio_labo03_pdm_00002517;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView nName, nLastname, nPassword, nEmail;
    private Button bt_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        nName = findViewById(R.id.tv_name);
        nLastname = findViewById(R.id.tv_lastname);
        nPassword = findViewById(R.id.tv_pass);
        nEmail = findViewById(R.id.tv_email);
        Intent mIntent = getIntent();
        if( mIntent != null){
            nName.setText("Name: " + mIntent.getStringExtra("name"));
            nLastname.setText("Lastname: " +mIntent.getStringExtra("lastname"));
            nPassword.setText("Password: " +mIntent.getStringExtra("password"));
            nEmail.setText("E-mail: " +mIntent.getStringExtra("email"));
        }

        bt_share = findViewById(R.id.btn_share);
        bt_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nName.getText().toString();
                String lastname = nLastname.getText().toString();
                String password = nPassword.getText().toString();
                String email = nEmail.getText().toString();
                Intent tIntent = new Intent();
                tIntent.setType("text/plain");
                tIntent.setAction(Intent.ACTION_SEND);
                tIntent.putExtra("name", name);
                tIntent.putExtra("lastname", lastname);
                tIntent.putExtra("password", password);
                tIntent.putExtra("email", email);
                NewActivity.this.startActivity(tIntent);
            }
        });
    }
}