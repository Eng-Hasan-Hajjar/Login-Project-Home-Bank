package com.example.hasansafwanhajjar.loginproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.hasansafwanhajjar.loginproject.activity_register;


public class LoginActivity extends AppCompatActivity  {

    LinearLayout ly_login;
    EditText login_name,login_password;
    Button btn_register_onClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ly_login =(LinearLayout) findViewById(R.id.ly_login);

        login_name=(EditText) findViewById(R.id.login_ETXT_Name);
        login_password=(EditText) findViewById(R.id.login_ETXT_password);
        btn_register_onClick=(Button) findViewById(R.id.btn_rigister);

    }

    public void btn_login (View view)
    {
        ly_login.setVisibility(View.VISIBLE);
        btn_register_onClick.setVisibility(View.INVISIBLE);

    }


    public void btn_move_register(View view)
    {
        Intent register_intent=new Intent(this,activity_register.class);
        startActivity(register_intent);
      //  Bundle bundle_variable=new Bundle();
       // bundle_variable.putString();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ly_login.setVisibility(View.INVISIBLE);
        btn_register_onClick.setVisibility(View.VISIBLE);

            }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override public boolean onOptionsItemSelected(MenuItem item)
    { int id = item.getItemId();
        if (id == R.id.Action_Reflesh){
            ly_login.setVisibility(View.INVISIBLE);
            btn_register_onClick.setVisibility(View.VISIBLE);
            return true; }
        return super.onOptionsItemSelected(item); }
}


