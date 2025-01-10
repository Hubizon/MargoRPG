package com.example.margorpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.margorpg.Attack.AttackActivity;

import java.util.ArrayList;

import static com.example.margorpg.Resources.DefaultAbsorption;
import static com.example.margorpg.Resources.DefaultArmor;
import static com.example.margorpg.Resources.DefaultArmorPen;
import static com.example.margorpg.Resources.DefaultArmorStats;
import static com.example.margorpg.Resources.DefaultAttackFrom;
import static com.example.margorpg.Resources.DefaultAttackTo;
import static com.example.margorpg.Resources.DefaultBlock;
import static com.example.margorpg.Resources.DefaultCounter;
import static com.example.margorpg.Resources.DefaultCritPower;
import static com.example.margorpg.Resources.DefaultCritic;
import static com.example.margorpg.Resources.DefaultDexterity;
import static com.example.margorpg.Resources.DefaultDodge;
import static com.example.margorpg.Resources.DefaultGloves;
import static com.example.margorpg.Resources.DefaultHealing;
import static com.example.margorpg.Resources.DefaultHelmet;
import static com.example.margorpg.Resources.DefaultHp;
import static com.example.margorpg.Resources.DefaultIfHaveLegendaryBonusOstatniRatunek;
import static com.example.margorpg.Resources.DefaultIntellect;
import static com.example.margorpg.Resources.DefaultLvl;
import static com.example.margorpg.Resources.DefaultMagicAbs;
import static com.example.margorpg.Resources.DefaultMagicRes;
import static com.example.margorpg.Resources.DefaultMaxHp;
import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.DefaultNecklace;
import static com.example.margorpg.Resources.DefaultNickname;
import static com.example.margorpg.Resources.DefaultRing;
import static com.example.margorpg.Resources.DefaultSa;
import static com.example.margorpg.Resources.DefaultSecWeapon;
import static com.example.margorpg.Resources.DefaultShoes;
import static com.example.margorpg.Resources.DefaultSlowDown;
import static com.example.margorpg.Resources.DefaultStrength;
import static com.example.margorpg.Resources.DefaultTwoHandedWeapon;
import static com.example.margorpg.Resources.DefaultWeapon;
import static com.example.margorpg.Resources.GetItemStats;
import static com.example.margorpg.Resources.LoadHeroInfo;
import static com.example.margorpg.Resources.SavedAbsorption;
import static com.example.margorpg.Resources.SavedArmor;
import static com.example.margorpg.Resources.SavedArmorPen;
import static com.example.margorpg.Resources.SavedArmorStats;
import static com.example.margorpg.Resources.SavedAttackFrom;
import static com.example.margorpg.Resources.SavedAttackTo;
import static com.example.margorpg.Resources.SavedBlock;
import static com.example.margorpg.Resources.SavedCounter;
import static com.example.margorpg.Resources.SavedCritPower;
import static com.example.margorpg.Resources.SavedCritic;
import static com.example.margorpg.Resources.SavedDexterity;
import static com.example.margorpg.Resources.SavedDodge;
import static com.example.margorpg.Resources.SavedEq;
import static com.example.margorpg.Resources.SavedGloves;
import static com.example.margorpg.Resources.SavedHealing;
import static com.example.margorpg.Resources.SavedHelmet;
import static com.example.margorpg.Resources.SavedHp;
import static com.example.margorpg.Resources.SavedIfHaveLegendaryBonusOslepienie;
import static com.example.margorpg.Resources.SavedIfHaveLegendaryBonusOstatniRatunek;
import static com.example.margorpg.Resources.SavedIntellect;
import static com.example.margorpg.Resources.SavedLvl;
import static com.example.margorpg.Resources.SavedMagicAbs;
import static com.example.margorpg.Resources.SavedMagicRes;
import static com.example.margorpg.Resources.SavedMaxHp;
import static com.example.margorpg.Resources.SavedMoney;
import static com.example.margorpg.Resources.SavedNecklace;
import static com.example.margorpg.Resources.SavedNickname;
import static com.example.margorpg.Resources.SavedRing;
import static com.example.margorpg.Resources.SavedSa;
import static com.example.margorpg.Resources.SavedSecWeapon;
import static com.example.margorpg.Resources.SavedShoes;
import static com.example.margorpg.Resources.SavedSlowDown;
import static com.example.margorpg.Resources.SavedStrength;
import static com.example.margorpg.Resources.SavedTwoHandedWeapon;
import static com.example.margorpg.Resources.SavedWeapon;
import static com.example.margorpg.Resources.b;
import static com.example.margorpg.Resources.h;
import static com.example.margorpg.Resources.m;
import static com.example.margorpg.Resources.p;
import static com.example.margorpg.Resources.t;
import static com.example.margorpg.Resources.w;

public class MainActivity extends AppCompatActivity {

    public static final String MY_PREFS_NAME = "MyPrefsFile";

    //    public static final int DefaultAttackFrom = 1;
//    public static final int DefaultAttackTo = 2;
//    public static final int DefaultArmorStats = 3;
//    public static final int DefaultStrength = 3;
//    public static final int DefaultDexterity = 3;
//    public static final int DefaultIntellect = 3;

    TinyDB tinydb;
    public static Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        tinydb = new TinyDB(this);

        LoadHeroInfo(this, tinydb);

        Glide.with(context).load(getDrawable(R.drawable.hero1_front)).into((ImageView)findViewById(R.id.heroImage));
        if(tinydb.getObject(SavedHelmet, DefaultHelmet) != null && !((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemHelmet)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getRarity(), ((ImageView)findViewById(R.id.itemHelmet)));
        }
        if(tinydb.getObject(SavedRing, DefaultRing) != null && !((Item)tinydb.getObject(SavedRing, DefaultRing)).getName().equals("")){
            ((ImageView)findViewById(R.id.itemRing)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedRing, DefaultRing)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedRing, DefaultRing)).getRarity(), ((ImageView)findViewById(R.id.itemRing)));
        }
        if(tinydb.getObject(SavedNecklace, DefaultNecklace) != null && !((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemNecklace)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getRarity(), ((ImageView)findViewById(R.id.itemNecklace)));
        }
        if(tinydb.getObject(SavedGloves, DefaultGloves) != null && !((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemGloves)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getRarity(), ((ImageView)findViewById(R.id.itemGloves)));
        }
        if(tinydb.getObject(SavedWeapon, DefaultWeapon) != null && !((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemWeapon)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getRarity(), ((ImageView)findViewById(R.id.itemWeapon)));
        }
        if(tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon) != null && !((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemWeapon)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getRarity(), ((ImageView)findViewById(R.id.itemWeapon)));
        }
        if(tinydb.getObject(SavedArmor, DefaultArmor) != null && !((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemArmor)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getRarity(), ((ImageView)findViewById(R.id.itemArmor)));
        }
        if(tinydb.getObject(SavedSecWeapon, DefaultSecWeapon) != null && !((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemSecWeapon)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getRarity(), ((ImageView)findViewById(R.id.itemSecWeapon)));
        }
        if(tinydb.getObject(SavedShoes, DefaultShoes) != null && !((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getName().equals("")) {
            ((ImageView)findViewById(R.id.itemShoes)).setImageDrawable(getDrawable(((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getImg()));
            setRarityBorder(((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getRarity(), ((ImageView)findViewById(R.id.itemShoes)));
        }

        CalculateStats(tinydb);
        loadStats();
    }

    private void setRarityBorder(int rarity, ImageView imageView)
    {
        switch (rarity)
        {
            case 0:
                imageView.setBackground(null);
                break;
            case 1:
                imageView.setBackground(getDrawable(R.drawable.unique_border));
                break;
            case 2:
                imageView.setBackground(getDrawable(R.drawable.heroic_border));
            break;
            case 3:
                imageView.setBackground(getDrawable(R.drawable.legendary_border));
                break;
            default:
                imageView.setBackground(getDrawable(R.drawable.improved_border));
                break;
        }
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

    public void onItemClick(View view) {
        if(((ImageView)view).getDrawable() != null)
            openItemView(view);
    }

    String itemInUse = SavedHelmet;
    private void openItemView(View view)
    {
        findViewById(R.id.imageView).setBackground(getDrawable(R.drawable.item_info));
        findViewById(R.id.heroImage).setVisibility(View.GONE);
        findViewById(R.id.itemHelmet).setVisibility(View.GONE);
        findViewById(R.id.itemRing).setVisibility(View.GONE);
        findViewById(R.id.itemNecklace).setVisibility(View.GONE);
        findViewById(R.id.itemGloves).setVisibility(View.GONE);
        findViewById(R.id.itemWeapon).setVisibility(View.GONE);
        findViewById(R.id.itemArmor).setVisibility(View.GONE);
        findViewById(R.id.itemSecWeapon).setVisibility(View.GONE);
        findViewById(R.id.itemShoes).setVisibility(View.GONE);
        findViewById(R.id.statsAttack).setVisibility(View.GONE);
        findViewById(R.id.statsArmor).setVisibility(View.GONE);
        findViewById(R.id.statsSa).setVisibility(View.GONE);
        findViewById(R.id.statsHp).setVisibility(View.GONE);
        findViewById(R.id.statsSlowDown).setVisibility(View.GONE);
        findViewById(R.id.statsCounter).setVisibility(View.GONE);
        findViewById(R.id.statsStrength).setVisibility(View.GONE);
        findViewById(R.id.statsDexterity).setVisibility(View.GONE);
        findViewById(R.id.statsIntellect).setVisibility(View.GONE);
        findViewById(R.id.statsHealing).setVisibility(View.GONE);
        findViewById(R.id.statsAbsorption).setVisibility(View.GONE);
        findViewById(R.id.statsMagicAbs).setVisibility(View.GONE);
        findViewById(R.id.statsCritic).setVisibility(View.GONE);
        findViewById(R.id.statsDodge).setVisibility(View.GONE);
        findViewById(R.id.statsBlock).setVisibility(View.GONE);
        findViewById(R.id.statsCritPow).setVisibility(View.GONE);
        findViewById(R.id.statsArmorPen).setVisibility(View.GONE);
        findViewById(R.id.statsMagicRes).setVisibility(View.GONE);

        findViewById(R.id.itemImg).setVisibility(View.VISIBLE);
        findViewById(R.id.itemName).setVisibility(View.VISIBLE);
        findViewById(R.id.itemRarity).setVisibility(View.VISIBLE);
        findViewById(R.id.itemClass).setVisibility(View.VISIBLE);
        findViewById(R.id.itemClassImg1).setVisibility(View.VISIBLE);
        findViewById(R.id.itemClassImg2).setVisibility(View.VISIBLE);
        findViewById(R.id.itemClassImg3).setVisibility(View.VISIBLE);
        findViewById(R.id.itemLvl).setVisibility(View.VISIBLE);
        findViewById(R.id.itemPrice).setVisibility(View.VISIBLE);
        findViewById(R.id.itemStats).setVisibility(View.VISIBLE);
        findViewById(R.id.itemBuy).setVisibility(View.VISIBLE);

        Item item = getItemFromId(view.getId());
        ((TextView)findViewById(R.id.itemName)).setText(item.getName());
        ((ImageView)findViewById(R.id.itemImg)).setImageDrawable(((ImageView)view).getDrawable());

        switch (item.getRarity())
        {
            case 0:
                ((TextView)findViewById(R.id.itemRarity)).setText("");
                break;
            case 1:
                ((TextView)findViewById(R.id.itemRarity)).setText("Unique");
                ((TextView) findViewById(R.id.itemRarity)).setTextColor(Color.parseColor("#946903"));
                break;
            case 2:
                ((TextView)findViewById(R.id.itemRarity)).setText("Heroic");
                ((TextView) findViewById(R.id.itemRarity)).setTextColor(Color.parseColor("#004f81"));
                break;
            case 3:
                ((TextView)findViewById(R.id.itemRarity)).setText("Legendary");
                ((TextView) findViewById(R.id.itemRarity)).setTextColor(Color.parseColor("#de5e03"));
                break;
            default:
                ((TextView)findViewById(R.id.itemRarity)).setText("Improved");
                ((TextView) findViewById(R.id.itemRarity)).setTextColor(Color.parseColor("#636262"));
                break;
        }

        findViewById(R.id.itemClassImg1).setBackground(null);
        findViewById(R.id.itemClassImg2).setBackground(null);
        findViewById(R.id.itemClassImg3).setBackground(null);
        String[] itemClasses = item.getClasses();
        if(itemClasses.length > 3)
            ((TextView)findViewById(R.id.itemClass)).setText(" Class: all");
        else
        {
            int whichImg = 1;
            ((TextView)findViewById(R.id.itemClass)).setText(" Class: ");

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

        ((TextView)findViewById(R.id.itemLvl)).setText(" Lvl: " + item.getLvl());
        ((TextView)findViewById(R.id.itemPrice)).setText(" Price: " + item.getCost());

        ((TextView)findViewById(R.id.itemStats)).setText(GetItemStats(item));
    }

    private int setClassImgs(int whichImg, int icon)
    {
        switch (whichImg)
        {
            case 1:
                findViewById(R.id.itemClassImg1).setBackground(getDrawable(icon));
                whichImg++;
                break;

            case 2:
                findViewById(R.id.itemClassImg2).setBackground(getDrawable(icon));
                whichImg++;
                break;

            case 3:
                findViewById(R.id.itemClassImg3).setBackground(getDrawable(icon));
                whichImg++;
                break;
        }
        return whichImg;
    }

    private Item getItemFromId (int id)
    {
        switch (id)
        {
            case R.id.itemHelmet:
                itemInUse = SavedHelmet;
                return tinydb.getObject(SavedHelmet, DefaultHelmet);

            case R.id.itemRing:
                itemInUse = SavedRing;
                return tinydb.getObject(SavedRing, DefaultRing);

            case R.id.itemNecklace:
                itemInUse = SavedNecklace;
                return tinydb.getObject(SavedNecklace, DefaultNecklace);

            case R.id.itemGloves:
                itemInUse = SavedGloves;
                return tinydb.getObject(SavedGloves, DefaultGloves);

            case R.id.itemWeapon:
                Item item = tinydb.getObject(SavedWeapon, DefaultWeapon);
                if(item.getName().equals("")) {
                    itemInUse = SavedTwoHandedWeapon;
                    return tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon);
                } else {
                    itemInUse = SavedWeapon;
                    return tinydb.getObject(SavedWeapon, DefaultWeapon);
                }

            case R.id.itemArmor:
                itemInUse = SavedArmor;
                return tinydb.getObject(SavedArmor, DefaultArmor);

            case R.id.itemSecWeapon:
                itemInUse = SavedSecWeapon;
                return tinydb.getObject(SavedSecWeapon, DefaultSecWeapon);

            case R.id.itemShoes:
                itemInUse = SavedShoes;
                return tinydb.getObject(SavedShoes, DefaultShoes);

            default:
                itemInUse = SavedWeapon;
                return tinydb.getObject(SavedWeapon, DefaultWeapon);
        }
    }

    public void onItemRemoveClick(View view) {
        ArrayList<Item> eq = tinydb.getListObject(SavedEq, Item.class);
        if(eq.size() < 69)
        {
            eq.add((Item)tinydb.getObject(itemInUse, DefaultHelmet));
            tinydb.putListObject(SavedEq, eq);
            tinydb.putObject(itemInUse, DefaultHelmet);
            closeItemView();
            CalculateStats(tinydb);
            loadStats();

            finish();
            startActivity(getIntent());
        }
        else
            Toast.makeText(this, "Unfortunately, equipment is already full", Toast.LENGTH_SHORT).show();
    }

    public void onCloseClick(View view) {
        closeItemView();
    }

    private void closeItemView()
    {
        findViewById(R.id.imageView).setBackground(getDrawable(R.drawable.hero_img_info));
        findViewById(R.id.heroImage).setVisibility(View.VISIBLE);
        findViewById(R.id.itemHelmet).setVisibility(View.VISIBLE);
        findViewById(R.id.itemRing).setVisibility(View.VISIBLE);
        findViewById(R.id.itemNecklace).setVisibility(View.VISIBLE);
        findViewById(R.id.itemGloves).setVisibility(View.VISIBLE);
        findViewById(R.id.itemWeapon).setVisibility(View.VISIBLE);
        findViewById(R.id.itemArmor).setVisibility(View.VISIBLE);
        findViewById(R.id.itemSecWeapon).setVisibility(View.VISIBLE);
        findViewById(R.id.itemShoes).setVisibility(View.VISIBLE);
        findViewById(R.id.itemShoes).setVisibility(View.VISIBLE);
        findViewById(R.id.statsAttack).setVisibility(View.VISIBLE);
        findViewById(R.id.statsArmor).setVisibility(View.VISIBLE);
        findViewById(R.id.statsSa).setVisibility(View.VISIBLE);
        findViewById(R.id.statsHp).setVisibility(View.VISIBLE);
        findViewById(R.id.statsSlowDown).setVisibility(View.VISIBLE);
        findViewById(R.id.statsCounter).setVisibility(View.VISIBLE);
        findViewById(R.id.statsStrength).setVisibility(View.VISIBLE);
        findViewById(R.id.statsDexterity).setVisibility(View.VISIBLE);
        findViewById(R.id.statsIntellect).setVisibility(View.VISIBLE);
        findViewById(R.id.statsHealing).setVisibility(View.VISIBLE);
        findViewById(R.id.statsAbsorption).setVisibility(View.VISIBLE);
        findViewById(R.id.statsMagicAbs).setVisibility(View.VISIBLE);
        findViewById(R.id.statsCritic).setVisibility(View.VISIBLE);
        findViewById(R.id.statsDodge).setVisibility(View.VISIBLE);
        findViewById(R.id.statsBlock).setVisibility(View.VISIBLE);
        findViewById(R.id.statsCritPow).setVisibility(View.VISIBLE);
        findViewById(R.id.statsArmorPen).setVisibility(View.VISIBLE);
        findViewById(R.id.statsMagicRes).setVisibility(View.VISIBLE);

        findViewById(R.id.itemImg).setVisibility(View.GONE);
        findViewById(R.id.itemName).setVisibility(View.GONE);
        findViewById(R.id.itemRarity).setVisibility(View.GONE);
        findViewById(R.id.itemClass).setVisibility(View.GONE);
        findViewById(R.id.itemClassImg1).setVisibility(View.GONE);
        findViewById(R.id.itemClassImg2).setVisibility(View.GONE);
        findViewById(R.id.itemClassImg3).setVisibility(View.GONE);
        findViewById(R.id.itemLvl).setVisibility(View.GONE);
        findViewById(R.id.itemPrice).setVisibility(View.GONE);
        findViewById(R.id.itemStats).setVisibility(View.GONE);
        findViewById(R.id.itemBuy).setVisibility(View.GONE);
    }

    public static void CalculateStats(TinyDB tinydb)
    {
        int strength = DefaultStrength + ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getStrength() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getStrength() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getStrength() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getStrength() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getStrength()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getStrength()+ ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getStrength() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getStrength() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getStrength();
        if(tinydb.getInt(SavedLvl, DefaultLvl) > 20)
            strength += 50 + (tinydb.getInt(SavedLvl, DefaultLvl) - 20) * 4;
        else
            strength += Math.round(tinydb.getInt(SavedLvl, DefaultLvl) * 2.5);
        tinydb.putInt(SavedStrength, strength);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int dexterity = DefaultDexterity +((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getDexterity() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getDexterity() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getDexterity() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getDexterity() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getDexterity()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getDexterity()+ ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getDexterity() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getDexterity() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getDexterity()
                + (int)Math.round(tinydb.getInt(SavedLvl, DefaultLvl) * 1.5);
        tinydb.putInt(SavedDexterity, dexterity);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int intellect = DefaultIntellect + ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getIntellect() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getIntellect() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getIntellect() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getIntellect() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getIntellect()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getIntellect() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getIntellect() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getIntellect() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getIntellect()
                + Math.round(tinydb.getInt(SavedLvl, DefaultLvl) * 3);
        tinydb.putInt(SavedIntellect, intellect);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int attackFrom = DefaultAttackFrom + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getAttackFrom() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getAttackFrom() + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getAttackFrom();
        int attackTo = DefaultAttackTo +((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getAttackTo() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getAttackTo() + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getAttackTo();
        int additionalAttack = (intellect / 7) + (strength / 4);
        tinydb.putInt(SavedAttackFrom, attackFrom + additionalAttack);
        tinydb.putInt(SavedAttackTo, attackTo + additionalAttack);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int armor = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getArmor() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getArmor() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getArmor() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getArmor()
                + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getArmor() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getArmor() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getArmor();
        tinydb.putInt(SavedArmorStats, armor);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        double sa = DefaultSa + ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getSa() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getSa() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getSa() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getSa() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getSa()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getSa() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getSa() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getSa() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getSa();
        if(dexterity > 100)
            sa += 2 + (dexterity - 100) * 0.005;
        else
            sa += dexterity * 0.02;
        tinydb.putDouble(SavedSa, Math.round(sa * 100.0) / 100.0);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        long hp = DefaultHp + ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getHp() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getHp() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getHp() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getHp() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getHp()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getHp() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getHp() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getHp() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getHp()
                + 20 * Math.round(Math.pow(tinydb.getInt(SavedLvl, DefaultLvl), 1.25)) + strength * 5 + Math.round(((Item) tinydb.getObject(SavedArmor, DefaultArmor)).getHpForStrength() * tinydb.getInt(SavedLvl, DefaultLvl) * strength);
        tinydb.putInt(SavedMaxHp, (int)hp);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        double slowDown = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getSlowDown() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getSlowDown() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getSlowDown() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getSlowDown() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getSlowDown()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getSlowDown() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getSlowDown() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getSlowDown() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getSlowDown();
        tinydb.putDouble(SavedSlowDown, Math.round(slowDown * 100.0) / 100.0);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int counter = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getCounter() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getCounter() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getCounter() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getCounter() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getCounter()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getCounter() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getCounter() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getCounter() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getCounter();
        tinydb.putInt(SavedCounter, counter);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int healing = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getHealing() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getHealing() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getHealing() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getHealing() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getHealing()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getHealing() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getHealing() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getHealing() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getHealing();
        tinydb.putInt(SavedHealing, healing);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int absorption = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getAbsorption() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getAbsorption() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getAbsorption() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getAbsorption() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getAbsorption()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getAbsorption() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getAbsorption() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getAbsorption() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getAbsorption();
        if(absorption > 5 * intellect)
            absorption = 5 * intellect;
        tinydb.putInt(SavedAbsorption, absorption);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int magicAbs = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getMagicAbs() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getMagicAbs() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getMagicAbs() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getMagicAbs() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getMagicAbs()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getMagicAbs() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getMagicAbs() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getMagicAbs() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getMagicAbs();
        if(magicAbs > 5 * intellect)
            magicAbs = 5 * intellect;
        tinydb.putInt(SavedMagicAbs, magicAbs);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        double critic = DefaultCritic + ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getCritic() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getCritic() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getCritic() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getCritic() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getCritic()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getCritic() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getCritic() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getCritic() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getCritic()
                + tinydb.getInt(SavedLvl, DefaultLvl) * 0.02;
        tinydb.putDouble(SavedCritic, Math.round(critic * 100.0) / 100.0);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int dodge = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getDodge() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getDodge() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getDodge() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getDodge() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getDodge()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getDodge() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getDodge() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getDodge() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getDodge()
                + Math.round(dexterity / 30);
        dodge = (dodge * 20 / tinydb.getInt(SavedLvl, DefaultLvl));
        tinydb.putInt(SavedDodge, dodge);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int block = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getBlock() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getBlock() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getBlock() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getBlock() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getBlock()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getBlock() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getBlock() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getBlock() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getBlock();
        block = 20 * block / tinydb.getInt(SavedLvl, DefaultLvl);
        tinydb.putInt(SavedBlock, block);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int critPow = DefaultCritPower + ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getCritPower() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getCritPower() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getCritPower() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getCritPower() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getCritPower()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getCritPower() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getCritPower() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getCritPower() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getCritPower();
        if(tinydb.getInt(SavedLvl, DefaultLvl) > 20) {
            critPow += strength / Math.round(tinydb.getInt(SavedLvl, DefaultLvl) / 2) + strength / Math.round(tinydb.getInt(SavedLvl, DefaultLvl) / 3);
            critPow += strength / Math.round(tinydb.getInt(SavedLvl, DefaultLvl) / 2) + (intellect / 2) / Math.round(tinydb.getInt(SavedLvl, DefaultLvl) / 3);}
        tinydb.putInt(SavedCritPower, critPow);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int ArmorPen = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getArmorPen() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getArmorPen() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getArmorPen() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getArmorPen() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getArmorPen()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getArmorPen() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getArmorPen() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getArmorPen() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getArmorPen();
        tinydb.putInt(SavedArmorPen, ArmorPen);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int MagicRes = ((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getMagicRes() + ((Item)tinydb.getObject(SavedRing, DefaultRing)).getMagicRes() + ((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getMagicRes() + ((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getMagicRes() + ((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getMagicRes()
                + ((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getMagicRes() + ((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getMagicRes() + ((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getMagicRes() + ((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getMagicRes();
        tinydb.putInt(SavedMagicRes, MagicRes);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int ifHaveLegendaryBonusOstatniRatunek = 0;
        if(((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedRing, DefaultRing)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        if(((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getLegendaryBonus() == LegendaryBonusses.OstatniRatunek)
            ifHaveLegendaryBonusOstatniRatunek++;
        tinydb.putInt(SavedIfHaveLegendaryBonusOstatniRatunek, ifHaveLegendaryBonusOstatniRatunek);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int ifHaveLegendaryBonusOslepienie = 0;
        if(((Item)tinydb.getObject(SavedHelmet, DefaultHelmet)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedRing, DefaultRing)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedNecklace, DefaultNecklace)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedGloves, DefaultGloves)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedWeapon, DefaultWeapon)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedTwoHandedWeapon, DefaultTwoHandedWeapon)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedArmor, DefaultArmor)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedSecWeapon, DefaultSecWeapon)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        if(((Item)tinydb.getObject(SavedShoes, DefaultShoes)).getLegendaryBonus() == LegendaryBonusses.Oslepienie)
            ifHaveLegendaryBonusOslepienie++;
        tinydb.putInt(SavedIfHaveLegendaryBonusOslepienie, ifHaveLegendaryBonusOslepienie);
    }

    public void loadStats()
    {
        ((TextView)findViewById(R.id.statsAttack)).setText("Attack: " + tinydb.getInt(SavedAttackFrom, DefaultAttackFrom) + "-" + tinydb.getInt(SavedAttackTo, 0));
        ((TextView)findViewById(R.id.statsArmor)).setText("Armor: " + tinydb.getInt(SavedArmorStats, DefaultArmorStats));
        ((TextView)findViewById(R.id.statsStrength)).setText("Strength: " + tinydb.getInt(SavedStrength, DefaultStrength));
        ((TextView)findViewById(R.id.statsDexterity)).setText("Dexterity: " + tinydb.getInt(SavedDexterity, DefaultDexterity));
        ((TextView)findViewById(R.id.statsIntellect)).setText("Intellect: " + tinydb.getInt(SavedIntellect, DefaultIntellect));
        ((TextView)findViewById(R.id.statsSa)).setText("SA: " + tinydb.getDouble(SavedSa, DefaultSa));
        ((TextView)findViewById(R.id.statsHp)).setText("HP: " + tinydb.getInt(SavedMaxHp, DefaultMaxHp));
        ((TextView)findViewById(R.id.statsSlowDown)).setText("Slow Down: " + tinydb.getDouble(SavedSlowDown, DefaultSlowDown));
        ((TextView)findViewById(R.id.statsCounter)).setText("Counter: " + tinydb.getInt(SavedCounter, DefaultCounter) + "%");
        ((TextView)findViewById(R.id.statsHealing)).setText("Healing: " + tinydb.getInt(SavedHealing, DefaultHealing));
        ((TextView)findViewById(R.id.statsAbsorption)).setText("Absorption: " + tinydb.getInt(SavedAbsorption, DefaultAbsorption));
        ((TextView)findViewById(R.id.statsMagicAbs)).setText("Magic Abs.: " + tinydb.getInt(SavedMagicAbs, DefaultMagicAbs));
        ((TextView)findViewById(R.id.statsCritic)).setText("Critic: " + tinydb.getDouble(SavedCritic, DefaultCritic) + "%");
        ((TextView)findViewById(R.id.statsDodge)).setText("Dodge: " + tinydb.getInt(SavedDodge, DefaultDodge) + "%");
        ((TextView)findViewById(R.id.statsBlock)).setText("Block: " + tinydb.getInt(SavedBlock, DefaultBlock) + "%");
        ((TextView)findViewById(R.id.statsCritPow)).setText("Crit. Pow.: " + tinydb.getInt(SavedCritPower, DefaultCritPower) + "%");
        ((TextView)findViewById(R.id.statsArmorPen)).setText("Armor Pen.: " + tinydb.getInt(SavedArmorPen, DefaultArmorPen) + "%");
        ((TextView)findViewById(R.id.statsMagicRes)).setText("Magic Res.: " + tinydb.getInt(SavedMagicRes, DefaultMagicRes) + "%");
    }
}
