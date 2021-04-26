package com.example.w701;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.w701.Fragment.FragmentBottomAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    BottomNavigationView navigation;
    FragmentBottomAdapter adapter;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        navigation = findViewById(R.id.navigation);
        adapter = new FragmentBottomAdapter(getSupportFragmentManager(),
                FragmentBottomAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        fab = findViewById(R.id.fab);
        navigation.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mHome:viewPager.setCurrentItem(0);
                    break;
                    case R.id.mNoti:viewPager.setCurrentItem(1);
                    break;
                    case R.id.mSearch:viewPager.setCurrentItem(2);
                    break;
                    case R.id.mCafe:viewPager.setCurrentItem(3);
                    break;

                }
            }
        });
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0: navigation.getMenu().findItem(R.id.mHome).setChecked(true);
                    break;
                    case 1: navigation.getMenu().findItem(R.id.mNoti).setChecked(false);
                        break;
                    case 2: navigation.getMenu().findItem(R.id.mSearch).setChecked(false);
                        break;
                    case 3: navigation.getMenu().findItem(R.id.mCafe).setChecked(false);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}