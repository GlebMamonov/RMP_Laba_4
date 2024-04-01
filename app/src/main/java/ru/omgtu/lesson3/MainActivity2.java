package ru.omgtu.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = findViewById(R.id.textView1);
        String out = getIntent().getStringExtra("TEXT");
        text.setText(out);
    }
    public void back(View v){
        DatePicker data = findViewById(R.id.datePicker);
        String day = String.valueOf(data.getDayOfMonth());
        String month = String.valueOf(data.getMonth()+1);
        String year = String.valueOf(data.getYear());

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra("day", day);
        intent.putExtra("month", month);
        intent.putExtra("year", year);


        startActivity(intent);

    }

}