package com.example.oderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new MyonclickListener());
    }

    private class MyonclickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "点菜", Toast.LENGTH_SHORT).show();
        }
    }
}