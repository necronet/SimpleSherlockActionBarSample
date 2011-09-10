package com.test.sherlock;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SherlockSimpleActivity extends FragmentActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sample);
    }
}