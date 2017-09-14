package com.bonovo.singletonedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //TestSingleton ts1 = TestSingleton.getTestSingleTonInstance();
        TestSingleton ts1 = new TestSingleton();
        ts1.setName("jason");
       //TestSingleton ts2 = TestSingleton.getTestSingleTonInstance();
        TestSingleton ts2 = new TestSingleton();
        ts2.setName("1234");

        //当为不同的对象的时候，得出的结果就会不一样

        Log.d(TAG, "onCreate: ---ts1 = "+ts1.toString());
        Log.d(TAG, "onCreate: ---ts2 = "+ts2.toString());

        //单例的作用就是保证调用的对象时同一个对象，而且两个调用的结果都一样，不存在二义性
        if (ts1 == ts2){
            Log.d(TAG, "onCreate: ts1 = ts2");
        }else {
            Log.d(TAG, "onCreate: ts1 != ts2");
        }
    }
}
