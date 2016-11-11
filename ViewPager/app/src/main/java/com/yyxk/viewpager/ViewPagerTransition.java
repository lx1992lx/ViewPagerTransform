package com.yyxk.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.yyxk.viewpager.adapter.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerTransition extends AppCompatActivity {
    private ViewPager mViewPager;
    private List<ImageView> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_transition);
        mViewPager = (ViewPager) findViewById(R.id.vp);
        mViewPager.setPageTransformer(true, new ViewPagerTransform());
        createImageView();
        PagerAdapter pagerAdapter=new PagerAdapter(mList,this);
        mViewPager.setAdapter(pagerAdapter);
    }

    private void createImageView() {
        mList=new ArrayList<>();
        ImageView imageView1=new ImageView(this);
        imageView1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imageView1.setImageResource(R.drawable.image1);
        mList.add(imageView1);
        ImageView imageView2=new ImageView(this);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imageView2.setImageResource(R.drawable.image2);
        mList.add(imageView2);
    }
}
