package com.example.gittestingandpracticing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testingBranchCreated();
    }

    /**
     * method created just for branch testing and removing from commit
     */
    private void testingBranchCreated() {

    }
}
