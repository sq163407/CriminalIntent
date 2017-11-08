package com.knight.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Qi on 2017/11/4.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
