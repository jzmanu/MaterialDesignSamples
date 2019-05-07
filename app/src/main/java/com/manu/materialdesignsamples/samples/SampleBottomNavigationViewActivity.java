package com.manu.materialdesignsamples.samples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.manu.materialdesignsamples.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * BottomNavigationView
 *
 * @author: jzman
 * @time: 2019/5/7 0007 10:18
 */
public class SampleBottomNavigationViewActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage)
    TextView tvMessage;
    @BindView(R.id.navigation)
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_bottom_navigation_view);
        ButterKnife.bind(this);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        tvMessage.setText(R.string.title_home);
                        return true;
                    case R.id.navigation_dashboard:
                        tvMessage.setText(R.string.title_dashboard);
                        return true;
                    case R.id.navigation_notifications:
                        tvMessage.setText(R.string.title_notifications);
                        return true;
                    case R.id.navigation_note:
                        tvMessage.setText(R.string.title_note);
                        return true;
                    case R.id.navigation_mine:
                        tvMessage.setText(R.string.title_mine);
                        return true;
                }
                return false;
            }
        });
    }
}
