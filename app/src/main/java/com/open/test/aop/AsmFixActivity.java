package com.open.test.aop;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.widget.Toast;

import com.open.test.R;

public class AsmFixActivity extends Activity {

    private String TAG = "AsmFixActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.net_okhttp);

        System.out.println("onCreate 0 --I am from System.out.println");
        android.util.Log.v(TAG,"onCreate 1 --I am from android.util.Log");

        Toast.makeText(this,"我是错误的代码",Toast.LENGTH_LONG).show();

        android.util.Log.v(TAG,"onCreate 2 --I am from android.util.Log");

        //修复空指针问题

        System.out.println("Success1 "+FixNullException.isSuccessNew("yes"));
        System.out.println("Success2 "+FixNullException.isSuccess("yes"));

        System.out.println("Error1 "+FixNullException.isSuccessNew(null));
        System.out.println("Error2 "+FixNullException.isSuccess(null));
    }


}
