package com.ctisv.psicobrain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnlogin;
    TextView tvGoSingup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btnSingup);
        tvGoSingup = findViewById(R.id.TextViewGoLogin);


        btnlogin .setOnClickListener(this);
        tvGoSingup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.btnSingup:
                break;
            case R.id.TextViewGoLogin:
                goToSignup();
                break;
        }
    }

    private void goToSignup() {
        Intent i = new Intent(MainActivity.this, SingupActivity.class);
        startActivity(i);
    }
}
