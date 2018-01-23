package com.sunilsaini.attendee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        Toolbar toolbar=(Toolbar)findViewById(R.id.my_toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_backar);
        TextView registertext=(TextView)findViewById(R.id.registertext);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        registertext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inavi=new Intent(loginactivity.this,RegisterActivity.class);
                startActivity(inavi);
            }
        });

    }
}
