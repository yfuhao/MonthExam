package com.bawei.monthexam.Handler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import com.bawei.monthexam.R;

public class TwoActiviy extends Activity {

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    break;
                case 1:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_activiy);

        TextView tv = (TextView) findViewById(R.id.two_tv);

        handler.sendEmptyMessage(1);
        handler.sendEmptyMessageDelayed(1, 2000);
    }
}
