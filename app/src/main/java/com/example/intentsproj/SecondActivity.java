package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.result);

        Intent intent = getIntent();
        int value1 = intent.getIntExtra("VALUE1", 0);
        int value2 = intent.getIntExtra("VALUE2", 0);

        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);

        editText1.setText(String.valueOf(value1));
        editText2.setText(String.valueOf(value2));
    }
}