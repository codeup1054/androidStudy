package ru.wrk.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        //TODO: 2020-09-30
    }

    public void onClick(View view)
    {
        Random random =new Random();
        int cube = random.nextInt(6)+1;
        textView.setText(String.valueOf(cube));
    }
}