package com.oktavianyudha.recycleview_tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.oktavianyudha.recycleview_tugas.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<Integer> mHeader = new ArrayList<Integer>();
    private ArrayList<Integer> mFooter = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initJob();
    }

    private void initJob(){
        for (int i = 0; i < 50; i++) {
            mImages.add(String.valueOf(R.id.image1));
            mHeader.add(R.id.firstLine);
            mFooter.add(R.id.secondLine);
        }
        initRecyclerview();
    }

     private void initRecyclerview(){
        RecyclerView rv = (RecyclerView) findViewById(R.id.my_recycler_view);
        MyAdapter adapter = new MyAdapter(this, mImages,mHeader,mFooter);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager layoutManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//
//        recyclerView.setHasFixedSize(true);
//
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        List<String> input = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            input.add("Wallpaper" + i);
//
//            mAdapter = new MyAdapter(input);
//            recyclerView.setAdapter(mAdapter);
//        }
//    }
}