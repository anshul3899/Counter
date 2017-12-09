package com.wordpress.physicsforsmartbrains.www.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.increment);
        Button button1=(Button) findViewById(R.id.decrement);
        Button reset=(Button) findViewById(R.id.reset);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count+1;
                String score = new StringBuffer().append(count).toString();
                TextView textView=(TextView) findViewById(R.id.count);
               textView.setText(score);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               count=count-1;
                String score = new StringBuffer().append(count).toString();
                TextView textView=(TextView) findViewById(R.id.count);
                textView.setText(score);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                String score = new StringBuffer().append(count).toString();
                TextView textView=(TextView) findViewById(R.id.count);
                textView.setText(score); 
            }
        });

    }
}
