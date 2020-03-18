package com.ctisv.psicobrain;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SingupActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSingup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        btnSingup = findViewById(R.id.btnLogin);
        btnSingup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


    }
}
