package com.example.tcbyjk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et;
Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "This app is developed by Javed with lots of Love", Toast.LENGTH_SHORT).show();

        et = findViewById(R.id.editText);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        TextView tx = findViewById(R.id.textView);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double var1 = Double.parseDouble(et.getText().toString());
                    double res1 = ((1.8 * var1) + 32);
                    et.setText(String.format("%.2f", res1));
                    tx.setText("°F");
                } catch (NumberFormatException e) {
                    et.setText("Invalid input");
                }
            }

        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    try {
                        double var2 = Double.parseDouble(et.getText().toString());
                        double res2 = ((var2 - 32) * 5) / 9;
                        et.setText(String.format("%.2f", res2));
                        tx.setText("°C");
                    } catch (NumberFormatException e) {
                        et.setText("Invalid input");
                    }
            }

        });
    }
}
