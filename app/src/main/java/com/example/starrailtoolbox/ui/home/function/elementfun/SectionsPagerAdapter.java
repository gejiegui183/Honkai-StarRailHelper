package com.example.starrailtoolbox.ui.home.function.elementfun;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.starrailtoolbox.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_element_1,
            R.string.tab_element_2,
            R.string.tab_element_3,
            R.string.tab_element_4,
            R.string.tab_element_5,
            R.string.tab_element_6,
            R.string.tab_element_7,
            R.string.tab_element_8,
    };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return Element1St.newInstance();
            case 1:
                return Element2nd.newInstance();
            case 2:
                return Element3rd.newInstance();
            case 3:
                return Element4th.newInstance();
            case 4:
                return Element5th.newInstance();
            case 5:
                return Element6th.newInstance();
            case 6:
                return Element7th.newInstance();
            case 7:
                return Element8th.newInstance();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 8;
    }
}