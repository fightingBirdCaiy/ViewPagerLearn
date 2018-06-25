package com.caiy.learn.viewpager;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    private void initData(){
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            datas.add("字符串" + i);
        }
        mViewPager.setAdapter(new MyAdapter(this,datas));
    }
}
