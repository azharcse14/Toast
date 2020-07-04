package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnId);

        textView = findViewById(R.id.tvId);

//        button.setOnClickListener(this);
        //btn.setOnClickListener(this);
    }


    public void onClick(View v) {
        if (v.getId()==R.id.btnId){
            Toast.makeText(getApplicationContext(),"First button Clicked", Toast.LENGTH_LONG).show();
        }
    }
}
