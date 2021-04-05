package com.example.baikt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.baikt.Model.Cat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rev;// lay tu layout
    private  RecycleViewAdapter adapter; // adapter vua xay dung

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rev = findViewById(R.id.rev);
        GridLayoutManager layout = new GridLayoutManager(this,3);
        adapter = new RecycleViewAdapter(this);
        rev.setLayoutManager(layout);
        adapter.setData(getAll());
        rev.setAdapter(adapter);
    }
    private List<Cat> getAll(){
        List<Cat> list = new ArrayList<>();
        list.add(new Cat(R.drawable.img2,"Cat 1"));
        list.add(new Cat(R.drawable.img_1,"Cat 2"));
        list.add(new Cat(R.drawable.img2,"Cat 3"));
        list.add(new Cat(R.drawable.img2,"Cat 4"));
        list.add(new Cat(R.drawable.img2,"Cat 5"));
        return list;
    }

}