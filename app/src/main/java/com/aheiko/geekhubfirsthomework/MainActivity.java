package com.aheiko.geekhubfirsthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        final EditText editTextFirst = (EditText) findViewById(R.id.edt_first);

        final EditText editTextSecond = (EditText) findViewById(R.id.edt_second);

        final TextView result = (TextView) findViewById(R.id.txt_result);

        Button showResult = (Button) findViewById(R.id.btn_show);
        showResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stFirst = editTextFirst.getText().toString();
                String stSecond = editTextSecond.getText().toString();
                try{
                    int firstNumber =Integer.parseInt(stFirst);
                    int secondNumber =Integer.parseInt(stSecond);
                    result.setText((firstNumber+secondNumber)+"");
                }catch (Exception e){
                    result.setText(stFirst+stSecond);
                }
            }
        });

    }
}
