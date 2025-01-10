package com.example.margorpg.Attack;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.margorpg.EqActivity;
import com.example.margorpg.Item;
import com.example.margorpg.ItemTypes;
import com.example.margorpg.MainActivity;
import com.example.margorpg.R;
import com.example.margorpg.ShopActivity;
import com.example.margorpg.TinyDB;

import java.util.ArrayList;
import java.util.Random;

import static com.example.margorpg.MainActivity.CalculateStats;
import static com.example.margorpg.Resources.DefaultAbsorption;
import static com.example.margorpg.Resources.DefaultArmorPen;
import static com.example.margorpg.Resources.DefaultArmorStats;
import static com.example.margorpg.Resources.DefaultAttackFrom;
import static com.example.margorpg.Resources.DefaultAttackTo;
import static com.example.margorpg.Resources.DefaultBlock;
import static com.example.margorpg.Resources.DefaultClass;
import static com.example.margorpg.Resources.DefaultCounter;
import static com.example.margorpg.Resources.DefaultCritPower;
import static com.example.margorpg.Resources.DefaultCritic;
import static com.example.margorpg.Resources.DefaultDodge;
import static com.example.margorpg.Resources.DefaultExp;
import static com.example.margorpg.Resources.DefaultHealing;
import static com.example.margorpg.Resources.DefaultHp;
import static com.example.margorpg.Resources.DefaultIfHaveLegendaryBonusOslepienie;
import static com.example.margorpg.Resources.DefaultIfHaveLegendaryBonusOstatniRatunek;
import static com.example.margorpg.Resources.DefaultImageBack;
import static com.example.margorpg.Resources.DefaultLvl;
import static com.example.margorpg.Resources.DefaultMagicAbs;
import static com.example.margorpg.Resources.DefaultMagicRes;
import static com.example.margorpg.Resources.DefaultMaxHp;
import static com.example.margorpg.Resources.DefaultMoney;
import static com.example.margorpg.Resources.DefaultNickname;
import static com.example.margorpg.Resources.DefaultSa;
import static com.example.margorpg.Resources.DefaultSlowDown;
import static com.example.margorpg.Resources.GetItemStats;
import static com.example.margorpg.Resources.LoadHeroInfo;
import static com.example.margorpg.Resources.SavedAbsorption;
import static com.example.margorpg.Resources.SavedArmorPen;
import static com.example.margorpg.Resources.SavedArmorStats;
import static com.example.margorpg.Resources.SavedAttackFrom;
import static com.example.margorpg.Resources.SavedAttackTo;
import static com.example.margorpg.Resources.SavedBlock;
import static com.example.margorpg.Resources.SavedClass;
import static com.example.margorpg.Resources.SavedCounter;
import static com.example.margorpg.Resources.SavedCritPower;
import static com.example.margorpg.Resources.SavedCritic;
import static com.example.margorpg.Resources.SavedDodge;
import static com.example.margorpg.Resources.SavedEq;
import static com.example.margorpg.Resources.SavedExp;
import static com.example.margorpg.Resources.SavedHealing;
import static com.example.margorpg.Resources.SavedHp;
import static com.example.margorpg.Resources.SavedIfHaveLegendaryBonusOslepienie;
import static com.example.margorpg.Resources.SavedIfHaveLegendaryBonusOstatniRatunek;
import static com.example.margorpg.Resources.SavedImageBack;
import static com.example.margorpg.Resources.SavedLvl;
import static com.example.margorpg.Resources.SavedMagicAbs;
import static com.example.margorpg.Resources.SavedMagicRes;
import static com.example.margorpg.Resources.SavedMaxHp;
import static com.example.margorpg.Resources.SavedMoney;
import static com.example.margorpg.Resources.SavedNickname;
import static com.example.margorpg.Resources.SavedSa;
import static com.example.margorpg.Resources.SavedSlowDown;
import static com.example.margorpg.Resources.b;
import static com.example.margorpg.Resources.commonEnemyLists;
import static com.example.margorpg.Resources.elite2EnemyList;
import static com.example.margorpg.Resources.eliteEnemyList;
import static com.example.margorpg.Resources.getExpToNextLevel;
import static com.example.margorpg.Resources.h;
import static com.example.margorpg.Resources.m;
import static com.example.margorpg.Resources.p;
import static com.example.margorpg.Resources.swiecaZlodzieja;
import static com.example.margorpg.Resources.t;
import static com.example.margorpg.Resources.tytanEnemyList;
import static com.example.margorpg.Resources.w;

public class FightActivity extends AppCompatActivity {

    Random random = new Random();
    Enemy[] arrayInUse;
    TextView battleLog;
    String battleLogText;
    TinyDB tinyDB;

    boolean isBattleGoing = false;
    int howManySteps = 0;
    int energy = 0;
    int mana = 0;
    String heroNickname;
    Enemy enemy;
    double heroSa;
    double enemySa;
    double unusedHeroSa = 0.00;
    double unusedEnemySa = 0.00;
    int heroMaxHp;
    int enemyMaxHp;
    int heroHp;
    int enemyHp;
    int heroAbsorptionLeft;
    int heroMagicAbsorptionLeft;
    int enemyAbsorptionLeft;
    int poisonLeftTurns = 0;
    int turnAmount = 0;
    boolean ifOstatniRatunekUsed = false;

    Item itemInUse = null;
    int itemInUseIndex = 0;
    Item item1 = null;
    int item1Index = 0;
    Item item2 = null;
    int item2Index = 0;
    Item item3 = null;
    int item3Index = 0;
    Item item4 = null;
    int item4Index = 0;
    Item item5 = null;
    int item5Index = 0;
    Item item6 = null;
    int item6Index = 0;
    Item item7 = null;
    int item7Index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        tinyDB = new TinyDB(this);
        battleLog = findViewById(R.id.battleLog);
        battleLog.setMovementMethod(new ScrollingMovementMethod());
        heroNickname = tinyDB.getString(SavedNickname, DefaultNickname);

        LoadHeroInfo(this, tinyDB);

        String type = getIntent().getExtras().getString("type");
        int position = getIntent().getExtras().getInt("position");
        int envi = getIntent().getExtras().getInt("envi");

        findViewById(R.id.heroZeroSteps).setVisibility(View.VISIBLE);
        Glide.with(this).load(tinyDB.getInt(SavedImageBack, DefaultImageBack)).into(((ImageView)findViewById(R.id.heroZeroSteps)));
        Glide.with(this).load(tinyDB.getInt(SavedImageBack, DefaultImageBack)).into(((ImageView)findViewById(R.id.heroOneStep)));
        Glide.with(this).load(tinyDB.getInt(SavedImageBack, DefaultImageBack)).into(((ImageView)findViewById(R.id.heroTwoSteps)));

        switch (envi)
        {
            case R.drawable.envi1:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi1_fight));
                break;
            case R.drawable.envi2:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi2_fight));
                break;
            case R.drawable.envi3:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi3_fight));
                break;
            case R.drawable.envi4:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi4_fight));
                break;
            case R.drawable.envi5:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi5_fight));
                break;
            case R.drawable.envi6:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi6_fight));
                break;
            case R.drawable.envi7:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi7_fight));
                break;
            case R.drawable.envi8:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi8_fight));
                break;
            case R.drawable.envi9:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi9_fight));
                break;
            case R.drawable.envi10:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi10_fight));
                break;
            case R.drawable.envi11:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi11_fight));
                break;
            case R.drawable.envi12:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi12_fight));
                break;
            case R.drawable.envi13:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi13_fight));
                break;
            case R.drawable.envi14:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi14_fight));
                break;
            case R.drawable.envi15:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi15_fight));
                break;
            default:
                ((ImageView)findViewById(R.id.battleEnvi)).setImageDrawable(getDrawable(R.drawable.envi16_fight));
                break;
        }

        switch (type)
        {
            case "common":
                arrayInUse = commonEnemyLists[position];
                break;
            case "elite":
                arrayInUse = eliteEnemyList[position];
                break;
            case "elite2":
                arrayInUse = elite2EnemyList[position];
                break;
            case "tytan":
                arrayInUse = tytanEnemyList[position];
                break;
            default:
                arrayInUse = commonEnemyLists[position];
                break;
        }

        enemy = arrayInUse[random.nextInt(arrayInUse.length)];
        startBattle();
    }

    @SuppressLint("SetTextI18n")
    private void startBattle()
    {
        isBattleGoing = true;
        ((ImageView)findViewById(R.id.enemyLargeDistance)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.enemyMediumDistance)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.enemySmallDistance)).setImageDrawable(null);
        switch (enemy.getEnemyClass())
        {
            case t: case h:
                Glide.with(this).load(enemy.getImage()).into(((ImageView)findViewById(R.id.enemyLargeDistance)));
                break;
            case m:
                Glide.with(this).load(enemy.getImage()).into(((ImageView)findViewById(R.id.enemyMediumDistance)));
                break;
            default:
                Glide.with(this).load(enemy.getImage()).into(((ImageView)findViewById(R.id.enemySmallDistance)));
                break;
        }

        battleLogText = "The battle between " + heroNickname + "(" + tinyDB.getInt(SavedLvl, DefaultLvl)
                + tinyDB.getString(SavedClass, DefaultClass) + ")" + " and " + enemy.getName() + "(" + enemy.getLvl() + enemy.getEnemyClass() + ") has begun<font size=10><br></br><br></br>";
        Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
        battleLog.setText(spannedTextToBattleLog);

        energy = tinyDB.getInt(SavedLvl, DefaultLvl);
        mana = tinyDB.getInt(SavedLvl, DefaultLvl);
        heroSa = tinyDB.getDouble(SavedSa, DefaultSa);
        enemySa = enemy.getSa();
        heroMaxHp = tinyDB.getInt(SavedMaxHp, DefaultMaxHp);
        enemyMaxHp = enemy.getHp();
        heroHp = tinyDB.getInt(SavedHp, DefaultHp);
        enemyHp = enemy.getHp();
        heroAbsorptionLeft = tinyDB.getInt(SavedAbsorption, DefaultAbsorption);
        heroMagicAbsorptionLeft = tinyDB.getInt(SavedMagicAbs, DefaultMagicAbs);
        enemyAbsorptionLeft = enemy.getAbsorption();

        ((ImageView)findViewById(R.id.item1)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.item2)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.item3)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.item4)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.item5)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.item6)).setImageDrawable(null);
        ((ImageView)findViewById(R.id.item7)).setImageDrawable(null);

        ((TextView)findViewById(R.id.energyAmount)).setText(energy + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
        ((TextView)findViewById(R.id.manaAmount)).setText(mana + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
    }

    private void heroTurn(int skill)
    {
        energy += 1;
        if(energy > tinyDB.getInt(SavedLvl, DefaultLvl))
            energy = tinyDB.getInt(SavedLvl, DefaultLvl);
        ((TextView)findViewById(R.id.energyAmount)).setText(energy + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));

        boolean ifCounter = false;
        boolean ifArmorPen = false;
        if(tinyDB.getDouble(SavedSlowDown, DefaultSlowDown) > 0)
            enemySa = enemy.getSa() - tinyDB.getDouble(SavedSlowDown, DefaultSlowDown);
        if(heroSa > enemySa)
            unusedHeroSa += heroSa - enemySa;

        int dmg = random.nextInt(tinyDB.getInt(SavedAttackTo, DefaultAttackTo) - tinyDB.getInt(SavedAttackFrom, DefaultAttackFrom)) + tinyDB.getInt(SavedAttackFrom, DefaultAttackFrom);
        if(skill == 1 || skill == 5)
        {
            dmg *= 1.2;
            heroSa += (heroSa / 4);
        }
        else if(skill == 2)
            poisonLeftTurns = 3;
        else if(skill == 3)
            dmg *= 1.1;

        if((double)(random.nextInt(10000) / 100) <= tinyDB.getDouble(SavedCritic, DefaultCritic))
        {
            dmg = (int)Math.round(dmg * (tinyDB.getInt(SavedCritPower, DefaultCritPower) / 100.0));
            battleLogText += "<font color=#b6aa84>" + heroNickname + "(" + Math.round((double)heroHp / (double)heroMaxHp * 100) + "%) strikes with a strength of <b>+" + dmg + "</b></font>";
            battleLogText += "<br><font color=#f28ea7> +Critical Strike </font></br>";

            if((enemy.getEnemyClass().equals(b) | enemy.getEnemyClass().equals(m)) && random.nextInt(100) < 60)
            {
                ifCounter = true;
                battleLogText += "<br><font color=#f2ec7c> -Counter </font></br>";
            }
        }
        else
            battleLogText += "<font color=#b6aa84>" + heroNickname + "(" + Math.round((double)heroHp / (double)heroMaxHp * 100) + "%) strikes with a strength of <b>+" + dmg + "</b></font>";

        if(random.nextInt(100) <= tinyDB.getInt(SavedArmorPen, DefaultArmorPen)) {
            ifArmorPen = true;
            battleLogText += "<br><font color=#eb3434> +Armor Penetration </font></br>";
        }

        if(enemy.getEnemyClass().equals(w) || enemy.getEnemyClass().equals(p))
        {
            int block;
            switch (enemy.getRarity())
            {
                case 0:
                    block = 10;
                    break;

                case 1:
                    block = 15;
                    break;

                case 2:
                    block = 22;
                    break;

                case 3:
                    block = 40;
                    break;

                default:
                    block = 30;
                    break;
            }
            if(random.nextInt(100) < block)
            {
                double blockPoints = block * enemy.getLvl() / 20;
                int blockedDmg = (int)Math.round(8 * (blockPoints + enemy.getLvl()));
                dmg -= blockedDmg;
                battleLogText += "<br><font color=#8cff5b> -Blocked " + blockedDmg + " damage </font></br>";
            }
        }

        int enemyDodge = enemy.getDodge();
        if(enemy.getEnemyClass().equals(h))
            enemyDodge *= 1.75;
        else if(enemy.getEnemyClass().equals(t) || enemy.getEnemyClass().equals(b))
            enemyDodge *= 1.3;
        if(random.nextInt(100) < enemyDodge)
        {
            dmg = 0;
            battleLogText += "<br><font color=#00bbff> -Dodge </font></br>";
        }

        int dmgAfterReduction = dmg - enemy.getArmor();
        if(ifArmorPen)
            dmgAfterReduction = dmg;
        if(dmgAfterReduction > 0)
        {
            if(dmgAfterReduction - enemyAbsorptionLeft > 0 && enemyAbsorptionLeft > 0)
            {
                battleLogText += "<br><font color=#b6aa84> -Absorption of " + enemyAbsorptionLeft + " damage </font></br>";
                dmgAfterReduction -= enemyAbsorptionLeft;
                enemyAbsorptionLeft = 0;
            }
            else if(enemyAbsorptionLeft > 0)
            {
                battleLogText += "<br><font color=#b6aa84> -Absorption of " + dmgAfterReduction + " damage </font></br>";
                enemyAbsorptionLeft -= dmgAfterReduction;
                dmgAfterReduction = 0;
            }
            enemyHp -= dmgAfterReduction;
            long hp = Math.round((double)enemyHp / (double)enemyMaxHp * 100);
            if(hp < 0)
                hp = 0;
            battleLogText +=  "<br><font color=#b6aa84>" + enemy.getName() + "(" + hp + "%) suffers <b>-" + dmgAfterReduction + "</b> damage</font></br><br></br><br></br>";
        }
        else
        {
            long hp = Math.round((double)enemyHp / (double)enemyMaxHp * 100);
            if(hp < 0)
                hp = 0;
            battleLogText += "<br><font color=#b6aa84>" + enemy.getName() + "(" + hp + "%) suffers <b>-0</b> damage</font></br><br></br><br></br>";
        }

        turnAmount++;

        if(enemyHp <= 0)
            endBattle(true);
        else
        {
            if(tinyDB.getInt(SavedHealing, DefaultHealing) > 0 && heroHp < heroMaxHp)
            {
                long healAmount = Math.round(tinyDB.getInt(SavedHealing, DefaultHealing) * (1.00 - turnAmount * 0.05));
                if(healAmount > 0)
                {
                    if(heroHp + healAmount >= heroMaxHp)
                        healAmount = heroMaxHp - heroHp;
                    heroHp += healAmount;
                    battleLogText += "<font color=#48f4f2>" + healAmount + " health points restored " + heroNickname + "(" + Math.round((double)heroHp / (double)heroMaxHp * 100) + "%)</font><br></br>";
                }
            }
            if(poisonLeftTurns > 0)
            {
                long poisonDmg = Math.round(0.37 * (random.nextInt(tinyDB.getInt(SavedAttackTo, DefaultAttackTo) - tinyDB.getInt(SavedAttackFrom, DefaultAttackFrom)) + tinyDB.getInt(SavedAttackFrom, DefaultAttackFrom)));
                enemyHp -= poisonDmg;
                battleLogText += "<font color=#3a8003>" + enemy.getName() + ": " + poisonDmg + " damage from poison. </font><br></br>";
                poisonLeftTurns--;
            }
            if((tinyDB.getInt(SavedHealing, DefaultHealing) > 0 && heroHp < heroMaxHp) || poisonLeftTurns > 0)
                battleLogText += "<br></br>";

            if(enemyHp <= 0)
                endBattle(true);
            else
            {
                if(ifCounter)
                    enemyTurn();
                if(skill == 3)
                    heroTurn(0);
                else
                {
                    if(unusedHeroSa > enemySa && unusedEnemySa < heroSa)
                    {
                        unusedHeroSa -= enemySa;
                        unusedEnemySa += enemySa;
                    }
                    if(skill != 5)
                    {
                        int chancheToGetLegendaryBonusOslepienie = 0;
                        if(tinyDB.getInt(SavedIfHaveLegendaryBonusOslepienie, DefaultIfHaveLegendaryBonusOslepienie) != 0)
                            chancheToGetLegendaryBonusOslepienie = Math.round(9.0F + 6F * (tinyDB.getInt(SavedIfHaveLegendaryBonusOslepienie, DefaultIfHaveLegendaryBonusOslepienie) - 1.0F));
                        if(random.nextInt(100) < chancheToGetLegendaryBonusOslepienie) {
                            battleLogText +=  "<font color=#de5e03>Dazzle: Enemy lost his turn.</font><br></br><br></br>";
                        } else {
                            unusedEnemySa -= heroSa;
                            enemyTurn();
                        }
                    }
                }
            }
        }
    }

    private void enemyTurn()
    {
        energy += 1;
        if(energy > tinyDB.getInt(SavedLvl, DefaultLvl))
            energy = tinyDB.getInt(SavedLvl, DefaultLvl);
        mana += 1;
        if(mana > tinyDB.getInt(SavedLvl, DefaultLvl))
            mana = tinyDB.getInt(SavedLvl, DefaultLvl);
        ((TextView)findViewById(R.id.energyAmount)).setText(energy + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
        ((TextView)findViewById(R.id.manaAmount)).setText(mana + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));

        boolean ifCounter = false;
        boolean ifArmorPen = false;
        if(enemySa > heroSa)
            unusedEnemySa += enemySa - heroSa;

        int dmg = Math.round(random.nextInt((int)Math.round(enemy.getAttack() * 1.3) - (int)Math.round(enemy.getAttack() * 0.7)) + (int)Math.round(enemy.getAttack() * 0.7));
        if((random.nextDouble() * 100) <= enemy.getCritic())
        {
            switch (enemy.getRarity())
            {
                case 0:
                    dmg *= 1.25;
                    break;
                case 1:
                    dmg *= 1.5;
                    break;
                case 2:
                    dmg *= 1.65;
                    break;
                case 3:
                    dmg *= 2.2;
                    break;
                default:
                    dmg *= 1.85;
                    break;
            }
            battleLogText += "<font color=#b6aa84>" + enemy.getName() + "(" + Math.round((double)enemyHp / (double)enemyMaxHp * 100) + "%) strikes with a strength of <b>+" + dmg + "</b></font>";
            battleLogText += "<br><font color=#f28ea7> +Critical Strike </font></br>";

            if(random.nextInt(100) <= tinyDB.getInt(SavedCounter, DefaultCounter))
            {
                ifCounter = true;
                battleLogText += "<br><font color=#f2ec7c> -Counter </font></br>";
            }
        }
        else
            battleLogText += "<font color=#b6aa84>" + enemy.getName() + "(" + Math.round((double)enemyHp / (double)enemyMaxHp * 100) + "%) strikes with a strength of <b>+" + dmg + "</b></font>";

        if((enemy.getEnemyClass().equals(m) || enemy.getEnemyClass().equals(t)) && random.nextInt(100) <= 10) {
            ifArmorPen = true;
            battleLogText += "<br><font color=#eb3434> +Armor Penetration </font></br>";
        }

        if(random.nextInt(100) < tinyDB.getInt(SavedBlock, DefaultBlock))
        {
            double blockPoints = tinyDB.getInt(SavedBlock, DefaultBlock) * tinyDB.getInt(SavedLvl, DefaultLvl) / 20;
            int blockedDmg = (int)Math.round(8 * (blockPoints + tinyDB.getInt(SavedLvl, DefaultLvl)));
            dmg -= blockedDmg;
            battleLogText += "<br><font color=#8cff5b> -Blocked " + blockedDmg + " damage </font></br>";
        }

        if(random.nextInt(100) < tinyDB.getInt(SavedDodge, DefaultDodge))
        {
            dmg = 0;
            battleLogText += "<br><font color=#00bbff> -Dodge </font></br>";
        }

        long dmgAfterReduction;
        if(enemy.getEnemyClass().equals(m))
            dmgAfterReduction = dmg - Math.round(tinyDB.getInt(SavedArmorStats, DefaultArmorStats) * 0.5) - Math.round(dmg * (double)(tinyDB.getInt(SavedMagicRes, DefaultMagicRes) / 100));
        else if(enemy.getEnemyClass().equals(t) || enemy.getEnemyClass().equals(p))
            dmgAfterReduction = dmg - Math.round(tinyDB.getInt(SavedArmorStats, DefaultArmorStats) * 0.75) - Math.round(0.75 * (dmg * (double)(tinyDB.getInt(SavedMagicRes, DefaultMagicRes) / 100)));
        else
            dmgAfterReduction = dmg - tinyDB.getInt(SavedArmorStats, DefaultArmorStats);
        if(ifArmorPen)
            dmgAfterReduction = dmg;
        if(dmgAfterReduction > 0)
        {
            if((enemy.getEnemyClass().equals(m) || enemy.getEnemyClass().equals(t) || enemy.getEnemyClass().equals(p)) && heroMagicAbsorptionLeft > 0)
            {
                if(dmgAfterReduction - heroMagicAbsorptionLeft >= 0)
                {
                    battleLogText += "<br><font color=#b6aa84>-Absorption of " + heroMagicAbsorptionLeft + " damage </font></br>";
                    dmgAfterReduction -= heroMagicAbsorptionLeft;
                    heroMagicAbsorptionLeft = 0;
                }
                else
                {
                    battleLogText += "<br><font color=#b6aa84>-Absorption of " + dmgAfterReduction + " damage </font></br>";
                    dmgAfterReduction -= dmgAfterReduction;
                    heroMagicAbsorptionLeft -= dmgAfterReduction;

                }
            }
            else if (heroAbsorptionLeft > 0)
            {
                if(dmgAfterReduction - heroAbsorptionLeft >= 0)
                {
                    battleLogText += "<br><font color=#b6aa84>-Absorption of " + heroAbsorptionLeft + " damage </font></br>";
                    dmgAfterReduction -= heroAbsorptionLeft;
                    heroAbsorptionLeft = 0;
                }
                else
                {
                    battleLogText += "<br><font color=#b6aa84>-Absorption of " + dmgAfterReduction + " damage </font></br>";
                    heroAbsorptionLeft -= dmgAfterReduction;
                    dmgAfterReduction = 0;
                }
            }
            heroHp -= dmgAfterReduction;
            long hp = Math.round((double)heroHp / (double)heroMaxHp * 100);
            if(hp < 0)
                hp = 0;
            battleLogText +=  "<br><font color=#b6aa84>" + heroNickname + "(" + hp + "%) suffers <b>-" + dmgAfterReduction + "</b> damage</font></br><br></br>";

            if(hp > 0 && hp < 18 && tinyDB.getInt(SavedIfHaveLegendaryBonusOstatniRatunek, DefaultIfHaveLegendaryBonusOstatniRatunek) != 0 && !ifOstatniRatunekUsed)
            {
                long howMuchHpToHeal;
                if(tinyDB.getInt(SavedIfHaveLegendaryBonusOstatniRatunek, DefaultIfHaveLegendaryBonusOstatniRatunek) > 1)
                    howMuchHpToHeal = Math.round((random.nextInt(20) + 30) * ((double)tinyDB.getInt(SavedIfHaveLegendaryBonusOstatniRatunek, DefaultIfHaveLegendaryBonusOstatniRatunek) - 1.0F) * 1.6F);
                else
                    howMuchHpToHeal = Math.round((random.nextInt(20) + 30));
                if(howMuchHpToHeal > 100)
                    howMuchHpToHeal = 100;
                heroHp = (int)Math.round(heroMaxHp * ((double)howMuchHpToHeal / 100.0));
                ifOstatniRatunekUsed = true;
                battleLogText +=  "<br><font color=#de5e03>Last Rescue: Healed to " + Math.round(heroMaxHp * ((double)howMuchHpToHeal / 100.0)) + "(" + howMuchHpToHeal + "%) hp.</font></br><br></br>";
            }

            battleLogText += "<br></br>";
        }
        else
        {
            long hp = Math.round((double)heroHp / (double)heroMaxHp * 100);
            if(hp < 0)
                hp = 0;
            battleLogText += "<br><font color=#b6aa84>" + heroNickname + "(" + hp + "%) suffers <b>-0</b> damage</font></br><br></br><br></br>";
        }

        tinyDB.putInt(SavedHp, heroHp);

        if(heroHp <= 0)
            endBattle(false);
        else
        {
            if(ifCounter)
                heroTurn(5);
            if(unusedEnemySa > heroSa && unusedHeroSa < enemySa)
            {
                enemyTurn();
                unusedEnemySa -= heroSa;
                unusedHeroSa += heroSa;
            }
            else if(unusedHeroSa >= enemySa)
                unusedEnemySa -= heroSa;
        }
    }

    private void endBattle(boolean ifHeroWon)
    {
        isBattleGoing = false;
        ((TextView)findViewById(R.id.runEnd_button)).setText("Close");
        ((TextView)findViewById(R.id.autoNext_button)).setText("Next");
        findViewById(R.id.imageView).setBackground(getDrawable(R.drawable.battle_end_image));
        findViewById(R.id.victoryDefeat_text).setVisibility(View.VISIBLE);
        setFastAccessPotions();

        if(ifHeroWon)
        {
            ((TextView)findViewById(R.id.victoryDefeat_text)).setText("victory");
            if(((ImageView)findViewById(R.id.enemyLargeDistance)).getDrawable() != null)
                ((ImageView)findViewById(R.id.enemyLargeDistance)).setImageDrawable(getDrawable(R.drawable.grave_image));
            else if(((ImageView)findViewById(R.id.enemyMediumDistance)).getDrawable() != null)
                ((ImageView)findViewById(R.id.enemyMediumDistance)).setImageDrawable(getDrawable(R.drawable.grave_image));
            else
                ((ImageView)findViewById(R.id.enemySmallDistance)).setImageDrawable(getDrawable(R.drawable.grave_image));
            battleLogText += "<br><font color=#08bd08>" + heroNickname +" won the battle!</font></br><br></br>";
            battleLogText += "<br><font color=#f9e63a>" + enemy.getExp() + " experience points has been gained.</font></br>";
            tinyDB.putInt(SavedExp, tinyDB.getInt(SavedExp, DefaultExp) + enemy.getExp());
            if(tinyDB.getInt(SavedExp, DefaultExp) >= getExpToNextLevel(tinyDB))
            {
                tinyDB.putInt(SavedExp, tinyDB.getInt(SavedExp, DefaultExp) - getExpToNextLevel(tinyDB));
                tinyDB.putInt(SavedLvl, tinyDB.getInt(SavedLvl, DefaultLvl) + 1);
                battleLogText += "<br><font color=#f9e63a> Achieved level " + tinyDB.getInt(SavedLvl, DefaultLvl) + "! </font></br>";
                CalculateStats(tinyDB);
            }

            double chancheForNextLoot;
            switch (enemy.getRarity())
            {
                case 0:
                    chancheForNextLoot = 0.01;
                    break;
                case 1:
                    chancheForNextLoot = 0.025;
                    break;
                case 2:
                    chancheForNextLoot = 0.1;
                    break;
                case 3:
                    chancheForNextLoot = 0.65;
                    break;
                default:
                    chancheForNextLoot = 0.4;
                    break;
            }
            dropLoot();
            while(random.nextDouble() <= chancheForNextLoot)
                dropLoot();
        }
        else
        {
            ((TextView)findViewById(R.id.victoryDefeat_text)).setText("defeat");
            if(findViewById(R.id.heroZeroSteps).getVisibility() == View.VISIBLE)
                ((ImageView)findViewById(R.id.heroZeroSteps)).setImageDrawable(getDrawable(R.drawable.grave_image));
            else if(findViewById(R.id.heroOneStep).getVisibility() == View.VISIBLE)
                ((ImageView)findViewById(R.id.heroOneStep)).setImageDrawable(getDrawable(R.drawable.grave_image));
            else
                ((ImageView)findViewById(R.id.heroTwoSteps)).setImageDrawable(getDrawable(R.drawable.grave_image));
            battleLogText += "<br><font color=#bd0808>" + enemy.getName() +" won the battle</font></br><br></br>";
        }
        LoadHeroInfo(this, tinyDB);
    }

    private void dropLoot()
    {
        ArrayList<Item> eq = tinyDB.getListObject(SavedEq, Item.class);
        if(eq.size() > 69)
            Toast.makeText(this, "Unfortunately, your equipment is full.", Toast.LENGTH_SHORT).show();
        else
        {
            Item itemFromLoot = getLootItem();
            if(itemFromLoot != null)
            {
                switch (itemFromLoot.getRarity())
                {
                    case 0:
                        battleLogText += "<br></br><br>" + enemy.getName() + ": looted <b>" + itemFromLoot.getName() +"</b></br>";
                        break;
                    case 1:
                        battleLogText += "<br></br><br>" + enemy.getName() + ": looted <b><font color=#946903>" + itemFromLoot.getName() +"</font></b></br>";
                        break;
                    case 2:
                        battleLogText += "<br></br><br>" + enemy.getName() + ": looted <b><font color=#004f81>" + itemFromLoot.getName() +"</font></b></br>";
                        break;
                    case 3:
                        battleLogText += "<br></br><br>" + enemy.getName() + ": looted <b><font color=#de5e03>" + itemFromLoot.getName() +"</font></b></br>";
                        break;
                    default:
                        battleLogText += "<br></br><br>" + enemy.getName() + ": looted <b><font color=#636262>" + itemFromLoot.getName() +"</font></b></br>";
                        break;
                }
                boolean isItemAdded = false;
                if((itemFromLoot.getItemType() == ItemTypes.potion || itemFromLoot.getItemType() == ItemTypes.other) && itemFromLoot.getAmount() < itemFromLoot.getMaxAmount())
                {
                    for(int i = 0; i < eq.size(); i++)
                    {
                        if(eq.get(i).getName().equals(itemFromLoot.getName()) && eq.get(i).getMaxAmount() > eq.get(i).getAmount())
                        {
                            eq.get(i).setAmount(eq.get(i).getAmount() + itemFromLoot.getAmount());
                            isItemAdded = true;
                            if(eq.get(i).getAmount() > eq.get(i).getMaxAmount())
                            {
                                Item itemToAdd = new Item(eq.get(i));
                                itemToAdd.setAmount(eq.get(i).getAmount() - eq.get(i).getMaxAmount());
                                eq.get(i).setAmount(eq.get(i).getMaxAmount());
                                eq.add(itemToAdd);
                            }
                        }
                    }
                }
                if(!isItemAdded)
                    eq.add(itemFromLoot);
                tinyDB.putListObject(SavedEq, eq);
            }
        }
    }

    private Item getLootItem()
    {
        double chancheForCommon;
        double chancheForUnique;
        double chancheForHeroic;
        double chancheForLegendary;
        ArrayList<Item> commonLoot = new ArrayList<>();
        ArrayList<Item> uniqueLoot = new ArrayList<>();
        ArrayList<Item> heroicLoot = new ArrayList<>();
        ArrayList<Item> legendaryLoot = new ArrayList<>();

        switch (enemy.getRarity())
        {
            case 0:
                chancheForCommon = 0.7;
                chancheForUnique = 0.015;
                chancheForHeroic = 0.003;
                chancheForLegendary = 0.001;
                break;
            case 1:
                chancheForCommon = 0.7;
                chancheForUnique = 0.035;
                chancheForHeroic = 0.0075;
                chancheForLegendary = 0.0025;
                break;
            case 2:
                chancheForCommon = 0.7;
                chancheForUnique = 0.0975;
                chancheForHeroic = 0.025;
                chancheForLegendary = 0.0075;
                break;
            case 3:
                chancheForCommon = 1;
                chancheForUnique = 0.75;
                chancheForHeroic = 0.3;
                chancheForLegendary = 0.1;
                break;
            default:
                chancheForCommon = 1;
                chancheForUnique = 0.75;
                chancheForHeroic = 0.4;
                chancheForLegendary = 0.13;
                break;
        }

        for(int i = 0; i < enemy.getLoot().length; i++)
        {
            if(enemy.getLoot()[i].getRarity() == 0)
                commonLoot.add(enemy.getLoot()[i]);
            else if(enemy.getLoot()[i].getRarity() == 1)
                uniqueLoot.add(enemy.getLoot()[i]);
            else if(enemy.getLoot()[i].getRarity() == 2)
                heroicLoot.add(enemy.getLoot()[i]);
            else if(enemy.getLoot()[i].getRarity() == 3)
                legendaryLoot.add(enemy.getLoot()[i]);
            else
                commonLoot.add(enemy.getLoot()[i]);
        }

        double drawnNumber = random.nextDouble();

        if(drawnNumber <= chancheForLegendary && legendaryLoot.size() > 0)
            return legendaryLoot.get(random.nextInt(legendaryLoot.size()));
        else if(drawnNumber <= chancheForHeroic && heroicLoot.size() > 0)
            return heroicLoot.get(random.nextInt(heroicLoot.size()));
        else if(drawnNumber <= chancheForUnique && uniqueLoot.size() > 0)
            return uniqueLoot.get(random.nextInt(uniqueLoot.size()));
        else if(drawnNumber <= chancheForCommon && commonLoot.size() > 0)
            return commonLoot.get(random.nextInt(commonLoot.size()));
        else
            return null;
    }

    private void setFastAccessPotions()
    {
        ArrayList<Item> eq = tinyDB.getListObject(SavedEq, Item.class);

        int lastItem = -1;
        for(int i = 0; i < eq.size(); i++)
            if(eq.get(i).getHeal() > 0) {
                Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView)findViewById(R.id.item1)));
                lastItem = i; i = 100;}
        if(lastItem >= 0) {
            item1 = eq.get(lastItem);
            item1Index = lastItem;
            for (int i = lastItem + 1; i < eq.size(); i++)
                if (eq.get(i).getHeal() > 0) {
                    Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView) findViewById(R.id.item2)));
                    lastItem = i;
                    i = 100;
                }
            item2 = eq.get(lastItem);
            item2Index = lastItem;
            for (int i = lastItem + 1; i < eq.size(); i++)
                if (eq.get(i).getHeal() > 0) {
                    Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView) findViewById(R.id.item3)));
                    lastItem = i;
                    i = 100;
                }
            item3 = eq.get(lastItem);
            item3Index = lastItem;
            for (int i = lastItem + 1; i < eq.size(); i++)
                if (eq.get(i).getHeal() > 0) {
                    Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView) findViewById(R.id.item4)));
                    lastItem = i;
                    i = 100;
                }
            item4 = eq.get(lastItem);
            item4Index = lastItem;
            for (int i = lastItem + 1; i < eq.size(); i++)
                if (eq.get(i).getHeal() > 0) {
                    Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView) findViewById(R.id.item5)));
                    lastItem = i;
                    i = 100;
                }
            item5 = eq.get(lastItem);
            item5Index = lastItem;
            for (int i = lastItem + 1; i < eq.size(); i++)
                if (eq.get(i).getHeal() > 0) {
                    Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView) findViewById(R.id.item6)));
                    lastItem = i;
                    i = 100;
                }
            item6 = eq.get(lastItem);
            item6Index = lastItem;
            for (int i = lastItem + 1; i < eq.size(); i++)
                if (eq.get(i).getHeal() > 0) {
                    Glide.with(this).load(getDrawable(eq.get(i).getImg())).into(((ImageView) findViewById(R.id.item7)));
                    lastItem = i;
                    i = 100;
                }
            item7 = eq.get(lastItem);
            item7Index = lastItem;
        }
    }

    public void onAttackClick(View view) {
        if(!isBattleGoing) {
            Intent intent = new Intent(this, AttackActivity.class);
            startActivity(intent);
        }
    }

    public void onEqClick(View view) {
        if(!isBattleGoing) {
            Intent intent = new Intent(this, EqActivity.class);
            startActivity(intent);
        }
    }

    public void onPersonClick(View view) {
        if(!isBattleGoing) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void onShopClick(View view) {
        if(!isBattleGoing) {
            Intent intent = new Intent(this, ShopActivity.class);
            startActivity(intent);
        }
    }

    public void onQuestClick(View view) {
        if(!isBattleGoing) {
        }
    }

    public void onSkillAttackClick(View view) {
        if(isBattleGoing) {
            if(canAttack()) {
                if (energy > 0) {
                    energy--;
                    heroTurn(0);
                    loadHealthInfo();
                } else {
                    battleLogText += "<font color=#b6aa84>" + heroNickname + " rests.</font><br></br><br></br>";
                    enemyTurn();
                }
                Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
                battleLog.setText(spannedTextToBattleLog);
                ((TextView) findViewById(R.id.energyAmount)).setText(energy + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
            } else
                Toast.makeText(this, "You have to move closer to enemy to perform this action", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSkillQuickBlowClick(View view) {
        if(isBattleGoing) {
            if(canAttack()) {
                if (energy >= 2) {
                    energy -= 4;
                    heroTurn(1);
                    loadHealthInfo();
                    Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
                    battleLog.setText(spannedTextToBattleLog);
                } else
                    Toast.makeText(this, "Unfortunately, you don't have enough energy to finish this move", Toast.LENGTH_SHORT).show();
                ((TextView) findViewById(R.id.energyAmount)).setText(energy + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
            } else
            Toast.makeText(this, "You have to move closer to enemy to perform this action", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSkillStepForwardClick(View view) {
        if(isBattleGoing) {
            if (findViewById(R.id.heroZeroSteps).getVisibility() == View.VISIBLE)
            {
                howManySteps = 1;
                findViewById(R.id.heroZeroSteps).setVisibility(View.INVISIBLE);
                findViewById(R.id.heroOneStep).setVisibility(View.VISIBLE);
                battleLogText += "<font color=#b6aa84>" + heroNickname + " made a step forward.</font><br></br><br></br>";
                enemyTurn();
                loadHealthInfo();
                Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
                battleLog.setText(spannedTextToBattleLog);
            }
            else if (findViewById(R.id.heroOneStep).getVisibility() == View.VISIBLE)
            {
                howManySteps = 2;
                findViewById(R.id.heroOneStep).setVisibility(View.INVISIBLE);
                findViewById(R.id.heroTwoSteps).setVisibility(View.VISIBLE);
                battleLogText += "<font color=#b6aa84>" + heroNickname + " made a step forward.</font><br></br><br></br>";
                enemyTurn();
                loadHealthInfo();
                Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
                battleLog.setText(spannedTextToBattleLog);
            }
            else {
                Toast.makeText(this, "You can't move anymore!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onSkillPoisonousPushClick(View view) {
        if(isBattleGoing) {
            if(canAttack()) {
                if (mana >= 4) {
                    mana -= 4;
                    heroTurn(2);
                    loadHealthInfo();
                    Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
                    battleLog.setText(spannedTextToBattleLog);
                } else
                    Toast.makeText(this, "Unfortunately, you don't have enough mana to finish this move", Toast.LENGTH_SHORT).show();
                ((TextView) findViewById(R.id.manaAmount)).setText(mana + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
            } else
                Toast.makeText(this, "You have to move closer to enemy to perform this action", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSkillSpinningBladeClick(View view) {
        if(isBattleGoing) {
            if(canAttack())
            {
                if(mana >= 4) {
                    mana -= 4;
                    heroTurn(3);
                    loadHealthInfo();
                    Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
                    battleLog.setText(spannedTextToBattleLog);
                } else
                    Toast.makeText(this, "Unfortunately, you don't have enough mana to finish this move", Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.manaAmount)).setText(mana + "/" + tinyDB.getInt(SavedLvl, DefaultLvl));
            } else
                Toast.makeText(this, "You have to move closer to enemy to perform this action", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean canAttack()
    {
        switch (enemy.getEnemyClass())
        {
            case t: case h:
                return findViewById(R.id.heroTwoSteps).getVisibility() == View.VISIBLE;
            case m:
                return findViewById(R.id.heroOneStep).getVisibility() == View.VISIBLE || findViewById(R.id.heroTwoSteps).getVisibility() == View.VISIBLE;
            default:
                return true;
        }
    }

    public void onRunEndClick(View view) {
        onBackPressed();
    }

    public void onAutoNextClick(View view) {
        if(!isBattleGoing)
        {
            int moneyNeededToContinue;
            switch (enemy.getRarity())
            {
                case 0:
                    moneyNeededToContinue = 0;
                    break;
                case 1:
                    moneyNeededToContinue = enemy.getLvl() * 25;
                    break;
                case 2:
                    moneyNeededToContinue = enemy.getLvl() * 80;
                    break;
                default:
                    moneyNeededToContinue = enemy.getLvl() * 750;
                    break;
            }
            if(tinyDB.getInt(SavedMoney, DefaultMoney) >= moneyNeededToContinue)
            {
                tinyDB.putInt(SavedMoney, tinyDB.getInt(SavedMoney, DefaultMoney) - moneyNeededToContinue);
                ((TextView)findViewById(R.id.hero_money)).setText(tinyDB.getInt(SavedMoney, DefaultMoney) + " ");

                findViewById(R.id.imageView).setBackground(getDrawable(R.drawable.fight_img));
                findViewById(R.id.heroZeroSteps).setVisibility(View.VISIBLE);
                findViewById(R.id.heroOneStep).setVisibility(View.INVISIBLE);
                findViewById(R.id.heroTwoSteps).setVisibility(View.INVISIBLE);
                findViewById(R.id.victoryDefeat_text).setVisibility(View.INVISIBLE);
                Glide.with(this).load(tinyDB.getInt(SavedImageBack, DefaultImageBack)).into(((ImageView)findViewById(R.id.heroZeroSteps)));
                Glide.with(this).load(tinyDB.getInt(SavedImageBack, DefaultImageBack)).into(((ImageView)findViewById(R.id.heroOneStep)));
                Glide.with(this).load(tinyDB.getInt(SavedImageBack, DefaultImageBack)).into(((ImageView)findViewById(R.id.heroTwoSteps)));
                ((TextView)findViewById(R.id.runEnd_button)).setText("Run");
                ((TextView)findViewById(R.id.autoNext_button)).setText("Auto");

                howManySteps = 0;
                ifOstatniRatunekUsed = false;
                enemy = arrayInUse[random.nextInt(arrayInUse.length)];
                startBattle();
            }
        }
        else
        {
            while (isBattleGoing)
            {
                if(turnAmount < 250)
                    if(canAttack())
                        heroTurn(0);
                    else
                        onSkillStepForwardClick(view);
                else
                    endBattle(false);
            }
            Spanned spannedTextToBattleLog = Html.fromHtml(battleLogText);
            battleLog.setText(spannedTextToBattleLog);
        }
    }

    private void loadHealthInfo()
    {
        if(tinyDB.getInt(SavedHp, DefaultHp) > tinyDB.getInt(SavedMaxHp, DefaultMaxHp))
            tinyDB.putInt(SavedHp, tinyDB.getInt(SavedMaxHp, DefaultMaxHp));
        if(tinyDB.getInt(SavedHp, DefaultHp) < 0)
            tinyDB.putInt(SavedHp, 0);
        ((ProgressBar)findViewById(R.id.vertical_progressbar)).setProgress(tinyDB.getInt(SavedHp, DefaultHp));
        ((TextView)findViewById(R.id.heroHpPercent)).setText(Math.round(((double)tinyDB.getInt(SavedHp, DefaultHp) / (double)tinyDB.getInt(SavedMaxHp, DefaultMaxHp)) * 100.0) + "%");
    }

    public void onFightItemClick(View view) {
        if(!isBattleGoing && ((ImageView)view).getDrawable() != null)
        {
            switch (view.getId())
            {
                case R.id.item1:
                    itemInUse = item1;
                    itemInUseIndex = item1Index;
                    break;
                case R.id.item2:
                    itemInUse = item2;
                    itemInUseIndex = item2Index;
                    break;
                case R.id.item3:
                    itemInUse = item3;
                    itemInUseIndex = item3Index;
                    break;
                case R.id.item4:
                    itemInUse = item4;
                    itemInUseIndex = item4Index;
                    break;
                case R.id.item5:
                    itemInUse = item5;
                    itemInUseIndex = item5Index;
                    break;
                case R.id.item6:
                    itemInUse = item6;
                    itemInUseIndex = item6Index;
                    break;
                case R.id.item7:
                    itemInUse = item7;
                    itemInUseIndex = item7Index;
                    break;
                default:
                    itemInUse = item1;
                    itemInUseIndex = item1Index;
                    break;
            }

            findViewById(R.id.imageView).setBackground(getDrawable(R.drawable.item_info));
            findViewById(R.id.victoryDefeat_text).setVisibility(View.INVISIBLE);
            findViewById(R.id.item1).setVisibility(View.INVISIBLE);
            findViewById(R.id.item2).setVisibility(View.INVISIBLE);
            findViewById(R.id.item3).setVisibility(View.INVISIBLE);
            findViewById(R.id.item4).setVisibility(View.INVISIBLE);
            findViewById(R.id.item5).setVisibility(View.INVISIBLE);
            findViewById(R.id.item6).setVisibility(View.INVISIBLE);
            findViewById(R.id.item7).setVisibility(View.INVISIBLE);
            findViewById(R.id.heroZeroSteps).setVisibility(View.INVISIBLE);
            findViewById(R.id.heroOneStep).setVisibility(View.INVISIBLE);
            findViewById(R.id.heroTwoSteps).setVisibility(View.INVISIBLE);
            findViewById(R.id.enemySmallDistance).setVisibility(View.INVISIBLE);
            findViewById(R.id.enemyMediumDistance).setVisibility(View.INVISIBLE);
            findViewById(R.id.enemyLargeDistance).setVisibility(View.INVISIBLE);
            findViewById(R.id.battleEnvi).setVisibility(View.INVISIBLE);
            findViewById(R.id.battleLog).setVisibility(View.INVISIBLE);
            findViewById(R.id.energyAmount).setVisibility(View.INVISIBLE);
            findViewById(R.id.manaAmount).setVisibility(View.INVISIBLE);
            findViewById(R.id.runEnd_button).setVisibility(View.INVISIBLE);
            findViewById(R.id.autoNext_button).setVisibility(View.INVISIBLE);

            findViewById(R.id.fightItemName).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemRarity).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemClose).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemImg).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemClass).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemLvl).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemPrice).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemStats).setVisibility(View.VISIBLE);
            findViewById(R.id.fightItemUse).setVisibility(View.VISIBLE);

            ((TextView)findViewById(R.id.fightItemName)).setText(itemInUse.getName());
            ((ImageView)findViewById(R.id.fightItemImg)).setImageDrawable(((ImageView)view).getDrawable());

            switch (itemInUse.getRarity())
            {
                case 0:
                    ((TextView)findViewById(R.id.fightItemRarity)).setText("");
                    break;
                case 1:
                    ((TextView)findViewById(R.id.fightItemRarity)).setText("Unique");
                    ((TextView) findViewById(R.id.fightItemRarity)).setTextColor(Color.parseColor("#946903"));
                    break;
                case 2:
                    ((TextView)findViewById(R.id.fightItemRarity)).setText("Heroic");
                    ((TextView) findViewById(R.id.fightItemRarity)).setTextColor(Color.parseColor("#004f81"));
                    break;
                case 3:
                    ((TextView)findViewById(R.id.fightItemRarity)).setText("Legendary");
                    ((TextView) findViewById(R.id.fightItemRarity)).setTextColor(Color.parseColor("#de5e03"));
                    break;
                default:
                    ((TextView)findViewById(R.id.fightItemRarity)).setText("Improved");
                    ((TextView) findViewById(R.id.fightItemRarity)).setTextColor(Color.parseColor("#636262"));
                    break;
            }
            ((TextView)findViewById(R.id.fightItemLvl)).setText(" Lvl: " + itemInUse.getLvl());
            ((TextView)findViewById(R.id.fightItemPrice)).setText(" Price: " + itemInUse.getCost());

            ((TextView)findViewById(R.id.fightItemStats)).setText(GetItemStats(itemInUse));
        }
    }

    public void onFightItemCloseClick(View view) {
        closeItemView();
    }

    private void closeItemView()
    {
        findViewById(R.id.imageView).setBackground(getDrawable(R.drawable.battle_end_image));
        findViewById(R.id.victoryDefeat_text).setVisibility(View.VISIBLE);
        findViewById(R.id.item1).setVisibility(View.VISIBLE);
        findViewById(R.id.item2).setVisibility(View.VISIBLE);
        findViewById(R.id.item3).setVisibility(View.VISIBLE);
        findViewById(R.id.item4).setVisibility(View.VISIBLE);
        findViewById(R.id.item5).setVisibility(View.VISIBLE);
        findViewById(R.id.item6).setVisibility(View.VISIBLE);
        findViewById(R.id.item7).setVisibility(View.VISIBLE);
        if(howManySteps == 0)
            findViewById(R.id.heroZeroSteps).setVisibility(View.VISIBLE);
        else if(howManySteps == 1)
            findViewById(R.id.heroOneStep).setVisibility(View.VISIBLE);
        else
            findViewById(R.id.heroTwoSteps).setVisibility(View.VISIBLE);
        findViewById(R.id.enemySmallDistance).setVisibility(View.VISIBLE);
        findViewById(R.id.enemyMediumDistance).setVisibility(View.VISIBLE);
        findViewById(R.id.enemyLargeDistance).setVisibility(View.VISIBLE);
        findViewById(R.id.battleEnvi).setVisibility(View.VISIBLE);
        findViewById(R.id.battleLog).setVisibility(View.VISIBLE);
        findViewById(R.id.energyAmount).setVisibility(View.VISIBLE);
        findViewById(R.id.manaAmount).setVisibility(View.VISIBLE);
        findViewById(R.id.runEnd_button).setVisibility(View.VISIBLE);
        findViewById(R.id.autoNext_button).setVisibility(View.VISIBLE);

        findViewById(R.id.fightItemName).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemRarity).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemClose).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemImg).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemClass).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemLvl).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemPrice).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemStats).setVisibility(View.INVISIBLE);
        findViewById(R.id.fightItemUse).setVisibility(View.INVISIBLE);
    }

    public void onFightUseItemClick(View view) {
        ArrayList<Item> eq = tinyDB.getListObject("eq", Item.class);
        Item potionToDrink = eq.get(itemInUseIndex);

        tinyDB.putInt(SavedHp, tinyDB.getInt(SavedHp, DefaultHp) + potionToDrink.getHeal());
        if(potionToDrink.getAmount() > 1)
        {
            potionToDrink.useItem();
            eq.remove(itemInUseIndex);
            eq.add(itemInUseIndex, potionToDrink);
            itemInUse = potionToDrink;

            if(itemInUseIndex == item1Index)
                item1 = potionToDrink;
            else if(itemInUseIndex == item2Index)
                item2 = potionToDrink;
            else if(itemInUseIndex == item3Index)
                item3 = potionToDrink;
            else if(itemInUseIndex == item4Index)
                item4 = potionToDrink;
            else if(itemInUseIndex == item5Index)
                item5 = potionToDrink;
            else if(itemInUseIndex == item6Index)
                item6 = potionToDrink;
            else
                item7 = potionToDrink;

            ((TextView)findViewById(R.id.fightItemStats)).setText(GetItemStats(itemInUse));
        }
        else
        {
            if(itemInUseIndex == item1Index) {
                item1 = null;
                ((ImageView)findViewById(R.id.item1)).setImageDrawable(null); }
            else if(itemInUseIndex == item2Index) {
                item2 = null;
                ((ImageView)findViewById(R.id.item2)).setImageDrawable(null); }
            else if(itemInUseIndex == item3Index) {
                item3 = null;
                ((ImageView)findViewById(R.id.item3)).setImageDrawable(null); }
            else if(itemInUseIndex == item4Index) {
                item4 = null;
                ((ImageView)findViewById(R.id.item4)).setImageDrawable(null); }
            else if(itemInUseIndex == item5Index) {
                item5 = null;
                ((ImageView)findViewById(R.id.item5)).setImageDrawable(null); }
            else if(itemInUseIndex == item6Index) {
                item6 = null;
                ((ImageView)findViewById(R.id.item6)).setImageDrawable(null); }
            else {
                item7 = null;
                ((ImageView)findViewById(R.id.item7)).setImageDrawable(null); }
            eq.remove(itemInUseIndex);
            closeItemView();
        }
        tinyDB.putListObject("eq", eq);
        loadHealthInfo();
    }
}
