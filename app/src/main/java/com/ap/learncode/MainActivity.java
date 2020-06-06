package com.ap.learncode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> items = new ArrayList<>();
        items.add(new Items(R.drawable.ic_baseline_play_arrow_24, "TextView"));
        items.add(new Items(R.drawable.ic_baseline_play_arrow_24, "Button"));
        items.add(new Items(R.drawable.ic_baseline_play_arrow_24, "EditText"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(items);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Log.i("TAG", "OnItemClick: out : "+position);
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "1st position : " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "2nd position : " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "3rd position : " + position, Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "position : " + position, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


    }
}