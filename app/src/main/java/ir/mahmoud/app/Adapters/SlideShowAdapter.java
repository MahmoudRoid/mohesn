package ir.mahmoud.app.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ir.mahmoud.app.Fragments.SlideFragment;

/**
 * Created by soheilsystem on 5/3/2018.
 */

public class SlideShowAdapter extends FragmentStatePagerAdapter {

    public int[] myImageList ;

    public SlideShowAdapter(FragmentManager fm, int[] myImageList) {
        super(fm);
        this.myImageList = myImageList;
    }

    @Override
    public Fragment getItem(int position) {
        SlideFragment fragment = new SlideFragment();
        fragment.setAsset(myImageList[position]);
        return fragment;
    }

    @Override
    public int getCount() {
        return myImageList.length;
    }
}
