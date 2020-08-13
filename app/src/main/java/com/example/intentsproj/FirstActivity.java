package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button button;
    EditText editText1;
    EditText editText2;
    TextView textView;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.okBtn);
        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

                toast = Toast.makeText(context, text, duration);

                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}