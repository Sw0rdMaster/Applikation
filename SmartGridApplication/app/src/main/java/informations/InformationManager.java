package informations;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import informations.Info_Tab_Info;
import informations.Info_Tab_Links;
import informations.Info_Tab_Videos;

/**
 * Created by Roman Kieser on 21.10.2015.
 */
public class InformationManager extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    String object;

    public InformationManager(FragmentManager fm, int NumOfTabs, String whichObject) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        object = whichObject;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("object", object);

        switch (position) {
            case 0:
                Info_Tab_Info tab1 = new Info_Tab_Info();
                tab1.setArguments(bundle);
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
