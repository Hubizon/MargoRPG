package com.example.margorpg;

import static com.example.margorpg.Resources.b;
import static com.example.margorpg.Resources.h;
import static com.example.margorpg.Resources.m;
import static com.example.margorpg.Resources.p;
import static com.example.margorpg.Resources.t;
import static com.example.margorpg.Resources.w;

public class Item {

    private String name, description;
    private String[] classes;
    private ItemTypes itemType;
    private LegendaryBonusses legendaryBonus;
    private int img, lvl, cost, attackFrom, attackTo, armor, hp, counter, strength, dexterity, intellect, healing, absorption, critPower, magicRes, magicAbs,
            dodge, block, armorPen, rarity, amount = 0, maxAmount = 0, heal = 0;
    private double sa, critic, hpForStrength, slowDown;

    public Item(String name, int img, String[] classes, int lvl, int cost, ItemTypes itemType, int rarity, int attackFrom, int attackTo, int armor,
                double sa, int hp, double slowDown, int counter, int strength, int dexterity, int intellect, int healing, int absorption, int magicAbs, double critic,
                int dodge, int block, int critPower, int armorPen, int magicRes, double hpForStrength, LegendaryBonusses legendaryBonus, String description)
    {
        this.name = name;
        this.img = img;
        this.classes = classes;
        this.lvl = lvl;
        this.cost = cost;
        this.itemType = itemType;
        this.rarity = rarity;
        this.attackFrom = attackFrom;
        this.attackTo = attackTo;
        this.armor = armor;
        this.sa = sa;
        this.hp = hp;
        this.slowDown = slowDown;
        this.counter = counter;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intellect = intellect;
        this.healing = healing;
        this.absorption = absorption;
        this.magicAbs = magicAbs;
        this.critic = critic;
        this.dodge = dodge;
        this.block = block;
        this.critPower = critPower;
        this.armorPen = armorPen;
        this.magicRes = magicRes;
        this.hpForStrength = hpForStrength;
        this.legendaryBonus = legendaryBonus;
        this.description = description;
    }

    public Item(String name, int img, int cost, int rarity, int amount, int maxAmount, int heal, String description)
    {
        this.name = name;
        this.img = img;
        this.cost = cost;
        this.rarity = rarity;
        this.amount = amount;
        this.maxAmount = maxAmount;
        this.heal = heal;
        this.description = description;

        this.itemType = ItemTypes.potion;
        this.classes = new String[]{w, m, t, h, b, p};
        this.lvl = 0;
        this.attackFrom = 0;
        this.attackTo = 0;
        this.armor = 0;
        this.sa = 0;
        this.hp = 0;
        this.slowDown = 0;
        this.counter = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.intellect = 0;
        this.healing = 0;
        this.absorption = 0;
        this.magicAbs = 0;
        this.critic = 0;
        this.dodge = 0;
        this.block = 0;
        this.critPower = 0;
        this.armorPen = 0;
        this.magicRes = 0;
        this.hpForStrength = 0;
        this.legendaryBonus = null;
    }

    public Item(String name, int img, int cost, int rarity, int amount, int maxAmount, String description)
    {
        this.name = name;
        this.img = img;
        this.cost = cost;
        this.rarity = rarity;
        this.amount = amount;
        this.maxAmount = maxAmount;
        this.description = description;

        this.itemType = ItemTypes.other;
        this.classes = new String[]{w, m, t, h, b, p};
        this.lvl = 0;
        this.attackFrom = 0;
        this.attackTo = 0;
        this.armor = 0;
        this.sa = 0;
        this.hp = 0;
        this.slowDown = 0;
        this.counter = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.intellect = 0;
        this.healing = 0;
        this.absorption = 0;
        this.magicAbs = 0;
        this.critic = 0;
        this.dodge = 0;
        this.block = 0;
        this.critPower = 0;
        this.armorPen = 0;
        this.magicRes = 0;
        this.hpForStrength = 0;
        this.legendaryBonus = null;
    }

    public Item(Item other)
    {
        this.name = other.getName();
        this.img = other.getImg();
        this.cost = other.getCost();
        this.itemType = other.getItemType();
        this.rarity = other.getRarity();
        this.amount = other.getAmount();
        this.maxAmount = other.getMaxAmount();
        this.heal = other.getHeal();
        this.description = other.getDescription();

        this.classes = new String[]{w, m, t, h, b, p};
        this.lvl = 0;
        this.attackFrom = 0;
        this.attackTo = 0;
        this.armor = 0;
        this.sa = 0;
        this.hp = 0;
        this.slowDown = 0;
        this.counter = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.intellect = 0;
        this.healing = 0;
        this.absorption = 0;
        this.magicAbs = 0;
        this.critic = 0;
        this.dodge = 0;
        this.block = 0;
        this.critPower = 0;
        this.armorPen = 0;
        this.magicRes = 0;
        this.hpForStrength = 0;
        this.legendaryBonus = null;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    public String[] getClasses() {
        return classes;
    }

    public int getLvl() {
        return lvl;
    }

    public int getCost() {
        return cost;
    }

    public ItemTypes getItemType() {
        return itemType;
    }

    public int getHp() {
        return hp;
    }

    public double getSlowDown() {
        return slowDown;
    }

    public int getBlock() {
        return block;
    }

    public double getCritic() {
        return critic;
    }

    public int getCritPower() {
        return critPower;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getDodge() {
        return dodge;
    }

    public int getHealing() {
        return healing;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getMagicAbs() {
        return magicAbs;
    }

    public int getMagicRes() {
        return magicRes;
    }

    public int getStrength() {
        return strength;
    }

    public double getHpForStrength() { return hpForStrength; }

    public int getAbsorption() {
        return absorption;
    }

    public int getArmorPen() {
        return armorPen;
    }

    public double getSa() {
        return sa;
    }

    public int getAttackFrom() {
        return attackFrom;
    }

    public int getAttackTo() {
        return attackTo;
    }

    public int getArmor() { return armor; }

    public int getRarity() { return rarity; }

    public int getCounter() { return counter; }

    public LegendaryBonusses getLegendaryBonus() { return legendaryBonus; }

    public String getDescription() { return description; }

    public int getHeal() { return heal; }

    public int getAmount() { return amount; }

    public int getMaxAmount() { return maxAmount; }

    public void setAmount(int amount) { this.amount = amount; }

    public void useItem() { amount--; }
}
