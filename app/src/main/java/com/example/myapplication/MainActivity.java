package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testGit();

    }

    private void testGit() {

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        ///1111111111
        ///2222222222
        //33333333333
        //44444
        //555
        //666

    }
}