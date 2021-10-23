package com.example.android5_time_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void time(View view){
        EditText year = findViewById(R.id.year);
        EditText month = findViewById(R.id.month);
        EditText day = findViewById(R.id.day);
        EditText hour = findViewById(R.id.hour);
        EditText minute = findViewById(R.id.minute);
        EditText second = findViewById(R.id.second);
        TextView Time = (TextView)findViewById(R.id.Time);
        TextView yyy = (TextView) findViewById(R.id.textView8);
        int Year = Integer.parseInt(year.getText().toString());
        int Month = Integer.parseInt(month.getText().toString());
        int Day = Integer.parseInt(day.getText().toString());
        int Hour = Integer.parseInt(hour.getText().toString());
        int Minute = Integer.parseInt(minute.getText().toString());
        int Second = Integer.parseInt(second.getText().toString());

        if(Month < 13 && Day < 32 && Hour < 24 && Minute < 60 && Second < 60){
            Time.setText("" + Year + "/" + Month + "/" + Day + "   " + Hour + ":" + Minute + ":" + Second);
        }
        else {
            Time.setText("錯誤!! 請重新出入");
        }

        int x = Year % 4;
        if(x == 0){
            yyy.setText("閏年");
        }
        else {
            yyy.setText("平年");
        }
    }

}