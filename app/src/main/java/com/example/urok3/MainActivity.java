package com.example.urok3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user_field;
    private Button main_btn;
    private TextView result_weather;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_field=findViewById(R.id.user_field);
        main_btn=findViewById(R.id.main_btn);
        result_weather=findViewById(R.id.result_weather);

        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user_field.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this,R.string.notext,Toast.LENGTH_LONG);

                }
                else
                {
                    Toast.makeText(MainActivity.this,R.string.notext,Toast.LENGTH_SHORT);

                }
            }
        });
    }
}
