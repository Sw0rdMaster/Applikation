package com.example.romankieser.smartgridapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Roman Kieser on 21.10.2015.
 */
public class LampManager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public LampManager(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Info_Tab_Info tab1 = new Info_Tab_Info();
                return tab1;
            case 1:
                Info_Tab_Videos tab2 = new Info_Tab_Videos();
                return tab2;
            case 2:
                Info_Tab_Links tab3 = new Info_Tab_Links();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
