package objects;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import objects.Tab_EnergieEffizienz;
import objects.Tab_Komfort;
import objects.Tab_Sicherheit;

public class CategoryManager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public CategoryManager(FragmentManager fm, int NumOfTabs) {
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