package com.example.margorpg.Attack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.margorpg.EqActivity;
import com.example.margorpg.MainActivity;
import com.example.margorpg.R;
import com.example.margorpg.ShopActivity;
import com.example.margorpg.TinyDB;

import static com.example.margorpg.Resources.LoadHeroInfo;

public class AttackActivity extends AppCompatActivity implements EliteFragment.OnFragmentInteractionListener, CommonFragment.OnFragmentInteractionListener,
        EliteIIFragment.OnFragmentInteractionListener, TytansFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attack);

        LoadHeroInfo(this, new TinyDB(this));

        ViewPager vpPager = (ViewPager) findViewById(R.id.pager);
        CustomPagerAdapter adapterViewPager = new CustomPagerAdapter(getSupportFragmentManager(), this);
        vpPager.setAdapter(adapterViewPager);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onAttackClick(View view) {
    }

    public void onEqClick(View view) {
        Intent intent = new Intent(this, EqActivity.class);
        startActivity(intent);
    }

    public void onPersonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onShopClick(View view) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }

    public void onQuestClick(View view) {
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
