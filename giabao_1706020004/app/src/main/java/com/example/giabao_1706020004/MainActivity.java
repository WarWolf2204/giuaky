package com.example.giabao_1706020004;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName;
    EditText edtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onInit();
        onLogin();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 1;
                switch (v.getId()){
                    case  R.id.main_btnLogin:
                        onLogin();
                }
            }
        });
        }
    public void onLogin(){
        if (onValidateForm()){
            if (edtUserName.getText().toString().equals("admin") && edtPassword.getText().toString().equals("admin")){
                Toast.makeText(MainActivity.this,"Login Success!",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(MainActivity.this,"Login Fail!",Toast.LENGTH_LONG).show();
            }
        }
    }
    private boolean onValidateForm() {
        if(edtUserName.getText().toString().length() < 1){
            edtUserName.setError("Please fill username");
            return false;
        }
        if(edtPassword.getText().toString().length() < 1){
            edtPassword.setError("Please fill username");
            return false;
        }
        return  true;
    }
    private void onInit() {
        edtUserName = findViewById(R.id.main_edtUserName);
        edtPassword = findViewById(R.id.main_edtPassword);
        btnLogin = findViewById(R.id.main_btnLogin);
    }

}

