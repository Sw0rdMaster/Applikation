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
                Lamp_Info tab1 = new Lamp_Info();
                return tab1;
            case 1:
                Lamp_Video tab2 = new Lamp_Video();
                return tab2;
            case 2:
                Lamp_Link tab3 = new Lamp_Link();
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
