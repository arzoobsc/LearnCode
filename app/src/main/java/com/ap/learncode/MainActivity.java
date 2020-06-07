package com.ap.learncode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Items> mExampleList;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createLists();
        buildRecyclerView();

    }

    public void removeItem(int position) {
        mExampleList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }

    public void createLists() {
        mExampleList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            mExampleList.add(new Items(R.drawable.ic_baseline_play_arrow_24, "Line " + i));
        }
        mExampleList.add(new Items(R.drawable.ic_baseline_play_arrow_24, "Line 1"));
        mExampleList.add(new Items(R.drawable.ic_baseline_play_arrow_24, "Line 2"));
        mExampleList.add(new Items(R.drawable.ic_baseline_play_arrow_24, "Line 3"));
    }

    public void buildRecyclerView() {
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Log.i("TAG", "OnItemClick: " + position);

                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "1st Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "2nd Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "3rd Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "4th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "5th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "6th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "7th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "8th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "9th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(MainActivity.this, "10th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(MainActivity.this, "11th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Toast.makeText(MainActivity.this, "12th Item image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onPlayClick(int position) {
                Log.i("TAG", "onPlayClick:  " + position);

                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "1st play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "2nd play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "3rd play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "4th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "5th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "6th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "7th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "8th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "9th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(MainActivity.this, "10th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(MainActivity.this, "11th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Toast.makeText(MainActivity.this, "12th play image->" + position, Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }

            }
        });
    }
}