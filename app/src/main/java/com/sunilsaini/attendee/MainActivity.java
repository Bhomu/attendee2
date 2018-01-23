package com.sunilsaini.attendee;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView login=(TextView)findViewById(R.id.logintext);
        TextView calender=(TextView)findViewById(R.id.calenderview);
        TextView navigate=(TextView)findViewById(R.id.textNavigate);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,loginactivity.class);
                startActivity(intent);


            }
        });
        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inavi=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(inavi);
            }
        });
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cali=new Intent(MainActivity.this,event_date_activity.class);
                startActivity(cali);

            }
        });
        TextView registration=(TextView)findViewById(R.id.Text_registration);
        TextView  approval=(TextView)findViewById(R.id.approval);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked1(view);
            }
        });
        approval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttonClicked(view);
            }
        });
    }


    public void buttonClicked(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.name_badge, null);
        Dialog dialog=new Dialog(this);
        dialog.setContentView(alertLayout);
        dialog.setCanceledOnTouchOutside(true);
       // dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
    public void buttonClicked1(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.registration_type, null);
        Dialog dialog=new Dialog(this);
        dialog.setContentView(alertLayout);
        dialog.setCanceledOnTouchOutside(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }


}
