package com.jeevani.tutorialspoint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jeevani on 5/15/2017.
 */

public class FrontActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    ArrayList<String> alName;
    ArrayList<Integer> alImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_activity);

        alName = new ArrayList<>(Arrays.asList("C", "Java", "Android", "SQL", "C", "Java", "Android", "SQL"));
        alImage = new ArrayList<>(Arrays.asList(R.drawable.c_img, R.drawable.java_img, R.drawable.android_img, R.drawable.sql_img, R.drawable.c_img, R.drawable.java_img, R.drawable.android_img, R.drawable.sql_img));

        // Calling the RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // The number of Columns
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new FrontActivityAdapter(FrontActivity.this, alName, alImage);
        mRecyclerView.setAdapter(mAdapter);

    }

}