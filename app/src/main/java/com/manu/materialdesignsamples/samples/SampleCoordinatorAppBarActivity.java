package com.manu.materialdesignsamples.samples;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.manu.materialdesignsamples.R;
import com.manu.materialdesignsamples.adapter.RecyclerViewAdapter;
import com.manu.materialdesignsamples.utils.DataUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SampleCoordinatorAppBarActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rvAppBarData)
    RecyclerView rvAppBarData;
    @BindView(R.id.ablBar)
    AppBarLayout ablBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_coordinator_app_bar);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        AppBarLayout.LayoutParams params = (AppBarLayout.LayoutParams) ablBar
                .getChildAt(0).getLayoutParams();
        //上滑时先隐藏AppBarLayout,然后再开始滚动，下滑时直到滚动视图的顶部出现AppBarLayout才开始显示
//        params.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL);
        //上滑时先隐藏AppBarLayout,然后再开始滚动，下滑时先显示AppBarLayout，然后再开始滚动
//        params.setScrollFlags(
//                AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS);
        //上滑时先隐藏AppBarLayout,然后再开始滚动，
        //下滑时AppBarLayout先显示最小高度，然后直到滚动视图的顶部出现AppBarLayout全部显示
//        toolbar.setMinimumHeight(30);
//        params.setScrollFlags(
//                AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED
//        );
        ////上滑时先隐藏AppBarLayout至最小高度,然后再开始滚动，下滑时直到滚动视图的顶部出现AppBarLayout才开始显示
//        toolbar.setMinimumHeight(30);
//        params.setScrollFlags(
//                AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED
//        );

//        toolbar.setMinimumHeight(30);
//        params.setScrollFlags(
//                AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED |
//                        AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED
//        );


        rvAppBarData.setNestedScrollingEnabled(false);
        rvAppBarData.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, DataUtil.getData());
        rvAppBarData.setAdapter(adapter);
    }
}
