package com.ctisv.psicobrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SingupActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSingup;
    TextView tvGoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        btnSingup = findViewById(R.id.btnSingup);
        tvGoLogin = findViewById(R.id.TextViewGoLogin);


        btnSingup .setOnClickListener(this);
        tvGoLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnSingup:
                break;
            case R.id.TextViewGoLogin:
                goToLogin();
                break;
        }

    }

    private void goToLogin() {
        Intent i = new Intent(SingupActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
