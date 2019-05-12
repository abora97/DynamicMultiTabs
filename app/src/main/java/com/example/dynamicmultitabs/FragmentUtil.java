package com.example.dynamicmultitabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class FragmentUtil {
    public static void swithchFragmentWithBack(int fragmentContainr, Fragment fragment, FragmentActivity activity) {
        FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(fragmentContainr, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public static void swithchFragment(int fragmentContainr, Fragment fragment, FragmentActivity activity) {
        FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(fragmentContainr, fragment);
        transaction.commit();
    }

    public static void swithchFragmentWithBundle(int fragmentContainr, Fragment fragment, Bundle bundle, FragmentActivity activity) {
        FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(fragmentContainr, fragment);
        fragment.setArguments(bundle);
        transaction.commit();
    }

}
