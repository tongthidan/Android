package com.example.zaloapp.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentBottomAdapter extends FragmentStatePagerAdapter {
    int numberPage = 4;
    public FragmentBottomAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentMessage();
            case 1: return new FragmentContact();
            case 2: return new FragmentHistory();
            case 3: return new FragmentAdd();
            default:  return new FragmentMessage();
        }
    }

    @Override
    public int getCount() {
        return numberPage;
    }
}
