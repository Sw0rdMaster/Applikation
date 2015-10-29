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
                Tab_Komfort tab1 = new Tab_Komfort();
                return tab1;
            case 1:
                Tab_EnergieEffizienz tab2 = new Tab_EnergieEffizienz();
                return tab2;
            case 2:
                Tab_Sicherheit tab3 = new Tab_Sicherheit();
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