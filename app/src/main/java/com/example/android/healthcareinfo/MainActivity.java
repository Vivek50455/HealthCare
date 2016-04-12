package com.example.android.healthcareinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button butnSingIn;
    Button butnSingUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butnSingIn = (Button)findViewById(R.id.btnSignIn);
        butnSingUp = (Button)findViewById(R.id.btnSignUp);
        butnSingIn.setOnClickListener(this);
        butnSingUp.setOnClickListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent i = null;
        if (v.getId() == R.id.btnSignIn) {

        } else if(v.getId() == R.id.btnSignUp)
        {
            i = new Intent(this, SignUpActivity.class);
        }
        startActivity(i);

    }
}
