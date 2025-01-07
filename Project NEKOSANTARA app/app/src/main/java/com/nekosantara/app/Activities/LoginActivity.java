package com.nekosantara.app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.nekosantara.app.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdt,passEdt;
    private TextView regbtntext;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        userEdt=findViewById(R.id.editTextUsername);
        passEdt=findViewById(R.id.editTextPassword);
        regbtntext=findViewById(R.id.TextRegister);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
           if(userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()) {
                Toast.makeText(LoginActivity.this, "Please Fill your user and password", Toast.LENGTH_SHORT).show();
            }else if(userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")) {
               Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
               startActivity(new Intent(LoginActivity.this, MainActivity.class ));
            }else {
               Toast.makeText(LoginActivity.this, "Your user and password is not correct", Toast.LENGTH_SHORT).show();
            }
        });

        regbtntext.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
            Toast.makeText(LoginActivity.this, "Make Your Account", Toast.LENGTH_SHORT).show();
        });
    }
}