package com.hashmappers.android.secuure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class AddingAccounts extends AppCompatActivity implements View.OnClickListener {

    Button addList;
    EditText enterTitle, enterLogin, enterPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_accounts);

        enterTitle = (EditText) findViewById(R.id.enterTitle);
        enterLogin = (EditText) findViewById(R.id.enterLogin);
        enterPassword = (EditText) findViewById(R.id.enterPassword);
        addList = (Button) findViewById(R.id.addList);

        addList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addList:
                // Receive all the user attributes that are typed in
                String name = enterTitle.getText().toString();
                String login = enterLogin.getText().toString();
                String password = enterPassword.getText().toString();
                //User registeredData = new User(name, username, password);
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
