package com.example.margorpg.Attack;

import android.graphics.drawable.Drawable;

import com.example.margorpg.Item;

public class Enemy {

    private final String name;
    private final Drawable image;
    private final int lvl;
    private final String enemyClass;
    private final int rarity;
    private final Item[] loot;
    private final int exp;
    private final int attack;
    private final int armor;
    private final double sa;
    private final int hp;
    private final int healing;
    private final int absorption;
    private final double critic;
    private final int dodge;

    public Enemy(String name, Drawable image, int lvl, String enemyClass, int rarity, Item[] loot, int exp, int attack, int armor, double sa, int hp, int healing, int absorption, double critic, int dodge)
    {

        this.name = name;
        this.image = image;
        this.lvl = lvl;
        this.enemyClass = enemyClass;
        this.rarity = rarity;
        this.loot = loot;
        this.exp = exp;
        this.attack = attack;
        this.armor = armor;
        this.sa = sa;
        this.hp = hp;
        this.healing = healing;
        this.absorption = absorption;
        this.critic = critic;
        this.dodge = dodge;
    }

    public int getHealing() {
        return healing;
    }

    public int getDodge() {
        return dodge;
    }

    public double getCritic() {
        return critic;
    }

    public int getAbsorption() {
        return absorption;
    }

    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public double getSa() {
        return sa;
    }

    public Item[] getLoot() {
        return loot;
    }

    public String getEnemyClass() {
        return enemyClass;
    }

    public String getName() {
        return name;
    }

    public Drawable getImage() {
        return image;
    }

    public int getExp() {
        return exp;
    }

    public int getRarity() { return rarity; }
}
