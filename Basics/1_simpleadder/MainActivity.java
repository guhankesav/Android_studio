package com.example.basic_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt01,edt02;
    Button btn1;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        edt01 = findViewById(R.id.ed1);
        edt01 =findViewById(R.id.ed2);
        txt = findViewById(R.id.textview1);
    }

    public void btn(View view) {
        String inp1 = edt01.getText().toString();
        String inp2 = edt01.getText().toString();
        int inp11 = Integer.parseInt(inp1);
        int inp22 = Integer.parseInt(inp2);

        int output = inp11 +inp22;

        txt.setText(Integer.toString(output));

    }
}
