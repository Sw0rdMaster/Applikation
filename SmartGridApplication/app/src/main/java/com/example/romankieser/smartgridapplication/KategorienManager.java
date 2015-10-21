package com.example.romankieser.smartgridapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class KategorienManager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public KategorienManager(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                X_Komfort tab1 = new X_Komfort();
                return tab1;
            case 1:
                X_Energieeffizienz tab2 = new X_Energieeffizienz();
                return tab2;
            case 2:
                X_Security tab3 = new X_Security();
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