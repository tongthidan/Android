package com.example.w6_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.w6_01.Fragment.FragmentTabAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
   private  TabLayout tab;
   private ViewPager viewPager;
   private FragmentTabAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);
        adapter = new FragmentTabAdapter(getSupportFragmentManager(),FragmentTabAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new HorizontalFlipTransformation());

        tab.setupWithViewPager(viewPager);
        tab.getTabAt(0).setIcon(R.drawable.ic_launcher_background);


    }
}