package com.example.margorpg;

import androidx.appcompat.app.AppCompatActivity;

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

import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.GetItemStats;
import static com.example.margorpg.Resources.LoadHeroInfo;
import static com.example.margorpg.Resources.Other;
import static com.example.margorpg.Resources.Potions;
import static com.example.margorpg.Resources.SavedMoney;
import static com.example.margorpg.Resources.b;
import static com.example.margorpg.Resources.h;
import static com.example.margorpg.Resources.m;
import static com.example.margorpg.Resources.p;
import static com.example.margorpg.Resources.t;
import static com.example.margorpg.Resources.w;
import static com.example.margorpg.Resources.ArmorP;
import static com.example.margorpg.Resources.GlovesP;
import static com.example.margorpg.Resources.HelmetsP;
import static com.example.margorpg.Resources.NecklacesP;
import static com.example.margorpg.Resources.RingsP;
import static com.example.margorpg.Resources.SecWeaponsP;
import static com.example.margorpg.Resources.ShoesP;
import static com.example.margorpg.Resources.WeaponsP;
import static com.example.margorpg.Resources.szerokiMiecz;

public class BuyActivity extends AppCompatActivity {

    private Item[] arrayInUse = WeaponsP;
    private int itemInUse = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        String buyingName = getIntent().getExtras().getString("buyingName");
        ((TextView)findViewById(R.id.textView5)).setText(buyingName);

        LoadHeroInfo(this, new TinyDB(this));

        switch (buyingName)
        {
            case "Weapons":
                arrayInUse = WeaponsP;
                break;

            case "Armor":
                arrayInUse = ArmorP;
                break;

            case "Shoes":
                arrayInUse = ShoesP;
                break;

            case "Helmets":
                arrayInUse = HelmetsP;
                break;

            case "Gloves":
                arrayInUse = GlovesP;
                break;

            case "Rings":
                arrayInUse = RingsP;
                break;

            case "Necklaces":
                arrayInUse = NecklacesP;
                break;

            case "Sec. Weapons":
                arrayInUse = SecWeaponsP;
                break;

            case "Potions":
                arrayInUse = Potions;
                break;

            case "Other":
                arrayInUse = Other;
                break;
        }

        if(arrayInUse.length > 0) {
            ((ImageView)findViewById(R.id.Buy11)).setImageDrawable(getDrawable(arrayInUse[0].getImg()));
            setRarityBorder(arrayInUse[0].getRarity(), ((ImageView)findViewById(R.id.Buy11))); }
        if(arrayInUse.length > 1) {
            ((ImageView)findViewById(R.id.Buy21)).setImageDrawable(getDrawable(arrayInUse[1].getImg()));
            setRarityBorder(arrayInUse[1].getRarity(), ((ImageView)findViewById(R.id.Buy21))); }
        if(arrayInUse.length > 2) {
            ((ImageView)findViewById(R.id.Buy31)).setImageDrawable(getDrawable(arrayInUse[2].getImg()));
            setRarityBorder(arrayInUse[2].getRarity(), ((ImageView)findViewById(R.id.Buy31))); }
        if(arrayInUse.length > 3) {
            ((ImageView)findViewById(R.id.Buy41)).setImageDrawable(getDrawable(arrayInUse[3].getImg()));
            setRarityBorder(arrayInUse[3].getRarity(), ((ImageView)findViewById(R.id.Buy41))); }
        if(arrayInUse.length > 4) {
            ((ImageView)findViewById(R.id.Buy51)).setImageDrawable(getDrawable(arrayInUse[4].getImg()));
            setRarityBorder(arrayInUse[4].getRarity(), ((ImageView)findViewById(R.id.Buy51))); }
        if(arrayInUse.length > 5) {
            ((ImageView)findViewById(R.id.Buy61)).setImageDrawable(getDrawable(arrayInUse[5].getImg()));
            setRarityBorder(arrayInUse[5].getRarity(), ((ImageView)findViewById(R.id.Buy61))); }
        if(arrayInUse.length > 6) {
            ((ImageView)findViewById(R.id.Buy71)).setImageDrawable(getDrawable(arrayInUse[6].getImg()));
            setRarityBorder(arrayInUse[6].getRarity(), ((ImageView)findViewById(R.id.Buy71))); }
        if(arrayInUse.length > 7) {
            ((ImageView)findViewById(R.id.Buy81)).setImageDrawable(getDrawable(arrayInUse[7].getImg()));
            setRarityBorder(arrayInUse[7].getRarity(), ((ImageView)findViewById(R.id.Buy81))); }
        if(arrayInUse.length > 8) {
            ((ImageView)findViewById(R.id.Buy12)).setImageDrawable(getDrawable(arrayInUse[8].getImg()));
            setRarityBorder(arrayInUse[8].getRarity(), ((ImageView)findViewById(R.id.Buy12))); }
        if(arrayInUse.length > 9) {
            ((ImageView)findViewById(R.id.Buy22)).setImageDrawable(getDrawable(arrayInUse[9].getImg()));
            setRarityBorder(arrayInUse[9].getRarity(), ((ImageView)findViewById(R.id.Buy22))); }
        if(arrayInUse.length > 10) {
            ((ImageView)findViewById(R.id.Buy32)).setImageDrawable(getDrawable(arrayInUse[10].getImg()));
            setRarityBorder(arrayInUse[10].getRarity(), ((ImageView)findViewById(R.id.Buy32))); }
        if(arrayInUse.length > 11) {
            ((ImageView)findViewById(R.id.Buy42)).setImageDrawable(getDrawable(arrayInUse[11].getImg()));
            setRarityBorder(arrayInUse[11].getRarity(), ((ImageView)findViewById(R.id.Buy42))); }
        if(arrayInUse.length > 12) {
            ((ImageView)findViewById(R.id.Buy52)).setImageDrawable(getDrawable(arrayInUse[12].getImg()));
            setRarityBorder(arrayInUse[12].getRarity(), ((ImageView)findViewById(R.id.Buy52))); }
        if(arrayInUse.length > 13) {
            ((ImageView)findViewById(R.id.Buy62)).setImageDrawable(getDrawable(arrayInUse[13].getImg()));
            setRarityBorder(arrayInUse[13].getRarity(), ((ImageView)findViewById(R.id.Buy62))); }
        if(arrayInUse.length > 14) {
            ((ImageView)findViewById(R.id.Buy72)).setImageDrawable(getDrawable(arrayInUse[14].getImg()));
            setRarityBorder(arrayInUse[14].getRarity(), ((ImageView)findViewById(R.id.Buy72))); }
        if(arrayInUse.length > 15) {
            ((ImageView)findViewById(R.id.Buy82)).setImageDrawable(getDrawable(arrayInUse[15].getImg()));
            setRarityBorder(arrayInUse[15].getRarity(), ((ImageView)findViewById(R.id.Buy82))); }
        if(arrayInUse.length > 16) {
            ((ImageView)findViewById(R.id.Buy13)).setImageDrawable(getDrawable(arrayInUse[16].getImg()));
            setRarityBorder(arrayInUse[16].getRarity(), ((ImageView)findViewById(R.id.Buy13))); }
        if(arrayInUse.length > 17) {
            ((ImageView)findViewById(R.id.Buy23)).setImageDrawable(getDrawable(arrayInUse[17].getImg()));
            setRarityBorder(arrayInUse[17].getRarity(), ((ImageView)findViewById(R.id.Buy23))); }
        if(arrayInUse.length > 18) {
            ((ImageView)findViewById(R.id.Buy33)).setImageDrawable(getDrawable(arrayInUse[18].getImg()));
            setRarityBorder(arrayInUse[18].getRarity(), ((ImageView)findViewById(R.id.Buy33))); }
        if(arrayInUse.length > 19) {
            ((ImageView)findViewById(R.id.Buy43)).setImageDrawable(getDrawable(arrayInUse[19].getImg()));
            setRarityBorder(arrayInUse[19].getRarity(), ((ImageView)findViewById(R.id.Buy43))); }
        if(arrayInUse.length > 20) {
            ((ImageView)findViewById(R.id.Buy53)).setImageDrawable(getDrawable(arrayInUse[20].getImg()));
            setRarityBorder(arrayInUse[20].getRarity(), ((ImageView)findViewById(R.id.Buy53))); }
        if(arrayInUse.length > 21) {
            ((ImageView)findViewById(R.id.Buy63)).setImageDrawable(getDrawable(arrayInUse[21].getImg()));
            setRarityBorder(arrayInUse[21].getRarity(), ((ImageView)findViewById(R.id.Buy63))); }
        if(arrayInUse.length > 22) {
            ((ImageView)findViewById(R.id.Buy73)).setImageDrawable(getDrawable(arrayInUse[22].getImg()));
            setRarityBorder(arrayInUse[22].getRarity(), ((ImageView)findViewById(R.id.Buy73))); }
        if(arrayInUse.length > 23) {
            ((ImageView)findViewById(R.id.Buy83)).setImageDrawable(getDrawable(arrayInUse[23].getImg()));
            setRarityBorder(arrayInUse[23].getRarity(), ((ImageView)findViewById(R.id.Buy83))); }

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

    public void onItemClick(View view) {
        if(((ImageView)view).getDrawable() != null)
            openItemView(view);
    }

    private void openItemView(View view)
    {
        findViewById(R.id.imageView2).setBackground(getDrawable(R.drawable.shop_info));
        findViewById(R.id.textView5).setVisibility(View.GONE);

        findViewById(R.id.Buy11).setVisibility(View.GONE);
        findViewById(R.id.Buy21).setVisibility(View.GONE);
        findViewById(R.id.Buy31).setVisibility(View.GONE);
        findViewById(R.id.Buy41).setVisibility(View.GONE);
        findViewById(R.id.Buy51).setVisibility(View.GONE);
        findViewById(R.id.Buy61).setVisibility(View.GONE);
        findViewById(R.id.Buy71).setVisibility(View.GONE);
        findViewById(R.id.Buy81).setVisibility(View.GONE);
        findViewById(R.id.Buy12).setVisibility(View.GONE);
        findViewById(R.id.Buy22).setVisibility(View.GONE);
        findViewById(R.id.Buy32).setVisibility(View.GONE);
        findViewById(R.id.Buy42).setVisibility(View.GONE);
        findViewById(R.id.Buy52).setVisibility(View.GONE);
        findViewById(R.id.Buy62).setVisibility(View.GONE);
        findViewById(R.id.Buy72).setVisibility(View.GONE);
        findViewById(R.id.Buy82).setVisibility(View.GONE);
        findViewById(R.id.Buy13).setVisibility(View.GONE);
        findViewById(R.id.Buy23).setVisibility(View.GONE);
        findViewById(R.id.Buy33).setVisibility(View.GONE);
        findViewById(R.id.Buy43).setVisibility(View.GONE);
        findViewById(R.id.Buy53).setVisibility(View.GONE);
        findViewById(R.id.Buy63).setVisibility(View.GONE);
        findViewById(R.id.Buy73).setVisibility(View.GONE);
        findViewById(R.id.Buy83).setVisibility(View.GONE);

        findViewById(R.id.shopItemImg).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemName).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemRarity).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemClass).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemClassImg1).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemClassImg2).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemClassImg3).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemLvl).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemPrice).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemStats).setVisibility(View.VISIBLE);
        findViewById(R.id.shopItemBuy).setVisibility(View.VISIBLE);

        Item item = getItemFromId(view.getId());
        ((TextView)findViewById(R.id.shopItemName)).setText(item.getName());
        ((ImageView)findViewById(R.id.shopItemImg)).setImageDrawable(((ImageView)view).getDrawable());

        switch (item.getRarity())
        {
            case 0:
                ((TextView)findViewById(R.id.shopItemRarity)).setText("");
                break;
            case 1:
                ((TextView)findViewById(R.id.shopItemRarity)).setText("Unique");
                ((TextView) findViewById(R.id.shopItemRarity)).setTextColor(Color.parseColor("#946903"));
                break;
            case 2:
                ((TextView)findViewById(R.id.shopItemRarity)).setText("Heroic");
                ((TextView) findViewById(R.id.shopItemRarity)).setTextColor(Color.parseColor("#004f81"));
                break;
            case 3:
                ((TextView)findViewById(R.id.shopItemRarity)).setText("Legendary");
                ((TextView) findViewById(R.id.shopItemRarity)).setTextColor(Color.parseColor("#de5e03"));
                break;
            default:
                ((TextView)findViewById(R.id.shopItemRarity)).setText("Improved");
                ((TextView) findViewById(R.id.shopItemRarity)).setTextColor(Color.parseColor("#636262"));
                break;
        }

        findViewById(R.id.shopItemClassImg1).setBackground(null);
        findViewById(R.id.shopItemClassImg2).setBackground(null);
        findViewById(R.id.shopItemClassImg3).setBackground(null);
        String[] itemClasses = item.getClasses();
        if(itemClasses.length > 3)
            ((TextView)findViewById(R.id.shopItemClass)).setText(" Class: all");
        else
        {
            int whichImg = 1;
            ((TextView)findViewById(R.id.shopItemClass)).setText(" Class: ");

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

        ((TextView)findViewById(R.id.shopItemLvl)).setText(" Lvl: " + item.getLvl());
        if(item.getAmount() > 1)
            ((TextView)findViewById(R.id.shopItemPrice)).setText(" Price: " + item.getCost() * item.getAmount());
        else
            ((TextView)findViewById(R.id.shopItemPrice)).setText(" Price: " + item.getCost());

        ((TextView)findViewById(R.id.shopItemStats)).setText(GetItemStats(item));
    }

    private int setClassImgs(int whichImg, int icon)
    {
        switch (whichImg)
        {
            case 1:
                findViewById(R.id.shopItemClassImg1).setBackground(getDrawable(icon));
                whichImg++;
                break;

            case 2:
                findViewById(R.id.shopItemClassImg2).setBackground(getDrawable(icon));
                whichImg++;
                break;

            case 3:
                findViewById(R.id.shopItemClassImg3).setBackground(getDrawable(icon));
                whichImg++;
                break;
        }
        return whichImg;
    }

    private Item getItemFromId (int id)
    {
        switch (id)
        {
            case R.id.Buy11:
                itemInUse = 0;
                return arrayInUse[itemInUse];

            case R.id.Buy21:
                itemInUse = 1;
                return arrayInUse[itemInUse];

            case R.id.Buy31:
                itemInUse = 2;
                return arrayInUse[itemInUse];

            case R.id.Buy41:
                itemInUse = 3;
                return arrayInUse[itemInUse];

            case R.id.Buy51:
                itemInUse = 4;
                return arrayInUse[itemInUse];

            case R.id.Buy61:
                itemInUse = 5;
                return arrayInUse[itemInUse];

            case R.id.Buy71:
                itemInUse = 6;
                return arrayInUse[itemInUse];

            case R.id.Buy81:
                itemInUse = 7;
                return arrayInUse[itemInUse];

            case R.id.Buy12:
                itemInUse = 8;
                return arrayInUse[itemInUse];

            case R.id.Buy22:
                itemInUse = 9;
                return arrayInUse[itemInUse];

            case R.id.Buy32:
                itemInUse = 10;
                return arrayInUse[itemInUse];

            case R.id.Buy42:
                itemInUse = 11;
                return arrayInUse[itemInUse];

            case R.id.Buy52:
                itemInUse = 12;
                return arrayInUse[itemInUse];

            case R.id.Buy62:
                itemInUse = 13;
                return arrayInUse[itemInUse];

            case R.id.Buy72:
                itemInUse = 14;
                return arrayInUse[itemInUse];

            case R.id.Buy82:
                itemInUse = 15;
                return arrayInUse[itemInUse];

            case R.id.Buy13:
                itemInUse = 16;
                return arrayInUse[itemInUse];

            case R.id.Buy23:
                itemInUse = 17;
                return arrayInUse[itemInUse];

            case R.id.Buy33:
                itemInUse = 18;
                return arrayInUse[itemInUse];

            case R.id.Buy43:
                itemInUse = 19;
                return arrayInUse[itemInUse];

            case R.id.Buy53:
                itemInUse = 20;
                return arrayInUse[itemInUse];

            case R.id.Buy63:
                itemInUse = 21;
                return arrayInUse[itemInUse];

            case R.id.Buy73:
                itemInUse = 22;
                return arrayInUse[itemInUse];

            case R.id.Buy83:
                itemInUse = 23;
                return arrayInUse[itemInUse];

            default:
                return szerokiMiecz;
        }
    }

    public void onCloseClick(View view) {
        closeShopeItemView();
    }

    private void closeShopeItemView()
    {
        findViewById(R.id.imageView2).setBackground(getDrawable(R.drawable.buy_img));
        findViewById(R.id.shopItemImg).setVisibility(View.GONE);
        findViewById(R.id.shopItemName).setVisibility(View.GONE);
        findViewById(R.id.shopItemRarity).setVisibility(View.GONE);
        findViewById(R.id.shopItemClass).setVisibility(View.GONE);
        findViewById(R.id.shopItemClassImg1).setVisibility(View.GONE);
        findViewById(R.id.shopItemClassImg2).setVisibility(View.GONE);
        findViewById(R.id.shopItemClassImg3).setVisibility(View.GONE);
        findViewById(R.id.shopItemLvl).setVisibility(View.GONE);
        findViewById(R.id.shopItemPrice).setVisibility(View.GONE);
        findViewById(R.id.shopItemStats).setVisibility(View.GONE);
        findViewById(R.id.shopItemBuy).setVisibility(View.GONE);

        findViewById(R.id.textView5).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy11).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy21).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy31).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy41).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy51).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy61).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy71).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy81).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy12).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy22).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy32).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy42).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy52).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy62).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy72).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy82).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy13).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy23).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy33).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy43).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy53).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy63).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy73).setVisibility(View.VISIBLE);
        findViewById(R.id.Buy83).setVisibility(View.VISIBLE);
    }

    public void onItemBuyClick(View view) {
        TinyDB tinydb = new TinyDB(this);
        int money = tinydb.getInt(SavedMoney, DefaultMoney);

        int itemCost = arrayInUse[itemInUse].getCost();
        if(arrayInUse[itemInUse].getAmount() > 1)
            itemCost *= arrayInUse[itemInUse].getAmount();

        if(money >= itemCost)
        {
            ArrayList<Item> eq = tinydb.getListObject("eq", Item.class);

            if(!(eq.size() >= 69))
            {
                boolean isItemAdded = false;

                tinydb.putInt(SavedMoney, money - itemCost);
                ((TextView)findViewById(R.id.hero_money)).setText(tinydb.getInt(SavedMoney, DefaultMoney) + " ");
                Toast.makeText(this, ("You successfully bought " + arrayInUse[itemInUse].getName()), Toast.LENGTH_SHORT).show();

                if((arrayInUse[itemInUse].getItemType() == ItemTypes.potion || arrayInUse[itemInUse].getItemType() == ItemTypes.other) && arrayInUse[itemInUse].getAmount() < arrayInUse[itemInUse].getMaxAmount())
                {
                    for(int i = 0; i < eq.size(); i++)
                    {
                        if(eq.get(i).getName().equals(arrayInUse[itemInUse].getName()) && eq.get(i).getMaxAmount() > eq.get(i).getAmount())
                        {
                            eq.get(i).setAmount(eq.get(i).getAmount() + arrayInUse[itemInUse].getAmount());
                            isItemAdded = true;
                            if(eq.get(i).getAmount() > eq.get(i).getMaxAmount())
                            {
                                Item itemToAdd = new Item(eq.get(i));
                                itemToAdd.setAmount(eq.get(i).getAmount() - eq.get(i).getMaxAmount());
                                eq.get(i).setAmount(eq.get(i).getMaxAmount());
                                eq.add(itemToAdd);
                            }
                            i = 100;
                        }
                    }
                }

                if(!isItemAdded)
                {
                    eq.add(arrayInUse[itemInUse]);
                    closeShopeItemView();
                }

                tinydb.putListObject("eq", eq);
            }
            else
                Toast.makeText(this, "Unfortunately, equipment is already full", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Unfortunately, you can't afford this item", Toast.LENGTH_SHORT).show();
    }


}
