package com.manu.materialdesignsamples.samples;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.manu.materialdesignsamples.R;
import com.manu.materialdesignsamples.adapter.RecyclerViewAdapter;
import com.manu.materialdesignsamples.utils.DataUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jzman
 * Powered by 2018/5/28 0019.
 */
public class SampleCollapsingToolbarLayoutActivity extends AppCompatActivity {

    @BindView(R.id.rvCollapsing)
    RecyclerView rvCollapsing;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ctlCollapsingLayout)
    CollapsingToolbarLayout ctlCollapsingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_collapsing_toolbar_layout);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        //CollapsingToolbarLayout
        ctlCollapsingLayout.setTitle("CollapsingToolbarLayout");
        ctlCollapsingLayout.setExpandedTitleColor(Color.parseColor("#ffffff"));
        ctlCollapsingLayout.setCollapsedTitleTextColor(Color.parseColor("#46eada"));
//        ctlCollapsingLayout.setContentScrim(getResources().getDrawable(R.drawable.ic_launcher_background));
//        ctlCollapsingLayout.setContentScrimColor(Color.BLUE);
//        ctlCollapsingLayout.setContentScrimResource(R.color.colorAccent);

//        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) ctlCollapsingLayout.getLayoutParams();
//        layoutParams.setCollapseMode(CollapsingToolbarLayout.LayoutParams.COLLAPSE_MODE_PIN);


        //RecyclerView初始化
        rvCollapsing.setLayoutManager(new LinearLayoutManager(this));
        rvCollapsing.setAdapter(new RecyclerViewAdapter(this, DataUtil.getData()));
    }
}
