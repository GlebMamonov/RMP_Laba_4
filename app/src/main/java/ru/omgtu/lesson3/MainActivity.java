package ru.omgtu.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    public void onClick(View v){
        EditText etName = findViewById(R.id.editText);
        String text = etName.getText().toString();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("TEXT", text);
        startActivity(intent);

    }
    public void date(View v){
        TextView data = findViewById(R.id.textView);
        String day = getIntent().getStringExtra("day");
        String month = getIntent().getStringExtra("month");
        String year = getIntent().getStringExtra("year");
        data.setText(day + "." + month + "." + year);
    }


}