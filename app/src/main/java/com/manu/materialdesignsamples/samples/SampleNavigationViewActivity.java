package com.manu.materialdesignsamples.samples;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
import com.manu.materialdesignsamples.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jzman
 * Powered by 2018/5/31 0019.
 */
public class SampleNavigationViewActivity extends AppCompatActivity implements
        OnNavigationItemSelectedListener{

    @BindView(R.id.navToolbar)
    Toolbar navToolbar;
    @BindView(R.id.navigationView)
    NavigationView navigationView;
    @BindView(R.id.navDrawLayout)
    DrawerLayout navDrawLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_navigation_view);
        ButterKnife.bind(this);

        setSupportActionBar(navToolbar);
        navigationView.setNavigationItemSelectedListener(this);
//        ColorStateList colorStateList = getResources().getColorStateList(R.color.select_color_navigation);
//        navigationView.setItemTextColor(colorStateList);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,navDrawLayout, navToolbar,R.string.strOpen,R.string.strClose);
        navDrawLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu1:
                Toast.makeText(this,"个人中心",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(this,"学习计划",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                Toast.makeText(this,"云文件",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu4:
                Toast.makeText(this,"便签",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu5:
                Toast.makeText(this,"咖啡",Toast.LENGTH_SHORT).show();
                break;

        }
        item.setCheckable(true);
//        navDrawLayout.closeDrawers();
        return true;
    }
}
