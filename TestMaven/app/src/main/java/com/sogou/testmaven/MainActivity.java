package com.sogou.testmaven;

import android.app.Activity;
import android.os.Bundle;

import com.sogou.mylibrary.Test;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test.showMsg();
    }
}
