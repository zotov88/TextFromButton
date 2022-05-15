package com.example.textfrombutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                button.setBackgroundColor(getResources().getColor(R.color.gray));
                String buttonText = button.getText().toString();
                textView.setText("Congratulations! You did it");
                Toast toast = Toast.makeText(getApplicationContext(), "You pushed " + buttonText, Toast.LENGTH_SHORT);
                toast.show();
                button.setText("inactive");
                view.setClickable(false);
            }
        });
    }


}

