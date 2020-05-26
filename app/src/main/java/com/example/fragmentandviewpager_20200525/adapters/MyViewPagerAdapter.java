package com.example.fragmentandviewpager_20200525.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragmentandviewpager_20200525.fragments.FirstFragment;
import com.example.fragmentandviewpager_20200525.fragments.SecondFragment;
import com.example.fragmentandviewpager_20200525.fragments.ThirdFragment;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "첫번째 페이지";
        }
        else if (position == 1) {
            return "두번째 페이지";
        }
        else {
            return "세번째 페이지";
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstFragment();
        }
        else if (position == 1){
            return new SecondFragment();
        }
        else {
            return new ThirdFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
