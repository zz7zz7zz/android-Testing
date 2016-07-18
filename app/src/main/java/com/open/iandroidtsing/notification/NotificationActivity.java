package com.open.iandroidtsing.notification;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;

import com.open.iandroidtsing.R;

/**
 * Created by Administrator on 2016/7/18.
 */

public class NotificationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        initView();
    }

    private void initView(){
        findViewById(R.id.notification_priority_max).setOnClickListener(clickListener);
        findViewById(R.id.notification_priority_high).setOnClickListener(clickListener);
        findViewById(R.id.notification_priority_default).setOnClickListener(clickListener);
        findViewById(R.id.notification_priority_low).setOnClickListener(clickListener);
        findViewById(R.id.notification_priority_min).setOnClickListener(clickListener);
    }

    static int count = 1;
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            count++;

            switch(v.getId()){
                case R.id.notification_priority_max:
                    NotificationUtil.notifyPriority(getApplicationContext(),count,"A"+count, Notification.PRIORITY_MAX);
                    break;

                case R.id.notification_priority_high:
                    NotificationUtil.notifyPriority(getApplicationContext(),count,"B"+count, Notification.PRIORITY_HIGH);
                    break;

                case R.id.notification_priority_default:
                    NotificationUtil.notifyPriority(getApplicationContext(),count,"C"+count, Notification.PRIORITY_DEFAULT);
                    break;

                case R.id.notification_priority_low:
                    NotificationUtil.notifyPriority(getApplicationContext(),count,"D"+count, Notification.PRIORITY_LOW);
                    break;

                case R.id.notification_priority_min:
                    NotificationUtil.notifyPriority(getApplicationContext(),count,"E"+count, Notification.PRIORITY_MIN);
                    break;
            }
        }
    };

}
