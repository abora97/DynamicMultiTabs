package com.example.dynamicmultitabs.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragmentList=new ArrayList<>();
    private final List<String> fragmentTitle=new ArrayList<>();

    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    public void addFrag(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitle.add(title);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
