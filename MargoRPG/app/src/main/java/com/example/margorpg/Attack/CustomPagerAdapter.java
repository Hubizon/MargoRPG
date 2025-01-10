package com.example.margorpg.Attack;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.margorpg.Attack.CommonFragment;
import com.example.margorpg.Attack.EliteFragment;
import com.example.margorpg.Attack.EliteIIFragment;
import com.example.margorpg.Attack.TytansFragment;

public class CustomPagerAdapter extends FragmentPagerAdapter {


    public CustomPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        //this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return EliteFragment.newInstance();
            case 2:
                return EliteIIFragment.newInstance();
            case 3:
                return TytansFragment.newInstance();
            default:
                return CommonFragment.newInstance();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 1:
                return "Elite";
            case 2:
                return "Elite II";
            case 3:
                return "Tytans";
            default:
                return "Common";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
