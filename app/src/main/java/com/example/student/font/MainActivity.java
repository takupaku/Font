package com.example.student.font;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //app>new>folder>asset folder
        //ass

        textView=findViewById(R.id.txtId);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Cherishing Moment.ttf");
        textView.setTypeface(typeface);
        textView.setText("this is a wired text style");
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit?");
        builder.setMessage("Do you want to exit");
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //YES
                finish();
            }
        });
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //NO
            }
        });

        builder.create().show();


    }
}
