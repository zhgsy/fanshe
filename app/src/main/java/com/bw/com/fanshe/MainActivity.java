package com.bw.com.fanshe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bw.com.fanshe.butterknife.ButterKnife;
import com.bw.com.fanshe.butterknife.ContentView;


@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.setContentView(R.layout.activity_main);
//
//        tv = findViewById(R.id.tv);
        ButterKnife.bind(this);

        tv.setText("kson1111111");
    }
}