package edu.ptit.vhlee.tabwithpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    private List<String> mTitle;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mTitle = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return (mFragments != null) ? mFragments.size() : 0;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mTitle.add(title);
    }
}
