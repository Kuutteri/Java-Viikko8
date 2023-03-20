package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valueInput1;
    private EditText valueInput2;
    private TextView outcomeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueInput1 = findViewById(R.id.editValue1);
        valueInput2 = findViewById(R.id.editValue2);
        outcomeView = findViewById(R.id.textView);
    }

    public void Addition(View view) {
        int Value1 = Integer.parseInt(valueInput1.getText().toString());
        int Value2 = Integer.parseInt(valueInput2.getText().toString());
        int Summa = Value1 + Value2;
        String stringSumma = Integer.toString(Summa);
        outcomeView.setText(stringSumma.toString());
    }

    public void Minus(View view) {
        int Value1 = Integer.parseInt(valueInput1.getText().toString());
        int Value2 = Integer.parseInt(valueInput2.getText().toString());
        int Summa = Value1 - Value2;
        String stringSumma = Integer.toString(Summa);
        outcomeView.setText(stringSumma.toString());
    }

    public void Multiply(View view) {
        int Value1 = Integer.parseInt(valueInput1.getText().toString());
        int Value2 = Integer.parseInt(valueInput2.getText().toString());
        int Summa = Value1 * Value2;
        String stringSumma = Integer.toString(Summa);
        outcomeView.setText(stringSumma.toString());
    }

    public void Divide(View view) {
        int Value1 = Integer.parseInt(valueInput1.getText().toString());
        int Value2 = Integer.parseInt(valueInput2.getText().toString());
        int Summa = Value1 / Value2;
        String stringSumma = Integer.toString(Summa);
        outcomeView.setText(stringSumma.toString());
    }
}
