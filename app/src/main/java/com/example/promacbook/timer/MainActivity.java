package com.example.promacbook.timer;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
    private TextView _text;
    private CountDownTimer _timer;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timerlayout);

        _text = (TextView) findViewById(R.id.tvMsg);

        _timer = new CountDownTimer(60 * 1000, 1000) {
            public void onTick(long millisUntilFinished) {
                _text.setText("시간 = " + millisUntilFinished/1000);
            }

            public void onFinish() {
                _text.setText("finshed");
            }
        };

        Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                _timer.start();
            }
        });

        Button btnEnd = (Button) findViewById(R.id.btnStop);
        btnEnd.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                _timer.cancel();
            }
        });
    }
}
