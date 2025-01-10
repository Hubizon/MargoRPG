package com.example.margorpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.margorpg.Attack.AttackActivity;

import java.util.ArrayList;

import static com.example.margorpg.MainActivity.CalculateStats;
import static com.example.margorpg.Resources.DefaultArmor;
import static com.example.margorpg.Resources.DefaultClass;
import static com.example.margorpg.Resources.DefaultGloves;
import static com.example.margorpg.Resources.DefaultHelmet;
import static com.example.margorpg.Resources.DefaultHp;
import static com.example.margorpg.Resources.DefaultLvl;
import static com.example.margorpg.Resources.DefaultMaxHp;
import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.DefaultNecklace;
import static com.example.margorpg.Resources.DefaultRing;
import static com.example.margorpg.Resources.DefaultSecWeapon;
import static com.example.margorpg.Resources.DefaultShoes;
import static com.example.margorpg.Resources.DefaultTwoHandedWeapon;
import static com.example.margorpg.Resources.DefaultWeapon;
import static com.example.margorpg.Resources.GetItemStats;
import static com.example.margorpg.Resources.LoadHeroInfo;
import static com.example.margorpg.Resources.SavedArmor;
import static com.example.margorpg.Resources.SavedEq;
import static com.example.margorpg.Resources.SavedGloves;
import static com.example.margorpg.Resources.SavedHelmet;
import static com.example.margorpg.Resources.SavedHp;
import static com.example.margorpg.Resources.SavedMaxHp;
import static com.example.margorpg.Resources.SavedNecklace;
import static com.example.margorpg.Resources.SavedRing;
import static com.example.margorpg.Resources.SavedSecWeapon;
import static com.example.margorpg.Resources.SavedShoes;
import static com.example.margorpg.Resources.SavedTwoHandedWeapon;
import static com.example.margorpg.Resources.SavedWeapon;
import static com.example.margorpg.Resources.b;
import static com.example.margorpg.Resources.h;
import static com.example.margorpg.Resources.m;
import static com.example.margorpg.Resources.p;
import static com.example.margorpg.Resources.t;
import static com.example.margorpg.Resources.w;

public class EqActivity extends AppCompatActivity {

    TinyDB tinydb;
    private ArrayList<Item> eq;
    private int itemInUse;
    private int idInUse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eq);

        tinydb = new TinyDB(this);

        LoadHeroInfo(this, tinydb);

        eq = tinydb.getListObject("eq", Item.class);

        switch (eq.size())
        {
            case 70:
                ((ImageView)findViewById(R.id.eq710)).setImageDrawable(getDrawable(eq.get(62).getImg()));
                setRarityBorder(eq.get(62).getRarity(), ((ImageView)findViewById(R.id.eq710)));
            case 69:
                ((ImageView)findViewById(R.id.eq610)).setImageDrawable(getDrawable(eq.get(61).getImg()));
                setRarityBorder(eq.get(61).getRarity(), ((ImageView)findViewById(R.id.eq610)));
            case 68:
                ((ImageView)findViewById(R.id.eq510)).setImageDrawable(getDrawable(eq.get(60).getImg()));
                setRarityBorder(eq.get(60).getRarity(), ((ImageView)findViewById(R.id.eq510)));
            case 67:
                ((ImageView)findViewById(R.id.eq410)).setImageDrawable(getDrawable(eq.get(59).getImg()));
                setRarityBorder(eq.get(59).getRarity(), ((ImageView)findViewById(R.id.eq410)));
            case 66:
                ((ImageView)findViewById(R.id.eq310)).setImageDrawable(getDrawable(eq.get(58).getImg()));
                setRarityBorder(eq.get(58).getRarity(), ((ImageView)findViewById(R.id.eq310)));
            case 65:
                ((ImageView)findViewById(R.id.eq210)).setImageDrawable(getDrawable(eq.get(57).getImg()));
                setRarityBorder(eq.get(57).getRarity(), ((ImageView)findViewById(R.id.eq210)));
            case 64:
                ((ImageView)findViewById(R.id.eq110)).setImageDrawable(getDrawable(eq.get(56).getImg()));
                setRarityBorder(eq.get(56).getRarity(), ((ImageView)findViewById(R.id.eq110)));
            case 63:
                ((ImageView)findViewById(R.id.eq79)).setImageDrawable(getDrawable(eq.get(62).getImg()));
                setRarityBorder(eq.get(62).getRarity(), ((ImageView)findViewById(R.id.eq79)));
            case 62:
                ((ImageView)findViewById(R.id.eq69)).setImageDrawable(getDrawable(eq.get(61).getImg()));
                setRarityBorder(eq.get(61).getRarity(), ((ImageView)findViewById(R.id.eq69)));
            case 61:
                ((ImageView)findViewById(R.id.eq59)).setImageDrawable(getDrawable(eq.get(60).getImg()));
                setRarityBorder(eq.get(60).getRarity(), ((ImageView)findViewById(R.id.eq59)));
            case 60:
                ((ImageView)findViewById(R.id.eq49)).setImageDrawable(getDrawable(eq.get(59).getImg()));
                setRarityBorder(eq.get(59).getRarity(), ((ImageView)findViewById(R.id.eq49)));
            case 59:
                ((ImageView)findViewById(R.id.eq39)).setImageDrawable(getDrawable(eq.get(58).getImg()));
                setRarityBorder(eq.get(58).getRarity(), ((ImageView)findViewById(R.id.eq39)));
            case 58:
                ((ImageView)findViewById(R.id.eq29)).setImageDrawable(getDrawable(eq.get(57).getImg()));
                setRarityBorder(eq.get(57).getRarity(), ((ImageView)findViewById(R.id.eq29)));
            case 57:
                ((ImageView)findViewById(R.id.eq19)).setImageDrawable(getDrawable(eq.get(56).getImg()));
                setRarityBorder(eq.get(56).getRarity(), ((ImageView)findViewById(R.id.eq19)));
            case 56:
                ((ImageView)findViewById(R.id.eq78)).setImageDrawable(getDrawable(eq.get(55).getImg()));
                setRarityBorder(eq.get(55).getRarity(), ((ImageView)findViewById(R.id.eq78)));
            case 55:
                ((ImageView)findViewById(R.id.eq68)).setImageDrawable(getDrawable(eq.get(54).getImg()));
                setRarityBorder(eq.get(54).getRarity(), ((ImageView)findViewById(R.id.eq68)));
            case 54:
                ((ImageView)findViewById(R.id.eq58)).setImageDrawable(getDrawable(eq.get(53).getImg()));
                setRarityBorder(eq.get(53).getRarity(), ((ImageView)findViewById(R.id.eq58)));
            case 53:
                ((ImageView)findViewById(R.id.eq48)).setImageDrawable(getDrawable(eq.get(52).getImg()));
                setRarityBorder(eq.get(52).getRarity(), ((ImageView)findViewById(R.id.eq48)));
            case 52:
                ((ImageView)findViewById(R.id.eq38)).setImageDrawable(getDrawable(eq.get(51).getImg()));
                setRarityBorder(eq.get(51).getRarity(), ((ImageView)findViewById(R.id.eq38)));
            case 51:
                ((ImageView)findViewById(R.id.eq28)).setImageDrawable(getDrawable(eq.get(50).getImg()));
                setRarityBorder(eq.get(50).getRarity(), ((ImageView)findViewById(R.id.eq28)));
            case 50:
                ((ImageView)findViewById(R.id.eq18)).setImageDrawable(getDrawable(eq.get(49).getImg()));
                setRarityBorder(eq.get(49).getRarity(), ((ImageView)findViewById(R.id.eq18)));
            case 49:
                ((ImageView)findViewById(R.id.eq77)).setImageDrawable(getDrawable(eq.get(48).getImg()));
                setRarityBorder(eq.get(48).getRarity(), ((ImageView)findViewById(R.id.eq77)));
            case 48:
                ((ImageView)findViewById(R.id.eq67)).setImageDrawable(getDrawable(eq.get(47).getImg()));
                setRarityBorder(eq.get(47).getRarity(), ((ImageView)findViewById(R.id.eq67)));
            case 47:
                ((ImageView)findViewById(R.id.eq57)).setImageDrawable(getDrawable(eq.get(46).getImg()));
                setRarityBorder(eq.get(46).getRarity(), ((ImageView)findViewById(R.id.eq57)));
            case 46:
                ((ImageView)findViewById(R.id.eq47)).setImageDrawable(getDrawable(eq.get(45).getImg()));
                setRarityBorder(eq.get(45).getRarity(), ((ImageView)findViewById(R.id.eq47)));
            case 45:
                ((ImageView)findViewById(R.id.eq37)).setImageDrawable(getDrawable(eq.get(44).getImg()));
                setRarityBorder(eq.get(44).getRarity(), ((ImageView)findViewById(R.id.eq37)));
            case 44:
                ((ImageView)findViewById(R.id.eq27)).setImageDrawable(getDrawable(eq.get(43).getImg()));
                setRarityBorder(eq.get(43).getRarity(), ((ImageView)findViewById(R.id.eq27)));
            case 43:
                ((ImageView)findViewById(R.id.eq17)).setImageDrawable(getDrawable(eq.get(42).getImg()));
                setRarityBorder(eq.get(42).getRarity(), ((ImageView)findViewById(R.id.eq17)));
            case 42:
                ((ImageView)findViewById(R.id.eq76)).setImageDrawable(getDrawable(eq.get(41).getImg()));
                setRarityBorder(eq.get(41).getRarity(), ((ImageView)findViewById(R.id.eq76)));
            case 41:
                ((ImageView)findViewById(R.id.eq66)).setImageDrawable(getDrawable(eq.get(40).getImg()));
                setRarityBorder(eq.get(40).getRarity(), ((ImageView)findViewById(R.id.eq66)));
            case 40:
                ((ImageView)findViewById(R.id.eq56)).setImageDrawable(getDrawable(eq.get(39).getImg()));
                setRarityBorder(eq.get(39).getRarity(), ((ImageView)findViewById(R.id.eq56)));
            case 39:
                ((ImageView)findViewById(R.id.eq46)).setImageDrawable(getDrawable(eq.get(38).getImg()));
                setRarityBorder(eq.get(38).getRarity(), ((ImageView)findViewById(R.id.eq46)));
            case 38:
                ((ImageView)findViewById(R.id.eq36)).setImageDrawable(getDrawable(eq.get(37).getImg()));
                setRarityBorder(eq.get(37).getRarity(), ((ImageView)findViewById(R.id.eq36)));
            case 37:
                ((ImageView)findViewById(R.id.eq26)).setImageDrawable(getDrawable(eq.get(36).getImg()));
                setRarityBorder(eq.get(36).getRarity(), ((ImageView)findViewById(R.id.eq26)));
            case 36:
                ((ImageView)findViewById(R.id.eq16)).setImageDrawable(getDrawable(eq.get(35).getImg()));
                setRarityBorder(eq.get(35).getRarity(), ((ImageView)findViewById(R.id.eq16)));
            case 35:
                ((ImageView)findViewById(R.id.eq75)).setImageDrawable(getDrawable(eq.get(34).getImg()));
                setRarityBorder(eq.get(34).getRarity(), ((ImageView)findViewById(R.id.eq75)));
            case 34:
                ((ImageView)findViewById(R.id.eq65)).setImageDrawable(getDrawable(eq.get(33).getImg()));
                setRarityBorder(eq.get(33).getRarity(), ((ImageView)findViewById(R.id.eq65)));
            case 33:
                ((ImageView)findViewById(R.id.eq55)).setImageDrawable(getDrawable(eq.get(32).getImg()));
                setRarityBorder(eq.get(32).getRarity(), ((ImageView)findViewById(R.id.eq55)));
            case 32:
                ((ImageView)findViewById(R.id.eq45)).setImageDrawable(getDrawable(eq.get(31).getImg()));
                setRarityBorder(eq.get(31).getRarity(), ((ImageView)findViewById(R.id.eq45)));
            case 31:
                ((ImageView)findViewById(R.id.eq35)).setImageDrawable(getDrawable(eq.get(30).getImg()));
                setRarityBorder(eq.get(30).getRarity(), ((ImageView)findViewById(R.id.eq35)));
            case 30:
                ((ImageView)findViewById(R.id.eq25)).setImageDrawable(getDrawable(eq.get(29).getImg()));
                setRarityBorder(eq.get(29).getRarity(), ((ImageView)findViewById(R.id.eq25)));
            case 29:
                ((ImageView)findViewById(R.id.eq15)).setImageDrawable(getDrawable(eq.get(28).getImg()));
                setRarityBorder(eq.get(28).getRarity(), ((ImageView)findViewById(R.id.eq15)));
            case 28:
                ((ImageView)findViewById(R.id.eq74)).setImageDrawable(getDrawable(eq.get(27).getImg()));
                setRarityBorder(eq.get(27).getRarity(), ((ImageView)findViewById(R.id.eq74)));
            case 27:
                ((ImageView)findViewById(R.id.eq64)).setImageDrawable(getDrawable(eq.get(26).getImg()));
                setRarityBorder(eq.get(26).getRarity(), ((ImageView)findViewById(R.id.eq64)));
            case 26:
                ((ImageView)findViewById(R.id.eq54)).setImageDrawable(getDrawable(eq.get(25).getImg()));
                setRarityBorder(eq.get(25).getRarity(), ((ImageView)findViewById(R.id.eq54)));
            case 25:
                ((ImageView)findViewById(R.id.eq44)).setImageDrawable(getDrawable(eq.get(24).getImg()));
                setRarityBorder(eq.get(24).getRarity(), ((ImageView)findViewById(R.id.eq44)));
            case 24:
                ((ImageView)findViewById(R.id.eq34)).setImageDrawable(getDrawable(eq.get(23).getImg()));
                setRarityBorder(eq.get(23).getRarity(), ((ImageView)findViewById(R.id.eq34)));
            case 23:
                ((ImageView)findViewById(R.id.eq24)).setImageDrawable(getDrawable(eq.get(22).getImg()));
                setRarityBorder(eq.get(22).getRarity(), ((ImageView)findViewById(R.id.eq24)));
            case 22:
                ((ImageView)findViewById(R.id.eq14)).setImageDrawable(getDrawable(eq.get(21).getImg()));
                setRarityBorder(eq.get(21).getRarity(), ((ImageView)findViewById(R.id.eq14)));
            case 21:
                ((ImageView)findViewById(R.id.eq73)).setImageDrawable(getDrawable(eq.get(20).getImg()));
                setRarityBorder(eq.get(20).getRarity(), ((ImageView)findViewById(R.id.eq73)));
            case 20:
                ((ImageView)findViewById(R.id.eq63)).setImageDrawable(getDrawable(eq.get(19).getImg()));
                setRarityBorder(eq.get(19).getRarity(), ((ImageView)findViewById(R.id.eq63)));
            case 19:
                ((ImageView)findViewById(R.id.eq53)).setImageDrawable(getDrawable(eq.get(18).getImg()));
                setRarityBorder(eq.get(18).getRarity(), ((ImageView)findViewById(R.id.eq53)));
            case 18:
                ((ImageView)findViewById(R.id.eq43)).setImageDrawable(getDrawable(eq.get(17).getImg()));
                setRarityBorder(eq.get(17).getRarity(), ((ImageView)findViewById(R.id.eq43)));
            case 17:
                ((ImageView)findViewById(R.id.eq33)).setImageDrawable(getDrawable(eq.get(16).getImg()));
                setRarityBorder(eq.get(16).getRarity(), ((ImageView)findViewById(R.id.eq33)));
            case 16:
                ((ImageView)findViewById(R.id.eq23)).setImageDrawable(getDrawable(eq.get(15).getImg()));
                setRarityBorder(eq.get(15).getRarity(), ((ImageView)findViewById(R.id.eq23)));
            case 15:
                ((ImageView)findViewById(R.id.eq13)).setImageDrawable(getDrawable(eq.get(14).getImg()));
                setRarityBorder(eq.get(14).getRarity(), ((ImageView)findViewById(R.id.eq13)));
            case 14:
                ((ImageView)findViewById(R.id.eq72)).setImageDrawable(getDrawable(eq.get(13).getImg()));
                setRarityBorder(eq.get(13).getRarity(), ((ImageView)findViewById(R.id.eq72)));
            case 13:
                ((ImageView)findViewById(R.id.eq62)).setImageDrawable(getDrawable(eq.get(12).getImg()));
                setRarityBorder(eq.get(12).getRarity(), ((ImageView)findViewById(R.id.eq62)));
            case 12:
                ((ImageView)findViewById(R.id.eq52)).setImageDrawable(getDrawable(eq.get(11).getImg()));
                setRarityBorder(eq.get(11).getRarity(), ((ImageView)findViewById(R.id.eq52)));
            case 11:
                ((ImageView)findViewById(R.id.eq42)).setImageDrawable(getDrawable(eq.get(10).getImg()));
                setRarityBorder(eq.get(10).getRarity(), ((ImageView)findViewById(R.id.eq42)));
            case 10:
                ((ImageView)findViewById(R.id.eq32)).setImageDrawable(getDrawable(eq.get(9).getImg()));
                setRarityBorder(eq.get(9).getRarity(), ((ImageView)findViewById(R.id.eq32)));
            case 9:
                ((ImageView)findViewById(R.id.eq22)).setImageDrawable(getDrawable(eq.get(8).getImg()));
                setRarityBorder(eq.get(8).getRarity(), ((ImageView)findViewById(R.id.eq22)));
            case 8:
               // if(!eq.get(7).getName().equals("")) {
                ((ImageView)findViewById(R.id.eq12)).setImageDrawable(getDrawable(eq.get(7).getImg()));
                setRarityBorder(eq.get(7).getRarity(), ((ImageView)findViewById(R.id.eq12)));// }
            case 7:
                ((ImageView)findViewById(R.id.eq71)).setImageDrawable(getDrawable(eq.get(6).getImg()));
                setRarityBorder(eq.get(6).getRarity(), ((ImageView)findViewById(R.id.eq71)));
            case 6:
                ((ImageView)findViewById(R.id.eq61)).setImageDrawable(getDrawable(eq.get(5).getImg()));
                setRarityBorder(eq.get(5).getRarity(), ((ImageView)findViewById(R.id.eq61)));
            case 5:
                ((ImageView)findViewById(R.id.eq51)).setImageDrawable(getDrawable(eq.get(4).getImg()));
                setRarityBorder(eq.get(4).getRarity(), ((ImageView)findViewById(R.id.eq51)));
            case 4:
                ((ImageView)findViewById(R.id.eq41)).setImageDrawable(getDrawable(eq.get(3).getImg()));
                setRarityBorder(eq.get(3).getRarity(), ((ImageView)findViewById(R.id.eq41)));
            case 3:
                ((ImageView)findViewById(R.id.eq31)).setImageDrawable(getDrawable(eq.get(2).getImg()));
                setRarityBorder(eq.get(2).getRarity(), ((ImageView)findViewById(R.id.eq31)));
            case 2:
                ((ImageView)findViewById(R.id.eq21)).setImageDrawable(getDrawable(eq.get(1).getImg()));
                setRarityBorder(eq.get(1).getRarity(), ((ImageView)findViewById(R.id.eq21)));
            case 1:
                ((ImageView)findViewById(R.id.eq11)).setImageDrawable(getDrawable(eq.get(0).getImg()));
                setRarityBorder(eq.get(0).getRarity(), ((ImageView)findViewById(R.id.eq11)));
                break;
        }
    }

    private void setRarityBorder(int rarity, ImageView imageView)
    {
        switch (rarity)
        {
            case 0:
                imageView.setBackground(null);
                break;
            case 1:
                imageView.setBackground(getDrawable(R.drawable.unique_border_eq));
                break;
            case 2:
                imageView.setBackground(getDrawable(R.drawable.heroic_border_eq));
                break;
            case 3:
                imageView.setBackground(getDrawable(R.drawable.legendary_border_eq));
                break;
            default:
                imageView.setBackground(getDrawable(R.drawable.improved_border_eq));
                break;
        }
    }

    public void onAttackClick(View view) {
        Intent intent = new Intent(this, AttackActivity.class);
        startActivity(intent);
    }

    public void onEqClick(View view) {
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

    public void onEqItemClick(View view) {
        if(((ImageView)view).getDrawable() != null)
            openEqItemView(view);

    }

    private void openEqItemView(View view)
    {
        Item item = getEqItemFromId(view.getId());

        boolean isItemClassEquipable = false;
        for(int i = 0; i < item.getClasses().length; i++)
        {
            if(item.getClasses()[i].equals(tinydb.getString("class", DefaultClass)))
                isItemClassEquipable = true;
        }

        if(item.getLvl() <= tinydb.getInt("lvl", DefaultLvl) && isItemClassEquipable && item.getItemType() != ItemTypes.other)
        {
            findViewById(R.id.eq_imageview).setBackground(getDrawable(R.drawable.eq_info));
            findViewById(R.id.eqItemEquip).setVisibility(View.VISIBLE);
        } else {
            findViewById(R.id.eq_imageview).setBackground(getDrawable(R.drawable.eq_info2));
        }

        findViewById(R.id.eq11).setVisibility(View.GONE);
        findViewById(R.id.eq21).setVisibility(View.GONE);
        findViewById(R.id.eq31).setVisibility(View.GONE);
        findViewById(R.id.eq41).setVisibility(View.GONE);
        findViewById(R.id.eq51).setVisibility(View.GONE);
        findViewById(R.id.eq61).setVisibility(View.GONE);
        findViewById(R.id.eq71).setVisibility(View.GONE);
        findViewById(R.id.eq12).setVisibility(View.GONE);
        findViewById(R.id.eq22).setVisibility(View.GONE);
        findViewById(R.id.eq32).setVisibility(View.GONE);
        findViewById(R.id.eq42).setVisibility(View.GONE);
        findViewById(R.id.eq52).setVisibility(View.GONE);
        findViewById(R.id.eq62).setVisibility(View.GONE);
        findViewById(R.id.eq72).setVisibility(View.GONE);
        findViewById(R.id.eq13).setVisibility(View.GONE);
        findViewById(R.id.eq23).setVisibility(View.GONE);
        findViewById(R.id.eq33).setVisibility(View.GONE);
        findViewById(R.id.eq43).setVisibility(View.GONE);
        findViewById(R.id.eq53).setVisibility(View.GONE);
        findViewById(R.id.eq63).setVisibility(View.GONE);
        findViewById(R.id.eq73).setVisibility(View.GONE);
        findViewById(R.id.eq14).setVisibility(View.GONE);
        findViewById(R.id.eq24).setVisibility(View.GONE);
        findViewById(R.id.eq34).setVisibility(View.GONE);
        findViewById(R.id.eq44).setVisibility(View.GONE);
        findViewById(R.id.eq54).setVisibility(View.GONE);
        findViewById(R.id.eq64).setVisibility(View.GONE);
        findViewById(R.id.eq74).setVisibility(View.GONE);
        findViewById(R.id.eq15).setVisibility(View.GONE);
        findViewById(R.id.eq25).setVisibility(View.GONE);
        findViewById(R.id.eq35).setVisibility(View.GONE);
        findViewById(R.id.eq45).setVisibility(View.GONE);
        findViewById(R.id.eq55).setVisibility(View.GONE);
        findViewById(R.id.eq65).setVisibility(View.GONE);
        findViewById(R.id.eq75).setVisibility(View.GONE);
        findViewById(R.id.eq16).setVisibility(View.GONE);
        findViewById(R.id.eq26).setVisibility(View.GONE);
        findViewById(R.id.eq36).setVisibility(View.GONE);
        findViewById(R.id.eq46).setVisibility(View.GONE);
        findViewById(R.id.eq56).setVisibility(View.GONE);
        findViewById(R.id.eq66).setVisibility(View.GONE);
        findViewById(R.id.eq76).setVisibility(View.GONE);
        findViewById(R.id.eq17).setVisibility(View.GONE);
        findViewById(R.id.eq27).setVisibility(View.GONE);
        findViewById(R.id.eq37).setVisibility(View.GONE);
        findViewById(R.id.eq47).setVisibility(View.GONE);
        findViewById(R.id.eq57).setVisibility(View.GONE);
        findViewById(R.id.eq67).setVisibility(View.GONE);
        findViewById(R.id.eq77).setVisibility(View.GONE);
        findViewById(R.id.eq18).setVisibility(View.GONE);
        findViewById(R.id.eq28).setVisibility(View.GONE);
        findViewById(R.id.eq38).setVisibility(View.GONE);
        findViewById(R.id.eq48).setVisibility(View.GONE);
        findViewById(R.id.eq58).setVisibility(View.GONE);
        findViewById(R.id.eq68).setVisibility(View.GONE);
        findViewById(R.id.eq78).setVisibility(View.GONE);
        findViewById(R.id.eq19).setVisibility(View.GONE);
        findViewById(R.id.eq29).setVisibility(View.GONE);
        findViewById(R.id.eq39).setVisibility(View.GONE);
        findViewById(R.id.eq49).setVisibility(View.GONE);
        findViewById(R.id.eq59).setVisibility(View.GONE);
        findViewById(R.id.eq69).setVisibility(View.GONE);
        findViewById(R.id.eq79).setVisibility(View.GONE);
        findViewById(R.id.eq110).setVisibility(View.GONE);
        findViewById(R.id.eq210).setVisibility(View.GONE);
        findViewById(R.id.eq310).setVisibility(View.GONE);
        findViewById(R.id.eq410).setVisibility(View.GONE);
        findViewById(R.id.eq510).setVisibility(View.GONE);
        findViewById(R.id.eq610).setVisibility(View.GONE);
        findViewById(R.id.eq710).setVisibility(View.GONE);

        findViewById(R.id.eqItemName).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemRarity).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemClose).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemImg).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemClass).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemLvl).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemPrice).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemStats).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemSell).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemClassImg1).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemClassImg2).setVisibility(View.VISIBLE);
        findViewById(R.id.eqItemClassImg3).setVisibility(View.VISIBLE);

        ((TextView)findViewById(R.id.eqItemName)).setText(item.getName());
        ((ImageView)findViewById(R.id.eqItemImg)).setImageDrawable(((ImageView)view).getDrawable());

        switch (item.getRarity())
        {
            case 0:
                ((TextView)findViewById(R.id.eqItemRarity)).setText("");
                break;
            case 1:
                ((TextView)findViewById(R.id.eqItemRarity)).setText("Unique");
                ((TextView) findViewById(R.id.eqItemRarity)).setTextColor(Color.parseColor("#946903"));
                break;
            case 2:
                ((TextView)findViewById(R.id.eqItemRarity)).setText("Heroic");
                ((TextView) findViewById(R.id.eqItemRarity)).setTextColor(Color.parseColor("#004f81"));
                break;
            case 3:
                ((TextView)findViewById(R.id.eqItemRarity)).setText("Legendary");
                ((TextView) findViewById(R.id.eqItemRarity)).setTextColor(Color.parseColor("#de5e03"));
                break;
            default:
                ((TextView)findViewById(R.id.eqItemRarity)).setText("Improved");
                ((TextView) findViewById(R.id.eqItemRarity)).setTextColor(Color.parseColor("#636262"));
                break;
        }

        findViewById(R.id.eqItemClassImg1).setBackground(null);
        findViewById(R.id.eqItemClassImg2).setBackground(null);
        findViewById(R.id.eqItemClassImg3).setBackground(null);
        String[] itemClasses = item.getClasses();
        if(itemClasses.length > 3)
            ((TextView)findViewById(R.id.eqItemClass)).setText(" Class: all");
        else
        {
            int whichImg = 1;
            ((TextView)findViewById(R.id.eqItemClass)).setText(" Class: ");

            for(int i = 0; i < itemClasses.length; i++)
            {
                switch (itemClasses[i])
                {
                    case w:
                        whichImg = setClassImgs(whichImg, R.drawable.w_icon);
                        break;

                    case m:
                        whichImg = setClassImgs(whichImg, R.drawable.m_icon);
                        break;

                    case t:
                        whichImg = setClassImgs(whichImg, R.drawable.t_icon);
                        break;

                    case h:
                        whichImg = setClassImgs(whichImg, R.drawable.h_icon);
                        break;

                    case b:
                        whichImg = setClassImgs(whichImg, R.drawable.b_icon);
                        break;

                    case p:
                        whichImg = setClassImgs(whichImg, R.drawable.p_icon);
                        break;
                }
            }
        }

        ((TextView)findViewById(R.id.eqItemLvl)).setText(" Lvl: " + item.getLvl());
        if(item.getAmount() > 1)
            ((TextView)findViewById(R.id.eqItemPrice)).setText(" Price: " + item.getCost() * item.getAmount());
        else
            ((TextView)findViewById(R.id.eqItemPrice)).setText(" Price: " + item.getCost());

        ((TextView)findViewById(R.id.eqItemStats)).setText(GetItemStats(item));
    }

    private int setClassImgs(int whichImg, int icon)
    {
        switch (whichImg)
        {
            case 1:
                findViewById(R.id.eqItemClassImg1).setBackground(getDrawable(icon));
                whichImg++;
                break;

            case 2:
                findViewById(R.id.eqItemClassImg2).setBackground(getDrawable(icon));
                whichImg++;
                break;

            case 3:
                findViewById(R.id.eqItemClassImg3).setBackground(getDrawable(icon));
                whichImg++;
                break;
        }
        return whichImg;
    }

    private Item getEqItemFromId(int id)
    {
        idInUse = id;
        switch (id)
        {
            case R.id.eq11:
                itemInUse = 0;
                return eq.get(0);

            case R.id.eq21:
                itemInUse = 1;
                return eq.get(1);

            case R.id.eq31:
                itemInUse = 2;
                return eq.get(2);

            case R.id.eq41:
                itemInUse = 3;
                return eq.get(3);

            case R.id.eq51:
                itemInUse = 4;
                return eq.get(4);

            case R.id.eq61:
                itemInUse = 5;
                return eq.get(5);

            case R.id.eq71:
                itemInUse = 6;
                return eq.get(6);

            case R.id.eq12:
                itemInUse = 7;
                return eq.get(7);

            case R.id.eq22:
                itemInUse = 8;
                return eq.get(8);

            case R.id.eq32:
                itemInUse = 9;
                return eq.get(9);

            case R.id.eq42:
                itemInUse = 10;
                return eq.get(10);

            case R.id.eq52:
                itemInUse = 11;
                return eq.get(11);

            case R.id.eq62:
                itemInUse = 12;
                return eq.get(12);

            case R.id.eq72:
                itemInUse = 13;
                return eq.get(13);

            case R.id.eq13:
                itemInUse = 14;
                return eq.get(14);

            case R.id.eq23:
                itemInUse = 15;
                return eq.get(15);

            case R.id.eq33:
                itemInUse = 16;
                return eq.get(16);

            case R.id.eq43:
                itemInUse = 17;
                return eq.get(17);

            case R.id.eq53:
                itemInUse = 18;
                return eq.get(18);

            case R.id.eq63:
                itemInUse = 19;
                return eq.get(19);

            case R.id.eq73:
                itemInUse = 20;
                return eq.get(20);

            case R.id.eq14:
                itemInUse = 21;
                return eq.get(21);

            case R.id.eq24:
                itemInUse = 22;
                return eq.get(22);

            case R.id.eq34:
                itemInUse = 23;
                return eq.get(23);

            case R.id.eq44:
                itemInUse = 24;
                return eq.get(24);

            case R.id.eq54:
                itemInUse = 25;
                return eq.get(25);

            case R.id.eq64:
                itemInUse = 26;
                return eq.get(26);

            case R.id.eq74:
                itemInUse = 27;
                return eq.get(27);

            case R.id.eq15:
                itemInUse = 28;
                return eq.get(28);

            case R.id.eq25:
                itemInUse = 29;
                return eq.get(29);

            case R.id.eq35:
                itemInUse = 30;
                return eq.get(30);

            case R.id.eq45:
                itemInUse = 31;
                return eq.get(31);

            case R.id.eq55:
                itemInUse = 32;
                return eq.get(32);

            case R.id.eq65:
                itemInUse = 33;
                return eq.get(33);

            case R.id.eq75:
                itemInUse = 34;
                return eq.get(34);

            case R.id.eq16:
                itemInUse = 35;
                return eq.get(35);

            case R.id.eq26:
                itemInUse = 36;
                return eq.get(36);

            case R.id.eq36:
                itemInUse = 37;
                return eq.get(37);

            case R.id.eq46:
                itemInUse = 38;
                return eq.get(38);

            case R.id.eq56:
                itemInUse = 39;
                return eq.get(39);

            case R.id.eq66:
                itemInUse = 40;
                return eq.get(40);

            case R.id.eq76:
                itemInUse = 41;
                return eq.get(41);

            case R.id.eq17:
                itemInUse = 42;
                return eq.get(42);

            case R.id.eq27:
                itemInUse = 43;
                return eq.get(43);

            case R.id.eq37:
                itemInUse = 44;
                return eq.get(44);

            case R.id.eq47:
                itemInUse = 45;
                return eq.get(45);

            case R.id.eq57:
                itemInUse = 46;
                return eq.get(46);

            case R.id.eq67:
                itemInUse = 47;
                return eq.get(47);

            case R.id.eq77:
                itemInUse = 48;
                return eq.get(48);

            case R.id.eq18:
                itemInUse = 49;
                return eq.get(49);

            case R.id.eq28:
                itemInUse = 50;
                return eq.get(50);

            case R.id.eq38:
                itemInUse = 51;
                return eq.get(51);

            case R.id.eq48:
                itemInUse = 52;
                return eq.get(52);

            case R.id.eq58:
                itemInUse = 53;
                return eq.get(53);

            case R.id.eq68:
                itemInUse = 54;
                return eq.get(54);

            case R.id.eq78:
                itemInUse = 55;
                return eq.get(55);

            case R.id.eq19:
                itemInUse = 56;
                return eq.get(56);

            case R.id.eq29:
                itemInUse = 57;
                return eq.get(57);

            case R.id.eq39:
                itemInUse = 58;
                return eq.get(58);

            case R.id.eq49:
                itemInUse = 59;
                return eq.get(59);

            case R.id.eq59:
                itemInUse = 60;
                return eq.get(60);

            case R.id.eq69:
                itemInUse = 61;
                return eq.get(61);

            case R.id.eq79:
                itemInUse = 62;
                return eq.get(62);

            case R.id.eq110:
                itemInUse = 63;
                return eq.get(63);

            case R.id.eq210:
                itemInUse = 64;
                return eq.get(64);

            case R.id.eq310:
                itemInUse = 65;
                return eq.get(65);

            case R.id.eq410:
                itemInUse = 66;
                return eq.get(66);

            case R.id.eq510:
                itemInUse = 67;
                return eq.get(67);

            case R.id.eq610:
                itemInUse = 68;
                return eq.get(68);

            case R.id.eq710:
                itemInUse = 69;
                return eq.get(69);

            default:
                itemInUse = 0;
                return eq.get(0);
        }
    }

    public void onEqSellClick(View view) {
        double moneyForItem = eq.get(itemInUse).getCost() * 0.75;

        if(eq.get(itemInUse).getItemType().equals(ItemTypes.other) || eq.get(itemInUse).getItemType().equals(ItemTypes.potion))
            moneyForItem *= eq.get(itemInUse).getAmount();

        tinydb.putInt("money", (tinydb.getInt("money", DefaultMoney) + (int)Math.round(moneyForItem)));
        Toast.makeText(this, ("You successfully sold " + eq.get(itemInUse).getName()), Toast.LENGTH_SHORT).show();
        eq.remove(itemInUse);
        tinydb.putListObject("eq", eq);
        findViewById(idInUse).setBackground(null);
        closeEqItemView();
        finish();
        startActivity(getIntent());
    }

    public void onEqEquipClick(View view)
    {
        Item usedItem = eq.get(itemInUse);
        switch (eq.get(itemInUse).getItemType())
        {
            case helmet:
                if(tinydb.getObject(SavedHelmet, DefaultHelmet) == null || ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getName().equals(""))
                    tinydb.putObject(SavedHelmet, eq.get(itemInUse));
                else
                {
                    Item item = tinydb.getObject(SavedHelmet, DefaultHelmet);
                    tinydb.putObject(SavedHelmet, eq.get(itemInUse));
                    eq.add(item);
                }
                break;
            case ring:
                if(tinydb.getObject(SavedRing, DefaultRing) == null || ((Item)tinydb.getObject(SavedRing, DefaultRing)).getName().equals(""))
                    tinydb.putObject(SavedRing, eq.get(itemInUse));
                else
                {
                    Item item = tinydb.getObject(SavedRing, DefaultRing);
                    tinydb.putObject(SavedRing, eq.get(itemInUse));
                    eq.add(item);
                }
                break;
            case necklace:
                if(tinydb.getObject(SavedNecklace, DefaultNecklace) == null || ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getName().equals(""))
                    tinydb.putObject(SavedNecklace, eq.get(itemInUse));
                else
                {
                    Item item = tinydb.getObject(SavedNecklace, DefaultNecklace);
                    tinydb.putObject(SavedNecklace, eq.get(itemInUse));
                    eq.add(item);
                }
                break;
            case gloves:
                if(tinydb.getObject(SavedGloves, DefaultGloves) == null || ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getName().equals(""))
                    tinydb.putObject(SavedGloves, eq.get(itemInUse));
                else
                {
                    Item item = tinydb.getObject(SavedGloves, DefaultGloves);
                    tinydb.putObject(SavedGloves, eq.get(itemInUse));
                    eq.add(item);
                }
                break;

            case weapon:
                if((tinydb.getObject(SavedWeapon, DefaultWeapon) == null || ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getName().equals("")) && (tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon) == null || ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getName().equals("")))
                    tinydb.putObject(SavedWeapon, eq.get(itemInUse));
                else
                {
                    Item item;
                    if(tinydb.getObject(SavedWeapon, DefaultWeapon) == null || ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getName().equals(""))
                        item = tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon);
                    else
                        item = tinydb.getObject(SavedWeapon, DefaultWeapon);
                    tinydb.putObject(SavedWeapon, eq.get(itemInUse));
                    eq.add(item);
                }
                break;

            case twoHandedWeapon:
                if((tinydb.getObject(SavedWeapon, DefaultWeapon) == null || ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getName().equals("")) && (tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon) == null || ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getName().equals("")) && (tinydb.getObject(SavedSecWeapon, DefaultSecWeapon) == null || ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getName().equals("")))
                    tinydb.putObject(SavedTwoHandedWeapon, eq.get(itemInUse));
                else
                {
                    if(tinydb.getObject(SavedWeapon, DefaultWeapon) != null && !((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getName().equals(""))
                    {
                        if(tinydb.getObject(SavedSecWeapon, DefaultSecWeapon) != null && !((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getName().equals(""))
                        {
                            if(eq.size() < 68)
                            {
                                Item weapon = tinydb.getObject(SavedWeapon, DefaultWeapon);
                                Item secWeapon = tinydb.getObject(SavedSecWeapon, DefaultSecWeapon);
                                tinydb.putObject(SavedTwoHandedWeapon, eq.get(itemInUse));
                                tinydb.putObject(SavedWeapon, DefaultWeapon);
                                tinydb.putObject(SavedSecWeapon, DefaultSecWeapon);
                                eq.add(weapon);
                                eq.add(secWeapon);
                            }
                            else
                            {
                                Toast.makeText(this, "Unfortunately, you don't have enough space in your equipment", Toast.LENGTH_LONG).show();
                                return;
                            }
                        }
                        else
                        {
                            Item item = tinydb.getObject(SavedWeapon, DefaultWeapon);
                            tinydb.putObject(SavedTwoHandedWeapon, eq.get(itemInUse));
                            eq.add(item);
                        }
                    }
                    else if(tinydb.getObject(SavedSecWeapon, DefaultSecWeapon) != null && !((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getName().equals(""))
                    {
                        Item item = tinydb.getObject(SavedSecWeapon, DefaultSecWeapon);
                        tinydb.putObject(SavedTwoHandedWeapon, eq.get(itemInUse));
                        eq.add(item);
                    }
                    else
                    {
                        Item item = tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon);
                        tinydb.putObject(SavedTwoHandedWeapon, eq.get(itemInUse));
                        eq.add(item);
                    }
                }
                break;

            case armor:
                if(tinydb.getObject(SavedArmor, DefaultArmor) == null || ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getName().equals(""))
                    tinydb.putObject(SavedArmor, eq.get(itemInUse));
                else
                {
                    Item item = tinydb.getObject(SavedArmor, DefaultArmor);
                    tinydb.putObject(SavedArmor, eq.get(itemInUse));
                    eq.add(item);
                }
                break;

            case secWeapon:
                if((tinydb.getObject(SavedSecWeapon, DefaultSecWeapon) == null || ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getName().equals("")) && (tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon) == null || ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getName().equals("")))
                    tinydb.putObject(SavedSecWeapon, eq.get(itemInUse));
                else
                {
                    Item item;
                    if(tinydb.getObject(SavedSecWeapon, DefaultWeapon) != null && !((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getName().equals(""))
                        item = tinydb.getObject(SavedSecWeapon, DefaultSecWeapon);
                    else
                        item = tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon);
                    tinydb.putObject(SavedSecWeapon, eq.get(itemInUse));
                    eq.add(item);
                }
                break;

            case shoes:
                if(tinydb.getObject(SavedShoes, DefaultShoes) == null || ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getName().equals(""))
                    tinydb.putObject(SavedShoes, eq.get(itemInUse));
                else
                {
                    Item item = tinydb.getObject(SavedShoes, DefaultShoes);
                    tinydb.putObject(SavedShoes, eq.get(itemInUse));
                    eq.add(item);
                }
                break;

            case potion:
                Item potion = eq.get(itemInUse);
                if(potion.getAmount() > 1)
                {
                    potion.useItem();
                    eq.remove(itemInUse);
                    eq.add(itemInUse, potion);
                    tinydb.putInt(SavedHp, tinydb.getInt(SavedHp, DefaultHp) + potion.getHeal());
                    tinydb.putListObject(SavedEq, eq);

                    ((TextView)findViewById(R.id.eqItemStats)).setText(GetItemStats(eq.get(itemInUse)));
                }
                else
                {
                    eq.remove(itemInUse);
                    tinydb.putInt(SavedHp, tinydb.getInt(SavedHp, DefaultHp) + potion.getHeal());

                    tinydb.putListObject(SavedEq, eq);
                    findViewById(idInUse).setBackground(null);
                    closeEqItemView();
                    finish();
                    startActivity(getIntent());
                }

                if(tinydb.getInt(SavedHp, DefaultHp) > tinydb.getInt(SavedMaxHp, DefaultMaxHp))
                    tinydb.putInt(SavedHp, tinydb.getInt(SavedMaxHp, DefaultMaxHp));
                else if(tinydb.getInt(SavedHp, DefaultHp) < 0)
                    tinydb.putInt(SavedHp, 0);
                ((ProgressBar)findViewById(R.id.vertical_progressbar)).setProgress(tinydb.getInt(SavedHp, DefaultHp));
                ((TextView)findViewById(R.id.heroHpPercent)).setText(Math.round(((double)tinydb.getInt(SavedHp, DefaultHp) / (double)tinydb.getInt(SavedMaxHp, DefaultMaxHp)) * 100.0) + "%");
                break;
        }

        if(usedItem.getItemType() != ItemTypes.potion)
        {
            eq.remove(itemInUse);
            tinydb.putListObject(SavedEq, eq);
            findViewById(idInUse).setBackground(null);
            CalculateStats(tinydb);
            closeEqItemView();

            finish();
            startActivity(getIntent());
        }
    }

    public void onEqItemCloseClick(View view) {
        closeEqItemView();
    }

    private void closeEqItemView()
    {
        findViewById(R.id.eq_imageview).setBackground(getDrawable(R.drawable.eq_img));
        findViewById(R.id.eq11).setVisibility(View.VISIBLE);
        findViewById(R.id.eq21).setVisibility(View.VISIBLE);
        findViewById(R.id.eq31).setVisibility(View.VISIBLE);
        findViewById(R.id.eq41).setVisibility(View.VISIBLE);
        findViewById(R.id.eq51).setVisibility(View.VISIBLE);
        findViewById(R.id.eq61).setVisibility(View.VISIBLE);
        findViewById(R.id.eq71).setVisibility(View.VISIBLE);
        findViewById(R.id.eq12).setVisibility(View.VISIBLE);
        findViewById(R.id.eq22).setVisibility(View.VISIBLE);
        findViewById(R.id.eq32).setVisibility(View.VISIBLE);
        findViewById(R.id.eq42).setVisibility(View.VISIBLE);
        findViewById(R.id.eq52).setVisibility(View.VISIBLE);
        findViewById(R.id.eq62).setVisibility(View.VISIBLE);
        findViewById(R.id.eq72).setVisibility(View.VISIBLE);
        findViewById(R.id.eq13).setVisibility(View.VISIBLE);
        findViewById(R.id.eq23).setVisibility(View.VISIBLE);
        findViewById(R.id.eq33).setVisibility(View.VISIBLE);
        findViewById(R.id.eq43).setVisibility(View.VISIBLE);
        findViewById(R.id.eq53).setVisibility(View.VISIBLE);
        findViewById(R.id.eq63).setVisibility(View.VISIBLE);
        findViewById(R.id.eq73).setVisibility(View.VISIBLE);
        findViewById(R.id.eq14).setVisibility(View.VISIBLE);
        findViewById(R.id.eq24).setVisibility(View.VISIBLE);
        findViewById(R.id.eq34).setVisibility(View.VISIBLE);
        findViewById(R.id.eq44).setVisibility(View.VISIBLE);
        findViewById(R.id.eq54).setVisibility(View.VISIBLE);
        findViewById(R.id.eq64).setVisibility(View.VISIBLE);
        findViewById(R.id.eq74).setVisibility(View.VISIBLE);
        findViewById(R.id.eq15).setVisibility(View.VISIBLE);
        findViewById(R.id.eq25).setVisibility(View.VISIBLE);
        findViewById(R.id.eq35).setVisibility(View.VISIBLE);
        findViewById(R.id.eq45).setVisibility(View.VISIBLE);
        findViewById(R.id.eq55).setVisibility(View.VISIBLE);
        findViewById(R.id.eq65).setVisibility(View.VISIBLE);
        findViewById(R.id.eq75).setVisibility(View.VISIBLE);
        findViewById(R.id.eq16).setVisibility(View.VISIBLE);
        findViewById(R.id.eq26).setVisibility(View.VISIBLE);
        findViewById(R.id.eq36).setVisibility(View.VISIBLE);
        findViewById(R.id.eq46).setVisibility(View.VISIBLE);
        findViewById(R.id.eq56).setVisibility(View.VISIBLE);
        findViewById(R.id.eq66).setVisibility(View.VISIBLE);
        findViewById(R.id.eq76).setVisibility(View.VISIBLE);
        findViewById(R.id.eq17).setVisibility(View.VISIBLE);
        findViewById(R.id.eq27).setVisibility(View.VISIBLE);
        findViewById(R.id.eq37).setVisibility(View.VISIBLE);
        findViewById(R.id.eq47).setVisibility(View.VISIBLE);
        findViewById(R.id.eq57).setVisibility(View.VISIBLE);
        findViewById(R.id.eq67).setVisibility(View.VISIBLE);
        findViewById(R.id.eq77).setVisibility(View.VISIBLE);
        findViewById(R.id.eq18).setVisibility(View.VISIBLE);
        findViewById(R.id.eq28).setVisibility(View.VISIBLE);
        findViewById(R.id.eq38).setVisibility(View.VISIBLE);
        findViewById(R.id.eq48).setVisibility(View.VISIBLE);
        findViewById(R.id.eq58).setVisibility(View.VISIBLE);
        findViewById(R.id.eq68).setVisibility(View.VISIBLE);
        findViewById(R.id.eq78).setVisibility(View.VISIBLE);
        findViewById(R.id.eq19).setVisibility(View.VISIBLE);
        findViewById(R.id.eq29).setVisibility(View.VISIBLE);
        findViewById(R.id.eq39).setVisibility(View.VISIBLE);
        findViewById(R.id.eq49).setVisibility(View.VISIBLE);
        findViewById(R.id.eq59).setVisibility(View.VISIBLE);
        findViewById(R.id.eq69).setVisibility(View.VISIBLE);
        findViewById(R.id.eq79).setVisibility(View.VISIBLE);
        findViewById(R.id.eq110).setVisibility(View.VISIBLE);
        findViewById(R.id.eq210).setVisibility(View.VISIBLE);
        findViewById(R.id.eq310).setVisibility(View.VISIBLE);
        findViewById(R.id.eq410).setVisibility(View.VISIBLE);
        findViewById(R.id.eq510).setVisibility(View.VISIBLE);
        findViewById(R.id.eq610).setVisibility(View.VISIBLE);
        findViewById(R.id.eq710).setVisibility(View.VISIBLE);

        findViewById(R.id.eqItemName).setVisibility(View.GONE);
        findViewById(R.id.eqItemRarity).setVisibility(View.GONE);
        findViewById(R.id.eqItemClose).setVisibility(View.GONE);
        findViewById(R.id.eqItemImg).setVisibility(View.GONE);
        findViewById(R.id.eqItemClass).setVisibility(View.GONE);
        findViewById(R.id.eqItemLvl).setVisibility(View.GONE);
        findViewById(R.id.eqItemPrice).setVisibility(View.GONE);
        findViewById(R.id.eqItemStats).setVisibility(View.GONE);
        findViewById(R.id.eqItemSell).setVisibility(View.GONE);
        findViewById(R.id.eqItemEquip).setVisibility(View.GONE);
        findViewById(R.id.eqItemClassImg1).setVisibility(View.GONE);
        findViewById(R.id.eqItemClassImg2).setVisibility(View.GONE);
        findViewById(R.id.eqItemClassImg3).setVisibility(View.GONE);
    }


}
