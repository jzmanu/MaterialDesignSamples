package com.manu.materialdesignsamples.samples;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.manu.materialdesignsamples.R;
import com.manu.materialdesignsamples.adapter.RecyclerViewAdapter;
import com.manu.materialdesignsamples.utils.DataUtil;
/**
 * Created by jzman
 * Powered by 2018/5/19 0019.
 */
public class SampleCoordinatorFloatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        RecyclerView rvData = findViewById(R.id.rvData);
        rvData.setLayoutManager(new LinearLayoutManager(this));
        rvData.setAdapter(new RecyclerViewAdapter(this, DataUtil.getData()));

        FloatingActionButton fab = findViewById(R.id.fab);
        //设置fab背景
//        fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));
        //设置fab图标
//        fab.setImageDrawable(getResources().getDrawable(R.drawable.fab));
//        fab.setImageResource(R.drawable.fab);
        //设置fab大小
//        fab.setSize(FloatingActionButton.SIZE_MINI);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"我是Snackbar...",Snackbar.LENGTH_SHORT)
                        .setAction("取消", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(SampleCoordinatorFloatActivity.this, "取消", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });

    }

}
