package com.example.ee.buttonexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button2);
        tView = (TextView) findViewById(R.id.textView2);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tView.setText(R.string.output);
    }
}
