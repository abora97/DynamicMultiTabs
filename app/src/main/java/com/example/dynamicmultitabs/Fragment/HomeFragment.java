package com.example.dynamicmultitabs.Fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.example.dynamicmultitabs.Adapter.HomeFragmentAdapter;
import com.example.dynamicmultitabs.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    Unbinder unbinder;

    @BindView(R.id.swpipe1_layout)
    SwipeRefreshLayout swpipe1Layout;
    @BindView(R.id.pbHeaderProgress)
    ProgressBar pbHeaderProgress;
    @BindView(R.id.home_fragment)
    FrameLayout homeFragment;

    int index;
    List<String> data;
    List<String> dummy;

    RecyclerView recFrag;

    @SuppressLint("ValidFragment")
    public HomeFragment(List<String> data, int index) {
        this.data = data;
        this.index = index;

    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);

        recFrag = view.findViewById(R.id.rec_home_frag);

        recFrag.setHasFixedSize(true);
        recFrag.setLayoutManager(new GridLayoutManager(getContext(), 2));


        dummy = new ArrayList<>();
        dummy.add("dsds");
        dummy.add("sdsdsds");
        dummy.add("adaass");
        dummy.add("dsds");
        dummy.add("sdsdsds");
        dummy.add("adaass");
        dummy.add("dsds");
        dummy.add("sdsdsds");
        dummy.add("adaass");
        getData();

        return view;

    }

    private void getData() {


        HomeFragmentAdapter homeFragmentAdapter = new HomeFragmentAdapter(dummy, getActivity());
        recFrag.setAdapter(homeFragmentAdapter);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}