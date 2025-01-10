package com.example.margorpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.margorpg.Attack.AttackActivity;

import static com.example.margorpg.Resources.LoadHeroInfo;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        LoadHeroInfo(this, new TinyDB(this));
    }

    public void onAttackClick(View view) {
        Intent intent = new Intent(this, AttackActivity.class);
        startActivity(intent);
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
    }

    public void onQuestClick(View view) {
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onBuyClick(View view) {
        Intent intent = new Intent(this, BuyActivity.class);

        switch (view.getId())
        {
            case(R.id.weaponsButton):
                intent.putExtra("buyingName", "Weapons");
                break;

            case(R.id.armorButton):
                intent.putExtra("buyingName", "Armor");
                break;

            case(R.id.helmetsButton):
                intent.putExtra("buyingName", "Helmets");
                break;

            case(R.id.shoesButton):
                intent.putExtra("buyingName", "Shoes");
                break;

            case(R.id.glovesButton):
                intent.putExtra("buyingName", "Gloves");
                break;

            case(R.id.ringsButton):
                intent.putExtra("buyingName", "Rings");
                break;

            case(R.id.necklacesButton):
                intent.putExtra("buyingName", "Necklaces");
                break;

            case(R.id.arrowsButton):
                intent.putExtra("buyingName", "Sec. Weapons");
                break;

            case(R.id.bagsButton):
                intent.putExtra("buyingName", "Potions");
                break;

            default:
                intent.putExtra("buyingName", "Other");
                break;
        }

        startActivity(intent);
    }
}
