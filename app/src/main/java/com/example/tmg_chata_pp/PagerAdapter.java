package com.example.tmg_chata_pp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;



    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new chatFragment();

            case 1:
                return new statusFragment();

            case 2:
                return new chatFragment();

            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
