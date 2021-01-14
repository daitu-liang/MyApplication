package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    int pageIndex = 0;
    private LinearLayout llContainer;
    private TextView tvdes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testGit();



        llContainer=(LinearLayout)findViewById(R.id.ll_container);
        View view= LayoutInflater.from(this).inflate(R.layout.item_test,llContainer,false);
        llContainer.addView(view);

        tvdes=(TextView)findViewById(R.id.tv_des);
        tvdes.setText("5555咔咔咔咔咔咔扩扩扩扩扩扩扩扩扩扩扩555555");
        tvdes.setText("44444444444qwwqwq:www");
        ////////////

        //dddddddd
///dddoooooooooooooo
       // cc
        ((Button) findViewById(R.id.btn1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pageIndex > 3) {
                    pageIndex-=3;
                    rv.smoothScrollToPosition(pageIndex);
                }

            }
        });
        ((Button) findViewById(R.id.btn2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pageIndex < 30) {
                    pageIndex+=3;
                    rv.smoothScrollToPosition(pageIndex);
                }
            }
        });
    }

    private void testGit() {

        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rv.setLayoutManager(linearLayoutManager);

        ListAdapter listAdapter = new ListAdapter(this, getList());
        rv.setAdapter(listAdapter);


    }

    private List<String> getList() {
        List<String> mlist = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mlist.add("item-" + i);
        }
        return mlist;
    }
}
