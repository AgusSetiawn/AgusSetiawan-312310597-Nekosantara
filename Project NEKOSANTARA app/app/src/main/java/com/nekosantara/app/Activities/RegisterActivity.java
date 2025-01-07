package com.nekosantara.app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nekosantara.app.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText userEdt1, passEdt1;
    private TextView regbtntext;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
    }

    private void initView() {
        userEdt1=findViewById(R.id.editTextUsername1);
        passEdt1=findViewById(R.id.editTextPassword1);
        regbtntext=findViewById(R.id.TextRegister);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            if(userEdt1.getText().toString().isEmpty() || passEdt1.getText().toString().isEmpty()) {
                Toast.makeText(RegisterActivity.this, "Please Fill your user and password", Toast.LENGTH_SHORT).show();
            }else if(userEdt1.getText().toString().equals("test") && passEdt1.getText().toString().equals("test")) {
                Toast.makeText(RegisterActivity.this, "Register Success", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class ));
            }else {
                Toast.makeText(RegisterActivity.this, "Your user and password is not correct", Toast.LENGTH_SHORT).show();
            }
        });

        regbtntext.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}