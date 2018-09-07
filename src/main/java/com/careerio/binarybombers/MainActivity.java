package com.careerio.binarybombers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.editText3);
        Password = (EditText)findViewById(R.id.editText2);
        Login = (Button)findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
    }


    private void validate(String userName, String userPassword)
    {

        if((userName =="admin") && (userPassword == "admin"))
        {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        }
    }
}
