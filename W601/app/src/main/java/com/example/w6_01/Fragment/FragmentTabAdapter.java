package com.example.w6_01.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentTabAdapter extends FragmentStatePagerAdapter {
    //behavior : so trang
    private  int numberPage = 3;
    public FragmentTabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return  new HomeFragment();
            case 1: return new FoodFragment();
            case 2: return new CafeFragment();
            default: return  new HomeFragment();

        }

    }

    @Override
    public int getCount() {
        return numberPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Home";
            case 1: return "Food";
            case 2: return "Cafe";
            default: return "Home";

        }
    }
}
