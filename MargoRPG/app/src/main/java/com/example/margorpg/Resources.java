package com.example.margorpg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.margorpg.Attack.Enemy;

import java.util.ArrayList;
import java.util.List;

import static com.example.margorpg.LegendaryBonusses.Oslepienie;
import static com.example.margorpg.LegendaryBonusses.OstatniRatunek;
import static com.example.margorpg.MainActivity.context;

public class Resources {

    public static final String h = "h";
    public static final String m = "m";
    public static final String t = "t";
    public static final String w = "w";
    public static final String b = "b";
    public static final String p = "p";
    public static final String SavedLvl = "lvl"; // int
    public static final String SavedMoney = "money"; // int
    public static final String SavedNickname = "nickname"; // int
    public static final String SavedClass = "class"; // int
    public static final String SavedExp = "exp"; // int
    public static final String SavedImageFront = "imageFront"; // int
    public static final String SavedImageBack = "imageBack"; // int
    public static final String SavedEq = "eq"; // int
    public static final String SavedHelmet = "helmet";
    public static final String SavedRing = "ring";
    public static final String SavedNecklace = "necklace";
    public static final String SavedGloves = "gloves";
    public static final String SavedWeapon = "weapon";
    public static final String SavedTwoHandedWeapon = "twoHandedWeapon";
    public static final String SavedArmor = "armor";
    public static final String SavedSecWeapon = "secWeapon";
    public static final String SavedShoes = "shoes";
    public static final String SavedAttackFrom = "attackFrom"; // int
    public static final String SavedAttackTo = "attackTo"; // int
    public static final String SavedArmorStats = "armorStats"; // int
    public static final String SavedSa = "sa"; // double
    public static final String SavedStrength = "strength"; // int
    public static final String SavedDexterity = "dexterity"; // int
    public static final String SavedIntellect = "intellect"; // int
    public static final String SavedHp = "hp"; // int
    public static final String SavedMaxHp = "maxHp"; // int
    public static final String SavedSlowDown = "slowDown"; // double
    public static final String SavedCounter = "counter"; // int
    public static final String SavedHealing = "healing"; // int
    public static final String SavedAbsorption = "absorption"; // int
    public static final String SavedMagicAbs = "magicAbs"; // int
    public static final String SavedCritic = "critic"; // double
    public static final String SavedDodge = "dodge"; // int
    public static final String SavedBlock = "block"; // int
    public static final String SavedCritPower = "critPower"; // int
    public static final String SavedArmorPen = "armorPen"; // int
    public static final String SavedMagicRes = "magicRes"; // int
    public static final String SavedIfHaveLegendaryBonusOstatniRatunek = "ostatniRatunek"; // int
    public static final String SavedIfHaveLegendaryBonusOslepienie = "oslepienie"; // int

    public static final String DefaultNickname = "Hubizonek";
    public static final int DefaultImageFront = R.drawable.hero1_front;//context.getResources().getDrawable(R.drawable.hero1_front);
    public static final int DefaultImageBack = R.drawable.hero1_back;//context.getResources().getDrawable(R.drawable.hero1_back);
    public static final int DefaultLvl = 15;
    public static final String DefaultClass = p;
    public static final int DefaultExp = 0;
    public static final int DefaultMoney = 10000;
    public static final ArrayList<Item> DefaultEq = new ArrayList<>();
    public static final Item DefaultHelmet = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.helmet, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultRing = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultNecklace = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.necklace, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultGloves = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.gloves, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultWeapon = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.weapon, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultTwoHandedWeapon = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.twoHandedWeapon, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultArmor = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.armor, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultSecWeapon = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.secWeapon, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final Item DefaultShoes = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.shoes, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static final int DefaultAttackFrom = 3;
    public static final int DefaultAttackTo = 7;
    public static final int DefaultArmorStats = 0;
    public static final double DefaultSa = 1.14;
    public static final int DefaultStrength = 3;
    public static final int DefaultDexterity = 3;
    public static final int DefaultIntellect = 3;
    public static final int DefaultHp = 150;
    public static final int DefaultMaxHp = 150;
    public static final double DefaultSlowDown = 0.00;
    public static final int DefaultCounter = 0;
    public static final int DefaultHealing = 0;
    public static final int DefaultAbsorption = 0;
    public static final int DefaultMagicAbs = 0;
    public static final double DefaultCritic = 1.00;
    public static final int DefaultDodge = 0;
    public static final int DefaultBlock = 0;
    public static final int DefaultCritPower = 120;
    public static final int DefaultArmorPen = 0;
    public static final int DefaultMagicRes = 0;
    public static final int DefaultIfHaveLegendaryBonusOstatniRatunek = 0;
    public static final int DefaultIfHaveLegendaryBonusOslepienie = 0;


    public static int getExpToNextLevel(TinyDB tinyDB)
    {
        int lvlFrom = tinyDB.getInt(SavedLvl, DefaultLvl);
        int lvlTo = lvlFrom + 1;

        int c = (lvlTo -= 1) * lvlTo * lvlTo * lvlTo,
                o = (lvlFrom -= 1) * lvlFrom * lvlFrom * lvlFrom,
                r = 10 + (int)Math.round((c - o));
        return r;
    }

    public static Spanned GetItemStats(Item item)
    {
        String stats = "";
        if(item.getAttackFrom() !=  0)
        {
            if(item.getAttackTo() != 0 && item.getAttackFrom() != item.getAttackTo())
                stats = "Attack: " + item.getAttackFrom() + "-" + item.getAttackTo() + "<br></br>";
            else
                stats = "Attack: " + item.getAttackFrom() + "<br></br>";
        }
        if(item.getArmor() != 0)
            stats += ("Armor: " + item.getArmor() + "<br></br>");
        if(item.getSa() != 0)
            stats += ("SA: " + item.getSa() + "<br></br>");
        if(item.getStrength() != 0)
            stats += ("Strength: " + item.getStrength() + "<br></br>");
        if(item.getDexterity() != 0)
            stats += ("Dexterity: " + item.getDexterity() + "<br></br>");
        if(item.getIntellect() != 0)
            stats += ("Intellect: " + item.getIntellect() + "<br></br>");
        if(item.getHp() != 0)
            stats += ("HP: " + item.getHp() + "<br></br>");
        if(item.getCritic() != 0)
            stats += ("Critic: " + item.getCritic() + "%<br></br>");
        if(item.getDodge() != 0)
            stats += ("Dodge: " + item.getDodge() + "<br></br>");
        if(item.getBlock() != 0)
            stats += ("Block: " + item.getBlock() + "<br></br>");
        if(item.getCritPower() != 0)
            stats += ("Critical Power: " + item.getCritPower() + "%<br></br>");
        if(item.getArmorPen() != 0)
            stats += ("Armor Penetration: " + item.getArmorPen() + "%<br></br>");
        if(item.getMagicRes() != 0)
            stats += ("Magic Resistance: " + item.getMagicRes() + "<br></br>");
        if(item.getHealing() != 0)
            stats += ("Healing: " + item.getHealing() + "<br></br>");
        if(item.getAbsorption() != 0)
            stats += ("Absorption: " + item.getAbsorption() + "<br></br>");
        if(item.getMagicAbs() != 0)
            stats += ("Magic Absorption: " + item.getMagicAbs() + "<br></br>");
        if(item.getSlowDown() != 0)
            stats += ("Slow Down: " + item.getSlowDown() + "<br></br>");
        if(item.getCounter() != 0)
            stats += ("Counter: " + item.getCounter() + "%<br></br>");
        if(item.getHpForStrength() != 0)
            stats += ("+" + item.getHpForStrength() + " health for 1 strength point" + "<br></br>");
        if(item.getAmount() != 0)
            stats += ("Amount: " + item.getAmount() + "<br></br>");
        if(item.getAmount() != 0)
            stats += ("Max amount: " + item.getMaxAmount() + "<br></br>");
        if(item.getHeal() != 0)
            stats += ("Heal: " + item.getHeal() + "<br></br>");
        if(item.getLegendaryBonus() == OstatniRatunek)
            stats += "<br></br><i><font color=#de5e03>Ostatni ratunek: Kiedy po otrzymanym ataku zostanie graczowi mniej niż 18% życia, zostaje jednorazowo znacznie uleczony.</font></i><br></br>";
        if(item.getLegendaryBonus() == Oslepienie)
            stats += "<br></br><i><font color=#de5e03>Oślepienie: Podczas przyjmowania ataku 9% szansy na oślepienie przeciwnika i ominięcie jego najbliższego ruchu.</font></i><br></br>";
        if(!item.getDescription().equals(""))
            stats += ("<br></br><i>" + item.getDescription() + "<i>");
        return Html.fromHtml(stats);
    }

    @SuppressLint("SetTextI18n")
    public static void LoadHeroInfo(Activity activity, TinyDB tinyDB)
    {
        ((TextView)activity.findViewById(R.id.hero_nickname)).setText(" " + tinyDB.getString(SavedNickname, DefaultNickname));
        ((TextView)activity.findViewById(R.id.hero_lvl)).setText(" Lvl: " + tinyDB.getInt(SavedLvl, DefaultLvl));
        ((ProgressBar)activity.findViewById(R.id.hero_exp_progressbar)).setMax(getExpToNextLevel(tinyDB));
        ((ProgressBar)activity.findViewById(R.id.hero_exp_progressbar)).setProgress(tinyDB.getInt(SavedExp, DefaultExp));
        if(tinyDB.getInt(SavedHp, DefaultHp) > tinyDB.getInt(SavedMaxHp, DefaultMaxHp))
            tinyDB.putInt(SavedHp, tinyDB.getInt(SavedMaxHp, DefaultMaxHp));
        if(tinyDB.getInt(SavedHp, DefaultHp) < 0)
            tinyDB.putInt(SavedHp, 0);
        ((ProgressBar)activity.findViewById(R.id.vertical_progressbar)).setMax(tinyDB.getInt(SavedMaxHp, DefaultMaxHp));
        ((ProgressBar)activity.findViewById(R.id.vertical_progressbar)).setProgress(tinyDB.getInt(SavedHp, DefaultHp));
        ((TextView)activity.findViewById(R.id.heroHpPercent)).setText(Math.round(((double)tinyDB.getInt(SavedHp, DefaultHp) / (double)tinyDB.getInt(SavedMaxHp, DefaultMaxHp)) * 100.0) + "%");
        ((TextView)activity.findViewById(R.id.hero_exp)).setText(tinyDB.getInt(SavedExp, DefaultExp) + "/" + getExpToNextLevel(tinyDB));
        ((TextView)activity.findViewById(R.id.hero_money)).setText(tinyDB.getInt(SavedMoney, DefaultMoney) + " ");
    }


    public static Item wyszczerbionyMiecz = new Item("Wyszczerbiony miecz", R.drawable.item_wymi, new String[]{w, b, p}, 1, 24, ItemTypes.weapon, 0, 6, 7, 0, 0.08, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item krotkiMiecz = new Item("Krótki Miecz", R.drawable.item_krmi, new String[]{w, b, p}, 2, 62, ItemTypes.weapon, 0, 12, 15, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, null, "");
    public static Item wyszczerbionyMiedzianyMiecz = new Item("Wyszczerbiony miedziany miecz", R.drawable.item_wymimi, new String[]{w, b, p}, 3, 114, ItemTypes.weapon, 0, 18, 22, 0, 0, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item mieczGiermka = new Item("Miecz giermka", R.drawable.item_migi, new String[]{w, b, p}, 4, 179, ItemTypes.weapon, 0, 25, 30, 0, 0.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item mieczOpryszka = new Item("Miecz opryszka", R.drawable.item_miop, new String[]{w, b, p}, 6, 351, ItemTypes.weapon, 0, 37, 46, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item staryDlugiMiecz = new Item("Stary długi miecz", R.drawable.item_stdlmi, new String[]{w, b, p}, 8, 608, ItemTypes.weapon, 0, 51, 62, 0, 0.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item szerokiMiecz = new Item("Szeroki miecz", R.drawable.item_szmi, new String[]{w, b, p}, 9, 431, ItemTypes.weapon, 0, 57, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item szpada = new Item("Szpada", R.drawable.item_sz, new String[]{w, b, p}, 10, 821, ItemTypes.weapon, 0, 64, 79, 0, 0.11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item zabkowanaWlocznia = new Item("Ząbkowana włócznia", R.drawable.item_zawl, new String[]{w, p}, 11, 853, ItemTypes.twoHandedWeapon, 0, 83, 94, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item mlotBojowy = new Item("Młot Bojowy", R.drawable.item_mlbo, new String[]{w, p}, 12, 1088, ItemTypes.twoHandedWeapon, 0, 98, 119, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, null, "");
    public static Item prostyKorbacz = new Item("Prosty korbacz", R.drawable.item_prko, new String[]{w, b, p}, 12, 1142, ItemTypes.weapon, 0, 78, 96, 0, 0.11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wlocznia = new Item("Włócznia", R.drawable.item_wl, new String[]{w, p}, 13, 1260, ItemTypes.twoHandedWeapon, 0, 107, 130, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item srebrnaKlinga = new Item("Srebrna klinga", R.drawable.item_srkl, new String[]{w, p}, 14, 963, ItemTypes.twoHandedWeapon, 0, 116, 141, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item mieczPoltorareczny = new Item("Miecz półtoraręczny", R.drawable.item_mipo, new String[]{w, p}, 15, 1641, ItemTypes.twoHandedWeapon, 0, 125, 153, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rapier = new Item("Rapier", R.drawable.item_ra, new String[]{w, b, p}, 18, 1538, ItemTypes.weapon, 0, 122, 149, 0, 0.15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item halabarda = new Item("Halabarda", R.drawable.item_ha, new String[]{w, p}, 19, 2553, ItemTypes.twoHandedWeapon, 0, 187, 214, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item poltorarecznyMieczSirGaliena = new Item("Półtoraręczny miecz Sir Galiena", R.drawable.item_pomisiga, new String[]{w, p}, 21, 2500, ItemTypes.twoHandedWeapon, 0, 192, 232, 0, 0.13, 129, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wekiera = new Item("Wekiera", R.drawable.item_we, new String[]{w, b, p}, 22, 2246, ItemTypes.weapon, 0, 153, 188, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item morgensztern = new Item("Morgensztern", R.drawable.item_mo, new String[]{w, b, p}, 22, 3666, ItemTypes.weapon, 0, 162, 197, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item szabla = new Item("Szabla", R.drawable.item_sz3, new String[]{w, b, p}, 25, 5512, ItemTypes.weapon, 0, 178, 217, 0, 0.15, 0, 0, 0, 15, 0, 0, 0, 0, 0, 1, 0, 0, 5, 1, 0, 0, null, "");
    public static Item katana = new Item("Katana", R.drawable.item_ka2, new String[]{w, b, p}, 25, 4521, ItemTypes.twoHandedWeapon, 0, 232, 292, 0, 0.14, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item bojowyKorbacz = new Item("Bojowy korbacz", R.drawable.item_boko, new String[]{w, b, p}, 28, 5606, ItemTypes.weapon, 0, 203, 258, 0, 0.15, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item palasz = new Item("Pałasz", R.drawable.item_pa2, new String[]{w, b, p}, 29, 5996, ItemTypes.weapon, 0, 222, 269, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, null, "");
    public static Item lekkiMieczPaladyna = new Item("Lekki miecz paladyna", R.drawable.item_lemipa, new String[]{p}, 30, 6480, ItemTypes.weapon, 0, 309, 353, 0, 0, 0, 0.29, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 3, 0, null, "");

    public static Item uszkodzonaZbroja = new Item("Uszkodzona zbroja", R.drawable.item_uszb, new String[]{w, p}, 1, 27, ItemTypes.armor, 0, 0, 0, 3, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item lekkaSkorzanaZbroja = new Item("Lekka skórzana zbroja", R.drawable.item_leskzb, new String[]{w, p}, 2, 69, ItemTypes.armor, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item ciezkaCwiekowanaZbroja = new Item("Ciężka ćwiekowana zbroja", R.drawable.item_cicwzb, new String[]{w, m, h, b, p, t}, 4, 114, ItemTypes.armor, 0, 0, 0, 11, 0, 39, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item lekkaZbrojaPlytowa = new Item("Lekka zbroja płytowa", R.drawable.item_lezbpl, new String[]{w, p}, 5, 190, ItemTypes.armor, 0, 0, 0, 16, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.1, null, "");
    public static Item zbrojaZPlatyny = new Item("Zbroja z platyny", R.drawable.item_zbzpl, new String[]{w, p}, 6, 387, ItemTypes.armor, 0, 0, 0, 19, 0.1, 0, 0, 0, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.1, null, "");
    public static Item zbrojaZTytanu = new Item("Zbroja z tytanu", R.drawable.item_zbzty, new String[]{w, p}, 7, 506, ItemTypes.armor, 0, 0, 0, 22, 0, 0, 0, 0, 10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.1, null, "");
    public static Item zbrojaPierscieniowa = new Item("Zbroja pierścieniowa", R.drawable.item_zbpi, new String[]{w, p}, 8, 386, ItemTypes.armor, 0, 0, 0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.1, null, "");
    public static Item zbrojaPaskowa = new Item("Zbroja paskowa", R.drawable.item_zbpa, new String[]{w, p}, 10, 574, ItemTypes.armor, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.1, null, "");
    public static Item zbrojaSzczurolapa = new Item("Zbroja szczurołapa", R.drawable.item_zbsz, new String[]{w, m, t, h, b, p}, 11, 1200, ItemTypes.armor, 0, 0, 0, 31, 0.11, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Żaden gryzoń nie jest dla ciebie godnym przeciwnikiem. Nawet białe myszki...");
    public static Item zbrojaLuskowa = new Item("Zbroja łuskowa", R.drawable.item_zblu, new String[]{w, p}, 11, 1389, ItemTypes.armor, 0, 0, 0, 43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.1, null, "");
    public static Item zbrojaSegmentowa = new Item("Zbroja segmentowa", R.drawable.item_zbse, new String[]{w, p}, 15, 1809, ItemTypes.armor, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.2, null, "");
    public static Item stalowyNapiersnik = new Item("Stalowy napierśnik", R.drawable.item_stna, new String[]{w, p}, 18, 2680, ItemTypes.armor, 0, 0, 0, 61, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.2, null, "");
    public static Item kolczugaPaladyna = new Item("Kolczuga paladyna", R.drawable.item_kopa, new String[]{p}, 18, 2543, ItemTypes.armor, 0, 0, 0, 53, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0.2, null, "");
    public static Item zbrojaPlytowa = new Item("Zbroja płytowa", R.drawable.item_zbpl, new String[]{w, p}, 20, 3102, ItemTypes.armor, 0, 0, 0, 69, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.2, null, "");
    public static Item ponchoMlodegoIndianina = new Item("Poncho młodego indianina", R.drawable.item_pomlin, new String[]{w, m, t, h, b, p}, 20, 5250, ItemTypes.armor, 0, 0, 0, 60, 0.13, 0, 0, 0, 0, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item przepaskaPrzezBiodro = new Item("Przepaska przez biodro", R.drawable.item_prprbi, new String[]{w, m, t, h, b, p}, 20, 2100, ItemTypes.armor, 0, 0, 0, 60, 0.13, 0, 0, 0, 13, 13, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wzmocnionaKolczugaPaladyna = new Item("Wzmocniona kolczuga paladyna", R.drawable.item_wzkopa, new String[]{p}, 21, 2267, ItemTypes.armor, 0, 0, 0, 57, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0.2, null, "");
    public static Item zbrojaSkrzydlategoPomiotu = new Item("Zbroja skrzydlatego pomiotu", R.drawable.item_zbskpo, new String[]{w, m, t, h, b, p}, 24, 2783, ItemTypes.armor, 0, 0, 0, 67, 0.14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item zbrojaSzlachetnegoPaladynaIii = new Item("Zbroja szlachetnego paladyna III", R.drawable.item_zbszpa, new String[]{p}, 25, 4360, ItemTypes.armor, 0, 0, 0, 70, 0, 237, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0.3, null, "");
    public static Item lekkaKolczugaMagiczna = new Item("Lekka kolczuga magiczna", R.drawable.item_lekoma, new String[]{p}, 25, 3159, ItemTypes.armor, 0, 0, 0, 70, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0.3, null, "");
    public static Item pelnaZbrojaPlytowa = new Item("Pełna zbroja płytowa", R.drawable.item_pezbpl, new String[]{w, p}, 25, 3263, ItemTypes.armor, 0, 0, 0, 89, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3, null, "");
    public static Item ponchoLowcyTatanek = new Item("Poncho łowcy tatanek", R.drawable.item_polota, new String[]{w, m, t, h, b, p}, 25, 3900, ItemTypes.armor, 0, 0, 0, 78, 0.14, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2, null, "");
    public static Item otulinaSmierci = new Item("Otulina śmierci", R.drawable.item_otsm, new String[]{w, m, t, h, b, p}, 25, 6719, ItemTypes.armor, 1, 0, 0, 91, 0.14, 250, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2, null, "");
    public static Item wzmocnionaKolczugaMagiczna = new Item("Wzmocniona kolczuga magiczna", R.drawable.item_wzkoma, new String[]{p}, 29, 5697, ItemTypes.armor, 0, 0, 0, 93, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0.3, null, "");

    public static Item skorzanyHelm = new Item("Skórzany hełm", R.drawable.item_skhe, new String[]{w, m, t, h, b, p}, 1, 14, ItemTypes.helmet, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item stalowaMisiurka = new Item("Stalowa misiurka", R.drawable.item_stmi, new String[]{w, m, t, h, b, p}, 2, 33, ItemTypes.helmet, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item szyszak = new Item("Szyszak", R.drawable.item_sz2, new String[]{w, m, t, h, b, p}, 4, 95, ItemTypes.helmet, 0, 0, 0, 4, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item helmOtwarty = new Item("Hełm otwarty", R.drawable.item_heot, new String[]{w, m, t, h, b, p}, 5, 137, ItemTypes.helmet, 0, 0, 0, 4, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item przylbicaSetlana = new Item("Przyłbica Setlana", R.drawable.item_prse, new String[]{p}, 6, 144, ItemTypes.helmet, 0, 0, 0, 5, 0.1, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, null, "");
    public static Item wzmocnionyStalowyHelm = new Item("Wzmocniony stalowy hełm", R.drawable.item_wzsthe, new String[]{w, m, t, h, b, p}, 7, 162, ItemTypes.helmet, 0, 0, 0, 6, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item czapkaLesnegoElfa = new Item("Czapka leśnego elfa", R.drawable.item_czleel, new String[]{w, m, t, h, b, p}, 9, 240, ItemTypes.helmet, 0, 0, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item helmSzczurzegoKrola = new Item("Hełm szczurzego króla", R.drawable.item_heszkr, new String[]{w, m, t, h, b, p}, 9, 304, ItemTypes.helmet, 0, 0, 0, 9, 0.09, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item helmZPrzylbica = new Item("Hełm z przyłbicą", R.drawable.item_hezpr, new String[]{w, m, t, h, b, p}, 11, 921, ItemTypes.helmet, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item helmRycerski = new Item("Hełm Rycerski", R.drawable.item_hery, new String[]{w, m, t, h, b, p}, 13, 666, ItemTypes.helmet, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item czapkaRobina = new Item("Czapka Robina", R.drawable.item_czro, new String[]{w, m, t, h, b, p}, 15, 638, ItemTypes.helmet, 0, 0, 0, 14, 0.12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Legendarna czapka Robin Hooda z piórkiem wyrwanym z kupra kaczki.");
    public static Item maskaKlaunaMordercy = new Item("Maska Klauna Mordercy", R.drawable.item_maklmo, new String[]{w, m, t, h, b, p}, 15, 1500, ItemTypes.helmet, 1, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Koszmar, który nie pozwala spać!");
    public static Item nadgryzionyKapeluszCzarodzieja = new Item("Nadgryziony kapelusz czarodzieja", R.drawable.item_nakacz, new String[]{w, m, t, h, b, p}, 15, 608, ItemTypes.helmet, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item czapkaKartografa = new Item("Czapka kartografa", R.drawable.item_czka, new String[]{w, m, t, h, b, p}, 15, 670, ItemTypes.helmet, 0, 0, 0, 14, 0, 0, 0, 0, 12, 12, 12, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, null, "");
    public static Item kapturPikowegoRycerza = new Item("Kaptur pikowego rycerza", R.drawable.item_kapiry, new String[]{w, m, t, h, b, p}, 20, 2376, ItemTypes.helmet, 1, 0, 0, 21, 0.15, 0, 0, 0, 10, 10, 10, 0, 0, 0, 1, 3, 0, 0, 0, -3, 0, null, "");
    public static Item opaskaMlodegoIndianina = new Item("Opaska młodego indianina", R.drawable.item_opmlin, new String[]{w, m, t, h, b, p}, 20, 2850, ItemTypes.helmet, 0, 0, 0, 20, 0.13, 30, 0, 0, 13, 13, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item otwartyHelmMagiczny = new Item("Otwarty hełm magiczny", R.drawable.item_othema, new String[]{p}, 24, 1629, ItemTypes.helmet, 0, 0, 0, 22, 0, 0, 0, 0, 16, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item helmZGlowyDemona = new Item("Hełm z głowy demona", R.drawable.item_hezglde, new String[]{w, m, t, h, b, p}, 24, 1529, ItemTypes.helmet, 0, 0, 0, 22, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, null, "");
    public static Item helmSzlachetnegoPaladynaIii = new Item("Hełm szlachetnego paladyna III", R.drawable.item_heszpa, new String[]{p}, 25, 2714, ItemTypes.helmet, 0, 0, 0, 23, 0, 0, 0, 0, 13, 0, 13, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, null, "");
    public static Item przylbicaOdwagi = new Item("Przyłbica odwagi", R.drawable.item_prod, new String[]{w, p}, 26, 1986, ItemTypes.helmet, 0, 0, 0, 31, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item zelzaznyLeb = new Item("Żelazny łeb", R.drawable.item_zele, new String[]{w, m, t, h, b, p}, 29, 2448, ItemTypes.helmet, 0, 0, 0, 29, 0, 132, 0, 0, 17, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, null, "");
    public static Item helmArhala = new Item("Hełm Arhala", R.drawable.item_hear, new String[]{w, m, t, h, b, p}, 30, 2370, ItemTypes.helmet, 0, 0, 0, 36, 0, 0, 0, 0, 21, 21, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item przepaskaNaGlowe = new Item("Przepaska na głowę", R.drawable.item_prnagl, new String[]{w, m, t, h, b, p}, 30, 2370, ItemTypes.helmet, 0, 0, 0, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, null, "");
    public static Item magicznaCzapkaWilka = new Item("Magiczna czapka wilka", R.drawable.item_maczwi, new String[]{w, m, t, h, b, p}, 30, 2672, ItemTypes.helmet, 0, 0, 0, 32, 0, 0, 0, 0, 24, 0, 24, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, null, "");

    public static Item skorzaneButy = new Item("Skórzane Buty", R.drawable.item_skbu, new String[]{w, m, t, h, b, p}, 1, 14, ItemTypes.shoes, 0, 0, 0, 1, 0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item mocneSkorzaneButy = new Item("Mocne skórzane buty", R.drawable.item_moskbu, new String[]{w, m, t, h, b, p}, 2, 33, ItemTypes.shoes, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item butyZLisiejSkory = new Item("Buty z lisiej skóry", R.drawable.item_buzlisk, new String[]{w, m, t, h, b, p}, 4, 95, ItemTypes.shoes, 0, 0, 0, 3, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wzmocnioneButy = new Item("Wzmocnione buty", R.drawable.item_wzbu, new String[]{w, m, t, h, b, p}, 5, 91, ItemTypes.shoes, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, null, "");
    public static Item miedzianeButy = new Item("Miedziane buty", R.drawable.item_mibu, new String[]{w, m, t, h, b, p}, 6, 124, ItemTypes.shoes, 0, 0, 0, 5, 0, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item staloweButy = new Item("Stalowe buty", R.drawable.item_stbu, new String[]{w, m, t, h, b, p}, 7, 243, ItemTypes.shoes, 0, 0, 0, 7, 0, 0, 0, 0, 10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item butyRycerskie = new Item("Buty rycerskie", R.drawable.item_bury, new String[]{w, m, t, h, b, p}, 9, 283, ItemTypes.shoes, 0, 0, 0, 9, 0.15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item butyUcieczkiEndriu = new Item("Buty ucieczki Endriu", R.drawable.item_buucen, new String[]{w, m, t, h, b, p}, 10, 319, ItemTypes.shoes, 0, 0, 0, 8, 0.13, 0, 0, 0, 9, 15, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item zimoweTrzewikiOdkrywcy = new Item("Zimowe trzewiki odkrywcy", R.drawable.item_zitrod, new String[]{w, m, t, h, b, p}, 12, 967, ItemTypes.shoes, 4, 0, 0, 14, 0.18, 0, 0, 0, 23, 23, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item lyzwy = new Item("Łyżwy", R.drawable.item_ly, new String[]{w, m, t, h, b, p}, 15, 100, ItemTypes.shoes, 0, 0, 0, 13, 0.19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Kiedy łyżwy wpadną w ręce, a raczej w nogi, odpowiedniego człowieka, stają się niezawodnym i szybkim środkiem transportu, ale każdy łyżwiarz kiedyś w końcu upada.");
    public static Item zieloneGetry = new Item("Zielone getry", R.drawable.item_zige, new String[]{w, m, t, h, b, p}, 15, 319, ItemTypes.shoes, 0, 0, 0, 13, 0, 0, 0.13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Rajtuzy z elastycznej tkaniny w najmodniejszym w tym sezonie kolorze - zielonym. Przyciągają wzrok, skutecznie rozpraszając przeciwnika.");
    public static Item ciezkieRycerskieButy = new Item("Ciężkie rycerskie buty", R.drawable.item_cirybu, new String[]{w, m, t, h, b, p}, 16, 629, ItemTypes.shoes, 0, 0, 0, 14, 0.12, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item butyTajemnejMocy = new Item("Buty tajemnej mocy", R.drawable.item_butamo, new String[]{w, m, t, h, b, p}, 18, 942, ItemTypes.shoes, 0, 0, 0, 16, 0, 0, 0, 0, 17, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "\\\"Jeżeli zbliżysz się za bardzo do mrocznych mocy, może zmienić to i Ciebie.\\\"");
    public static Item szybkobiegiDzikie = new Item("Szybkobiegi Dzikie", R.drawable.item_szdz, new String[]{w, m, t, h, b, p}, 20, 1862, ItemTypes.shoes, 1, 0, 0, 19, 0.18, 0, 0, 0, 26, 0, -7, 0, 0, 0, 0, 0, 0, 18, 0, 0, 0, null, "Stworzone do uciekania przed strażą miejską, portową oraz wdeptywania wrogów w ziemię.");
    public static Item uszkodzoneButyThowara = new Item("Uszkodzone buty Thowara", R.drawable.item_usbuth, new String[]{w, p}, 20, 1094, ItemTypes.shoes, 0, 0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item dobreSkorzaneButy = new Item("Dobre skórzane buty", R.drawable.item_doskbu, new String[]{w, m, t, h, b, p}, 20, 1724, ItemTypes.shoes, 0, 0, 0, 23, 0.13, 0, 0, 0, 13, 13, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item skorzaneButyLekkosci = new Item("Skórzane buty lekkości", R.drawable.item_skbule, new String[]{w, m, t, h, b, p}, 22, 1310, ItemTypes.shoes, 0, 0, 0, 20, 0.19, 0, 0, 0, 10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item butySzlachetnegoPaladynaIii = new Item("Buty szlachetnego paladyna III", R.drawable.item_buszpa, new String[]{p}, 25, 1607, ItemTypes.shoes, 0, 0, 0, 21, 0.19, 0, 0, 0, 16, 16, 16, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, null, "");
    public static Item zolnierskieButy = new Item("Żołnierskie buty", R.drawable.item_zobu, new String[]{w, m, t, h, b, p}, 25, 2844, ItemTypes.shoes, 1, 0, 0, 27, 0.14, 106, 0, 0, 14, 14, 14, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, null, "");
    public static Item butyNocnegoElfa = new Item("Buty nocnego elfa", R.drawable.item_bunoel, new String[]{w, m, t, h, b, p}, 25, 7373, ItemTypes.shoes, 4, 0, 0, 33, 0.33, 0, 0, 0, 27, 27, 27, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, null, "");
    public static Item butyGonca = new Item("Buty gońca", R.drawable.item_bugo, new String[]{w, m, t, h, b, p}, 26, 1891, ItemTypes.shoes, 0, 0, 0, 24, 0.15, 0, 0, 0, 15, 15, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item ciezkieButyWojownika = new Item("Ciężkie buty wojownika", R.drawable.item_cibuwo, new String[]{w, p}, 28, 3289, ItemTypes.shoes, 0, 0, 0, 31, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item butyPaladyna = new Item("Buty paladyna", R.drawable.item_bupa, new String[]{p}, 30, 2486, ItemTypes.shoes, 0, 0, 0, 26, 0, 0, 0, 0, 16, 0, 16, 0, 66, 66, 0, 1, 0, 0, 0, 3, 0, null, "");
    public static Item butyArhala = new Item("Buty Arhala", R.drawable.item_buar, new String[]{w, m, t, h, b, p}, 30, 2370, ItemTypes.shoes, 0, 0, 0, 29, 0, 0, 0, 0, 16, 16, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");

    public static Item rekawice = new Item("Rękawice", R.drawable.item_re, new String[]{w, m, t, h, b, p}, 1, 14, ItemTypes.gloves, 0, 0, 0, 1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item skorzaneRekawice = new Item("Skórzane rękawice", R.drawable.item_skre, new String[]{w, m, t, h, b, p}, 2, 33, ItemTypes.gloves, 0, 0, 0, 1, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wzmocnioneRekawice = new Item("Wzmocnione rękawice", R.drawable.item_wzre, new String[]{w, m, t, h, b, p}, 4, 63, ItemTypes.gloves, 0, 0, 0, 3, 0, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceKolcze = new Item("Rękawice kolcze", R.drawable.item_reko, new String[]{w, m, t, h, b, p}, 5, 87, ItemTypes.gloves, 0, 0, 0, 3, 0, 0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceJezdzieckie = new Item("Rękawice jeździeckie", R.drawable.item_reje, new String[]{w, m, t, h, b, p}, 6, 186, ItemTypes.gloves, 0, 0, 0, 4, 0, 0, 0, 0, 10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceSprytu = new Item("Rękawice sprytu", R.drawable.item_resp, new String[]{w, m, t, h, b, p}, 7, 243, ItemTypes.gloves, 0, 0, 0, 5, 0.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item skorzaneRekawiceSily = new Item("Skórzane rękawice siły", R.drawable.item_skresi, new String[]{w, m, t, h, b, p}, 9, 304, ItemTypes.gloves, 0, 0, 0, 7, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceSzczurzegoKrola = new Item("Rękawice szczurzego króla", R.drawable.item_reszkr, new String[]{w, m, t, h, b, p}, 10, 464, ItemTypes.gloves, 0, 0, 0, 8, 0, 0, 0, 0, 15, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceRycerskie = new Item("Rękawice rycerskie", R.drawable.item_rery, new String[]{w, m, t, h, b, p}, 11, 491, ItemTypes.gloves, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item zlocisteRekawice = new Item("Złociste rękawice", R.drawable.item_zlre, new String[]{w, m, t, h, b, p}, 12, 490, ItemTypes.gloves, 0, 0, 0, 15, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceSzczurolapa = new Item("Rękawice szczurołapa", R.drawable.item_resz, new String[]{w, m, t, h, b, p}, 13, 1000, ItemTypes.gloves, 0, 0, 0, 15, 0, 0, 0, 0, 11, 11, 11, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, null, "Chronią przed pogryzieniem.");
    public static Item bialoCzerwonaSilikonowaOpaska = new Item("Biało-czerwona silikonowa opaska", R.drawable.item_biczsiop, new String[]{w, m, t, h, b, p}, 15, 970, ItemTypes.gloves, 4, 0, 0, 10, 0.1, 0, 0, 0, 10, 10, 10, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, null, "");
    public static Item rekawiceTafina = new Item("Rękawice Tafina", R.drawable.item_reta, new String[]{w, m, t, h, b, p}, 17, 846, ItemTypes.gloves, 0, 0, 0, 14, 0.15, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item unikatoweRekawiceSmialka = new Item("Unikatowe rękawice śmiałka", R.drawable.item_heresm, new String[]{w, m, t, h, b, p}, 20, 2443, ItemTypes.gloves, 1, 0, 0, 20, 0.15, 133, 0.15, 0, 18, 18, 18, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, null, "");
    public static Item niedzwiedzieRekawice = new Item("Niedźwiedzie rękawice", R.drawable.item_nire, new String[]{w, m, t, h, b, p}, 20, 1755, ItemTypes.gloves, 1, 0, 0, 18, 0.13, 86, 0, 0, 18, 18, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Wykonane są z niedźwiedzich skór.");
    public static Item rekawiceSzaregoNiedzwiedzia = new Item("Rękawice szarego niedźwiedzia", R.drawable.item_reszni, new String[]{w, m, t, h, b, p}, 20, 1724, ItemTypes.gloves, 0, 0, 0, 20, 0.13, 0, 0, 0, 13, 13, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item bloniaki = new Item("Błoniaki", R.drawable.item_bl, new String[]{w, m, t, h, b, p}, 24, 1546, ItemTypes.gloves, 0, 0, 0, 17, 0.15, 0, 0.15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceSzlachetnegoPaladyna = new Item("Rękawice szlachetnego paladyna III", R.drawable.item_reszpa, new String[]{p}, 25, 2313, ItemTypes.gloves, 0, 0, 0, 19, 0, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item ciepleRekawiczkiKamilka = new Item("Ciepłe rękawiczki Kamilka", R.drawable.item_cireka, new String[]{w, m, t, h, b, p}, 25, 2986, ItemTypes.gloves, 4, 0, 0, 20, 0.14, 113, 0.15, 0, 10, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Ciepłe i wygodne rękawiczki z jednym palcem. Jesteś zadowolony, że odebrałeś je Kamilkowi?");
    public static Item rekawiceMagiczne = new Item("Rękawice magiczne", R.drawable.item_rema, new String[]{w, m, t, h, b, p}, 25, 1592, ItemTypes.gloves, 0, 0, 0, 19, 0, 0, 0, 0, 13, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Ciepłe i wygodne rękawiczki z jednym palcem. Jesteś zadowolony, że odebrałeś je Kamilkowi?");
    public static Item folgoweRekawiceSily = new Item("Folgowe rękawice siły", R.drawable.item_foresi, new String[]{w, p}, 26, 2979, ItemTypes.gloves, 0, 0, 0, 23, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "Ciepłe i wygodne rękawiczki z jednym palcem. Jesteś zadowolony, że odebrałeś je Kamilkowi?");
    public static Item znoszoneKarwasze = new Item("Znoszone karwasze", R.drawable.item_znka, new String[]{w, m, t, h, b, p}, 30, 2489, ItemTypes.gloves, 0, 0, 0, 24, 0.16, 0, 0, 0, 16, 16, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Ciepłe i wygodne rękawiczki z jednym palcem. Jesteś zadowolony, że odebrałeś je Kamilkowi?");
    public static Item rekawicePaladyna = new Item("Rękawice paladyna", R.drawable.item_repa, new String[]{p}, 30, 3189, ItemTypes.gloves, 0, 0, 0, 23, 0, 0, 0, 0, 19, 19, 19, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, null, "Ciepłe i wygodne rękawiczki z jednym palcem. Jesteś zadowolony, że odebrałeś je Kamilkowi?");
    public static Item zieloneRekawice = new Item("Zielone rękawice", R.drawable.item_zire, new String[]{w, m, t, h, b, p}, 30, 2789, ItemTypes.gloves, 0, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 73, 0, 0, 0, 0, 0, 5, 0, 3, 0, null, "Ciepłe i wygodne rękawiczki z jednym palcem. Jesteś zadowolony, że odebrałeś je Kamilkowi?");

    public static Item piersciemWytrzymalosci = new Item("Pierścień wytrzymałości", R.drawable.item_piwy, new String[]{w, m, t, h, b, p}, 1, 12, ItemTypes.ring, 0, 0, 0, 0, 0, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienPrzyspieszenia = new Item("Pierścień przyśpieszenia", R.drawable.item_pipr, new String[]{w, m, t, h, b, p}, 2, 32, ItemTypes.ring, 0, 0, 0, 0, 0.09, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item piersciemSprytu = new Item("Pierścień sprytu", R.drawable.item_pisp, new String[]{w, m, t, h, b, p}, 3, 57, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item piersciemZwawosci = new Item("Pierścień żwawości", R.drawable.item_pizw, new String[]{w, m, t, h, b, p}, 4, 90, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item piersciemZdrowia = new Item("Pierścień zdrowia", R.drawable.item_pizd, new String[]{w, m, t, h, b, p}, 5, 87, ItemTypes.ring, 0, 0, 0, 0, 0, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item piersciemSily = new Item("Pierscień siły", R.drawable.item_pisi, new String[]{w, m, t, h, b, p}, 6, 177, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item piersciemSprawnosci = new Item("Pierścień sprawności", R.drawable.item_pisp2, new String[]{w, m, t, h, b, p}, 7, 231, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item piersciemMocyPowietrza = new Item("Pierścień mocy powietrza", R.drawable.item_pimopo, new String[]{w, m, t, h, b, p}, 10, 364, ItemTypes.ring, 0, 0, 0, 0, 0.15, 34, 0, 0, 15, 15, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienSzczurolapa = new Item("Pierścień szczurołapa", R.drawable.item_pisz, new String[]{w, m, t, h, b, p}, 11, 361, ItemTypes.ring, 0, 0, 0, 0, 0.11, 0, 0, 0, 11, 11, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienLowcy = new Item("Pierścień łowcy", R.drawable.item_pilo, new String[]{w, m, t, h, b, p}, 15, 671, ItemTypes.ring, 0, 0, 0, 0, 0.12, 89, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item zabieOczkoZabistracha = new Item("Żabie oczko Żabistracha", R.drawable.item_zaocza, new String[]{w, m, t, h, b, p}, 15, 1000, ItemTypes.ring, 1, 0, 0, 0, 0.12, 89, 0, 0, 12, 12, 12, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "... to chyba nie jest prawdziwe żabie oczko?! W każdym razie nie przyniosło szczęścia Żabistrachowi.");
    public static Item pierscienMocyWody = new Item("Pierścień mocy wody", R.drawable.item_pimowo, new String[]{w, m, t, h, b, p}, 15, 1206, ItemTypes.ring, 0, 0, 0, 0, 0.15, 98, 0, 0, 15, 15, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienZalobny = new Item("Pierścień żałobny", R.drawable.item_piza, new String[]{w, m, t, h, b, p}, 16, 756, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 12, 12, 12, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, null, "");
    public static Item okoOriona = new Item("Oko Oriona", R.drawable.item_okor, new String[]{w, m, t, h, b, p}, 20, 2327, ItemTypes.ring, 0, 0, 0, 0, 0.13, 0, 0, 0, 13, 13, 13, 36, 72, 72, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienMocyZiemi = new Item("Pierścień mocy ziemi", R.drawable.item_pimozi, new String[]{w, m, t, h, b, p}, 20, 1149, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0.14, 0, 13, 13, 13, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienBranora = new Item("Pierścień Branora", R.drawable.item_pibr, new String[]{w, m, t, h, b, p}, 20, 1213, ItemTypes.ring, 1, 0, 0, 0, 0.13, 112, 0, 0, 13, 13, 13, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, null, "");
    public static Item dobryPierscienMadrosci = new Item("Dobry pierścień mądrości", R.drawable.item_dopima, new String[]{w, m, t, h, b, p}, 25, 1995, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 14, 14, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item dobryPierscienSily = new Item("Dobry pierścień siły", R.drawable.item_dopisi, new String[]{w, m, t, h, b, p}, 25, 3025, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0, 0, 31, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscieMocyOgnia = new Item("Pierścień mocy ognia", R.drawable.item_pimoog, new String[]{w, m, t, h, b, p}, 25, 1755, ItemTypes.ring, 0, 0, 0, 0, 0.14, 0, 0, 0, 14, 14, 14, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienSprytuLowcy = new Item("Pierścień sprytu łowcy", R.drawable.item_pisplo, new String[]{w, m, t, h, b, p}, 28, 2289, ItemTypes.ring, 0, 0, 0, 0, 0.15, 166, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, null, "");
    public static Item sygnetLowcyWezy = new Item("Sygnet łowcy węży", R.drawable.item_sylowe, new String[]{w, m, t, h, b, p}, 30, 2370, ItemTypes.ring, 0, 0, 0, 0, 0.16, 0, 0, 0, 27, 27, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item sygnetKrolaElancji = new Item("Sygnet króla Elancji", R.drawable.item_sykrel, new String[]{w, m, t, h, b, p}, 30, 2370, ItemTypes.ring, 0, 0, 0, 0, 0, 296, 0, 0, 27, 27, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item zadziornyPierscien = new Item("Zadziorny pierścień", R.drawable.item_zapi, new String[]{w, m, t, h, b, p}, 30, 2744, ItemTypes.ring, 0, 0, 0, 0, 0.16, 0, 0, 0, 19, 19, 19, 25, 0, 0, 0, 0, 0, 0, 4, 0, 0, null, "Zrobiony z kociego pazura.");
    public static Item pierscienArhana = new Item("Pierścień Arhala", R.drawable.item_piar, new String[]{w, m, t, h, b, p}, 30, 4381, ItemTypes.ring, 1, 0, 0, 0, 0.16, 0, 0.17, 0, 0, 0, 0, 0, 0, 0, 2, 9, 0, 0, 1, 0, 0, null, "");

    public static Item naszyjnikWytrzymalosci = new Item("Naszyjnik wytrzymałości", R.drawable.item_nawy, new String[]{w, m, t, h, b, p}, 1, 12, ItemTypes.necklace, 0, 0, 0, 0, 0, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikPrzyspieszenia = new Item("Naszyjnik przyśpieszenia", R.drawable.item_napr, new String[]{w, m, t, h, b, p}, 2, 32, ItemTypes.necklace, 0, 0, 0, 0, 0.09, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikzwawosci = new Item("Naszyjnik żwawości", R.drawable.item_nazw, new String[]{w, m, t, h, b, p}, 4, 60, ItemTypes.necklace, 0, 0, 0, 0, 0, 39, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikOchrony = new Item("Naszyjnik ochrony", R.drawable.item_naoc, new String[]{w, m, t, h, b, p}, 5, 83, ItemTypes.necklace, 0, 0, 0, 4, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikSzybkosci = new Item("Naszyjnik szybkości", R.drawable.item_nasz, new String[]{w, m, t, h, b, p}, 5, 125, ItemTypes.necklace, 0, 0, 0, 0, 0.09, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikSily = new Item("Naszyjnik siły", R.drawable.item_nasi, new String[]{w, m, t, h, b, p}, 6, 177, ItemTypes.necklace, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikSprawnosci = new Item("Naszyjnik sprawności", R.drawable.item_nasp, new String[]{w, m, t, h, b, p}, 7, 231, ItemTypes.necklace, 0, 0, 0, 0, 0, 0, 0, 0, 12, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikSzczurolapa = new Item("Naszyjnik szczurołapa", R.drawable.item_nasz2, new String[]{w, m, t, h, b, p}, 10, 319, ItemTypes.necklace, 0, 0, 0, 0, 13, 67, 0, 0, 0, 13, 13, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikWielkiejWiary = new Item("Naszyjnik wielkiej wiary", R.drawable.item_nawiwi, new String[]{w, m, t, h, b, p}, 12, 461, ItemTypes.necklace, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item teczoweKorale = new Item("Tęczowe korale", R.drawable.item_teko, new String[]{w, m, t, h, b, p}, 14, 1500, ItemTypes.necklace, 1, 0, 0, 0, 0.37, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "W kinie w Lublinie, w swetrze i w metrze, tęczowo jest!");
    public static Item naszyjnikMocyWody = new Item("Naszyjnik mocy wody", R.drawable.item_namowo, new String[]{w, m, t, h, b, p}, 15, 906, ItemTypes.necklace, 0, 0, 0, 0, 0.12, 0, 0.12, 0, 12, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikWielkiejWiaryII = new Item("Naszyjnik wielkiej wiary II", R.drawable.item_nawiwi2, new String[]{p}, 16, 1403, ItemTypes.necklace, 1, 0, 0, 0, 0.13, 0, 0, 0, 22, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, null, "");
    public static Item naszyjnikDruida = new Item("Naszyjnik druida", R.drawable.item_nadr, new String[]{m, t, p}, 17, 966, ItemTypes.necklace, 0, 0, 0, 0, 0, 167, 0, 0, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item amuletBogaWojny = new Item("Amulet boga wojny", R.drawable.item_ambowo, new String[]{w, m, t, h, b, p}, 18, 994, ItemTypes.necklace, 0, 0, 0, 0, 0, 102, 0, 0, 24, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item amuletWombata = new Item("Amulet wombata", R.drawable.item_amwo, new String[]{w, m, t, h, b, p}, 19, 1106, ItemTypes.necklace, 0, 0, 0, 0, 0.12, 102, 0, 0, 13, 13, 13, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikMocyZiemi = new Item("Naszyjnik mocy ziemi", R.drawable.item_namozi, new String[]{w, m, t, h, b, p}, 20, 2068, ItemTypes.necklace, 0, 0, 0, 0, 0.13, 0, 0, 0, 13, 13, 13, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, null, "");
    public static Item kociaZwinnosc = new Item("Kocia zwinność", R.drawable.item_kozw, new String[]{w, m, t, h, b, p}, 23, 2580, ItemTypes.necklace, 0, 0, 0, 0, 0, 0, 0, 0, 10, 10, 10, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikMocyOgnia = new Item("Naszyjnik mocy ognia", R.drawable.item_namoog, new String[]{w, m, t, h, b, p}, 25, 1843, ItemTypes.necklace, 0, 0, 0, 0, 0.14, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, null, "");
    public static Item amuletPogromcyWampirow = new Item("Amulet pogromcy wampirów", R.drawable.item_ampowa, new String[]{w, m, t, h, b, p}, 27, 2242, ItemTypes.necklace, 0, 0, 0, 0, 0.16, 160, 0, 0, 16, 16, 16, 47, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item tygrysiNaszyjnik = new Item("Tygrysi naszyjnik", R.drawable.item_tyna, new String[]{w, m, t, h, b, p}, 28, 3754, ItemTypes.necklace, 0, 0, 0, 0, 0, 0, 0, 0, 31, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikZdrowia = new Item("Naszyjnik zdrowia", R.drawable.item_nazd, new String[]{w, m, t, h, b, p}, 30, 3613, ItemTypes.necklace, 0, 0, 0, 0, 0, 199, 0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikLowcyWezy = new Item("Naszyjnik łowcy węży", R.drawable.item_nalowe, new String[]{w, m, t, h, b, p}, 30, 4028, ItemTypes.necklace, 0, 0, 0, 0, 0, 169, 0, 0, 17, 17, 17, 0, 0, 0, 0, 3, 0, 0, 0, 5, 0, null, "");
    public static Item naszyjnikArhala = new Item("Naszyjnik Arhala", R.drawable.item_naar, new String[]{w, m, t, h, b, p}, 30, 5911, ItemTypes.necklace, 1, 0, 0, 0, 0.15, 173, 0, 0, 0, 0, 0, 57, 0, 0, 4, 0, 0, 0, 1, 0, 0, null, "");
    public static Item zacnyNaszyjnikZamieciI = new Item("Zacny naszyjnik zamieci I", R.drawable.item_zanaza, new String[]{w, m, t, h, b, p}, 30, 6243, ItemTypes.necklace, 1, 0, 0, 0, 0.24, 296, 0, 0, 24, 24, 24, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, null, "");

    public static Item zelaznaTarcza = new Item("Żelazna tarcza", R.drawable.item_zeta, new String[]{w, p}, 1, 21, ItemTypes.secWeapon, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, null, "");
    public static Item lekkaDrewnianaTarcza = new Item("Lekka drewniana tarcza", R.drawable.item_ledrta, new String[]{w, p}, 2, 53, ItemTypes.secWeapon, 0, 0, 0, 5, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, null, "");
    public static Item puklerz = new Item("Puklerz", R.drawable.item_pu, new String[]{w, p}, 3, 62, ItemTypes.secWeapon, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 3, 0, 0, 1, 0, null, "");
    public static Item okutaTarcza = new Item("Okuta tarcza", R.drawable.item_okta, new String[]{w, p}, 4, 153, ItemTypes.secWeapon, 0, 0, 0, 9, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, null, "");
    public static Item pancernyPuklerz = new Item("Pancerny puklerz", R.drawable.item_papu, new String[]{w, p}, 5, 222, ItemTypes.secWeapon, 0, 0, 0, 12, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0, 0, 0, 5, 0, 0, 1, 0, null, "");
    public static Item drewnianaTarcza = new Item("Drewniana tarcza", R.drawable.item_drta, new String[]{w, p}, 6, 302, ItemTypes.secWeapon, 0, 0, 0, 16, 0.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 1, 0, null, "");
    public static Item stalowaTarcza = new Item("Stalowa tarcza", R.drawable.item_stta, new String[]{w, p}, 7, 393, ItemTypes.secWeapon, 0, 0, 0, 17, 0, 0, 0, 0, 10, 10, 10, 0, 0, 0, 0, 0, 7, 0, 0, 1, 0, null, "");
    public static Item sredniaTarcza = new Item("Średnia tarcza", R.drawable.item_srta, new String[]{w, p}, 10, 492, ItemTypes.secWeapon, 0, 0, 0, 24, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 1, 0, null, "");
    public static Item wzmocnionaSredniaTarcza = new Item("Wzmocniona średnia tarcza", R.drawable.item_wzsrta, new String[]{w, p}, 12, 1029, ItemTypes.secWeapon, 0, 0, 0, 29, 0, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 1, 0, null, "");
    public static Item rytualnaTarcza = new Item("Rytualna Tarcza", R.drawable.item_ryta, new String[]{m, p}, 13, 2370, ItemTypes.secWeapon, 1, 0, 0, 15, 0, 100, 0, 0, 15, 0, 15, 0, 85, 85, 1, 0, 20, 0, 0, 5, 0, null, "");
    public static Item magicznyPuklerz = new Item("Magiczny puklerz", R.drawable.item_mapu, new String[]{m, p}, 14, 1710, ItemTypes.secWeapon, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 33, 33, 0, 0, 14, 10, 0, 3, 0, null, "");
    public static Item mocarnaTarczaRycerzaIi = new Item("Mocarna tarcza rycerza II", R.drawable.item_motary, new String[]{w, p}, 15, 2986, ItemTypes.secWeapon, 0, 0, 0, 39, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 2, 0, null, "");
    public static Item miedzianaTarcza = new Item("Miedziana tarcza", R.drawable.item_mita, new String[]{w, p}, 16, 2300, ItemTypes.secWeapon, 0, 0, 0, 40, 0, 0, 0, 0, 12, 12, 12, 0, 0, 0, 1, 0, 16, 0, 0, 1, 0, null, "");
    public static Item tarczaDobrejJakosci = new Item("Tarcza dobrej jakości", R.drawable.item_tadoja, new String[]{w, p}, 17, 1778, ItemTypes.secWeapon, 0, 0, 0, 43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 1, 0, null, "");
    public static Item malaTarczaPaladyna = new Item("Mała tarcza paladyna", R.drawable.item_matapa, new String[]{p}, 18, 1979, ItemTypes.secWeapon, 0, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22, 0, 0, 3, 0, null, "");
    public static Item ochronaPrzedTrollami = new Item("Ochrona przed trollami", R.drawable.item_ocprtr, new String[]{w, m, p}, 20, 3606, ItemTypes.secWeapon, 1, 0, 0, 53, 0, 97, 0, 0, 12, 12, 12, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, null, "");
    public static Item pawez = new Item("Pawęż", R.drawable.item_pa3, new String[]{w, p}, 23, 2201, ItemTypes.secWeapon, 0, 0, 0, 61, 0, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 0, 1, 0, null, "");
    public static Item lekkaCzerwonaTarcza = new Item("Lekka czerwona tarcza", R.drawable.item_leczta, new String[]{w, p}, 24, 3759, ItemTypes.secWeapon, 0, 0, 0, 64, 0, 120, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 0, 0, 1, 0, null, "");
    public static Item mocarnaTarczaRycerzaIii = new Item("Mocarna tarcza rycerza III", R.drawable.item_motary2, new String[]{w, p}, 25, 4456, ItemTypes.secWeapon, 0, 0, 0, 67, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 0, 0, 25, 0, 0, 1, 0, null, "");
    public static Item lekkaTarczaMagiczna = new Item("Lekka tarcza magiczna", R.drawable.item_letama, new String[]{p}, 25, 2580, ItemTypes.secWeapon, 0, 0, 0, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 0, 0, 3, 0, null, "");
    public static Item magicznaTarcza = new Item("Magiczna tarcza", R.drawable.item_mata, new String[]{m, p}, 26, 3380, ItemTypes.secWeapon, 0, 0, 0, 30, 0.15, 0, 0, 0, 0, 0, 0, 0, 61, 61, 0, 0, 26, 0, 0, 5, 0, null, "");
    public static Item lekkaTarczaBojowa = new Item("Lekka tarcza bojowa", R.drawable.item_letabo, new String[]{w, p}, 26, 2919, ItemTypes.secWeapon, 0, 0, 0, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26, 0, 1, 3, 0, null, "");
    public static Item pawezPancerny = new Item("Pawęż pancerny", R.drawable.item_papa, new String[]{w, p}, 28, 3204, ItemTypes.secWeapon, 0, 0, 0, 76, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, 0, 10, 3, 0, null, "");
    public static Item zolwiaTarcza = new Item("Żółwia tarcza", R.drawable.item_zota, new String[]{w, p}, 30, 4033, ItemTypes.secWeapon, 0, 0, 0, 83, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 3, 0, null, "");

    public static Item malaMiksturaPoszukiwacza = new Item("Mała mikstura poszukiwacza", R.drawable.item_mamipo, 22, 0, 3,5, 100, "");
    public static Item sredniaMiksturaPoszukiwacza = new Item("Średnia mikstura poszukiwacz", R.drawable.item_srmipo, 63, 0, 3,5, 200, "");
    public static Item duzaMiksturaPoszukiwacza = new Item("Duża mikstura poszukiwacza", R.drawable.item_dumipo, 87, 0, 3,5, 300, "");
    public static Item mocnyEliksirZdrowia = new Item("Mocny eliksir zdrowia", R.drawable.item_moelzd, 105, 0, 1, 3, 500, "");
    public static Item miksturaWilka = new Item("Mikstura wilka", R.drawable.item_miwi, 128, 0, 5, 10, 600, "");
    public static Item opatrunek = new Item("Opatrunek", R.drawable.item_op, 896, 0, 1, 1, 2500, "");
    public static Item opatrunekNasaczanyZiolami = new Item("Opatrunek nasączony ziołami", R.drawable.item_opnazi, 1133, 0, 1, 1, 5000, "");
    public static Item opatrunekNasaczanyMagia = new Item("Opatrunek nasączony magią", R.drawable.item_opnama, 1827, 0, 1, 1, 7500, "");
    public static Item wyciagZeZmiazdzonejZaby = new Item("Wyciąg ze zmiażdżonej żaby", R.drawable.item_wyzezmza, 800, 0, 10, 20, 1900, "");
    public static Item wezowyTluszczyk = new Item("Wężowy tłuszczyk", R.drawable.item_wetl, 840, 0, 20, 20, 2000, "W tym wypadku nie sprawdziło się powiedzenie \"Jesteś cienki jak tyłek węża\".");
    public static Item czerwonaMiksturaOgnia = new Item("Czerwona mikstura ognia", R.drawable.item_czmiog, 883, 0, 10, 10, 2500, "");
    public static Item wywarLeczacy = new Item("Wywar leczący", R.drawable.item_wyle, 1437, 0, 20, 20, 4500, "");
    public static Item duzaPomaranczowaMikstura = new Item("Duża pomarańczowa mikstura", R.drawable.item_dupomi, 1397, 0, 12, 12, 5000, "");
    public static Item syropZAronii = new Item("Syrop z aronii", R.drawable.item_syzar, 1344, 0, 5, 20, 4000, "");
    public static Item syropZGlogu = new Item("Syrop z głogu", R.drawable.item_syzgl, 1613, 0, 5, 20, 6500, "");
    public static Item syropMalinonwy = new Item("Syrop malinowy", R.drawable.item_syma, 1899, 0, 5, 20, 8000, "");
    public static Item miodAjszy = new Item("Miód Ajszy", R.drawable.item_miaj, 7, 0, 10, 10, 35, "");
    public static Item miodWlasnejRoboty = new Item("Miód własnej roboty", R.drawable.item_miwlro, 15, 0, 30, 30, 75, "Miód zrobiony wraz ze Zbigniewem. Ma gorzki smak, trzeba go pić małymi łykami.");
    public static Item miodWrzosowy = new Item("Miód wrzosowy", R.drawable.item_miwr, 55, 0, 5, 15, 200, "Doskonały do herbaty.");
    public static Item miodWielokwiatowy = new Item("Miód wielokwiatowy", R.drawable.item_miwi2, 110, 0, 3, 9, 550, "");
    public static Item miodLipowy = new Item("Miód lipowy", R.drawable.item_mili, 125, 0, 3, 3, 650, "");
    public static Item miodSpadziowy = new Item("Miód spadziowy", R.drawable.item_misp, 180, 0, 3, 30, 800, "");
    public static Item miodGryczany = new Item("Miód gryczany", R.drawable.item_migr, 240, 0, 8, 24, 950, "");
    public static Item miodZDodatkiemMagii = new Item("Miód z dodatkiem magii", R.drawable.item_mizdoma, 2250, 0, 15, 15, 500000, "Miód ma silne właściwości lecznicze. Sam zapach stawia na nogi.");


    public static final Item[] WeaponsP = new Item[]{
            wyszczerbionyMiecz, krotkiMiecz, wyszczerbionyMiedzianyMiecz, mieczGiermka, mieczOpryszka, staryDlugiMiecz, szerokiMiecz, szpada,
            zabkowanaWlocznia, mlotBojowy, prostyKorbacz, wlocznia, srebrnaKlinga, mieczPoltorareczny, rapier, halabarda,
            poltorarecznyMieczSirGaliena, wekiera, morgensztern, szabla, katana, bojowyKorbacz, palasz, lekkiMieczPaladyna
    };

    public static final Item[] ArmorP = new Item[]{
            uszkodzonaZbroja, lekkaSkorzanaZbroja, ciezkaCwiekowanaZbroja, lekkaZbrojaPlytowa, zbrojaZPlatyny, zbrojaZTytanu, zbrojaPierscieniowa, zbrojaPaskowa,
            zbrojaSzczurolapa, zbrojaLuskowa, zbrojaSegmentowa, stalowyNapiersnik, kolczugaPaladyna, zbrojaPlytowa, ponchoMlodegoIndianina, przepaskaPrzezBiodro,
            wzmocnionaKolczugaPaladyna, zbrojaSkrzydlategoPomiotu, zbrojaSzlachetnegoPaladynaIii, lekkaKolczugaMagiczna, pelnaZbrojaPlytowa, ponchoLowcyTatanek, otulinaSmierci, wzmocnionaKolczugaMagiczna
    };

    public static final Item[] HelmetsP = new Item[]{
            skorzanyHelm, stalowaMisiurka, szyszak, helmOtwarty, przylbicaSetlana, wzmocnionyStalowyHelm, czapkaLesnegoElfa, helmSzczurzegoKrola,
            helmRycerski, czapkaRobina, maskaKlaunaMordercy, nadgryzionyKapeluszCzarodzieja, czapkaKartografa, helmZPrzylbica, kapturPikowegoRycerza, opaskaMlodegoIndianina,
            otwartyHelmMagiczny, helmZGlowyDemona, helmSzlachetnegoPaladynaIii, przylbicaOdwagi, zelzaznyLeb, helmArhala, przepaskaNaGlowe, magicznaCzapkaWilka
    };

    public static final Item[] ShoesP = new Item[]{
            skorzaneButy, mocneSkorzaneButy, butyZLisiejSkory, wzmocnioneButy, miedzianeButy, staloweButy, butyRycerskie, butyUcieczkiEndriu,
            zimoweTrzewikiOdkrywcy, lyzwy, zieloneGetry, ciezkieRycerskieButy, butyTajemnejMocy, szybkobiegiDzikie, uszkodzoneButyThowara, dobreSkorzaneButy,
            skorzaneButyLekkosci, butySzlachetnegoPaladynaIii, zolnierskieButy, butyNocnegoElfa, butyGonca, ciezkieButyWojownika, butyPaladyna, butyArhala
    };

    public static final Item[] GlovesP = new Item[]{
            rekawice, skorzaneRekawice, wzmocnioneRekawice, rekawiceKolcze, rekawiceJezdzieckie, rekawiceSprytu, skorzaneRekawiceSily, rekawiceSzczurzegoKrola,
            rekawiceRycerskie, zlocisteRekawice, rekawiceSzczurolapa, bialoCzerwonaSilikonowaOpaska, rekawiceTafina, unikatoweRekawiceSmialka, niedzwiedzieRekawice, rekawiceSzaregoNiedzwiedzia,
            bloniaki, rekawiceSzlachetnegoPaladyna, ciepleRekawiczkiKamilka, rekawiceMagiczne, folgoweRekawiceSily, znoszoneKarwasze, rekawicePaladyna, zieloneRekawice
    };

    public static final Item[] RingsP = new Item[]{
            piersciemWytrzymalosci, pierscienPrzyspieszenia, piersciemSprytu, piersciemZwawosci, piersciemZdrowia, piersciemSily, piersciemSprawnosci, piersciemMocyPowietrza,
            pierscienSzczurolapa, pierscienLowcy, zabieOczkoZabistracha, pierscienMocyWody, pierscienZalobny, okoOriona, pierscienMocyZiemi, pierscienBranora,
            dobryPierscienMadrosci, dobryPierscienSily, pierscieMocyOgnia, pierscienSprytuLowcy, sygnetLowcyWezy, sygnetKrolaElancji, zadziornyPierscien, pierscienArhana
    };

    public static final Item[] NecklacesP = new Item[]{
            naszyjnikWytrzymalosci, naszyjnikPrzyspieszenia, naszyjnikzwawosci, naszyjnikOchrony, naszyjnikSzybkosci, naszyjnikSily, naszyjnikSprawnosci, naszyjnikSzczurolapa,
            naszyjnikWielkiejWiary, teczoweKorale, naszyjnikMocyWody, naszyjnikWielkiejWiaryII, naszyjnikDruida, amuletBogaWojny, amuletWombata, naszyjnikMocyZiemi,
            kociaZwinnosc, naszyjnikMocyOgnia, amuletPogromcyWampirow, tygrysiNaszyjnik, naszyjnikZdrowia, naszyjnikLowcyWezy, naszyjnikArhala, zacnyNaszyjnikZamieciI
    };


    public static final Item[] SecWeaponsP = new Item[]{
            zelaznaTarcza, lekkaDrewnianaTarcza, puklerz, okutaTarcza, pancernyPuklerz, drewnianaTarcza, stalowaTarcza, sredniaTarcza,
            wzmocnionaSredniaTarcza, rytualnaTarcza, magicznyPuklerz, mocarnaTarczaRycerzaIi, miedzianaTarcza, tarczaDobrejJakosci, malaTarczaPaladyna, ochronaPrzedTrollami,
            pawez, lekkaCzerwonaTarcza, mocarnaTarczaRycerzaIii, lekkaTarczaMagiczna, magicznaTarcza, lekkaTarczaBojowa, pawezPancerny, zolwiaTarcza
    };

    public static final Item[] Potions = new Item[]{
            malaMiksturaPoszukiwacza, sredniaMiksturaPoszukiwacza, duzaMiksturaPoszukiwacza, mocnyEliksirZdrowia, miksturaWilka, opatrunek, opatrunekNasaczanyZiolami, opatrunekNasaczanyMagia,
            wyciagZeZmiazdzonejZaby, wezowyTluszczyk, czerwonaMiksturaOgnia, wywarLeczacy, duzaPomaranczowaMikstura, syropZAronii, syropZGlogu, syropMalinonwy,
            miodAjszy, miodWlasnejRoboty, miodWrzosowy, miodWielokwiatowy, miodLipowy, miodSpadziowy, miodGryczany, miodZDodatkiemMagii
    };

    public static final Item[] Other = new Item[]{};


    public static Item mieso = new Item("Mięso", R.drawable.item_mi, 11, 0, 1,3, 18, "");
    public static Enemy zajac = new Enemy("Zając", context.getDrawable(R.drawable.enemy_za), 1, w, 0, new Item[] { mieso }, 4, 2, 0,  1.00, 25, 0, 0, 0, 6);

    public static Item oczyZaby= new Item("Oczy Żaby", R.drawable.item_ocza, 100, 0,2,10,5, "Kiedy rozgryzasz, strzelają jak cukierki.");
    public static Item ZabieUdka = new Item("Żabie Udka", R.drawable.item_zaud, 12, 0,1,3,21, "");
    public static Enemy zaba = new Enemy("Żaba", context.getDrawable(R.drawable.enemy_za2), 2, w, 0, new Item[] { oczyZaby, ZabieUdka }, 10, 3, 1,  1.05, 60, 0, 0, 0, 2);

    public static Item martwySwierszcz = new Item("Martwy Świerszcz", R.drawable.item_masw, 100, 0,1,3, "");
    public static Item nogiSwierszcza = new Item("Nogi Świerszcza", R.drawable.item_nosw, 66, 0,1,3, "");
    public static Enemy swierszcz = new Enemy("Świerszcz", context.getDrawable(R.drawable.enemy_sw), 3, w, 0, new Item[] { martwySwierszcz, nogiSwierszcza }, 17, 4, 1,  1.1, 75, 0, 0, 0, 6);

    public static Item karaluszekItem = new Item("Karaluszek", R.drawable.item_ka, 500, 0,1,1, "Podobno są smaczne na surowo i w panierce.");
    public static Enemy karaluszek = new Enemy("Karaluszek", context.getDrawable(R.drawable.enemy_ka2), 4, p, 0, new Item[] { karaluszekItem }, 23, 4, 2,  1.15, 92, 0, 0, 0, 6);

    public static Item glowaSzerszenia = new Item("Głowa Szerszenia", R.drawable.item_glsz, 110, 0,1,3, "");
    public static Item skrzydlaSzerszenia = new Item("Skrzydła Szerszenia", R.drawable.item_sksz, 47, 0,1,3, "");
    public static Item zadlo = new Item("Żądło", R.drawable.item_za, 75, 0,1,3, "");
    public static Enemy szerszen = new Enemy("Szerszeń", context.getDrawable(R.drawable.enemy_sz), 5, w, 0, new Item[] { glowaSzerszenia, skrzydlaSzerszenia, zadlo }, 36, 6, 2,  1.2, 118, 0, 0, 1, 9);


    public static Item zuwaczkiZuka = new Item("Żuwaczki Żuka", R.drawable.item_zuzu, 75, 0,1,3, "");
    public static Item pancerzykZuka = new Item("Pancerzyk Żuka", R.drawable.item_pazu, 82, 0,1,1, "");
    public static Item jajeczkaZuka = new Item("Jajeczka Żuka", R.drawable.item_jazu, 27, 0,10,10,20, "");
    public static Enemy zuk = new Enemy("Żuk", context.getDrawable(R.drawable.enemy_zu), 6, w, 0, new Item[] { zuwaczkiZuka, pancerzykZuka, jajeczkaZuka }, 39, 10, 6,  1.22, 142, 0, 0, 1.5, 5);

    public static Item skrzydloNietoperza = new Item("Skrzydło Nietoperza", R.drawable.item_skni, 100, 0,1,1, "");
    public static Item zebyNietoperza = new Item("Zęby Nietoperza", R.drawable.item_zeni, 50, 0,1,5, "");
    public static Item malyNietoperz = new Item("Mały Nietoperz", R.drawable.item_mani, 3500, 2,1,1, "");
    public static Enemy nietoperz = new Enemy("Nietoperz", context.getDrawable(R.drawable.enemy_ni), 7, w, 0, new Item[] { skrzydloNietoperza, zebyNietoperza, mieso, malyNietoperz}, 39, 17, 8,  1.22, 178, 0, 34, 1.5, 5);

    public static Item sierscPajaka = new Item("Sierść Pająka", R.drawable.item_sipa, 110, 0,1,10, "");
    public static Item przedzaPajaka = new Item("Przędza Pająka", R.drawable.item_prpa, 70, 0,1,10, "");
    public static Item jadPajaka = new Item("Jad Pająka", R.drawable.item_japa, 30, 0,1,2,-50, "");
    public static Enemy duzyPajak = new Enemy("Duży Pająk", context.getDrawable(R.drawable.enemy_dupa), 8, w, 0, new Item[] { sierscPajaka, przedzaPajaka, jadPajaka}, 57, 23, 10,  1.25, 214, 0, 0, 2, 9);

    public static Item kruczyDziob = new Item("Kruczy Dziób", R.drawable.item_krdz, 500, 0,1,2, "");
    public static Item kruczePioro = new Item("Krucze Pióro", R.drawable.item_krpi, 500, 0,1,10, "");
    public static Item kruczeSzpony = new Item("Krucze Szpony", R.drawable.item_krsz, 500, 0,1,3, "");
    public static Enemy kruk = new Enemy("Kruk", context.getDrawable(R.drawable.enemy_kr), 9, m, 0, new Item[] { kruczyDziob, kruczePioro, kruczeSzpony}, 83, 34, 12,  1.37, 278, 0, 66, 3, 6);

    public static Item zabekCzosnku = new Item("Ząbek Czosnku", R.drawable.item_zacz, 46, 0,1,3, 200, "");
    public static Item glowkaCzosnku = new Item("Główka Czosnku", R.drawable.item_glcz, 1133, 1,10,10,750, "");
    public static Enemy piwiniczanyPotwor = new Enemy("Piwniczny potwór", context.getDrawable(R.drawable.enemy_pipo), 10, b, 0, new Item[] { zabekCzosnku, glowkaCzosnku}, 123, 39, 16,  1.45, 352, 0, 74, 3, 8);


    public static Item skoraJelenia = new Item("Skóra Jelenia", R.drawable.item_skje, 300, 0,1,3, "");
    public static Item udziecZJelenia = new Item("Udziec z Jelenia", R.drawable.item_udzje, 799, 0,1, 1,120, "");
    public static Item duzeMieso = new Item("Duże Mięso", R.drawable.item_dumi, 210, 0,2,5, 37, "");
    public static Item porozeJelenia = new Item("Poroże Jelenia", R.drawable.item_poje, 20000, 1,1,1, "");
    public static Enemy jelen = new Enemy("Jeleń", context.getDrawable(R.drawable.enemy_je), 11, w, 0, new Item[] { skoraJelenia, udziecZJelenia, duzeMieso, porozeJelenia}, 152, 45, 19,  1.45, 402, 0, 0, 3, 5);
    public static Enemy silnyJelen = new Enemy("Silny Jeleń", context.getDrawable(R.drawable.enemy_sije), 13, w, 0, new Item[] { skoraJelenia, udziecZJelenia, duzeMieso, porozeJelenia}, 192, 63, 19,  1.45, 493, 0, 0, 3, 5);

    public static Item ogonSzczura = new Item("Skóra Jelenia", R.drawable.item_skje, 300, 0,1,3, "");
    public static Enemy szczurWojownik = new Enemy("Szczur Wojownik", context.getDrawable(R.drawable.enemy_szwo), 11, w, 0, new Item[] { mieso, ogonSzczura }, 142, 33, 17,  1.6, 393, 0, 77, 15, 15);
    public static Enemy szczurZbozowy = new Enemy("Szczur Zbożowy", context.getDrawable(R.drawable.enemy_szzb), 14, w, 0, new Item[] { mieso, ogonSzczura }, 214, 59, 21,  1.8, 548, 0, 0, 15, 15);

    public static Enemy cmentarnyGhul = new Enemy("Cmentarny Ghul", context.getDrawable(R.drawable.enemy_cmgh), 16, w, 0, new Item[] {  }, 270, 67, 21,  1.4, 673, 0, 0, 5, 1);
    public static Enemy cmentarnyGhul2 = new Enemy("Cmentarny Ghul", context.getDrawable(R.drawable.enemy_cmgh), 17, w, 0, new Item[] {  }, 305, 74, 23,  1.45, 743, 0, 0, 5, 1);

    public static Item zloto333 = new Item("Złoto", R.drawable.item_zl333, 444, 0,1,1, "+333 gold");
    public static Enemy nieumarlyMnich = new Enemy("Nieumarły Mnich", context.getDrawable(R.drawable.enemy_nimn), 17, m, 0, new Item[] { zloto333 }, 314, 89, 16,  1.45, 643, 0, 0, 8, 3);

    public static Item stareMonety = new Item("Stare Monety", R.drawable.item_stmo, 56, 0,1,1, "+42 gold");
    public static Item staraKolczuga = new Item("Stara Kolczuga", R.drawable.item_stko, new String[]{w, p}, 16, 1499, ItemTypes.armor, 0, 0, 0, 67, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.2, null, "");
    public static Item kapturSzabrownika = new Item("Kaptur Szabrownika", R.drawable.item_kasz, new String[]{h, t}, 16, 833, ItemTypes.helmet, 0, 0, 0, 11, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, null, "");
    public static Item swiecaZlodzieja = new Item("Świeca Złodzieja", R.drawable.item_swzl, new String[]{m}, 19, 1877, ItemTypes.secWeapon, 0, 60, 76, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pogrobowiec = new Item("Pogrobowiec", R.drawable.item_po, new String[]{w, b, p}, 16, 756, ItemTypes.helmet, 0, 0, 0, 25, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wiekoweGroty = new Item("Wiekowe Groty", R.drawable.item_wigr, new String[]{h, t}, 16, 74, ItemTypes.secWeapon, 0, 11, 11, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, null, "");
    public static Item lukNieumarlych = new Item("Łuk Nieumarłych", R.drawable.item_luni, new String[]{t}, 19, 1971, ItemTypes.weapon, 0, 183, 203, 0, 0.13, 0, 0.14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item kurtaZlodzieja = new Item("Kurta Złodzieja", R.drawable.item_kuzl, new String[]{t, h, b}, 16, 1428, ItemTypes.armor, 0, 0, 0, 47, 0.05, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wydlubywaczKlejnotow = new Item("Wydłubywacz Klejnotów", R.drawable.item_wykl, new String[]{b}, 19, 1877, ItemTypes.secWeapon, 0, 104, 115, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, null, "");
    public static Enemy szabrownik = new Enemy("Szabrownik", context.getDrawable(R.drawable.enemy_sz2), 18, b, 0, new Item[] { stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, stareMonety, staraKolczuga, kapturSzabrownika, miedzianaTarcza, swiecaZlodzieja, pogrobowiec, wiekoweGroty, lukNieumarlych, kurtaZlodzieja, wydlubywaczKlejnotow }, 363, 107, 27,  1.7, 843, 0, 0, 15, 3);

    public static Item czaszkaNieumarlego = new Item("Czaszka Nieumarłego", R.drawable.item_czni, 50, 0,1,1, "");
    public static Item piszczelNieumarlego = new Item("Piszczel Nieumarłego", R.drawable.item_pini, 30, 0,1,1, "");
    public static Item pierscienNieumarlego = new Item("Pierścień Nieumarłego", R.drawable.item_pini2, new String[]{w, m, t, h, b, p}, 15, 638, ItemTypes.ring, 0, 0, 0, 0, 0.13, -16, 0, 0, 16, 16, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item sejmitarNieumarlego = new Item("Sejmitar Nieumarłego", R.drawable.item_seni, new String[]{w, b, p}, 19, 1702, ItemTypes.weapon, 0, 130, 159, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item tarczaNieumarlego = new Item("Tarcza Nieumarłego", R.drawable.item_tani, new String[]{w, p}, 19, 1702, ItemTypes.ring, 0, 0, 0, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 1, 0, null, "");
    public static Enemy nieumarlyWojownik = new Enemy("Nieumarły Wojownik", context.getDrawable(R.drawable.enemy_niwo), 19, w, 0, new Item[] { zloto333, zloto333, czaszkaNieumarlego, czaszkaNieumarlego, czaszkaNieumarlego, czaszkaNieumarlego, piszczelNieumarlego, piszczelNieumarlego, piszczelNieumarlego, piszczelNieumarlego, pierscienNieumarlego, sejmitarNieumarlego, tarczaNieumarlego }, 573, 137, 37,  1.9, 1043, 0, 0, 10, 3);
    public static Enemy nieumarlyWiarus = new Enemy("Nieumarły Wiarus", context.getDrawable(R.drawable.enemy_niwi), 20, p, 0, new Item[] { zloto333, zloto333, czaszkaNieumarlego, czaszkaNieumarlego, czaszkaNieumarlego, czaszkaNieumarlego, piszczelNieumarlego, piszczelNieumarlego, piszczelNieumarlego, piszczelNieumarlego, pierscienNieumarlego, sejmitarNieumarlego, tarczaNieumarlego }, 643, 151, 42,  1.8, 1343, 0, 0, 10, 3);


    public static Item kly = new Item("Kły", R.drawable.item_kl, 60, 0,1,5, "");
    public static Item pazury = new Item("Pazury", R.drawable.item_pa, 5, 0,1,10, "");
    public static Item skoraCzarnegoNiedzwiedza = new Item("Skóra Czarnego Niedźwiedzia", R.drawable.item_skczni, 40, 0,1,1, "");
    public static Item skoraSzaregoNiedzwiedza = new Item("Skóra Szarego Niedźwiedzia", R.drawable.item_skszni, 35, 0,1,1, "");
    public static Item skoraNiedzwiedza = new Item("Skóra Niedźwiedzia", R.drawable.item_skni2, 30, 0,1,1, "");
    public static Enemy niedzwiedzBrunatny = new Enemy("Nieumarły Brunatny", context.getDrawable(R.drawable.enemy_nibr), 21, w, 0, new Item[] { kly, pazury, skoraNiedzwiedza }, 937, 161, 53,  1.5, 1443, 0, 0, 3, 3);
    public static Enemy niedzwiedzSzary = new Enemy("Nieumarły Szary", context.getDrawable(R.drawable.enemy_nisz), 22, w, 0, new Item[] { kly, pazury, skoraSzaregoNiedzwiedza }, 998, 173, 57,  1.45, 1533, 0, 0, 3, 3);
    public static Enemy niedzwiedzCzarny = new Enemy("Nieumarły Czarny", context.getDrawable(R.drawable.enemy_nicz), 23, w, 0, new Item[] { kly, pazury, skoraCzarnegoNiedzwiedza }, 1143, 186, 59,  1.4, 1673, 0, 0, 3, 3);

    public static Item mrowczeJajeczka = new Item("Mrówcze jajeczka", R.drawable.item_mrja, 500, 0,1,5, "");
    public static Item glowaBrazowejMrowki = new Item("Głowa Brązowej Mrówki", R.drawable.item_glbrmr, 2000, 0,1,5, "");
    public static Item odwlokMrowkiZolnierza = new Item("Odwłok Mrówki Żołnierza", R.drawable.item_odmrzo, 163, 0,15, 30,1250, "");
    public static Enemy brazowaMrowkaZolnierz = new Enemy("Brązowa Mrówka Żołnierz", context.getDrawable(R.drawable.enemy_brmrzo), 25, w, 0, new Item[] { mrowczeJajeczka, glowaBrazowejMrowki, odwlokMrowkiZolnierza, odwlokMrowkiZolnierza }, 1489, 218, 73,  2.05, 1973, 0, 0, 5, 15);

    public static Item prostaTarczaZulusa = new Item("Prosta tarcza Zulusa", R.drawable.item_prtazu, new String[]{w, p}, 27, 3138, ItemTypes.secWeapon, 0, 0, 0, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0, 10, 1, 0, null, "");
    public static Item czachaGhula = new Item("Czacha Ghula", R.drawable.item_czgh, new String[]{w, p}, 27, 2135, ItemTypes.helmet, 0, 0, 0, 47, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 3, 0, 0, 5, 0, 3, 0, null, "");
    public static Item butyZulusa = new Item("Buty Zulusa", R.drawable.item_buzu, new String[]{w, m, t, h, b, p}, 27, 1935, ItemTypes.shoes, 0, 0, 0, 29, 0.15, 112, 0, 0, 10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item glowaZulusa = new Item("Głowa Zulusa", R.drawable.item_glzu, new String[]{h, b}, 27, 2242, ItemTypes.helmet, 0, 0, 0, 22, 0, 0, 0, 0, 15, 15, 15, 0, 0, 0, 0, 0, 0, 5, 0, 9, 0, null, "");
    public static Enemy fulaGula = new Enemy("Fula Gula", context.getDrawable(R.drawable.enemy_fugu), 26, b, 0, new Item[] { prostaTarczaZulusa, czachaGhula, butyZulusa, glowaZulusa }, 1713, 238, 67,  2.1, 2105, 0, 0, 5, 3);

    public static Item wloczniaNuna = new Item("Włócznia Nuna", R.drawable.item_wlnu, new String[]{w}, 27, 3660, ItemTypes.twoHandedWeapon, 0, 292, 357, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item szybkozbrojaGulu = new Item("Szybkozbroja Gulu", R.drawable.item_szgu, new String[]{h, b}, 27, 4035, ItemTypes.armor, 0, 0, 0, 68, 0.24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, null, "");
    public static Item mieczGula = new Item("Miecz Gula", R.drawable.item_migu, new String[]{w, b, p}, 27, 3485, ItemTypes.weapon, 0, 205, 248, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 10, 0, 0, null, "");
    public static Item ogniochronaGulu = new Item("Ogniochrona Gulu", R.drawable.item_oggu, new String[]{p}, 27, 4035, ItemTypes.armor, 0, 0, 0, 86, 0, 0, 0, 0, 18, 18, 18, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0.3, null, "");
    public static Item ogienGula = new Item("Ogień Gula", R.drawable.item_oggu2, new String[]{p}, 27, 4035, ItemTypes.weapon, 0, 294, 333, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 2, 0, null, "");
    public static Enemy nunaGula = new Enemy("Nuna Gula", context.getDrawable(R.drawable.enemy_nugu), 26, p, 0, new Item[] { wloczniaNuna, szybkozbrojaGulu, mieczGula, ogniochronaGulu, ogienGula }, 1727, 213, 83,  1.75, 2693, 0, 0, 5, 5);

    public static Item magicznaTarczaZulusa = new Item("Magiczna tarcza Zulusa", R.drawable.item_matazu, new String[]{m, p}, 27, 3633, ItemTypes.secWeapon, 0, 0, 0, 32, 0, 0, 0, 0, 14, 0, 14, 0, 64, 64, 0, 0, 37, 0, 0, 5, 0, null, "");
    public static Item rozdzkaMulu = new Item("Różdżka Mulu", R.drawable.item_romu, new String[]{m}, 27, 3633, ItemTypes.weapon, 0, 204, 204, 0, 0.14, 0, 0.29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, null, "");
    public static Enemy zuluMulu = new Enemy("Zulu Mulu", context.getDrawable(R.drawable.enemy_zumu), 27, m, 0, new Item[] { butyZulusa, magicznaTarczaZulusa, rozdzkaMulu }, 1913, 314, 33,  2.00, 2040, 50, 250, 3, 3);

    public static Item twardozbrojaGulu = new Item("Twardozbroja Gulu", R.drawable.item_twgu, new String[]{w, p}, 27, 3843, ItemTypes.armor, 0, 0, 0, 119, 0, 0, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.35, null, "");
    public static Enemy didaGula = new Enemy("Dida Gula", context.getDrawable(R.drawable.enemy_digu), 28, w, 0, new Item[] { mieczGula, ogienGula, twardozbrojaGulu }, 2345, 303, 90,  1.95, 3013, 0, 0, 5, 1);

    public static Item szatamanaMulu = new Item("Szatamana Mulu", R.drawable.item_szmu, new String[]{m}, 27, 4448, ItemTypes.armor, 0, 0, 0, 25, 0, 0, 0, 0, 15, 15, 15, 15, 254, 127, 0, 0, 0, 0, 0, 4, 0, null, "");
    public static Item kaftanZulusa = new Item("kaftan Zulusa", R.drawable.item_kazu, new String[]{t}, 27, 4904, ItemTypes.armor, 0, 0, 0, 51, 0.17, 145, 0, 0, 0, 0, 0, 0, 191, 140, 0, 0, 0, 0, 0, 6, 0, null, "");
    public static Enemy buluMulu = new Enemy("Bulu Mulu", context.getDrawable(R.drawable.enemy_bumu), 29, m, 0, new Item[] { szatamanaMulu, rozdzkaMulu, butyZulusa, kaftanZulusa }, 2601, 339, 47,  2.02, 2290, 15, 125, 5, 5);

    public static Item maskaMulu = new Item("Maska Mulu", R.drawable.item_mamu, new String[]{m, t}, 27, 2354, ItemTypes.helmet, 0, 0, 0, 17, 0, 0, 0, 0, 0, 0, 0, 0, 42, 28, 0, 0, 0, 5, 0, 3, 0, null, "");
    public static Enemy furuMulu = new Enemy("Bulu Mulu", context.getDrawable(R.drawable.enemy_bumu), 30, m, 0, new Item[] { maskaMulu, kaftanZulusa, rozdzkaMulu, magicznaTarczaZulusa }, 2893, 360, 63,  2.12, 2413, 50, 300, 2, 2);


    public static Item oproznionaButelka = new Item("Opróżniona butelka", R.drawable.item_opbu, 100, 0,1,3, "");
    public static Item klyCzarnejWilczycy = new Item("Kły czarnej wilczycy", R.drawable.item_klczwi, 200, 0,1,10, "");
    public static Item skoraCzarnejWilczycy = new Item("Skóra czarnej wilczycy", R.drawable.item_skczwi, 500, 0,1,10, "");
    public static Item wilczeJagody = new Item("Wilcze jagody", R.drawable.item_wija, 56, 0,4,10, 250, "Torin z Przedmieści Karka-han na pewno będzie nimi zainteresowany.");
    public static Item miksturaZWilczychJagod = new Item("Mikstura z wilczych jagód", R.drawable.item_wija, 150, 0,10,20, 750, "");
    public static Item helmZWilczejSkory = new Item("Hełm z wilczej skóry", R.drawable.item_hezwisk, new String[]{w, m, t, h, b, p}, 17, 2115, ItemTypes.helmet, 0, 0, 0, 22, 0.16, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item butyZWilczejSkory = new Item("Buty z wilczej skóry", R.drawable.item_buzwisk, new String[]{w, m, t, h, b, p}, 17, 2115, ItemTypes.shoes, 0, 0, 0, 20, 0, 0, 0, 0, 14, 14, 14, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceZWilczejSkory = new Item("Rękawice z wilczej skóry", R.drawable.item_rezwisk, new String[]{w, m, t, h, b, p}, 17, 2115, ItemTypes.gloves, 0, 0, 0, 18, 0.16, 125, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item pierscienZWilczychKlow = new Item("Pierścień z wilczych kłów", R.drawable.item_pizwikl, new String[]{w, m, t, h, b, p}, 17, 2115, ItemTypes.ring, 0, 0, 0, 0, 0.16, 167, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item naszyjnikZWilczychKlow = new Item("Naszyjnik z wilczych kłów", R.drawable.item_nazwikl, new String[]{w, m, t, h, b, p}, 17, 2115, ItemTypes.necklace, 0, 0, 0, 0, 0.18, 0, 0, 0, 14, 14, 14, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wiekszaSkoraCzarnejWilczycy = new Item("Większa skóra czarnej wilczycy", R.drawable.item_wiskczwi, 15000, 0,1,1, "");
    public static Item pierscienCzarnejWilczycy = new Item("Pierścień czarnej wilczycy", R.drawable.item_piczwi, new String[]{p, w}, 20, 4653, ItemTypes.ring, 1, 0, 0, 0, 0.2, 356, 0, 0, 17, 17, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Enemy czarnaWilczyca = new Enemy("Czarna Wilczyca", context.getDrawable(R.drawable.enemy_czwi), 17, w, 1, new Item[] { oproznionaButelka, oproznionaButelka, oproznionaButelka, oproznionaButelka, klyCzarnejWilczycy, klyCzarnejWilczycy, klyCzarnejWilczycy, skoraCzarnejWilczycy, skoraCzarnejWilczycy, skoraCzarnejWilczycy, wilczeJagody, wilczeJagody, wilczeJagody, miksturaZWilczychJagod, miksturaZWilczychJagod, helmZWilczejSkory, helmZWilczejSkory, butyZWilczejSkory, rekawiceZWilczejSkory, pierscienZWilczychKlow, naszyjnikZWilczychKlow, pierscienCzarnejWilczycy }, 550, 193, 83,  2.75, 2467, 40, 370, 6, 8);

    public static Item skoraVulka = new Item("Skóra Vulka", R.drawable.item_skvu, 1000, 0,1,5, "");
    public static Item wilczeKly = new Item("Wilcze kły", R.drawable.item_wikl, 250, 0,3,30, "");
    public static Item rekawiceZuchwalegoLowcy = new Item("Rękawice zuchwałego łowcy", R.drawable.item_rezulo, new String[]{h}, 20, 1330, ItemTypes.gloves, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 15, 0, null, "Poprzedni właściciel nie uniknął w odpowiednim czasie kłów rozszarpujących jego tętnice. Nie popełnij tego samego błędu.");
    public static Item butyLowcyWilkow = new Item("Buty Łowcy Wilków", R.drawable.item_bulowi, new String[]{b, h}, 20, 2955, ItemTypes.shoes, 1, 0, 0, 17, 0.18, 0, 0, 0, 13, 13, 13, 0, 0, 0, 0, 2, 0, 0, 0, 15, 0, null, "");
    public static Item zatrutyMieczNieuwaznegoAsasyna = new Item("Zatruty miecz nieuważnego asasyna", R.drawable.item_zaminias, new String[]{b}, 20, 3351, ItemTypes.secWeapon, 1, 186, 201, 0, 0.13, 0, 0.15, 0, 15, 15, 0, 0, 0, 0, 0, 2, 0, 0, 0, 15, 0, null, "");
    public static Item butyLesnegoTrapera = new Item("Buty leśnego trapera", R.drawable.item_bulowi, new String[]{m, t}, 20, 2452, ItemTypes.shoes, 1, 0, 0, 13, 0.13, 0, 0, 0, 18, 18, 18, 28, 32, 27, 0, 2, 0, 0, 0, 4, 0, null, "");
    public static Item lukZuchwalegoMysliwego = new Item("Łuk zuchwałego myśliwego", R.drawable.item_luzumy, new String[]{h}, 21, 5318, ItemTypes.weapon, 2, 246, 285, 0, 0.13, 0, 0.09, 0, 13, 29, 13, 0, 0, 0, 0, 2, 0, 1, 20, 0, 0, null, "Zaletą śmiałków, którzy niedocenili swoojego przeciwnika jest pozostawiony przez nich oręż.");
    public static Enemy vulk = new Enemy("Vulk", context.getDrawable(R.drawable.enemy_vu), 20, b, 1, new Item[] { skoraVulka, wilczeKly, rekawiceZuchwalegoLowcy, butyLowcyWilkow, zatrutyMieczNieuwaznegoAsasyna, butyLesnegoTrapera, lukZuchwalegoMysliwego }, 770, 243, 64,  2.25, 2737, 0, 0, 3, 25);

    public static Item glowaNiedzwiedzia = new Item("Głowa niedźwiedzia", R.drawable.item_glni, new String[]{w, p}, 20, 1206, ItemTypes.helmet, 0, 0, 0, 25, 0, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item klyNiedzwiedzia = new Item("Kły niedźwiedzia", R.drawable.item_klni,133, 0,12,30, "");
    public static Item skoraKarhu = new Item("Skóra Karhu", R.drawable.item_skka,1500, 0,2,5, "");
    public static Item oslonaZNiedzwiedzichZeber = new Item("Osłona z niedźwiedzich żeber", R.drawable.item_osznize, new String[]{p}, 20, 2906, ItemTypes.secWeapon, 1, 0, 0, 61, 0, 0, 0, 0, 14, 14, 14, 33, 0, 0, 0, 0, 24, 0, 0, 3, 0, null, "");
    public static Item tarczaZNiedzwiedzichZeber = new Item("Tarcza z niedźwiedzich żeber", R.drawable.item_taznize, new String[]{w}, 20, 2982, ItemTypes.secWeapon, 1, 0, 0, 83, 0, 113, 0, 0, 14, 14, 14, 33, 0, 0, 0, 0, 20, 0, 0, 0, 0, null, "");
    public static Item toporZuchwalegoPaladyna = new Item("Topór zuchwałego paladyna", R.drawable.item_tozupa, new String[]{p}, 20, 3651, ItemTypes.weapon, 1, 169, 386, 0, 0, 113, 0, 45, 18, 18, 18, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, null, "");
    public static Item butyPoleglegoWojownika = new Item("Buty poległego wojownika", R.drawable.item_bupowo, new String[]{w, p}, 20, 2455, ItemTypes.weapon, 1, 0, 0, 0, 0.13, 98, 0, 0, 29, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item toporBunczucznegoWojownika = new Item("Topór buńczucznego wojownika", R.drawable.item_tobuwo, new String[]{w}, 20, 6502, ItemTypes.weapon, 2, 269, 328, 0, 0.19, 129, 0, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "Zaletą śmiałków, którzy nie docenili swojego przeciwnika, jest pozostawiony przez nich oręż.");
    public static Enemy karhu = new Enemy("Karhu", context.getDrawable(R.drawable.enemy_ka), 20, w, 1, new Item[] { glowaNiedzwiedzia, klyNiedzwiedzia, skoraKarhu, oslonaZNiedzwiedzichZeber, tarczaZNiedzwiedzichZeber, toporZuchwalegoPaladyna, butyPoleglegoWojownika, toporBunczucznegoWojownika }, 795, 233, 95,  1.8, 2989, 0, 0, 5, 1);

    public static Item chitynoweRekawice = new Item("Chitynowe rękawice", R.drawable.item_chre, new String[]{m, t}, 22, 1593, ItemTypes.gloves, 0, 0, 0, 10, 0, 0, 0, 0, 14, 14, 14, 0, 25, 17, 0, 0, 0, 0, 0, 3, 0, null, "");
    public static Item mrowczyPazur = new Item("Mrówczy pazur", R.drawable.item_mrpa, new String[]{b}, 23, 2829, ItemTypes.secWeapon, 0, 101, 112, 0, 0.13, 0, 0, 0, 0, 0, 0, 0, 25, 0, 0, 0, 0, 1, 10, 0, 0, null, "");
    public static Item mrowczeZloto = new Item("Mrówcze złoto", R.drawable.item_mrzl, 9960, 0,1,1, "+7470 gold");
    public static Item magicznyEliksirZdrowia = new Item("Magiczny eliksir zdrowia", R.drawable.item_maelzd, 105, 0,5,20, 500, "");
    public static Item pierscienMrowczejZrecznosci = new Item("Pierścień mrówczej zręczności", R.drawable.item_pimrzr, new String[]{h, b}, 20, 2773, ItemTypes.ring, 1, 0, 0, 0, 0, 0, 0.14, 0, 13, 13, 13, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, null, "");
    public static Item chitynowaOslona = new Item("Chitynowa osłona", R.drawable.item_chos, new String[]{w, p}, 20, 3122, ItemTypes.secWeapon, 1, 0, 0, 76, 0.14, 0, 0, 0, 15, 15, 15, 0, 0, 0, 0, 0, 22, 0, 0, 2, 0, null, "");
    public static Item chitynowaZbroja = new Item("Chitynowa zbroja", R.drawable.item_chzb, new String[]{b}, 20, 3518, ItemTypes.armor, 1, 0, 0, 67, 0.13, 112, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 4, 0, null, "");
    public static Item odnozeMrowczejKrolowej = new Item("Odnóże mrówczej królowej", R.drawable.item_odmrkr, new String[]{b}, 21, 4375, ItemTypes.weapon, 2, 240, 265, 0, 0.19, 0, 0, 0, 19, 9, 19, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, null, "Zaletą śmiałków, którzy nie docenili swojego przeciwnika, jest pozostawiony przez nich oręż.");
    public static Enemy mrowczaKrolowa = new Enemy("Mrówcza Królowa", context.getDrawable(R.drawable.enemy_ka), 21, b, 1, new Item[] { chitynoweRekawice, mrowczyPazur, mrowczeZloto, magicznyEliksirZdrowia, pierscienMrowczejZrecznosci, chitynowaOslona, chitynowaZbroja, odnozeMrowczejKrolowej }, 879, 293, 69,  2.75, 2118, 0, 0, 3, 10);

    public static Item pierscienApostaty = new Item("Pierścień apostaty", R.drawable.item_piap, new String[]{w, m, t, h, b, p}, 22, 1310, ItemTypes.ring, 0, 0, 0, 0, 0, 0, 0.14, 0, 14, 14, 14, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, null, "");
    public static Item kolczugaMlodegoPaladyna = new Item("Kolczuga młodego paladyna", R.drawable.item_komlpa, new String[]{p}, 22, 2600, ItemTypes.armor, 0, 0, 0, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0.2, null, "");
    public static Item malaSzablaPaladyna = new Item("Mała szabla paladyna", R.drawable.item_maszpa, new String[]{w, b, p}, 22, 2476, ItemTypes.weapon, 0, 153, 188, 0, 0.13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item rekawiceMlodegoPaladyna = new Item("Rękawice młodego paladyna", R.drawable.item_remlpa, new String[]{w, b, p}, 22, 1672, ItemTypes.gloves, 0, 0, 0, 17, 0, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item srebrnyMieczPaladyna = new Item("Srebrny miecz paladyna", R.drawable.item_srmipa, new String[]{w, p}, 21, 2068, ItemTypes.weapon, 0, 192, 230, 0, 0, 112, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item uszkodzonaZbrojaMlodegoPaladyna = new Item("Uszkodzona zbroja młodego paladyna", R.drawable.item_uszbmlpa, new String[]{w, p}, 22, 2600, ItemTypes.secWeapon, 0, 0, 0, 77, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0.2, null, "");
    public static Item ciezkiMieczWojownika = new Item("Ciężki miecz wojownika", R.drawable.item_cimiwo, new String[]{w}, 17, 1523, ItemTypes.twoHandedWeapon, 0, 184, 224, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item stalowaKolczugaPaladyna = new Item("Stalowa kolczuga paladyna", R.drawable.item_stkopa, new String[]{p}, 23, 3822, ItemTypes.armor, 1, 0, 0, 89, 0, 0, 0, 0, 21, 21, 21, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0.3, null, "");
    public static Item zlotyHelmPaladyna = new Item("Złoty hełm paladyna", R.drawable.item_zlhepa, new String[]{p}, 23, 2230, ItemTypes.helmet, 1, 0, 0, 27, 0.14, 95, 0, 0, 21, 21, 21, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, null, "");
    public static Item dobrejJakosciSzablaPaladyna = new Item("Dobrej jakości szabla paladyna", R.drawable.item_dojaszpa, new String[]{p}, 23, 4214, ItemTypes.weapon, 1, 205, 331, 0, 0.14, 102, 0, 0, 16, 16, 16, 0, 0, 0, 1, 0, 0, 5, 3, 0, 0, null, "");
    public static Item lodoweostrzeApostaty = new Item("Lodowo ostrze Apostaty", R.drawable.item_loosap, new String[]{p}, 25, 5064, ItemTypes.weapon, 2, 291, 384, 0, 0.17, 0, 0.2, 50, 35, 19, 19, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, null, "");
    public static Enemy paladynskiApostata = new Enemy("Paladyński Apostata", context.getDrawable(R.drawable.enemy_paap), 25, p, 1, new Item[] { pierscienApostaty, kolczugaMlodegoPaladyna, malaSzablaPaladyna, rekawiceMlodegoPaladyna, srebrnyMieczPaladyna, uszkodzonaZbrojaMlodegoPaladyna, ciezkiMieczWojownika, stalowaKolczugaPaladyna, zlotyHelmPaladyna, dobrejJakosciSzablaPaladyna, lodoweostrzeApostaty }, 1313, 313, 94,  2.05, 2909, 50, 250, 3, 3);

    public static Item zniszczonaKsiega = new Item("Zniszczona księga", R.drawable.item_znks, 50, 0,1,1, "");
    public static Item zloto500 = new Item("Złoto", R.drawable.item_zl500, 676, 0,1,1, "+507 gold");
    public static Item obrozaLewegoLbaCerbera = new Item("Obroża lewego łba Cerbera", R.drawable.item_oblelbce, new String[]{w, b, p}, 28, 3533, ItemTypes.necklace, 1, 0, 0, 0, 0.23, 181, 0, 0, 17, 17, 17, 0, 0, 0, 0, 3, 0, 0, 5, 0, 0, null, "");
    public static Item obrozaSrodkowegoLbaCerbera = new Item("Obroża środkowego łba Cerbera", R.drawable.item_obsrlbce, new String[]{h, t, b}, 28, 3365, ItemTypes.necklace, 1, 0, 0, 0, 0.29, 151, 0, 0, 17, 17, 17, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, null, "");
    public static Item obrozaPrawegoLbaCerbera = new Item("Obroża prawego łba Cerbera", R.drawable.item_obprlbce, new String[]{m, t, p}, 28, 3533, ItemTypes.necklace, 1, 0, 0, 0, 0.26, 0, 0.19, 0, 25, 25, 25, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Enemy cerber = new Enemy("Cerber", context.getDrawable(R.drawable.enemy_ce), 28, w, 1, new Item[] { zniszczonaKsiega, zloto500, obrozaLewegoLbaCerbera, obrozaSrodkowegoLbaCerbera, obrozaPrawegoLbaCerbera }, 2349, 319, 146,  2.4, 3329, 0, 0, 5, 1);




    public static Item pazuryPumy = new Item("Pazury Pumy", R.drawable.item_papu2, 125, 0,4,20, "");
    public static Item symbolLowcyZTropikow = new Item("Symbol łowcy z tropików", R.drawable.item_syloztr, new String[]{b, h}, 23, 2201, ItemTypes.necklace, 1, 0, 0, 0, 0.14, 0, 0, 0, 14, 14, 14, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, null, "");
    public static Item mistycznyNaszyjnikZKlem = new Item("Mistyczny naszyjnik z kłem", R.drawable.item_minazkl, new String[]{t, m}, 23, 2201, ItemTypes.necklace, 1, 0, 0, 0, 0.14, 0, 0, 0, 14, 14, 14, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wisiorDzielnegoWojownika = new Item("Wisior dzielnego wojownika", R.drawable.item_widzwo, new String[]{w, p}, 23, 2311, ItemTypes.necklace, 1, 0, 0, 0, 0.14, 138, 0, 0, 14, 14, 14, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, null, "");
    public static Item wzmocnioneCholweyWojownika = new Item("Wzmocnione cholewy wojownika", R.drawable.item_wzchwo, new String[]{w, b}, 23, 3033, ItemTypes.shoes, 2, 0, 0, 31, 0.2, 190, 0, 0, 20, 37, 20, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, null, "");
    public static Item magiczneButyZablakanegoPodroznika = new Item("Magiczne buty zabłąkanego podróżnika", R.drawable.item_mabuzapo, new String[]{p, m}, 23, 3686, ItemTypes.shoes, 2, 0, 0, 22, 0.14, 0, 0.21, 0, 37, 25, 25, 47, 28, 28, 0, 0, 0, 0, 0, 7, 0, null, "");
    public static Item trepyPoleglegoLowcy = new Item("Trepy poległego łowcy", R.drawable.item_trpolo, new String[]{h, t}, 23, 3344, ItemTypes.shoes, 2, 0, 0, 22, 0.25, 0, 0, 0, 20, 37, 20, 0, 0, 0, 0, 2, 0, 0, 0, 8, 0, null, "");
    public static Item nimbEmanujacegoKla = new Item("Nimb emanującego kła", R.drawable.item_niemkl, new String[]{w, m, t, h, b, p}, 23, 4012, ItemTypes.ring, 3, 0, 0, 0, 0.25, 156, 0.18, 0, 23, 23, 23, 60, 0, 0, 0, 2, 0, 0, 0, 0, 0, OstatniRatunek, "Z oddali pierścień wygląda jakby był wykonany z magicznego kamienia. Z bliska można jednak dostrzec, że jest to kieł Mushity. Pulsująca energia wokół tego nimbu wzmacnia ochronę jego właściciela. Pamiętaj, że jego moc w walce ratuje tylko jeden raz.");
    public static Enemy mushita = new Enemy("Mushita", context.getDrawable(R.drawable.enemy_mu), 23, p, 2, new Item[] { pazuryPumy, symbolLowcyZTropikow, mistycznyNaszyjnikZKlem, wisiorDzielnegoWojownika, wzmocnioneCholweyWojownika, magiczneButyZablakanegoPodroznika, trepyPoleglegoLowcy, nimbEmanujacegoKla }, 1609, 348, 232,  5.43, 3003, 0, 500, 1, 3);


    public static Item szataTreningowaI = new Item("Szata treningowa I", R.drawable.item_sztri, new String[]{m}, 30, 9266, ItemTypes.armor, 1, 0, 0, 57, 0.18, 0, 0, 0, 16, 16, 16, 51, 326, 163, 0, 0, 0, 0, 0, 4, 0, null, "");
    public static Item zbrojaSchodkowaI = new Item("Zbroja schodkowa I", R.drawable.item_zbsci, new String[]{p}, 30, 8405, ItemTypes.armor, 1, 0, 0, 109, 0.16, 0, 0, 0, 14, 0, 14, 0, 0, 0, 0, 0, 5, 0, 0, 3, 0.3, null, "");
    public static Item czapkaWschodniegoSztukmistrzaI = new Item("Czapka wschodniego sztukmistrza I", R.drawable.item_czwsszi, new String[]{p, t, m}, 30, 5405, ItemTypes.helmet, 1, 0, 0, 27, 0.16, 0, 0, 0, 14, 0, 14, 0, 61, 29, 0, 0, 0, 1, 3, 6, 0, null, "");
    public static Item rekawiczkiWodnejZjawyI = new Item("Rękawiczki wodnej zjawy I", R.drawable.item_rewozji, new String[]{t, m}, 30, 5405, ItemTypes.gloves, 1, 0, 0, 16, 0.16, 0, 0.17, 0, 0, 0, 21, 0, 68, 34, 0, 0, 0, 1, 0, 10, 0, null, "");
    public static Item rekawiczkiOgnistegoYokaiI = new Item("Rękawiczki ognistego yokai I", R.drawable.item_reogyoi, new String[]{w, p}, 30, 4669, ItemTypes.gloves, 1, 0, 0, 33, 0.16, 132, 0, 0, 21, 0, 0, 0, 68, 34, 0, 0, 0, 1, 0, 2, 0, null, "");
    public static Item medalionMinamiI = new Item("Medalion Minami I", R.drawable.item_memii, new String[]{w, m, t, h, b, p}, 30, 4447, ItemTypes.necklace, 1, 0, 0, 0, 0.16, 132, 0.17, 0, 23, 23, 23, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, null, "");
    public static Item medalionYugureI = new Item("Medalion Yugure I", R.drawable.item_meyui, new String[]{w, m, t, h, b, p}, 30, 4669, ItemTypes.necklace, 1, 0, 0, 0, 0.2, 175, 0, 0, 27, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, null, "");
    public static Item zbrojaSzlachetnegoRoduI = new Item("Zbroja szlachetnego rodu I", R.drawable.item_zbszroi, new String[]{m, t}, 30, 13408, ItemTypes.armor, 2, 0, 0, 73, 0.27, 0, 0, 0, 16, 16, 16, 51, 296, 148, 1, 5, 0, 0, 0, 8, 0, null, "");
    public static Item OYoroiI = new Item("O-yoroi I", R.drawable.item_oyoi, new String[]{w, p}, 30, 11583, ItemTypes.armor, 2, 0, 0, 152, 0.16, 326, 0, 0, 27, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0.3, null, "");
    public static Item herumettoZwiadowcyI = new Item("Herumetto zwiadowcy I", R.drawable.item_hezwi, new String[]{h, b}, 30, 6757, ItemTypes.helmet, 2, 0, 0, 33, 0.23, 0, 0, 0, 16, 33, 16, 38, 0, 0, 1, 6, 0, 0, 0, 6, 0, null, "");
    public static Item kaskMeznegoSamurajaI = new Item("Kask mężnego samuraja I", R.drawable.item_kamesai, new String[]{w, p}, 30, 6435, ItemTypes.helmet, 2, 0, 0, 47, 0.23, 249, 0, 0, 37, 16, 16, 0, 0, 0, 1, 2, 0, 0, 3, 2, 0, null, "");
    public static Item chodakiPiekielnegoKrokuI = new Item("Chodaki piekielnego kroku I", R.drawable.item_chpikri, new String[]{w, h, b}, 30, 6435, ItemTypes.shoes, 2, 0, 0, 36, 0.23, 0, 0.17, 0, 16, 16, 16, 0, 0, 0, 0, 3, 0, 0, 0, 4, 0, null, "");
    public static Item stapanieMagiiI = new Item("Stąpanie magii I", R.drawable.item_stmai, new String[]{m, t, p}, 30, 6757, ItemTypes.shoes, 2, 0, 0, 27, 0.23, 0, 0, 0, 16, 16, 16, 68, 60, 28, 3, 0, 0, 0, 0, 5, 0, null, "");
    public static Item rekawiceWieliejFaliI = new Item("Rękawice wielkiej fali I", R.drawable.item_rewifai, new String[]{m, p}, 30, 6757, ItemTypes.gloves, 2, 0, 0, 22, 0.23, 344, 0, 0, 27, 16, 27, 0, 44, 22, 1, 0, 0, 0, 0, 4, 0, null, "");
    public static Item serceWschodniejFaliI = new Item("Serce wschodniej fali I", R.drawable.item_sewsfli, new String[]{w, m, t, h, b, p}, 30, 5837, ItemTypes.ring, 2, 0, 0, 0, 0.31, 0, 0, 0, 16, 16, 16, 51, 0, 0, 1, 3, 0, 0, 5, 0, 0, null, "");
    public static Item okoSpokojnychOceanowI = new Item("Oko spokojnych oceanów I", R.drawable.item_okspoci, new String[]{m, t, p}, 30, 6128, ItemTypes.ring, 2, 0, 0, 0, 0.27, 0, 0.25, 0, 24, 16, 24, 51, 0, 0, 1, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wisiorMuttsuI = new Item("Wisior Muttsu I", R.drawable.item_wimui, new String[]{h}, 30, 5837, ItemTypes.necklace, 2, 0, 0, 0, 0.31, 175, 0, 0, 16, 37, 16, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, null, "");
    public static Item wisiorMittsuI = new Item("Wisior Mittsu I", R.drawable.item_wimii, new String[]{p}, 30, 5837, ItemTypes.necklace, 2, 0, 0, 0, 0.23, 480, 0, 0, 23, 16, 16, 51, 0, 0, 1, 0, 0, 0, 0, 0, 0, null, "");
    public static Item wisiorHitotsuI = new Item("Wisior Hitotsu I", R.drawable.item_wimii, new String[]{w}, 30, 5837, ItemTypes.necklace, 2, 0, 0, 0, 0.23, 480, 0, 0, 37, 16, 16, 51, 0, 0, 1, 3, 0, 0, 3, 0, 0, null, "");
    public static Item butyPoleglegoYokaiI = new Item("Buty poległego Yokai", R.drawable.item_bupoyo, new String[]{w, m, t, h, b, p}, 30, 8513, ItemTypes.shoes, 3, 0, 0, 53, 0.42, 354, 0.19, 0, 16, 16, 16, 42, 0, 0, 3, 3, 0, 0, 10, 0, 0, OstatniRatunek, "Po zadaniu ostatecznego ciosu truchło demonicznej kobiety rozprysło się w niezliczoną ilość drobinek. Gęsta chmura pyłu odsłoniła w końcu skarb, który skrywała... Parę butów, będącą teraz w twoim posiadaniu. Oby tylko nie była nawiedzona!");
    public static Item deszczoryAmulet = new Item("Deszczowy amulet", R.drawable.item_deam, new String[]{w, m, t, h, b, p}, 30, 8513, ItemTypes.necklace, 3, 0, 0, 0, 0.38, 426, 0, 0, 19, 19, 19, 134, 0, 0, 0, 9, 0, 0, 3, 5, 0, Oslepienie, "Yokai, będące wcześniej w posiadanie tego amuletu, używało go do wywoływania deszczu. Ukrywając się za pokrywą wody przeczesywało wtedy wsie w poszukiwaniu nowo narodzonych dzieci...");
    public static Enemy ameOnna = new Enemy("Ame-onna", context.getDrawable(R.drawable.enemy_amon), 30, w, 3, new Item[] { szataTreningowaI, szataTreningowaI, zbrojaSchodkowaI, czapkaWschodniegoSztukmistrzaI, rekawiczkiWodnejZjawyI, rekawiczkiOgnistegoYokaiI, medalionMinamiI, medalionYugureI, zbrojaSzlachetnegoRoduI, zbrojaSzlachetnegoRoduI, OYoroiI, herumettoZwiadowcyI, kaskMeznegoSamurajaI, chodakiPiekielnegoKrokuI, stapanieMagiiI, rekawiceWieliejFaliI, serceWschodniejFaliI, okoSpokojnychOceanowI, wisiorMuttsuI, wisiorMuttsuI, wisiorMittsuI, wisiorHitotsuI, wisiorHitotsuI, butyPoleglegoYokaiI, deszczoryAmulet }, 4760, 634, 341,  8.13, 5439, 111, 1000, 10, 10);




    public static final Enemy[] lesnyGaszcz = new Enemy[] {
            zajac, zaba, swierszcz, karaluszek, szerszen
    };

    public static final Enemy[] zaginonyMatecznik = new Enemy[] {
            zuk, nietoperz, duzyPajak, kruk, piwiniczanyPotwor
    };

    public static final Enemy[] crossroads = new Enemy[] {
            jelen, silnyJelen, szczurWojownik, szczurZbozowy
    };

    public static final Enemy[] deepCreep = new Enemy[] {
            cmentarnyGhul, cmentarnyGhul2, nieumarlyMnich, szabrownik, nieumarlyWojownik, nieumarlyWiarus
    };

    public static final Enemy[] virginThickForest = new Enemy[] {
            niedzwiedzBrunatny, niedzwiedzSzary, niedzwiedzCzarny, brazowaMrowkaZolnierz
    };

    public static final Enemy[] zuluSettlement = new Enemy[] {
            fulaGula, nunaGula, zuluMulu, didaGula, buluMulu, furuMulu
    };

    public static final Enemy[][] commonEnemyLists = new Enemy[][] {
            lesnyGaszcz, zaginonyMatecznik, crossroads, deepCreep, virginThickForest,
            zuluSettlement,
    };

    public static final Enemy[] CzarnaWilczyca = new Enemy[] { czarnaWilczyca };
    public static final Enemy[] Vulk = new Enemy[] { vulk };
    public static final Enemy[] Karhu = new Enemy[] { karhu };
    public static final Enemy[] MrowczaKrolowa = new Enemy[] { mrowczaKrolowa };
    public static final Enemy[] PaladynskiApostata = new Enemy[] { paladynskiApostata };
    public static final Enemy[] Cerber = new Enemy[] { cerber };

    public static final Enemy[] Mushita = new Enemy[] { mushita };

    public static final Enemy[] AmeOnna = new Enemy[] { ameOnna };

    public static final Enemy[][] eliteEnemyList = new Enemy[][] { CzarnaWilczyca, Vulk, Karhu, MrowczaKrolowa, PaladynskiApostata, Cerber };

    public static final Enemy[][] elite2EnemyList = new Enemy[][] { Mushita };

    public static final Enemy[][] tytanEnemyList = new Enemy[][] { AmeOnna };

//    public static final Item DefaultHelmet = kaskMeznegoSamurajaI;
//    public static final Item DefaultRing = nimbEmanujacegoKla;
//    public static final Item DefaultNecklace = deszczoryAmulet;
//    public static final Item DefaultGloves = rekawiceWieliejFaliI;
//    public static final Item DefaultWeapon = rapier;
//    public static final Item DefaultTwoHandedWeapon = new Item("", 0, new String[]{w, m, t, h, b, p}, 1, 0, ItemTypes.twoHandedWeapon, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, "");
//    public static final Item DefaultArmor = OYoroiI;
//    public static final Item DefaultSecWeapon = ochronaPrzedTrollami;
//    public static final Item DefaultShoes = butyPoleglegoYokaiI;

}
