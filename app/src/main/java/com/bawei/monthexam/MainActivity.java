package com.bawei.monthexam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.bawei.monthexam.One_Fragment.Fragment_one;
import com.bawei.monthexam.One_Fragment.Fragment_two;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    List<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return 2;
            }
        });


    }

    private void init() {
        list.add(new Fragment_one());
        list.add(new Fragment_two());
    }
}
