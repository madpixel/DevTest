package com.devtest.redknee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.testfairy.TestFairy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestFairy.begin(this, "40c6f96d105b5f7b6f19e2232cf5377c67dba927");
    }
}
