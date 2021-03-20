package com.example.project1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class TabLayoutAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> fragments;

    public TabLayoutAdapter(Fragment fragment) {

        super(fragment);
        fragments = new ArrayList<>();

        fragments.add(new Calculator_Fragment());
        fragments.add(new Tip_Fragment());

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) { return fragments.get(position); }

    @Override
    public int getItemCount() { return fragments.size(); }

}