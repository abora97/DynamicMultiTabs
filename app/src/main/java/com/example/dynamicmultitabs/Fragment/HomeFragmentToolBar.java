package com.example.dynamicmultitabs.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dynamicmultitabs.Adapter.HomeFragmentPagerAdapter;
import com.example.dynamicmultitabs.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragmentToolBar extends Fragment {


    TabLayout htabTabs;
    ViewPager htabViewpager;
    int mParam1;
    Unbinder unbinder;

    public HomeFragmentToolBar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment_tool_bar, container, false);
        unbinder = ButterKnife.bind(this, view);
        htabTabs = view.findViewById(R.id.htab_tabs);
        htabViewpager = view.findViewById(R.id.htab_viewpager);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        setUpUi();
        setTabs();
        return view;
    }

    private void setUpUi() {
        htabTabs.setupWithViewPager(htabViewpager);
        htabTabs.setTabMode(TabLayout.MODE_FIXED);
        htabTabs.setTabGravity(TabLayout.GRAVITY_FILL);
        htabTabs
                .setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {

                        htabViewpager.setCurrentItem(tab.getPosition());

                        switch (tab.getPosition()) {
                            case 0:

                                break;
                            case 1:


                                break;
                            case 2:


                                break;
                        }
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
    }

    private void setTabs() {
        if (getArguments() != null) {
            mParam1 = getArguments().getInt("Tabs_Num");
        }
        //add new paranch fragment
        List<String> dummy = new ArrayList<>();

        for (int i = 1; i <= mParam1; i++) {
            dummy.add("title " + i);
        }

        HomeFragmentPagerAdapter homeFragmentPagerAdapter = new HomeFragmentPagerAdapter(getActivity().getSupportFragmentManager());

        for (int i = 0; i < dummy.size(); i++) {
            homeFragmentPagerAdapter.addFrag(new HomeFragment(dummy, i), dummy.get(i));
        }
        htabViewpager.setAdapter(homeFragmentPagerAdapter);

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}