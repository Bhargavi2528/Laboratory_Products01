package com.cssolution.labproduct.DashboardModule.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter
{

    List<String> stringList = new ArrayList<>();
    List<Fragment> fragmentList = new ArrayList<>();

    public TabAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }

    public void addfragment(Fragment fragment, String string) {

        fragmentList.add(fragment);
        stringList.add(string);

    }
}
