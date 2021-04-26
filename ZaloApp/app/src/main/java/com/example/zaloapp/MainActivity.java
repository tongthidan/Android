package com.example.zaloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.zaloapp.Fragment.FragmentBottomAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    BottomNavigationView navigation;
    FragmentBottomAdapter adapter;
    Toolbar optionMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionMenu  = findViewById(R.id.toolbar);
        setSupportActionBar(optionMenu);
        viewPager = findViewById(R.id.viewPager);
        navigation = findViewById(R.id.navigation);
        adapter = new FragmentBottomAdapter(getSupportFragmentManager(),
                FragmentBottomAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        navigation.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mMessage:viewPager.setCurrentItem(0);
                    break;
                    case R.id.mContact:viewPager.setCurrentItem(1);
                    break;
                    case R.id.mHistory:viewPager.setCurrentItem(2);
                    break;
                    case R.id.mAdd:viewPager.setCurrentItem(3);
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
                    case 0: navigation.getMenu().findItem(R.id.mMessage).setChecked(true);
                    break;
                    case 1: navigation.getMenu().findItem(R.id.mContact).setChecked(true);
                        break;
                    case 2: navigation.getMenu().findItem(R.id.mHistory).setChecked(true);
                        break;
                    case 3: navigation.getMenu().findItem(R.id.mAdd).setChecked(true);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menuoption,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.group :
                break;
            case R.id.friend :
                break;
            case R.id.history :
                break;
            case R.id.calendar :
                break;
            case R.id.file :
                break;
            case R.id.video_call :
                break;

            default:
                break;
        }
        return true;
    }
}