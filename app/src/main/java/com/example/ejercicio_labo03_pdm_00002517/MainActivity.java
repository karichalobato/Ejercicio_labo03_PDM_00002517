package com.example.ejercicio_labo03_pdm_00002517;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mName, mLastname, mPassword, mEmail;
    private Button bt_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.name_text_box);
        mLastname = findViewById(R.id.lastname_text_box);
        mPassword = findViewById(R.id.pass_text_box);
        mEmail = findViewById(R.id.email_text_box);
        bt_next = findViewById(R.id.btn_next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                String lastname = mLastname.getText().toString();
                String password = mPassword.getText().toString();
                String email = mEmail.getText().toString();
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
                mIntent.putExtra("name", name);
                mIntent.putExtra("lastname", lastname);
                mIntent.putExtra("password", password);
                mIntent.putExtra("email", email);
                MainActivity.this.startActivity(mIntent);

            }
        });
    }
}