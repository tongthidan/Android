package com.example.w701.FragmentCafe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.w701.Fragment.FragmentCafe;
import com.example.w701.Fragment.FragmentHome;
import com.example.w701.Fragment.FragmentNotification;
import com.example.w701.Fragment.FragmentSearch;

public class FragmentCafeAdapter extends FragmentStatePagerAdapter {
    private int numberPage = 3;
    public FragmentCafeAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentMocka();
            case 1: return new FragmentCuli();
            case 2: return new FragmentRobasta();

            default:  return new FragmentMocka();
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
            case 0: return "Mocka";
            case 1: return "Culi";
            case 2: return "Robasta";
            default: return "Mocka";
        }
    }
}
