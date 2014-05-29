package com.xbl.chebang.app;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends ActionBarActivity implements View.OnClickListener
{
    private EditText mLoginNameEt;
    private EditText mLoginPasswd;
    private TextView mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginNameEt = (EditText)findViewById(R.id.loginName);
        mLoginPasswd = (EditText)findViewById(R.id.loginPassword);
        mRegister = (TextView)findViewById(R.id.registerTv);
        mRegister.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view)
    {
        int i = view.getId();

        if (i == R.id.loginTv)
        {
            startLogin();
        }
        else if (i == R.id.registerTv)
        {
            startActivity(new Intent(this, Register.class));
        }
    }

    private void startLogin()
    {
        String name = mLoginNameEt.getText().toString().trim();
        if (name == null)
            Log.e("CB_Login", "No available login name!");
        String password = mLoginPasswd.getText().toString().trim();
        if (password == null)
            Log.e("CB_Login", "No password!");
        Log.d("CB_Login", "startLogin (" + name + ", " + password + ")");
    }

    private void startRegister()
    {

    }
}
