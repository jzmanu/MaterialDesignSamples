package com.manu.materialdesignsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.manu.materialdesignsamples.samples.SampleCollapsingToolbarLayoutActivity;
import com.manu.materialdesignsamples.samples.SampleCoordinatorAppBarActivity;
import com.manu.materialdesignsamples.samples.SampleCoordinatorFloatActivity;
import com.manu.materialdesignsamples.samples.SampleNavigationViewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnCoordinatorLayout)
    Button btnCoordinatorLayout;
    @BindView(R.id.btnAppBar)
    Button btnAppBar;
    @BindView(R.id.btnCollapsingToolbarLayout)
    Button btnCollapsingToolbarLayout;
    @BindView(R.id.btnNavigationView)
    Button btnNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnCoordinatorLayout, R.id.btnAppBar, R.id.btnCollapsingToolbarLayout,R.id.btnNavigationView})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnCoordinatorLayout:
                goToActivity(SampleCoordinatorFloatActivity.class);
                break;
            case R.id.btnAppBar:
                goToActivity(SampleCoordinatorAppBarActivity.class);
                break;
            case R.id.btnCollapsingToolbarLayout:
                goToActivity(SampleCollapsingToolbarLayoutActivity.class);
                break;
            case R.id.btnNavigationView:
                goToActivity(SampleNavigationViewActivity.class);
                break;
        }
    }

    private void goToActivity(Class<?> class1) {
        startActivity(new Intent(this, class1));
    }

}
