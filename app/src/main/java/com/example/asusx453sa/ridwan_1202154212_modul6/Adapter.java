package com.example.asusx453sa.ridwan_1202154212_modul6;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
/**
 * Created by ASUS X453SA on 4/4/2018.
 */

public class Adapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;

    public Adapter(FragmentManager fragmentManager, int NumOfTabs){
        super(fragmentManager);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PostTerbaruActivity();
            case 1:
                return new potoSayaActivity();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
