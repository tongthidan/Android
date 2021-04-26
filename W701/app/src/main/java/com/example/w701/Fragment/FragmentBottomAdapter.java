package com.example.w701.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentBottomAdapter extends FragmentStatePagerAdapter {
    private int numberPage = 4;
    public FragmentBottomAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentHome();
            case 1: return new FragmentNotification();
            case 2: return new FragmentSearch();
            case 3: return new FragmentCafe();
            default:  return new FragmentHome();
        }

    }

    @Override
    public int getCount() {
        return numberPage;
    }
}
