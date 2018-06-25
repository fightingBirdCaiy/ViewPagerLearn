package com.caiy.learn.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caiyong on 2018/6/25.
 */

public class MyAdapter extends PagerAdapter {

    private Context mContext;
    private List<String> mDatas = new ArrayList<>();

    public MyAdapter(Context context,List<String> datas){
        mContext = context;
        mDatas.clear();
        if(datas != null && datas.size() > 0) {
            mDatas.addAll(datas);
        }
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setText(mDatas.get(position));
        container.addView(textView,new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        return textView;
    }
}