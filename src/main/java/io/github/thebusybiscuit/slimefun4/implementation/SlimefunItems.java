package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /*		 Items 		*/
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack(
            "PORTABLE_CRAFTER",
            HeadTexture.PORTABLE_CRAFTER,
            "&6Przenośny Stół Rzemieślniczy",
            "&a&oPrzenośny stół rzemieślniczy",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack(
            "PORTABLE_DUSTBIN", HeadTexture.TRASH_CAN, "&6Przenośny Śmietnik", "&rŁatwo usuwaj zbędne przedmioty", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack(
            "ENDER_BACKPACK", HeadTexture.ENDER_BACKPACK, "&6Plecak Endu", "&a&oPrzenośna skrzynia kresu", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack(
            "MAGIC_EYE_OF_ENDER", Material.ENDER_EYE, "&6&lMagiczne Oko Endu", "&4&lWymaga pełnego zestawu zbroi Endu", "", "&7&ePPM&7 aby wystrzelić Perłę Endu");
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack(
            "BROKEN_SPAWNER", Material.SPAWNER, "&cZniszczony Spawner", "&7Typ: &b<Typ>", "", "&cZniszczony, wymaga naprawy w Starożytnym Ołtarzu");
    public static final SlimefunItemStack REPAIRED_SPAWNER =
            new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "&bNaprawiony Spawner", "&7Typ: &b<Typ>");
    public static final SlimefunItemStack INFERNAL_BONEMEAL =
            new SlimefunItemStack("INFERNAL_BONEMEAL", Material.BONE_MEAL, "&4Piekielna Mączka Kostna", "", "&cPrziespiesza wzrost Brodawki");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack(
            "TAPE_MEASURE",
            "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65",
            "&6Miarka",
            "",
            "&eShift + PPM &7ustaw punkt początkowy",
            "&ePPM &7zmierz dystans");

    /*		 Gadgets 		*/
    public static final SlimefunItemStack GOLD_PAN =
            new SlimefunItemStack("GOLD_PAN", Material.BOWL, "&6Misa do Płukania Złota", "&a&oMożna uzyskać różne minerały", "", "&7&ePPM&7 aby płukać w żwirze");
    public static final SlimefunItemStack NETHER_GOLD_PAN =
            new SlimefunItemStack("NETHER_GOLD_PAN", Material.BOWL, "&4Netherowa Misa do Płukania Złota", "", "&7&ePPM&7 aby płukać w piasku dusz");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack(
            "PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&r&lSpadochron", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack GRAPPLING_HOOK =
            new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "&6Hak z Linką", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SOLAR_HELMET =
            new SlimefunItemStack("SOLAR_HELMET", Material.IRON_HELMET, "&bHełm Solarny", "", "&a&oŁaduje trzymane przedmioty i ekwipunek");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&bTkanina");
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack(
            "REINFORCED_CLOTH", Material.PAPER, "&bWzmocniona Tkanina", "", "&fTa tkanina wzmocniona ołowiem", "&fchroni przed negatywnymi skutkami promieniowania");
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack("CAN", HeadTexture.TIN_CAN, "&rPuszka");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack(
            "NIGHT_VISION_GOGGLES", Material.LEATHER_HELMET, Color.BLACK, "&aGogle Noktowizyjne", "", "&9+ Noktowizja");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack(
            "ELYTRA_CAP", Material.LEATHER_HELMET, Color.PURPLE, "&5Czapka Elytry", "", "&7Zapobiega obrażeniom od upadku", "&7podczas lotu Elytrą");
    public static final SlimefunItemStack FARMER_SHOES =
            new SlimefunItemStack("FARMER_SHOES", Material.LEATHER_BOOTS, Color.YELLOW, "&eButy Farmera", "", "&6&oZapobiega niszczeniu upraw");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack(
            "INFUSED_MAGNET",
            HeadTexture.MAGNET,
            "&aZaklęty Magnes",
            "",
            "&rMagiczny magnes",
            "&rPrzyciąga pobliskie przedmioty",
            "&rdo twojego ekwipunku",
            "",
            "&7Przytrzymaj &eShift&7 aby przyciągnąć przedmioty");
    public static final SlimefunItemStack RAG = new SlimefunItemStack(
            "RAG",
            Material.PAPER,
            "&cSzmata",
            "",
            "&aZestaw medyczny poz. 1",
            "",
            "&rPrzywraca 2 HP",
            "&rGasi ogień",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack(
            "BANDAGE",
            Material.PAPER,
            "&cBandaż",
            "",
            "&aZestaw medyczny poz. 2",
            "",
            "&rPrzywraca 4 HP",
            "&rGasi ogień",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack(
            "SPLINT", Material.STICK, "&cSzyna", "", "&aZestaw medyczny poz. 1", "", "&rPrzywraca 2 HP", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack(
            "VITAMINS",
            Material.NETHER_WART,
            "&cWitaminy",
            "",
            "&aZestaw medyczny poz. 3",
            "",
            "&rPrzywraca 4 HP",
            "&rGasi ogień",
            "&rLeczy truciznę/wither/promieniowanie",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack(
            "MEDICINE",
            Material.POTION,
            Color.RED,
            "&cLekarstwo",
            "",
            "&aZestaw medyczny poz. 3",
            "",
            "&rPrzywraca 4 HP",
            "&rGasi ogień",
            "&rLeczy truciznę/wither/promieniowanie",
            "",
            "&7&ePPM&7 aby wypić");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS =
            new SlimefunItemStack("MAGICAL_ZOMBIE_PILLS", Material.NETHER_WART, "&6Magiczne Pigułki Zombie", "", "&ePPM aby natychmiast uleczyć &7Zombie Wieśniaka/Piglina");

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FLASK_OF_KNOWLEDGE", Material.GLASS_BOTTLE, "&cButelka Wiedzy", "", "&rPozwala przechowywać doświadczenie", "&7Kosztuje &a1 poziom");
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE =
            new SlimefunItemStack("FILLED_FLASK_OF_KNOWLEDGE", Material.EXPERIENCE_BOTTLE, "&aPełna Butelka Wiedzy");

    /*		Backpacks		*/
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack(
            "SMALL_BACKPACK",
            HeadTexture.BACKPACK,
            "&eMały Plecak",
            "",
            "&7Rozmiar: &e9",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack(
            "MEDIUM_BACKPACK",
            HeadTexture.BACKPACK,
            "&eŚredni Plecak",
            "",
            "&7Rozmiar: &e18",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack(
            "LARGE_BACKPACK",
            HeadTexture.BACKPACK,
            "&eDuży Plecak",
            "",
            "&7Rozmiar: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack(
            "WOVEN_BACKPACK",
            HeadTexture.BACKPACK,
            "&eTkany Plecak",
            "",
            "&7Rozmiar: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack(
            "GILDED_BACKPACK",
            HeadTexture.BACKPACK,
            "&ePozłacany Plecak",
            "",
            "&7Rozmiar: &e45",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack(
            "RADIANT_BACKPACK",
            HeadTexture.BACKPACK,
            "&ePromienny Plecak",
            "",
            "&7Rozmiar: &e54 (Duża Skrzynia)",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack(
            "BOUND_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "&cPlecak Duszy",
            "",
            "&7Rozmiar: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack COOLER = new SlimefunItemStack(
            "COOLER",
            HeadTexture.COOLER,
            "&bChłodziarka",
            "&rMoże przechowywać soki i smoothie",
            "&rGdy jest w twoim ekwipunku",
            "&rautomatycznie konsumuje jedzenie gdy jesteś głodny",
            "",
            "&7Rozmiar: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack(
            "RESTORED_BACKPACK",
            HeadTexture.RESTORED_BACKPACK,
            "&ePrzywracacz Plecaka",
            "",
            "&7Odzyskaj przedmioty ze zgubionego plecaka",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		 Jetpacks		*/
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack(
            "DURALUMIN_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Elektryczny Plecak Odrzutowy &7- &eI",
            "",
            LoreBuilder.material("Duraluminium"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Ciąg: &c0.35",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack(
            "SOLDER_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Elektryczny Plecak Odrzutowy &7- &eII",
            "",
            LoreBuilder.material("Lutowie"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Ciąg: &c0.4",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack(
            "BILLON_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Elektryczny Plecak Odrzutowy &7- &eIII",
            "",
            LoreBuilder.material("Bilon"),
            LoreBuilder.powerCharged(0, 45),
            "&8\u21E8 &7Ciąg: &c0.45",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack(
            "STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Elektryczny Plecak Odrzutowy &7- &eIV",
            "",
            LoreBuilder.material("Stal"),
            LoreBuilder.powerCharged(0, 60),
            "&8\u21E8 &7Ciąg: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Elektryczny Plecak Odrzutowy &7- &eV",
            "",
            LoreBuilder.material("Stal Damasceńska"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Ciąg: &c0.55",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Elektryczny Plecak Odrzutowy &7- &eVI",
            "",
            LoreBuilder.material("Wzmocniony Stop"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Ciąg: &c0.6",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack(
            "CARBONADO_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.BLACK,
            "&9Elektryczny Plecak Odrzutowy &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 150),
            "&8\u21E8 &7Ciąg: &c0.7",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack(
            "ARMORED_JETPACK",
            Material.IRON_CHESTPLATE,
            "&9Opancerzony Plecak Odrzutowy",
            LoreBuilder.material("Stal"),
            "",
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Ciąg: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Jetboots		*/
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack(
            "DURALUMIN_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Buty Odrzutowe &7- &eI",
            "",
            LoreBuilder.material("Duraluminium"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Prędkość: &a0.35",
            "&8\u21E8 &7Celność: &c50%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack(
            "SOLDER_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Buty Odrzutowe &7- &eII",
            "",
            LoreBuilder.material("Lutowie"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Prędkość: &a0.4",
            "&8\u21E8 &7Celność: &660%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack(
            "BILLON_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Buty Odrzutowe &7- &eIII",
            "",
            LoreBuilder.material("Bilon"),
            LoreBuilder.powerCharged(0, 40),
            "&8\u21E8 &7Prędkość: &a0.45",
            "&8\u21E8 &7Celność: &665%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack(
            "STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Buty Odrzutowe &7- &eIV",
            "",
            LoreBuilder.material("Stal"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Prędkość: &a0.5",
            "&8\u21E8 &7Celność: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Buty Odrzutowe &7- &eV",
            "",
            LoreBuilder.material("Stal Damasceńska"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Prędkość: &a0.55",
            "&8\u21E8 &7Celność: &a75%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Buty Odrzutowe &7- &eVI",
            "",
            LoreBuilder.material("Wzmocniony Stop"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Prędkość: &a0.6",
            "&8\u21E8 &7Celność: &c80%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack(
            "CARBONADO_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "&9Buty Odrzutowe &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 125),
            "&8\u21E8 &7Prędkość: &a0.7",
            "&8\u21E8 &7Celność: &c99.9%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack(
            "ARMORED_JETBOOTS",
            Material.IRON_BOOTS,
            "&9Opancerzone Buty Odrzutowe",
            "",
            LoreBuilder.material("Stal"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Prędkość: &a0.45",
            "&8\u21E8 &7Celność: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Multi Tools		*/
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack(
            "DURALUMIN_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eI",
            "",
            LoreBuilder.material("Duraluminium"),
            LoreBuilder.powerCharged(0, 20),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack(
            "SOLDER_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eII",
            "",
            LoreBuilder.material("Lutowie"),
            LoreBuilder.powerCharged(0, 30),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack(
            "BILLON_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eIII",
            "",
            LoreBuilder.material("Bilon"),
            LoreBuilder.powerCharged(0, 40),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack(
            "STEEL_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eIV",
            "",
            LoreBuilder.material("Stal"),
            LoreBuilder.powerCharged(0, 50),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack(
            "DAMASCUS_STEEL_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eV",
            "",
            LoreBuilder.material("Stal Damasceńska"),
            LoreBuilder.powerCharged(0, 60),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack(
            "REINFORCED_ALLOY_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eVI",
            "",
            LoreBuilder.material("Wzmocniony Stop"),
            LoreBuilder.powerCharged(0, 75),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack(
            "CARBONADO_MULTI_TOOL",
            Material.SHEARS,
            "&9Multitool &7- &eVII",
            "",
            LoreBuilder.material("Carbonado"),
            LoreBuilder.powerCharged(0, 100),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Przytrzymaj &eShift + PPM&7 aby zmienić tryb");

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /*		 Food 		*/
    public static final SlimefunItemStack FORTUNE_COOKIE =
            new SlimefunItemStack("FORTUNE_COOKIE", Material.COOKIE, "&6Ciasteczko z Wróżbą", "", "&a&oMówi ci co przyniesie przyszłość :o");
    public static final SlimefunItemStack DIET_COOKIE =
            new SlimefunItemStack("DIET_COOKIE", Material.COOKIE, "&6Dietetyczne Ciasteczko", "", "&aBardzo &olekkie&r&a ciasteczko");
    public static final SlimefunItemStack MAGIC_SUGAR =
            new SlimefunItemStack("MAGIC_SUGAR", Material.SUGAR, "&6Magiczny Cukier", "", "&a&oPoczuj moc Hermesa!");
    public static final SlimefunItemStack MONSTER_JERKY =
            new SlimefunItemStack("MONSTER_JERKY", Material.ROTTEN_FLESH, "&6Suszone Mięso Potwora", "", "&a&oPożywne i sycące");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack(
            "APPLE_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cSok Jabłkowy",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack(
            "MELON_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cSok Arbuzowy",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack(
            "CARROT_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Sok Marchewkowy",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack(
            "PUMPKIN_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Sok Dyniowy",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack(
            "SWEET_BERRY_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cSok Jagodowy",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GLOW_BERRY_JUICE = new SlimefunItemStack(
            "GLOW_BERRY_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Sok ze Świecących Jagód",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack(
            "GOLDEN_APPLE_JUICE", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0), "&bSok z Złotego Jabłka");

    public static final SlimefunItemStack BEEF_JERKY =
            new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "&6Suszona Wołowina", "", "&rZabija głód!");
    public static final SlimefunItemStack PORK_JERKY =
            new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "&6Suszona Wieprzowina", "", "&rZabija głód!");
    public static final SlimefunItemStack CHICKEN_JERKY =
            new SlimefunItemStack("CHICKEN_JERKY", Material.COOKED_CHICKEN, "&6Suszony Kurczak", "", "&rZabija głód!");
    public static final SlimefunItemStack MUTTON_JERKY =
            new SlimefunItemStack("MUTTON_JERKY", Material.COOKED_MUTTON, "&6Suszona Baranina", "", "&rZabija głód!");
    public static final SlimefunItemStack RABBIT_JERKY =
            new SlimefunItemStack("RABBIT_JERKY", Material.COOKED_RABBIT, "&6Suszony Królik", "", "&rZabija głód!");
    public static final SlimefunItemStack FISH_JERKY =
            new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "&6Suszona Ryba", "", "&rZabija głód!");
    public static final SlimefunItemStack KELP_COOKIE = new SlimefunItemStack("KELP_COOKIE", Material.COOKIE, "&2Ciasteczko z Wodorostów");

    /*		Christmas		*/
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack(
            "CHRISTMAS_MILK",
            Color.WHITE,
            new PotionEffect(PotionEffectType.SATURATION, 4, 0),
            "&6Szklanka Mleka",
            "",
            LoreBuilder.hunger(2.5));
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack(
            "CHRISTMAS_CHOCOLATE_MILK",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 11, 0),
            "&6Mleko Czekoladowe",
            "",
            LoreBuilder.hunger(3.5));
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack(
            "CHRISTMAS_EGG_NOG",
            Color.GRAY,
            new PotionEffect(PotionEffectType.SATURATION, 6, 0),
            "&aAjerkoniak",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack(
            "CHRISTMAS_APPLE_CIDER",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&cCydr",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_COOKIE =
            new SlimefunItemStack("CHRISTMAS_COOKIE", Material.COOKIE, ChatUtils.christmas("Świąteczne Ciasteczko"));
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE =
            new SlimefunItemStack("CHRISTMAS_FRUIT_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Ciasto Owocowe"));
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE =
            new SlimefunItemStack("CHRISTMAS_APPLE_PIE", Material.PUMPKIN_PIE, "&rSzarlotka");
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack(
            "CHRISTMAS_HOT_CHOCOLATE",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&6Gorąca Czekolada",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_CAKE =
            new SlimefunItemStack("CHRISTMAS_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Świąteczne Ciasto"));
    public static final SlimefunItemStack CHRISTMAS_CARAMEL =
            new SlimefunItemStack("CHRISTMAS_CARAMEL", Material.BRICK, "&6Karmel");
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE =
            new SlimefunItemStack("CHRISTMAS_CARAMEL_APPLE", Material.APPLE, "&6Karmelowe Jabłko");
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE =
            new SlimefunItemStack("CHRISTMAS_CHOCOLATE_APPLE", Material.APPLE, "&6Czekoladowe Jabłko");
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack(
            "CHRISTMAS_PRESENT",
            HeadTexture.CHRISTMAS_PRESENT,
            ChatUtils.christmas("Prezent Świąteczny"),
            "&7Prezent od &eTheBusyBiscuit",
            "&7Dla: &eCiebie",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		Easter			*/
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack(
            "EASTER_EGG", HeadTexture.EASTER_EGG, "&rJajko Wielkanocne", "&dWesołych Świąt! Otwórz prezent.", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack EASTER_CARROT_PIE =
            new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "&6Ciasto Marchewkowe");
    public static final SlimefunItemStack EASTER_APPLE_PIE =
            new SlimefunItemStack("EASTER_APPLE_PIE", Material.PUMPKIN_PIE, "&rSzarlotka");

    /*		 Weapons 		*/
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK =
            new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "&7Laska Babci");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK =
            new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "&7Laska Dziadka");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack(
            "SWORD_OF_BEHEADING", Material.IRON_SWORD, "&6Miecz Ścięcia", "&7Ścięcie II", "", "&rSzansa na ścięcie głowy moba", "&r(Zwiększa szansę na czaszkę Witherowego Szkieleta)");
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack(
            "BLADE_OF_VAMPIRES", Material.GOLDEN_SWORD, "&cOstrze Wampira", "&7Kradzież Życia I", "", "&r45% szans przy ataku", "na przywrócenie 2 HP");
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack(
            "SEISMIC_AXE", Material.IRON_AXE, "&aTopór Sejsmiczny", "", "&7&oPowoduje trzęsienie ziemi...", "", LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.SHARPNESS, 2);
    }

    /*		Bows		*/
    public static final SlimefunItemStack EXPLOSIVE_BOW =
            new SlimefunItemStack("EXPLOSIVE_BOW", Material.BOW, "&cWybuchowy Łuk", "&rStrzały wystrzeliwują cel w powietrze");
    public static final SlimefunItemStack ICY_BOW =
            new SlimefunItemStack("ICY_BOW", Material.BOW, "&bLodowy Łuk", "&rTrafienie zamraża cel", "&runiemożliwiając ruch (2s)");

    /*		 Tools		*/
    public static final SlimefunItemStack SMELTERS_PICKAXE =
            new SlimefunItemStack("SMELTERS_PICKAXE", Material.DIAMOND_PICKAXE, "&6Kilof Hutniczy", "&c&lAutomatyczne przetapianie", "", "&9Działa jak Szczęście przy kopaniu");
    public static final SlimefunItemStack LUMBER_AXE =
            new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "&6Topór Drwala", "&a&oŚcina całe drzewa...");
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT =
            new SlimefunItemStack("PICKAXE_OF_CONTAINMENT", Material.IRON_PICKAXE, "&cKilof Przechowywania", "", "&9Może zebrać Spawner");
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "EXPLOSIVE_PICKAXE", Material.DIAMOND_PICKAXE, "&eWybuchowy Kilof", "", "&rSzybkie kopanie eksplozjami", "", "&9Wspiera Szczęście");
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL =
            new SlimefunItemStack("EXPLOSIVE_SHOVEL", Material.DIAMOND_SHOVEL, "&eWybuchowa Łopata", "", "&rWykopuje wiele bloków naraz");
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack(
            "PICKAXE_OF_THE_SEEKER",
            Material.DIAMOND_PICKAXE,
            "&aKilof Poszukiwacza",
            "&rWskazuje pobliskie rudy",
            "&rMoże ulec uszkodzeniu",
            "",
            "&7&ePPM&7 aby szukać rud");
    public static final SlimefunItemStack COBALT_PICKAXE =
            new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "&9Kobaltowy Kilof");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack(
            "PICKAXE_OF_VEIN_MINING", Material.DIAMOND_PICKAXE, "&eKilof Górniczy", "", "&rWykopuje całą żyłę", "&rminerałów...");
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack(
            "CLIMBING_PICK", Material.IRON_PICKAXE, "&bCzekan", "", "&fPozwala wspinać się", "&fna wybrane ściany po kliknięciu PPM.", "&fWydajność zwiększa prędkość wspinaczki");

    static {
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.EFFICIENCY, 6);
    }

    /*		 Armor 		*/
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack(
            "GLOWSTONE_HELMET", Material.LEATHER_HELMET, Color.YELLOW, "&e&lHełm z Jasnopyłu", "", "&a&oLśni jak słońce!", "", "&9+ Noktowizja");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack(
            "GLOWSTONE_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.YELLOW,
            "&e&lNapierśnik z Jasnopyłu",
            "",
            "&a&oLśni jak słońce!",
            "",
            "&9+ Noktowizja");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack(
            "GLOWSTONE_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.YELLOW,
            "&e&lNogawice z Jasnopyłu",
            "",
            "&a&oLśni jak słońce!",
            "",
            "&9+ Noktowizja");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack(
            "GLOWSTONE_BOOTS", Material.LEATHER_BOOTS, Color.YELLOW, "&e&lButy z Jasnopyłu", "", "&a&oLśni jak słońce!", "", "&9+ Noktowizja");
    public static final SlimefunItemStack RAINBOW_LEATHER =
            new SlimefunItemStack("RAINBOW_LEATHER", Material.RABBIT_HIDE, Color.FUCHSIA, "&dTęczowa Skóra", "", "&fUżywana do tworzenia tęczowej zbroi");
    public static final SlimefunItemStack RAINBOW_HELMET = new SlimefunItemStack(
            "RAINBOW_HELMET", Material.LEATHER_HELMET, Color.FUCHSIA, "&d&lTęczowy Hełm", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CHESTPLATE = new SlimefunItemStack(
            "RAINBOW_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.FUCHSIA, "&d&lTęczowy Napierśnik", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_LEGGINGS = new SlimefunItemStack(
            "RAINBOW_LEGGINGS", Material.LEATHER_LEGGINGS, Color.FUCHSIA, "&d&lTęczowe Nogawice", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_BOOTS = new SlimefunItemStack(
            "RAINBOW_BOOTS", Material.LEATHER_BOOTS, Color.FUCHSIA, "&d&lTęczowe Buty", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack(
            "ENDER_HELMET", Material.LEATHER_HELMET, Color.fromRGB(28, 25, 112), "&5&lHełm Endu", "", "&a&oPoruszaj się swobodnie");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack(
            "ENDER_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(28, 25, 112), "&5&lNapierśnik Endu", "", "&a&oPoruszaj się swobodnie");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack(
            "ENDER_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(28, 25, 112), "&5&lNogawice Endu", "", "&a&oPoruszaj się swobodnie");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack(
            "ENDER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.fromRGB(28, 25, 112),
            "&5&lButy Endu",
            "",
            "&a&oPoruszaj się swobodnie",
            "",
            "&9+ Brak obrażeń od Pereł Endu");

    public static final SlimefunItemStack SLIME_HELMET =
            new SlimefunItemStack("SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "&a&lSzlamowy Hełm", "", "&a&oSprężyste uczucie");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack(
            "SLIME_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.LIME, "&a&lSzlamowy Napierśnik", "", "&a&oSprężyste uczucie");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack(
            "SLIME_LEGGINGS", Material.LEATHER_LEGGINGS, Color.LIME, "&a&lSzlamowe Nogawice", "", "&a&oSprężyste uczucie", "", "&9+ Prędkość");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack(
            "SLIME_BOOTS",
            Material.LEATHER_BOOTS,
            Color.LIME,
            "&a&lSzlamowe Buty",
            "",
            "&a&oSprężyste uczucie",
            "",
            "&9+ Wysoki Skok",
            "&9+ Zmniejszone obrażenia od upadku");

    public static final SlimefunItemStack CACTUS_HELMET =
            new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "&2Kaktusowy Hełm");
    public static final SlimefunItemStack CACTUS_CHESTPLATE =
            new SlimefunItemStack("CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2Kaktusowy Napierśnik");
    public static final SlimefunItemStack CACTUS_LEGGINGS =
            new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "&2Kaktusowe Nogawice");
    public static final SlimefunItemStack CACTUS_BOOTS =
            new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "&2Kaktusowe Buty");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET =
            new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "&7Hełm ze Stali Damasceńskiej");
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE =
            new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Napierśnik ze Stali Damasceńskiej");
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS =
            new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&7Nogawice ze Stali Damasceńskiej");
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS =
            new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "&7Buty ze Stali Damasceńskiej");

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET =
            new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "&bWzmocniony Hełm");
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE =
            new SlimefunItemStack("REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "&bWzmocniony Napierśnik");
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS =
            new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "&bWzmocnione Nogawice");
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS =
            new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "&bWzmocnione Buty");

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Pełny Zestaw:");
        hazmatLore.add(ChatColor.YELLOW + "- Odporność na promieniowanie");
        hazmatLore.add(ChatColor.YELLOW + "- Odporność na użądlenia pszczół");
    }

    public static final SlimefunItemStack SCUBA_HELMET =
            new SlimefunItemStack("SCUBA_HELMET", Material.LEATHER_HELMET, Color.ORANGE, "&cHełm Nurka", "", "&7Pozwala oddychać pod wodą");
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack(
            "HAZMAT_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.ORANGE, "&cKombinezon Hazmat", "", "&7Pozwala chodzić w ogniu i lawie");
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack(
            "HAZMAT_LEGGINGS", Material.LEATHER_LEGGINGS, Color.ORANGE, "&cNogawice Hazmat", hazmatLore.toArray(new String[0]));
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack(
            "RUBBER_BOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&cButy Hazmat", hazmatLore.toArray(new String[0]));

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET =
            new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "&6Pozłacany Żelazny Hełm");
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE =
            new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Pozłacany Żelazny Napierśnik");
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS =
            new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Pozłacane Żelazne Nogawice");
    public static final SlimefunItemStack GILDED_IRON_BOOTS =
            new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "&6Pozłacane Żelazne Buty");

    public static final SlimefunItemStack GOLDEN_HELMET_12K =
            new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "&6Złoty Hełm", "&912 Karatów");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K =
            new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Złoty Napierśnik", "&912 Karatów");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K =
            new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Złote Nogawice", "&912 Karatów");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K =
            new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "&6Złote Buty", "&912 Karatów");

    public static final SlimefunItemStack SLIME_HELMET_STEEL =
            new SlimefunItemStack("SLIME_STEEL_HELMET", Material.IRON_HELMET, "&a&lSzlamowy Hełm", "&7&oWzmocniony", "", "&a&oSprężyste uczucie");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&a&lSzlamowy Napierśnik", "&7&oWzmocniony", "", "&a&oSprężyste uczucie");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&a&lSzlamowe Nogawice", "&7&oWzmocniony", "", "&a&oSprężyste uczucie", "", "&9+ Prędkość");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_BOOTS",
            Material.IRON_BOOTS,
            "&a&lSzlamowe Buty",
            "&7&oWzmocniony",
            "",
            "&a&oSprężyste uczucie",
            "",
            "&9+ Wysoki Skok",
            "&9+ Zmniejszone obrażenia od upadku");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack(
            "BOOTS_OF_THE_STOMPER",
            Material.LEATHER_BOOTS,
            Color.AQUA,
            "&bButy Tąpacza",
            "",
            "&9Wszystkie obrażenia od upadku",
            "&9są przenoszone na pobliskie moby/graczy",
            "",
            "&9+ Zmniejszone obrażenia od upadku");

    public static final SlimefunItemStack BEE_HELMET =
            new SlimefunItemStack("BEE_HELMET", Material.GOLDEN_HELMET, "&e&lPszczeli Hełm", " ", "&fBzz bzz");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack(
            "BEE_WINGS", Material.ELYTRA, "&e&lPszczele Skrzydła", " ", "&fBzz bzz", " ", "&9Gdy blisko ziemi", "&9aktywuje powolne opadanie", " ");
    public static final SlimefunItemStack BEE_LEGGINGS =
            new SlimefunItemStack("BEE_LEGGINGS", Material.GOLDEN_LEGGINGS, "&e&lPszczele Nogawice", " ", "&fBzz bzz");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack(
            "BEE_BOOTS",
            Material.GOLDEN_BOOTS,
            "&e&lPszczele Buty",
            "&fBzz bzz",
            "",
            "&e&oNie ma problemu z ponownym startem",
            "",
            "&9+ Wysoki Skok",
            "&9+ Zmniejszone obrażenia od upadku");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(VersionedEnchantment.UNBREAKING, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(VersionedEnchantment.UNBREAKING, 5);
        damascusEnchs.put(VersionedEnchantment.PROTECTION, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(VersionedEnchantment.UNBREAKING, 9);
        reinforcedEnchs.put(VersionedEnchantment.PROTECTION, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(VersionedEnchantment.UNBREAKING, 6);
        gildedEnchs.put(VersionedEnchantment.PROTECTION, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        slimeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        beeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /*		 Misc 		*/
    public static final SlimefunItemStack MAGIC_LUMP_1 =
            new SlimefunItemStack("MAGIC_LUMP_1", Material.GOLD_NUGGET, "&6Magiczna Grudka &7- &eI", "", "&c&oPoziom: I");
    public static final SlimefunItemStack MAGIC_LUMP_2 =
            new SlimefunItemStack("MAGIC_LUMP_2", Material.GOLD_NUGGET, "&6Magiczna Grudka &7- &eII", "", "&c&oPoziom: II");
    public static final SlimefunItemStack MAGIC_LUMP_3 =
            new SlimefunItemStack("MAGIC_LUMP_3", Material.GOLD_NUGGET, "&6Magiczna Grudka &7- &eIII", "", "&c&oPoziom: III");
    public static final SlimefunItemStack ENDER_LUMP_1 =
            new SlimefunItemStack("ENDER_LUMP_1", Material.GOLD_NUGGET, "&5Grudka Endu &7- &eI", "", "&c&oPoziom: I");
    public static final SlimefunItemStack ENDER_LUMP_2 =
            new SlimefunItemStack("ENDER_LUMP_2", Material.GOLD_NUGGET, "&5Grudka Endu &7- &eII", "", "&c&oPoziom: II");
    public static final SlimefunItemStack ENDER_LUMP_3 =
            new SlimefunItemStack("ENDER_LUMP_3", Material.GOLD_NUGGET, "&5Grudka Endu &7- &eIII", "", "&c&oPoziom: III");
    public static final SlimefunItemStack MAGICAL_BOOK_COVER =
            new SlimefunItemStack("MAGICAL_BOOK_COVER", Material.PAPER, "&6Magiczna Okładka", "", "&a&oUżywana do magicznych ksiąg");
    public static final SlimefunItemStack MAGICAL_GLASS =
            new SlimefunItemStack("MAGICAL_GLASS", Material.GLASS_PANE, "&6Magiczne Szkło", "", "&a&oUżywane w magicznych przedmiotach");
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack(
            "SYNTHETIC_SHULKER_SHELL", Material.SHULKER_SHELL, "&dSyntetyczna Skorupa Shulkera", "", "&fMoże być używana w craftingu", "&fjak zwykła skorupa shulkera");
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD =
            new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "&bPodstawowa Płytka Drukowana");
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD =
            new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "&bZaawansowana Płytka Drukowana");
    public static final SlimefunItemStack WHEAT_FLOUR = new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "&rMąka Pszenna");
    public static final SlimefunItemStack STEEL_PLATE = new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "&7&lStalowa Płyta");
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack("BATTERY", HeadTexture.BATTERY, "&6Bateria");
    public static final SlimefunItemStack CARBON = new SlimefunItemStack("CARBON", HeadTexture.CARBON, "&eWęgiel");
    public static final SlimefunItemStack COMPRESSED_CARBON =
            new SlimefunItemStack("COMPRESSED_CARBON", HeadTexture.COMPRESSED_CARBON, "&cSkompresowany Węgiel");
    public static final SlimefunItemStack CARBON_CHUNK =
            new SlimefunItemStack("CARBON_CHUNK", HeadTexture.CARBON, "&4Bryła Węgla");
    public static final SlimefunItemStack STEEL_THRUSTER =
            new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "&7&lStalowy Pędnik");
    public static final SlimefunItemStack POWER_CRYSTAL =
            new SlimefunItemStack("POWER_CRYSTAL", HeadTexture.POWER_CRYSTAL, "&c&lKryształ Energii");
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "&bŁańcuch");
    public static final SlimefunItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "&bHak");
    public static final SlimefunItemStack SIFTED_ORE = new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "&6Przesiana Ruda");
    public static final SlimefunItemStack STONE_CHUNK =
            new SlimefunItemStack("STONE_CHUNK", HeadTexture.STONE_CHUNK, "&6Bryła Kamienia");
    public static final SlimefunItemStack LAVA_CRYSTAL =
            new SlimefunItemStack("LAVA_CRYSTAL", HeadTexture.LAVA_CRYSTAL, "&4Kryształ Lawy");
    public static final SlimefunItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "&rSól");
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack("CHEESE", HeadTexture.CHEESE, "&rSer");
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack("BUTTER", HeadTexture.BUTTER, "&rMasło");
    public static final SlimefunItemStack DUCT_TAPE =
            new SlimefunItemStack("DUCT_TAPE", HeadTexture.DUCT_TAPE, "&8Taśma Klejąca", "", "&rMożna jej użyć w Auto-Kowadle", "&rdo naprawy przedmiotów");
    public static final SlimefunItemStack HEAVY_CREAM =
            new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "&rŚmietana");
    public static final SlimefunItemStack CRUSHED_ORE =
            new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "&6Zmiażdżona Ruda");
    public static final SlimefunItemStack PULVERIZED_ORE =
            new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "&6Sproszkowana Ruda");
    public static final SlimefunItemStack PURE_ORE_CLUSTER =
            new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "&6Czysta Ruda");
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack(
            "SMALL_URANIUM",
            HeadTexture.URANIUM,
            "&cMały Uran",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack(
            "TINY_URANIUM", HeadTexture.URANIUM, "&cDrobny Uran", "", LoreBuilder.radioactive(Radioactivity.LOW));

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack("MAGNET", HeadTexture.MAGNET, "&cMagnes");
    public static final SlimefunItemStack NECROTIC_SKULL =
            new SlimefunItemStack("NECROTIC_SKULL", HeadTexture.NECROTIC_SKULL, "&cMartwa Czaszka");
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE =
            new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "&4Esencja Zaświatów");
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack(
            "STRANGE_NETHER_GOO", Material.PURPLE_DYE, "&5Dziwna Netherowa Maź", "", "&fDziwna substancja", "&fMożna ją wymienić z Piglinami");
    public static final SlimefunItemStack ELECTRO_MAGNET =
            new SlimefunItemStack("ELECTRO_MAGNET", HeadTexture.MAGNET, "&cElektromagnes");
    public static final SlimefunItemStack HEATING_COIL =
            new SlimefunItemStack("HEATING_COIL", HeadTexture.HEATING_COIL, "&cCewka Grzewcza");
    public static final SlimefunItemStack COOLING_UNIT =
            new SlimefunItemStack("COOLING_UNIT", HeadTexture.COOLING_UNIT, "&bJednostka Chłodząca");
    public static final SlimefunItemStack ELECTRIC_MOTOR =
            new SlimefunItemStack("ELECTRIC_MOTOR", HeadTexture.MOTOR, "&cSilnik Elektryczny");
    public static final SlimefunItemStack CARGO_MOTOR =
            new SlimefunItemStack("CARGO_MOTOR", HeadTexture.CARGO_MOTOR, "&3Silnik Transportowy", "", "&7Ważny element sieci transportowej");
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack(
            "SCROLL_OF_DIMENSIONAL_TELEPOSITION",
            Material.PAPER,
            "&6Zwój Wymiarowej Telepozycji",
            "",
            "&cTworzy tymczasową czarną dziurę",
            "&cTeleportuje pobliskie byty",
            "&cdo innego wymiaru",
            "&cWszystko jest odwrócone",
            "",
            "&rCzyli: obraca byty o 180 stopni");
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack(
            "TOME_OF_KNOWLEDGE_SHARING",
            Material.ENCHANTED_BOOK,
            "&6Tom Dzielenia Wiedzy",
            "&7Właściciel: &bBrak",
            "",
            "&ePPM&7 aby przypisać swoje badania",
            "",
            "",
            "&ePPM&7 aby zyskać badania poprzedniego właściciela");
    public static final SlimefunItemStack HARDENED_GLASS =
            new SlimefunItemStack("HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "&7Hartowane Szkło", "", "&rOdporne na wybuchy");
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN =
            new SlimefunItemStack("WITHER_PROOF_OBSIDIAN", Material.OBSIDIAN, "&5Witheroodporny Obsydian", "", "&rOdporny na wybuchy i", "&rataki Withera");
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack(
            "WITHER_PROOF_GLASS", Material.PURPLE_STAINED_GLASS, "&5Witheroodporne Szkło", "", "&rOdporne na wybuchy i", "&rataki Withera");
    public static final SlimefunItemStack REINFORCED_PLATE =
            new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "&7Wzmocniona Płyta");
    public static final SlimefunItemStack ANCIENT_PEDESTAL =
            new SlimefunItemStack("ANCIENT_PEDESTAL", Material.DISPENSER, "&dStarożytny Piedestał", "", "&5Część Starożytnego Ołtarza");
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack(
            "ANCIENT_ALTAR", Material.ENCHANTING_TABLE, "&dStarożytny Ołtarz", "", "&5Zbuduj ołtarz w świecie", "&5i twórz przedmioty starożytnym rytuałem");
    public static final SlimefunItemStack COPPER_WIRE =
            new SlimefunItemStack("COPPER_WIRE", Material.STRING, "&6Miedziany Drut", "", "&6Ważny element elektroniki");
    public static final SlimefunItemStack CRAFTING_MOTOR =
            new SlimefunItemStack("CRAFTING_MOTOR", HeadTexture.CRAFTING_MOTOR, "&6Silnik Rzemieślniczy", "", "&7Ważny element Automatycznego Stołu");

    public static final SlimefunItemStack RAINBOW_WOOL =
            new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "&5Tęczowa Wełna", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS =
            new SlimefunItemStack("RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "&5Tęczowe Szkło", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CLAY =
            new SlimefunItemStack("RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "&5Tęczowa Glina", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "&5Tęczowa Szyba", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CONCRETE =
            new SlimefunItemStack("RAINBOW_CONCRETE", Material.WHITE_CONCRETE, "&5Tęczowy Beton", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA", Material.WHITE_GLAZED_TERRACOTTA, "&5Tęczowa Glazurowana Terakota", "", LoreBuilder.RAINBOW);

    private static final String CHRISTMAS = ChatUtils.christmas("< Edycja Świąteczna >");

    public static final SlimefunItemStack RAINBOW_WOOL_XMAS =
            new SlimefunItemStack("RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "&5Tęczowa Wełna &7(Edycja Świąteczna)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS =
            new SlimefunItemStack("RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "&5Tęczowe Szkło &7(Edycja Świąteczna)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS =
            new SlimefunItemStack("RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "&5Tęczowa Glina &7(Edycja Świąteczna)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_XMAS", Material.WHITE_STAINED_GLASS_PANE, "&5Tęczowa Szyba &7(Edycja Świąteczna)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS =
            new SlimefunItemStack("RAINBOW_CONCRETE_XMAS", Material.WHITE_CONCRETE, "&5Tęczowy Beton &7(Edycja Świąteczna)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_XMAS", Material.WHITE_GLAZED_TERRACOTTA, "&5Tęczowa Glazurowana Terakota &7(Edycja Świąteczna)", "", CHRISTMAS);

    private static final String VALENTINES_DAY = "&d< Edycja Walentynkowa >";

    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE =
            new SlimefunItemStack("RAINBOW_WOOL_VALENTINE", Material.PINK_WOOL, "&5Tęczowa Wełna &7(Edycja Walentynkowa)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_VALENTINE", Material.PINK_STAINED_GLASS, "&5Tęczowe Szkło &7(Edycja Walentynkowa)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CLAY_VALENTINE", Material.PINK_TERRACOTTA, "&5Tęczowa Glina &7(Edycja Walentynkowa)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_VALENTINE", Material.PINK_STAINED_GLASS_PANE, "&5Tęczowa Szyba &7(Edycja Walentynkowa)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CONCRETE_VALENTINE", Material.PINK_CONCRETE, "&5Tęczowy Beton &7(Edycja Walentynkowa)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_VALENTINE",
            Material.PINK_GLAZED_TERRACOTTA,
            "&5Tęczowa Glazurowana Terakota &7(Edycja Walentynkowa)",
            "",
            VALENTINES_DAY);

    private static final String HALLOWEEN = "&6< Edycja Halloween >";

    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN =
            new SlimefunItemStack("RAINBOW_WOOL_HALLOWEEN", Material.ORANGE_WOOL, "&5Tęczowa Wełna &7(Edycja Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_HALLOWEEN", Material.ORANGE_STAINED_GLASS, "&5Tęczowe Szkło &7(Edycja Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CLAY_HALLOWEEN", Material.ORANGE_TERRACOTTA, "&5Tęczowa Glina &7(Edycja Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_HALLOWEEN", Material.ORANGE_STAINED_GLASS_PANE, "&5Tęczowa Szyba &7(Edycja Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CONCRETE_HALLOWEEN", Material.ORANGE_CONCRETE, "&5Tęczowy Beton &7(Edycja Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN",
            Material.ORANGE_GLAZED_TERRACOTTA,
            "&5Tęczowa Glazurowana Terakota &7(Edycja Halloween)",
            "",
            HALLOWEEN);

    /*		锭 		*/
    public static final SlimefunItemStack COPPER_INGOT = new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "&bSztabka Miedzi");
    public static final SlimefunItemStack TIN_INGOT = new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "&bSztabka Cyny");
    public static final SlimefunItemStack SILVER_INGOT =
            new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "&bSztabka Srebra");
    public static final SlimefunItemStack ALUMINUM_INGOT =
            new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "&bSztabka Aluminium");
    public static final SlimefunItemStack LEAD_INGOT = new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "&bSztabka Ołowiu");
    public static final SlimefunItemStack ZINC_INGOT = new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "&bSztabka Cynku");
    public static final SlimefunItemStack MAGNESIUM_INGOT =
            new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "&bSztabka Magnezu");

    /*		Alloy (Carbon + Iron)	*/
    public static final SlimefunItemStack STEEL_INGOT =
            new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "&bSztabka Stali");
    /*		Alloy (Copper + Tin)	*/
    public static final SlimefunItemStack BRONZE_INGOT = new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "&bSztabka Brązu");
    /*		Alloy (Copper + Aluminum)	*/
    public static final SlimefunItemStack DURALUMIN_INGOT =
            new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "&bSztabka Duraluminium");
    /*		Alloy (Copper + Silver)	*/
    public static final SlimefunItemStack BILLON_INGOT =
            new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "&bSztabka Bilonu");
    /*		Alloy (Copper + Zinc)	*/
    public static final SlimefunItemStack BRASS_INGOT =
            new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "&bSztabka Mosiądzu");
    /*		Alloy (Aluminum + Brass)	*/
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT =
            new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "&bSztabka Aluminium-Mosiądz");
    /*		Alloy (Aluminum + Bronze)	*/
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT =
            new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "&bSztabka Aluminium-Brąz");
    /*		Alloy (Gold + Silver + Copper)	*/
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT =
            new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "&bSztabka Brązu Korynckiego");
    /*		Alloy (Lead + Tin)	*/
    public static final SlimefunItemStack SOLDER_INGOT =
            new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "&bSztabka Lutowia");
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT =
            new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "&bSztabka Stali Damasceńskiej");
    /*		Alloy (大马士革钢 + 硬铝 + Compressed Carbon + Aluminium Bronze)	*/
    public static final SlimefunItemStack HARDENED_METAL_INGOT =
            new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "&b&lSztabka Utwardzonego Metalu");
    /*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + 大马士革钢)	*/
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT =
            new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "&b&lSztabka Wzmocnionego Stopu");
    /*		Alloy (Iron + Silicon)		*/
    public static final SlimefunItemStack FERROSILICON =
            new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "&bŻelazokrzem");
    /*		Alloy (Iron + Gold)			*/
    public static final SlimefunItemStack GILDED_IRON =
            new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "&6&lPozłacane Żelazo");
    /*		Alloy (Redstone + Ferrosilicon)	*/
    public static final SlimefunItemStack REDSTONE_ALLOY =
            new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "&cStop Redstone");
    /*		Alloy (Iron + Copper)		*/
    public static final SlimefunItemStack NICKEL_INGOT =
            new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "&bSztabka Niklu");
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static final SlimefunItemStack COBALT_INGOT =
            new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "&9Sztabka Kobaltu");

    /*		Gold		*/
    public static final SlimefunItemStack GOLD_4K =
            new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "&rSztabka Złota &7(4 Karaty)");
    public static final SlimefunItemStack GOLD_6K =
            new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "&rSztabka Złota &7(6 Karatów)");
    public static final SlimefunItemStack GOLD_8K =
            new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "&rSztabka Złota &7(8 Karatów)");
    public static final SlimefunItemStack GOLD_10K =
            new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "&rSztabka Złota &7(10 Karatów)");
    public static final SlimefunItemStack GOLD_12K =
            new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "&rSztabka Złota &7(12 Karatów)");
    public static final SlimefunItemStack GOLD_14K =
            new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "&rSztabka Złota &7(14 Karatów)");
    public static final SlimefunItemStack GOLD_16K =
            new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "&rSztabka Złota &7(16 Karatów)");
    public static final SlimefunItemStack GOLD_18K =
            new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "&rSztabka Złota &7(18 Karatów)");
    public static final SlimefunItemStack GOLD_20K =
            new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "&rSztabka Złota &7(20 Karatów)");
    public static final SlimefunItemStack GOLD_22K =
            new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "&rSztabka Złota &7(22 Karaty)");
    public static final SlimefunItemStack GOLD_24K =
            new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "&rSztabka Złota &7(24 Karaty)");

    /*		 Dusts 		*/
    public static final SlimefunItemStack IRON_DUST = new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "&6Pył Żelazny");
    public static final SlimefunItemStack GOLD_DUST =
            new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "&6Pył Złoty");
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "&6Pył Cynowy");
    public static final SlimefunItemStack COPPER_DUST =
            new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "&6Pył Miedziany");
    public static final SlimefunItemStack SILVER_DUST = new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "&6Pył Srebrny");
    public static final SlimefunItemStack ALUMINUM_DUST =
            new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "&6Pył Aluminiowy");
    public static final SlimefunItemStack LEAD_DUST = new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "&6Pył Ołowiany");
    public static final SlimefunItemStack SULFATE = new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "&6Siarczan");
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "&6Pył Cynkowy");
    public static final SlimefunItemStack MAGNESIUM_DUST =
            new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "&6Pył Magnezowy");
    public static final SlimefunItemStack SILICON = new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "&6Krzem");
    public static final SlimefunItemStack GOLD_24K_BLOCK =
            new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "&r&rBlok Złota &7(24 Karaty)");

    /*		 Gems 		*/
    public static final SlimefunItemStack SYNTHETIC_DIAMOND =
            new SlimefunItemStack("SYNTHETIC_DIAMOND", Material.DIAMOND, "&bSyntetyczny Diament", "", "&rMoże być używany w craftingu jako diament");
    public static final SlimefunItemStack SYNTHETIC_EMERALD =
            new SlimefunItemStack("SYNTHETIC_EMERALD", Material.EMERALD, "&bSyntetyczny Szmaragd", "", "&rMożna nim handlować z wieśniakami");
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE =
            new SlimefunItemStack("SYNTHETIC_SAPPHIRE", HeadTexture.SAPPHIRE, "&bSyntetyczny Szafir", "", "&rMoże być używany w craftingu jako lazuryt");
    public static final SlimefunItemStack CARBONADO =
            new SlimefunItemStack("CARBONADO", HeadTexture.CARBONADO, "&b&lCarbonado", "", "&7&o\"Czarny Diament\"");
    public static final SlimefunItemStack RAW_CARBONADO =
            new SlimefunItemStack("RAW_CARBONADO", HeadTexture.RAW_CARBONADO, "&bSurowe Carbonado");

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack(
            "URANIUM",
            HeadTexture.URANIUM,
            "&4Uran",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack(
            "NEPTUNIUM",
            HeadTexture.NEPTUNIUM,
            "&aNeptun",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack(
            "PLUTONIUM",
            HeadTexture.PLUTONIUM,
            "&7Pluton",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack(
            "BOOSTED_URANIUM",
            HeadTexture.BOOSTED_URANIUM,
            "&2Paliwo MOX",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    /*		Talisman		*/
    public static final SlimefunItemStack COMMON_TALISMAN =
            new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "&6Zwykły Talizman");
    public static final SlimefunItemStack ENDER_TALISMAN =
            new SlimefunItemStack("ENDER_TALISMAN", Material.EMERALD, "&5Talizman Endu");

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack(
            "ANVIL_TALISMAN",
            Material.EMERALD,
            "&aTalizman Kowadła",
            "",
            "&fKażdy talizman zapobiega",
            "&fzniszczeniu jednego narzędzia",
            "&f(Zużywa się po użyciu)",
            "",
            "&4&lOstrzeżenie:",
            "&4Ze względu na złożoność",
            "&4nie działa na potężne narzędzia");
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack(
            "MINER_TALISMAN", Material.EMERALD, "&aTalizman Górnika", "", "&fGdy masz go w ekwipunku", "&fjest 20% szans na podwójny drop", "&fwykopanych minerałów");
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack(
            "FARMER_TALISMAN", Material.EMERALD, "&aTalizman Farmera", "", "&fGdy masz go w ekwipunku", "&fjest 20% szans na podwójny drop", "&fzebranych plonów");
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack(
            "HUNTER_TALISMAN", Material.EMERALD, "&aTalizman Łowcy", "", "&fGdy masz go w ekwipunku", "&fjest 20% szans na podwójny drop", "&flootu z zabitych mobów");
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack(
            "LAVA_TALISMAN",
            Material.EMERALD,
            "&aTalizman Chodzenia po Lawie",
            "",
            "&fGdy masz go w ekwipunku",
            "&fZyskujesz odporność na ogień",
            "&fgdy chodzisz po lawie",
            "&f(Zużywa się po użyciu)");
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack(
            "WATER_TALISMAN",
            Material.EMERALD,
            "&aTalizman Nurka",
            "",
            "&fGdy masz go w ekwipunku",
            "&fGdy zaczynasz tonąć",
            "&fdaje oddychanie pod wodą",
            "&f(Zużywa się po użyciu)");
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack(
            "ANGEL_TALISMAN", Material.EMERALD, "&aTalizman Anioła", "", "&fGdy masz go w ekwipunku", "&f75% szans na uniknięcie obrażeń od upadku");
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack(
            "FIRE_TALISMAN", Material.EMERALD, "&aTalizman Strażaka", "", "&fGdy masz go w ekwipunku", "&fGdy płoniesz", "&fdaje odporność na ogień", "&f(Zużywa się po użyciu)");
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack(
            "MAGICIAN_TALISMAN", Material.EMERALD, "&aTalizman Maga", "", "&fGdy masz go w ekwipunku", "&fPodczas zaklinania jest 80% szans", "&fna dodatkowe zaklęcie");
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack(
            "TRAVELLER_TALISMAN",
            Material.EMERALD,
            "&aTalizman Podróżnika",
            "",
            "&fGdy masz go w ekwipunku",
            "&fPodczas sprintu jest 60% szans",
            "&fna efekt szybkości");
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack(
            "WARRIOR_TALISMAN", Material.EMERALD, "&aTalizman Wojownika", "", "&fGdy masz go w ekwipunku", "&fPo ataku otrzymujesz Siłę III", "&f(Zużywa się po użyciu)");
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack(
            "KNIGHT_TALISMAN",
            Material.EMERALD,
            "&aTalizman Rycerza",
            "",
            "&fGdy masz go w ekwipunku",
            "&fPo ataku",
            "&f30% szans na 5s Regeneracji",
            "&f(Zużywa się po użyciu)");
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack(
            "WHIRLWIND_TALISMAN", Material.EMERALD, "&aTalizman Wiatru", "", "&fGdy masz go w ekwipunku", "&fjest 60% szans", "&fna odbicie pocisków");
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack(
            "WIZARD_TALISMAN",
            Material.EMERALD,
            "&aTalizman Czarnoksiężnika",
            "",
            "&fGdy masz go w ekwipunku",
            "&fMoże dać Szczęście IV/V przy zaklinaniu",
            "&fale może też obniżyć",
            "&fpoziom innych zaklęć");
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack(
            "CAVEMAN_TALISMAN", Material.EMERALD, "&aTalizman Jaskiniowca", "", "&fGdy masz go w ekwipunku", "&fPodczas kopania 50% szans", "&fna efekt Pośpiechu");
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack(
            "WISE_TALISMAN", Material.EMERALD, "&aTalizman Mędrca", "", "&fGdy masz go w ekwipunku", "&f20% szans na podwójne XP");

    /*		Staves		*/
    public static final SlimefunItemStack STAFF_ELEMENTAL =
            new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "&6Kostur Żywiołów");
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WIND", Material.STICK, "&6Kostur Żywiołów &7- &b&oWiatr", "", "&7Żywioł: &b&oWiatr", "", "&7&ePPM&7 aby cię wystrzelić");
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack(
            "STAFF_ELEMENTAL_FIRE", Material.STICK, "&6Kostur Żywiołów &7- &c&oOgień", "", "&7Żywioł: &c&oOgień", "", "&cOczyść wszystko ogniem!");
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WATER", Material.STICK, "&6Kostur Żywiołów &7- &1&oWoda", "", "&7Żywioł: &1&oWoda", "", "&7&ePPM&7 aby ugasić ogień");
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack(
            "STAFF_ELEMENTAL_STORM",
            Material.STICK,
            "&6Kostur Żywiołów &7- &8&oPiorun",
            "",
            "&7Żywioł: &8&oPiorun",
            "",
            "&ePPM&7 przyzwij błyskawicę",
            LoreBuilder.usesLeft(StormStaff.MAX_USES));

    static {
        STAFF_WIND.addUnsafeEnchantment(VersionedEnchantment.LUCK_OF_THE_SEA, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(VersionedEnchantment.AQUA_AFFINITY, 1);
        STAFF_STORM.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 1);
    }

    /*		 Machines 		*/
    public static final SlimefunItemStack GRIND_STONE =
            new SlimefunItemStack("GRIND_STONE", Material.DISPENSER, "&bKamień Szlifierski", "", "&a&oMieli przedmioty na pył");
    public static final SlimefunItemStack ARMOR_FORGE =
            new SlimefunItemStack("ARMOR_FORGE", Material.ANVIL, "&6Kuźnia Zbroi", "", "&a&oUżywana do tworzenia zaawansowanych zbroi");
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack(
            "MAKESHIFT_SMELTERY", Material.BLAST_FURNACE, "&eProwizoryczna Huta", "", "&rUproszczona wersja huty", "&rPrzetapia tylko pył na sztabki");
    public static final SlimefunItemStack SMELTERY =
            new SlimefunItemStack("SMELTERY", Material.FURNACE, "&6Huta", "", "&aDziała jak zaawansowany piec");
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack(
            "IGNITION_CHAMBER", Material.DROPPER, "&4Komora Zapłonowa", "&rAby huta nie zgasła", "&rWłóż zapalniczkę do środka", "&ri postaw obok dozownika huty");
    public static final SlimefunItemStack ORE_CRUSHER =
            new SlimefunItemStack("ORE_CRUSHER", Material.DISPENSER, "&bKruszarka Rud", "", "&a&oKruszy rudy i podwaja urobek");
    public static final SlimefunItemStack COMPRESSOR =
            new SlimefunItemStack("COMPRESSOR", Material.PISTON, "&bKompresor", "", "&aKompresuje przedmioty");
    public static final SlimefunItemStack PRESSURE_CHAMBER =
            new SlimefunItemStack("PRESSURE_CHAMBER", Material.GLASS, "&bKomora Ciśnieniowa", "", "&aKompresuje więcej przedmiotów");
    public static final SlimefunItemStack MAGIC_WORKBENCH =
            new SlimefunItemStack("MAGIC_WORKBENCH", Material.CRAFTING_TABLE, "&6Magiczny Stół", "", "&dUżywany do tworzenia magicznych przedmiotów");
    public static final SlimefunItemStack ORE_WASHER =
            new SlimefunItemStack("ORE_WASHER", Material.CAULDRON, "&6Płuczka Rud", "", "&a&oWypłukuje pył z przesianej rudy", "&a&oi daje kamyki");
    public static final SlimefunItemStack TABLE_SAW =
            new SlimefunItemStack("TABLE_SAW", Material.STONECUTTER, "&6Piła Stołowa", "", "&a&oDaje 8 desek z 1 kłody", "&a&o(Obsługuje wszystkie drewno)");
    ;
    public static final SlimefunItemStack COMPOSTER =
            new SlimefunItemStack("COMPOSTER", Material.CAULDRON, "&aKompostownik", "", "&a&oZamienia materiały organiczne w czasie...");
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
            "ENHANCED_CRAFTING_TABLE", Material.CRAFTING_TABLE, "&eUlepszony Stół Rzemieślniczy", "", "&a&oPrymitywny stół", "&a&oniezdolny do utrzymania wielkiej mocy...");
    public static final SlimefunItemStack CRUCIBLE =
            new SlimefunItemStack("CRUCIBLE", Material.CAULDRON, "&cTygiel", "", "&a&oTopi przedmioty na ciecz");
    public static final SlimefunItemStack JUICER =
            new SlimefunItemStack("JUICER", Material.GLASS_BOTTLE, "&aSokowirówka", "", "&aWyciska pyszne soki");

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack(
            "INDUSTRIAL_MINER",
            Material.GOLDEN_PICKAXE,
            "&bGórnik Przemysłowy",
            "",
            "&rWydobywa wszystkie rudy w obszarze 7x7",
            "&rponiżej maszyny.",
            "&rWłóż węgiel lub inne paliwo",
            "&rdo skrzyni maszyny aby działała.");
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack(
            "ADVANCED_INDUSTRIAL_MINER",
            Material.DIAMOND_PICKAXE,
            "&cZaawansowany Górnik Przemysłowy",
            "",
            "&rWydobywa wszystkie rudy w obszarze 11x11",
            "&rponiżej maszyny.",
            "&rWłóż paliwo płynne lub lawę do skrzyni",
            "&raby działała.",
            "",
            "&a+ Jedwabny Dotyk");

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    public static final SlimefunItemStack SOLAR_PANEL =
            new SlimefunItemStack("SOLAR_PANEL", Material.DAYLIGHT_DETECTOR, "&bOgniwo Fotowoltaiczne", "", "&7Ważny element &bPanelu Solarnego");

    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE =
            new SlimefunItemStack("AUTOMATED_PANNING_MACHINE", Material.BOWL, "&aAutomatyczna Misa", "", "&a&oUlepszona wersja Misy");
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack(
            "OUTPUT_CHEST", Material.CHEST, "&4Skrzynia Wyjściowa", "", "&c&oPostaw obok dozownika maszyny", "&c&oProdukty trafią do tej skrzyni");
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR =
            new SlimefunItemStack("HOLOGRAM_PROJECTOR", Material.QUARTZ_SLAB, "&bProjektor Hologramów", "", "&rWyświetla edytowalny tekst holograficzny");

    /*		 Enhanced Furnaces 		*/
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack(
            "ENHANCED_FURNACE", Material.FURNACE, "&7Ulepszony Piec - &eI", "", "&7Prędkość: &e1x", "&7Wydajność paliwa: &e1x", "&7Szansa na podwojenie: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack(
            "ENHANCED_FURNACE_2",
            Material.FURNACE,
            "&7Ulepszony Piec - &eII",
            "",
            "&7Prędkość: &e2x",
            "&7Wydajność paliwa: &e1x",
            "&7Szansa na podwojenie: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack(
            "ENHANCED_FURNACE_3",
            Material.FURNACE,
            "&7Ulepszony Piec - &eIII",
            "",
            "&7Prędkość: &e2x",
            "&7Wydajność paliwa: &e2x",
            "&7Szansa na podwojenie: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack(
            "ENHANCED_FURNACE_4",
            Material.FURNACE,
            "&7Ulepszony Piec - &eIV",
            "",
            "&7Prędkość: &e3x",
            "&7Wydajność paliwa: &e2x",
            "&7Szansa na podwojenie: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack(
            "ENHANCED_FURNACE_5",
            Material.FURNACE,
            "&7Ulepszony Piec - &eV",
            "",
            "&7Prędkość: &e3x",
            "&7Wydajność paliwa: &e2x",
            "&7Szansa na podwojenie: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack(
            "ENHANCED_FURNACE_6",
            Material.FURNACE,
            "&7Ulepszony Piec - &eVI",
            "",
            "&7Prędkość: &e3x",
            "&7Wydajność paliwa: &e3x",
            "&7Szansa na podwojenie: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack(
            "ENHANCED_FURNACE_7",
            Material.FURNACE,
            "&7Ulepszony Piec - &eVII",
            "",
            "&7Prędkość: &e4x",
            "&7Wydajność paliwa: &e3x",
            "&7Szansa na podwojenie: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack(
            "ENHANCED_FURNACE_8",
            Material.FURNACE,
            "&7Ulepszony Piec - &eVIII",
            "",
            "&7Prędkość: &e4x",
            "&7Wydajność paliwa: &e4x",
            "&7Szansa na podwojenie: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack(
            "ENHANCED_FURNACE_9",
            Material.FURNACE,
            "&7Ulepszony Piec - &eIX",
            "",
            "&7Prędkość: &e5x",
            "&7Wydajność paliwa: &e4x",
            "&7Szansa na podwojenie: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack(
            "ENHANCED_FURNACE_10",
            Material.FURNACE,
            "&7Ulepszony Piec - &eX",
            "",
            "&7Prędkość: &e5x",
            "&7Wydajność paliwa: &e5x",
            "&7Szansa na podwojenie: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack(
            "ENHANCED_FURNACE_11",
            Material.FURNACE,
            "&7Ulepszony Piec - &eXI",
            "",
            "&7Prędkość: &e5x",
            "&7Wydajność paliwa: &e5x",
            "&7Szansa na podwojenie: &e3x");
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack(
            "REINFORCED_FURNACE", Material.FURNACE, "&7Wzmocniony Piec Stopowy", "", "&7Prędkość: &e10x", "&7Wydajność paliwa: &e10x", "&7Szansa na podwojenie: &e3x");
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack(
            "CARBONADO_EDGED_FURNACE",
            Material.FURNACE,
            "&7Piec z Krawędziami Carbonado",
            "",
            "&7Prędkość: &e20x",
            "&7Wydajność paliwa: &e10x",
            "&7Szansa na podwojenie: &e3x");

    public static final SlimefunItemStack BLOCK_PLACER =
            new SlimefunItemStack("BLOCK_PLACER", Material.DISPENSER, "&aStawiacz Bloków", "", "&rWszystkie bloki w tym dozowniku", "&rzostaną automatycznie postawione");

    /*		Soulbound Items		*/
    public static final SlimefunItemStack SOULBOUND_SWORD =
            new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "&cMiecz (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_BOW =
            new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "&cŁuk (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_PICKAXE =
            new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "&cKilof (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_AXE =
            new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "&cSiekiera (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_SHOVEL =
            new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "&cŁopata (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_HOE =
            new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "&cMotyka (Duszo-splot)");

    public static final SlimefunItemStack SOULBOUND_HELMET =
            new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "&cHełm (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE =
            new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&cNapierśnik (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_LEGGINGS =
            new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&cNogawice (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_BOOTS =
            new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "&cButy (Duszo-splot)");
    public static final SlimefunItemStack SOULBOUND_TRIDENT =
            new SlimefunItemStack("SOULBOUND_TRIDENT", Material.TRIDENT, "&cTrójząb (Duszo-splot)");

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE =
            new SlimefunItemStack("BLANK_RUNE", new ColoredFireworkStar(Color.BLACK, "&8Pusta Runa"));

    public static final SlimefunItemStack AIR_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_AIR", new ColoredFireworkStar(Color.AQUA, "&7Starożytna Runa &8&l[&b&lPowietrze&8&l]"));
    public static final SlimefunItemStack WATER_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_WATER", new ColoredFireworkStar(Color.BLUE, "&7Starożytna Runa &8&l[&1&lWoda&8&l]"));
    public static final SlimefunItemStack FIRE_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_FIRE", new ColoredFireworkStar(Color.RED, "&7Starożytna Runa &8&l[&4&lOgień&8&l]"));
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_EARTH", new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "&7Starożytna Runa &8&l[&c&lZiemia&8&l]"));
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENDER", new ColoredFireworkStar(Color.PURPLE, "&7Starożytna Runa &8&l[&5&lEnder&8&l]"));

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_RAINBOW", new ColoredFireworkStar(Color.FUCHSIA, "&7Starożytna Runa &8&l[&d&lTęcza&8&l]"));
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_LIGHTNING", new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "&7Starożytna Runa &8&l[&e&lPiorun&8&l]"));
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_SOULBOUND",
            new ColoredFireworkStar(
                    Color.fromRGB(47, 0, 117),
                    "&7Starożytna Runa &8&l[&5&lDuszo-splot&8&l]",
                    "&eNajpierw rzuć przedmiot na ziemię",
                    "&enastępnie rzuć runę na ten przedmiot",
                    "&5aby nadać &eDuszo-splot.",
                    " ",
                    "&eZalecane dla &6ważnych &eprzedmiotów.",
                    " ",
                    "&ePrzedmiot nie wypadnie po śmierci."));
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENCHANTMENT",
            new ColoredFireworkStar(
                    Color.fromRGB(255, 217, 25),
                    "&7Starożytna Runa &8&l[&6&lZaklinanie&8&l]",
                    "&eRzuć runę na wyrzucony przedmiot",
                    "&ektóry chcesz &6zakląć",
                    "&eOtrzyma on losowe zaklęcie."));
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_VILLAGERS",
            new ColoredFireworkStar(
                    Color.fromRGB(160, 20, 5),
                    "&7Starożytna Runa &8&l[&4&lWieśniak&8&l]",
                    "&eKliknij PPM na wieśniaka",
                    "&eaby zresetować jego zawód.",
                    "&eWieśniak poszuka nowej pracy",
                    "&epo pewnym czasie."));

    /*		Electricity			*/
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack(
            "SOLAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&bGenerator Solarny",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "SOLAR_GENERATOR_2",
            Material.DAYLIGHT_DETECTOR,
            "&cZaawansowany Generator Solarny",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "SOLAR_GENERATOR_3",
            Material.DAYLIGHT_DETECTOR,
            "&4Generator Solarny Carbonado",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64));
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "SOLAR_GENERATOR_4",
            Material.DAYLIGHT_DETECTOR,
            "&eWzmocniony Generator Solarny",
            "",
            "&9Działa w nocy",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256),
            " (Dzień)",
            LoreBuilder.powerPerSecond(128),
            " (Noc)");

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack(
            "COAL_GENERATOR",
            HeadTexture.GENERATOR,
            "&cGenerator Węglowy",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack(
            "COAL_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&cGenerator Węglowy &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack(
            "LAVA_GENERATOR",
            HeadTexture.GENERATOR,
            "&4Generator Lawowy",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack(
            "LAVA_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&4Generator Lawowy &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack(
            "ELECTRIC_FURNACE",
            Material.FURNACE,
            "&cPiec Elektryczny",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_2",
            Material.FURNACE,
            "&cPiec Elektryczny &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 2x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_3",
            Material.FURNACE,
            "&cPiec Elektryczny &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 4x",
            LoreBuilder.powerPerSecond(10));

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER",
            Material.FURNACE,
            "&cElektryczny Młynek",
            "",
            "&rMieli przedmioty na pył",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(12));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_2",
            Material.FURNACE,
            "&cElektryczny Młynek &7(&eII&7)",
            "",
            "&rMieli przedmioty na pył",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 4x",
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_3",
            Material.FURNACE,
            "&cElektryczny Młynek &7(&eIII&7)",
            "",
            "&fMieli przedmioty na pył",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilder.powerPerSecond(90));
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack(
            "ELECTRIC_INGOT_PULVERIZER",
            Material.FURNACE,
            "&cElektryczna Kruszarka Sztabek",
            "",
            "&rZamienia sztabki w pył",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack(
            "AUTO_DRIER",
            Material.SMOKER,
            "&eAutomatyczna Suszarka",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack(
            "AUTO_ENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Automatyczny Zaklinacz",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack(
            "AUTO_ENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Automatyczny Zaklinacz &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack(
            "AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Automatyczny Odczarowywacz",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack(
            "AUTO_DISENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Automatyczny Odczarowywacz &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack(
            "AUTO_ANVIL",
            Material.IRON_BLOCK,
            "&7Automatyczne Kowadło",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Naprawa: 10%",
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack(
            "AUTO_ANVIL_2",
            Material.IRON_BLOCK,
            "&7Automatyczne Kowadło Mk.II",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Naprawa: 25%",
            LoreBuilder.powerPerSecond(32));
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack(
            "AUTO_BREWER",
            Material.SMOKER,
            "&eAutomatyczny Statyw Alchemiczny",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(12));

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack(
            "BOOK_BINDER",
            Material.BOOKSHELF,
            "&6Introligator",
            "",
            "&fŁączy wiele zaklętych książek w jedną.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16));

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack(
            "BIO_REACTOR",
            Material.LIME_TERRACOTTA,
            "&2Bio Reaktor",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7128 J Bufor",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack MULTIMETER =
            new SlimefunItemStack("MULTIMETER", Material.CLOCK, "&eMultimetr", "", "&rSprawdź energię w maszynie");

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack(
            "SMALL_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aMały Kondensator",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR),
            "&8\u21E8 &e\u26A1 &7128 J Bufor");
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack(
            "MEDIUM_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aŚredni Kondensator",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(512));
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack(
            "BIG_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aDuży Kondensator",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(1024));
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack(
            "LARGE_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aOgromny Kondensator",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(8192));
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack(
            "CARBONADO_EDGED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aKondensator Carbonado",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(65536));
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "ENERGIZED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aEnergetyczny Kondensator",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(524288));

    /*		Robots				*/
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cProgramowalny Android &7(Normalny)",
            "",
            "&8\u21E8 &7Funkcja: Brak",
            "&8\u21E8 &7Wydajność paliwa: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cProgramowalny Android &7(Farmer)",
            "",
            "&8\u21E8 &7Funkcja: Farmer",
            "&8\u21E8 &7Wydajność paliwa: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_MINER",
            HeadTexture.PROGRAMMABLE_ANDROID_MINER,
            "&cProgramowalny Android &7(Górnik)",
            "",
            "&8\u21E8 &7Funkcja: Górnik",
            "&8\u21E8 &7Wydajność paliwa: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_WOODCUTTER",
            HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER,
            "&cProgramowalny Android &7(Drwal)",
            "",
            "&8\u21E8 &7Funkcja: Drwal",
            "&8\u21E8 &7Wydajność paliwa: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cProgramowalny Android &7(Rzeźnik)",
            "",
            "&8\u21E8 &7Funkcja: Rzeźnik",
            "&8\u21E8 &7Obrażenia: 4",
            "&8\u21E8 &7Wydajność paliwa: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cProgramowalny Android &7(Rybak)",
            "",
            "&8\u21E8 &7Funkcja: Rybak",
            "&8\u21E8 &7Szansa: 10%",
            "&8\u21E8 &7Wydajność paliwa: 1.0x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cProgramowalny Android &7(Zaawansowany)",
            "",
            "&8\u21E8 &7Funkcja: Brak",
            "&8\u21E8 &7Wydajność paliwa: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cProgramowalny Android &7(Rybak)",
            "",
            "&8\u21E8 &7Funkcja: Rybak",
            "&8\u21E8 &7Szansa: 20%",
            "&8\u21E8 &7Wydajność paliwa: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cProgramowalny Android &7(Farmer)",
            "",
            "&8\u21E8 &7Funkcja: Farmer",
            "&8\u21E8 &7Wydajność paliwa: 1.5x",
            "&8\u21E8 &7Może zbierać rośliny z Exotic Garden");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cProgramowalny Android &7(Rzeźnik)",
            "",
            "&8\u21E8 &7Funkcja: Rzeźnik",
            "&8\u21E8 &7Obrażenia: 8",
            "&8\u21E8 &7Wydajność paliwa: 1.5x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&eWzocniony Android &7(Normalny)",
            "",
            "&8\u21E8 &7Funkcja: Brak",
            "&8\u21E8 &7Wydajność paliwa: 3.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&eWzocniony Android &7(Rybak)",
            "",
            "&8\u21E8 &7Funkcja: Rybak",
            "&8\u21E8 &7Szansa: 30%",
            "&8\u21E8 &7Wydajność paliwa: 8.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&eWzocniony Android &7(Rzeźnik)",
            "",
            "&8\u21E8 &7Funkcja: Rzeźnik",
            "&8\u21E8 &7Obrażenia: 20",
            "&8\u21E8 &7Wydajność paliwa: 8.0x");

    /*		       GPS		       */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack(
            "GPS_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&bNadajnik GPS",
            "",
            LoreBuilder.powerBuffer(16),
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack(
            "GPS_TRANSMITTER_2",
            HeadTexture.GPS_TRANSMITTER,
            "&cZaawansowany Nadajnik GPS",
            "",
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack(
            "GPS_TRANSMITTER_3",
            HeadTexture.GPS_TRANSMITTER,
            "&4Nadajnik GPS Carbonado",
            "",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(22));
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack(
            "GPS_TRANSMITTER_4",
            HeadTexture.GPS_TRANSMITTER,
            "&eEnergetyczny Nadajnik GPS",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(92));

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack(
            "GPS_MARKER_TOOL", Material.REDSTONE_TORCH, "&bNarzędzie Znacznika GPS", "", "&rPozwala ustawić punkt trasy", "&rw miejscu postawienia");
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack(
            "GPS_CONTROL_PANEL", HeadTexture.GPS_CONTROL_PANEL, "&bPanel Kontrolny GPS", "", "&rPozwala śledzić satelity GPS", "&roraz zarządzać punktami trasy");
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack(
            "GPS_EMERGENCY_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&cAwaryjny Nadajnik GPS",
            "",
            "&rGdy zginiesz",
            "&rjeśli masz go w ekwipunku",
            "&rautomatycznie zapisze miejsce śmierci jako punkt trasy");

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack(
            "ANDROID_INTERFACE_FUEL",
            Material.DISPENSER,
            "&7Interfejs Androida &c(Paliwo)",
            "",
            "&rGdy skrypt na to pozwoli",
            "&rprzedmioty w tym interfejsie",
            "&rtrafią do paliwa robota");
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack(
            "ANDROID_INTERFACE_ITEMS",
            Material.DISPENSER,
            "&7Interfejs Androida &9(Przedmioty)",
            "",
            "&rGdy skrypt na to pozwoli",
            "&rprzedmioty z ekwipunku robota",
            "&rtrafią do tego interfejsu");

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack(
            "GPS_GEO_SCANNER", HeadTexture.GEO_SCANNER, "&bSkaner Geologiczny GPS", "", "&rSkanuje zasoby naturalne w chunku", "&rnp. &8Ropę");
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack(
            "PORTABLE_GEO_SCANNER", Material.CLOCK, "&bPrzenośny Skaner Geologiczny", "", "&rSkanuje zasoby naturalne w chunku", "", "&ePPM&7 aby zeskanować");
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack(
            "GEO_MINER",
            HeadTexture.GEO_MINER,
            "&6Górnik Geologiczny",
            "",
            "&eWydobywa zasoby z chunku",
            "&eMoże wydobyć to czego kilof nie może",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            "&c&l! &cUpewnij się że zeskanowałeś chunk");
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack(
            "OIL_PUMP", HeadTexture.OIL_PUMP, "&rPompa Ropy", "", "&7Pompuje ropę do wiader", "", "&c&l! &cNajpierw zeskanuj chunk");
    public static final SlimefunItemStack OIL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_OIL", HeadTexture.OIL_BUCKET, "&rWiadro Ropy");
    public static final SlimefunItemStack FUEL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_FUEL", HeadTexture.FUEL_BUCKET, "&rWiadro Paliwa");

    public static final SlimefunItemStack REFINERY =
            new SlimefunItemStack("REFINERY", Material.PISTON, "&cRafineria", "", "&rPrzetwarza ropę na paliwo");
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack(
            "COMBUSTION_REACTOR",
            HeadTexture.GENERATOR,
            "&cGenerator Spalinowy",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack ANDROID_MEMORY_CORE =
            new SlimefunItemStack("ANDROID_MEMORY_CORE", HeadTexture.ENERGY_REGULATOR, "&bRdzeń Pamięci Androida");

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON =
            new SlimefunItemStack("GPS_TELEPORTER_PYLON", Material.PURPLE_STAINED_GLASS, "&5Pylon Teleportacyjny GPS", "", "&7Komponent teleportera");
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack(
            "GPS_TELEPORTATION_MATRIX",
            Material.IRON_BLOCK,
            "&bMatryca Teleportacyjna GPS",
            "",
            "&rGłówny element teleportacji GPS",
            "&rPozwala teleportować się do",
            "&rzdefiniowanych punktów trasy");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_SHARED",
            Material.STONE_PRESSURE_PLATE,
            "&rAktywator GPS &3(Publiczny)",
            "",
            "&rPostaw na matrycy",
            "&ri stań na nim aby wybrać",
            "&rpunkt docelowy");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_PERSONAL",
            Material.STONE_PRESSURE_PLATE,
            "&rAktywator GPS &a(Prywatny)",
            "",
            "&rPostaw na matrycy",
            "&ri stań na nim aby wybrać",
            "&rpunkt docelowy",
            "",
            "&rTylko właściciel może",
            "&rgo używać");
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack(
            "PORTABLE_TELEPORTER",
            Material.COMPASS,
            "&bPrzenośny Teleporter",
            "",
            "&fTeleportuje cię do",
            "&fwybranego punktu trasy",
            "",
            LoreBuilder.powerCharged(0, 50),
            "",
            "&ePPM&7 aby użyć");

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack(
            "ELEVATOR_PLATE",
            Material.STONE_PRESSURE_PLATE,
            "&bPłyta Windy",
            "",
            "&rPostaw na każdym piętrze",
            "&raby podróżować między nimi.",
            "",
            "&ePPM&7 aby nazwać piętro");

    public static final SlimefunItemStack INFUSED_HOPPER =
            new SlimefunItemStack("INFUSED_HOPPER", Material.HOPPER, "&5Zaklęty Lej", "", "&rZbiera przedmioty w zasięgu", "&r7x7x7");

    public static final SlimefunItemStack PLASTIC_SHEET =
            new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "&rPlastikowy Arkusz");

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cPrasa Termiczna",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER_2",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cPrasa Termiczna &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 5x",
            LoreBuilder.powerPerSecond(44));

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack(
            "ELECTRIC_SMELTERY",
            Material.FURNACE,
            "&cElektryczna Huta",
            "",
            "&4Tylko stopy, nie przetapia pyłów",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack(
            "ELECTRIC_SMELTERY_2",
            Material.FURNACE,
            "&cElektryczna Huta &7- &eII",
            "",
            "&4Tylko stopy, nie przetapia pyłów",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack(
            "ELECTRIC_PRESS",
            HeadTexture.ELECTRIC_PRESS,
            "&eElektryczna Prasa",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack(
            "ELECTRIC_PRESS_2",
            HeadTexture.ELECTRIC_PRESS,
            "&eElektryczna Prasa &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE",
            Material.RED_TERRACOTTA,
            "&cElektryczny Tygiel",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_2",
            Material.RED_TERRACOTTA,
            "&cElektryczny Tygiel &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 2x",
            "&8\u21E8 &e\u26A1 &780 J/s");
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_3",
            Material.RED_TERRACOTTA,
            "&cElektryczny Tygiel &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 4x",
            "&8\u21E8 &e\u26A1 &7120 J/s");

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack(
            "CARBON_PRESS",
            Material.BLACK_STAINED_GLASS,
            "&cPrasa Węglowa",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack(
            "CARBON_PRESS_2",
            Material.BLACK_STAINED_GLASS,
            "&cPrasa Węglowa &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 3x",
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack(
            "CARBON_PRESS_3",
            Material.BLACK_STAINED_GLASS,
            "&cPrasa Węglowa &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 15x",
            "&8\u21E8 &e\u26A1 &7180 J/s");

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack(
            "BLISTERING_INGOT",
            Material.GOLD_INGOT,
            "&6Sztabka Pęcherzowa &7(33%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack(
            "BLISTERING_INGOT_2",
            Material.GOLD_INGOT,
            "&6Sztabka Pęcherzowa &7(66%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack(
            "BLISTERING_INGOT_3",
            Material.GOLD_INGOT,
            "&6Sztabka Pęcherzowa",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack ENERGY_REGULATOR =
            new SlimefunItemStack("ENERGY_REGULATOR", HeadTexture.ENERGY_REGULATOR, "&6Regulator Energii", "", "&rKluczowy element sieci energetycznej");
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack(
            "ENERGY_CONNECTOR",
            HeadTexture.ENERGY_CONNECTOR,
            "&cŁącznik Energetyczny",
            LoreBuilder.range(6),
            "",
            "&fUżywany do łączenia maszyn i generatorów",
            "&fMoże łączyć się z pobliską siecią energetyczną");
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack(
            "DEBUG_FISH",
            Material.SALMON,
            "&3Po ile ta ryba?",
            "",
            "&ePPM &rna dowolny blok aby zobaczyć jego dane",
            "&eLPM &rzniszcz blok",
            "&eShift + LPM &rna blok aby wyczyścić jego dane",
            "&eShift + PPM &rpostaw blok zastępczy");

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack(
            "NETHER_ICE",
            HeadTexture.NETHER_ICE,
            "&eLód Netheru",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack(
            "ENRICHED_NETHER_ICE",
            HeadTexture.ENRICHED_NETHER_ICE,
            "&eWzbogacony Lód Netheru",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL =
            new SlimefunItemStack("NETHER_ICE_COOLANT_CELL", HeadTexture.NETHER_ICE_COOLANT_CELL, "&6Chłodziwo z Lodu Netheru");

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER =
            new SlimefunItemStack("CARGO_MANAGER", HeadTexture.CARGO_MANAGER, "&6Menedżer Transportu", "", "&rKluczowy element sieci transportowej");
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE =
            new SlimefunItemStack("CARGO_NODE", HeadTexture.CARGO_CONNECTOR_NODE, "&7Węzeł Transportowy &c(Łącznik)", "", "&rRura łącząca transport");
    public static final SlimefunItemStack CARGO_INPUT_NODE =
            new SlimefunItemStack("CARGO_NODE_INPUT", HeadTexture.CARGO_INPUT_NODE, "&7Węzeł Transportowy &c(Wejście)", "", "&rRura wejściowa transportu");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE =
            new SlimefunItemStack("CARGO_NODE_OUTPUT", HeadTexture.CARGO_OUTPUT_NODE, "&7Węzeł Transportowy &c(Wyjście)", "", "&rRura wyjściowa transportu");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT_ADVANCED", HeadTexture.CARGO_OUTPUT_NODE, "&6Zaawansowany Węzeł Transportowy &c(Wyjście)", "", "&rRura wyjściowa transportu");

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack(
            "AUTO_BREEDER",
            Material.HAY_BLOCK,
            "&eAutomatyczny Karmnik",
            "",
            "&rWymaga &aOrganicznej Żywności",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/zwierzę");
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack(
            "PRODUCE_COLLECTOR",
            Material.HAY_BLOCK,
            "&bAutomatyczny Zbieracz",
            "",
            "&fTa maszyna automatycznie zbiera",
            "&fprodukty od pobliskich zwierząt.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32));

    public static final SlimefunItemStack ORGANIC_FOOD =
            new SlimefunItemStack("ORGANIC_FOOD", HeadTexture.FILLED_CAN, "&aOrganiczna Żywność", "&7Zawiera &9???");
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_WHEAT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Pszenicę");
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_CARROT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Marchew");
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_POTATO", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Ziemniaki");
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEEDS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Nasiona Pszenicy");
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_BEETROOT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Buraki");
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_MELON", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Arbuza");
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_APPLE", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Jabłka");
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SWEET_BERRIES", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Jagody");
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_KELP", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Suszony Wodorost");
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_COCOA", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera &9Kakao");
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEAGRASS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Zawiera: &9Trawę Morską");

    public static final SlimefunItemStack FERTILIZER =
            new SlimefunItemStack("FERTILIZER", HeadTexture.FILLED_CAN, "&aOrganiczny Nawóz", "&7Zawiera &9???");
    public static final SlimefunItemStack WHEAT_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_WHEAT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Pszenicę");
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_CARROT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Marchew");
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_POTATO", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Ziemniaki");
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEEDS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Nasiona Pszenicy");
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_BEETROOT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Buraki");
    public static final SlimefunItemStack MELON_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_MELON", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Arbuza");
    public static final SlimefunItemStack APPLE_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_APPLE", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Jabłka");
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SWEET_BERRIES", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Jagody");
    public static final SlimefunItemStack KELP_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_KELP", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Suszony Wodorost");
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_COCOA", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera &9Kakao");
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEAGRASS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Zawiera: &9Trawę Morską");

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "ANIMAL_GROWTH_ACCELERATOR",
            Material.HAY_BLOCK,
            "&bAkcelerator Wzrostu Zwierząt",
            "",
            "&rWymaga &aOrganicznej Żywności",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(28));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR",
            Material.LIME_TERRACOTTA,
            "&aAkcelerator Wzrostu Upraw",
            "",
            "&rWymaga &aOrganicznego Nawozu",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Promień: 7x7",
            "&8\u21E8 &7Prędkość: &a3/cykl",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR_2",
            Material.LIME_TERRACOTTA,
            "&aAkcelerator Wzrostu Upraw &7(&eII&7)",
            "",
            "&rWymaga &aOrganicznego Nawozu",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Promień: 9x9",
            "&8\u21E8 &7Prędkość: &a4/cykl",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/s");
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "TREE_GROWTH_ACCELERATOR",
            Material.BROWN_TERRACOTTA,
            "&aAkcelerator Wzrostu Drzew",
            "",
            "&rWymaga &aOrganicznego Nawozu",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Promień: 9x9",
            "&8\u21E8 &7Prędkość: &a4/cykl",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack(
            "FOOD_FABRICATOR",
            Material.GREEN_STAINED_GLASS,
            "&cPrzetwórca Żywności",
            "",
            "&rMoże wytwarzać &aOrganiczną Żywność",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack(
            "FOOD_FABRICATOR_2",
            Material.GREEN_STAINED_GLASS,
            "&cPrzetwórca Żywności &7(&eII&7)",
            "",
            "&rMoże wytwarzać &aOrganiczną Żywność",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 6x",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack(
            "FOOD_COMPOSTER",
            Material.GREEN_TERRACOTTA,
            "&cKompostownik Żywności",
            "",
            "&rMoże wytwarzać &aOrganiczny Nawóz",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack(
            "FOOD_COMPOSTER_2",
            Material.GREEN_TERRACOTTA,
            "&cKompostownik Żywności &7(&eII&7)",
            "",
            "&rMoże wytwarzać &aOrganiczny Nawóz",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 10x",
            LoreBuilder.powerBuffer(512),
            "&8\u21E8 &e\u26A1 &752 J/s");

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack(
            "XP_COLLECTOR",
            HeadTexture.EXP_COLLECTOR,
            "&aZbieracz Doświadczenia",
            "",
            "&rZbiera pobliskie doświadczenie i je przechowuje",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack REACTOR_COOLANT_CELL =
            new SlimefunItemStack("REACTOR_COLLANT_CELL", HeadTexture.COOLANT_CELL, "&bChłodziwo Reaktora");

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack(
            "NUCLEAR_REACTOR",
            HeadTexture.NUCLEAR_REACTOR,
            "&2Reaktor Jądrowy",
            "",
            "&rWymaga chłodziwa!",
            "&8\u21E8 &bMusi być otoczony wodą",
            "&8\u21E8 &bWymaga Chłodziwa Reaktora do działania",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &716384 J Pojemności",
            "&8\u21E8 &e\u26A1 &7500 J/s");
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack(
            "NETHERSTAR_REACTOR",
            HeadTexture.NETHER_STAR_REACTOR,
            "&rReaktor Gwiazdy Netheru",
            "",
            "&rWymaga Gwiazdy Netheru",
            "&8\u21E8 &bMusi być otoczony wodą",
            "&8\u21E8 &bWymaga Chłodziwa z Lodu Netheru",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &732768 J Pojemności",
            "&8\u21E8 &e\u26A1 &71024 J/s",
            "&8\u21E8 &4Powoduje efekt wither u pobliskich mobów");
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack(
            "REACTOR_ACCESS_PORT",
            Material.CYAN_TERRACOTTA,
            "&2Port Dostępu Reaktora",
            "",
            "&rUmożliwia dostęp do reaktora przez węzły transportowe",
            "&rMoże być również używany do przechowywania",
            "",
            "&8\u21E8 &cMusi być &eumieszczony 3 bloki nad reaktorem");

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack(
            "FREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bZamrażarka",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack(
            "FREEZER_2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bZamrażarka &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 2x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack FREEZER_3 = new SlimefunItemStack(
            "FREEZER_3",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bZamrażarka &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(42));

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN",
            Material.BROWN_TERRACOTTA,
            "&6Elektryczna Płuczka Złota",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_2",
            Material.BROWN_TERRACOTTA,
            "&6Elektryczna Płuczka Złota &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 3x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_3",
            Material.BROWN_TERRACOTTA,
            "&6Elektryczna Płuczka Złota &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 10x",
            LoreBuilder.powerPerSecond(14));

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER",
            Material.BLUE_STAINED_GLASS,
            "&3Elektryczna Płuczka Pyłu",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_2",
            Material.BLUE_STAINED_GLASS,
            "&3Elektryczna Płuczka Pyłu &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 2x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_3",
            Material.BLUE_STAINED_GLASS,
            "&3Elektryczna Płuczka Pyłu &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 10x",
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY",
            Material.RED_TERRACOTTA,
            "&cElektryczna Odlewnia",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 1x",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_2",
            Material.RED_TERRACOTTA,
            "&cElektryczna Odlewnia &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 2x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_3",
            Material.RED_TERRACOTTA,
            "&cElektryczna Odlewnia &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Prędkość: 8x",
            LoreBuilder.powerPerSecond(40));

    // @Deprecated
    // public static final SlimefunItemStack AUTOMATED_CRAFTING_CHAMBER = new
    // SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6自动合成机", "",
    // LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710
    // J/个物品");

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack(
            "FLUID_PUMP",
            Material.BLUE_TERRACOTTA,
            "&9Pompa Cieczy",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &732 J/blok");
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack(
            "CHARGING_BENCH",
            Material.CRAFTING_TABLE,
            "&6Stacja Ładowania",
            "",
            "&rMoże ładować przedmioty, np. plecaki odrzutowe",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7128 J Pojemności",
            "&8\u21E8 &e\u26A1 &7Strata energii: &c50%");

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack(
            "VANILLA_AUTO_CRAFTER",
            HeadTexture.VANILLA_AUTO_CRAFTER,
            "&2Automatyczny Stół Rzemieślniczy &8(Vanilla)",
            "",
            "&fUmieść maszynę na dowolnym pojemniku",
            "&faby automatycznie wytwarzać przedmioty!",
            "&fMoże wytwarzać przedmioty ze &ezwykłego stołu",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Zużycie: 16 J");
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack(
            "ENHANCED_AUTO_CRAFTER",
            HeadTexture.ENHANCED_AUTO_CRAFTER,
            "&2Automatyczny Stół Rzemieślniczy &8(Zaawansowany)",
            "",
            "&fUmieść maszynę na dowolnym pojemniku",
            "&faby automatycznie wytwarzać przedmioty!",
            "&fMoże wytwarzać przedmioty z &eZaawansowanego Stołu",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Zużycie: 16 J");
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack(
            "ARMOR_AUTO_CRAFTER",
            HeadTexture.ARMOR_AUTO_CRAFTER,
            "&2Automatyczny Stół Rzemieślniczy &8(Zbroja)",
            "",
            "&fUmieść maszynę na dowolnym pojemniku",
            "&fMoże wytwarzać przedmioty z Kuźni Zbroi",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Zużycie: 32 J");

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack(
            "IRON_GOLEM_ASSEMBLER",
            Material.IRON_BLOCK,
            "&6Montownia Żelaznych Golemów",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Czas odnowienia: &b30 s",
            LoreBuilder.powerBuffer(4096),
            "&8\u21E8 &e\u26A1 &72048 J/golem");
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack(
            "WITHER_ASSEMBLER",
            Material.OBSIDIAN,
            "&5Montownia Witherów",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Czas odnowienia: &b30 s",
            "&8\u21E8 &e\u26A1 &74096 J Pojemności",
            "&8\u21E8 &e\u26A1 &74096 J/wither");

    public static final SlimefunItemStack TRASH_CAN =
            new SlimefunItemStack("TRASH_CAN_BLOCK", HeadTexture.TRASH_CAN, "&3Śmietnik", "", "&rMożesz tu wrzucić niechciane przedmioty");

    public static final SlimefunItemStack ELYTRA_SCALE =
            new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "&bŁuska Elytry");
    public static final SlimefunItemStack INFUSED_ELYTRA =
            new SlimefunItemStack("INFUSED_ELYTRA", Material.ELYTRA, "&5Elytra (Naprawa)");
    public static final SlimefunItemStack SOULBOUND_ELYTRA =
            new SlimefunItemStack("SOULBOUND_ELYTRA", Material.ELYTRA, "&cElytra (Duszo-splot)");

    public static final SlimefunItemStack MAGNESIUM_SALT =
            new SlimefunItemStack("MAGNESIUM_SALT", Material.SUGAR, "&cSól Magnezowa", "", "&7Specjalne paliwo do Generatora Magnezowego");
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack(
            "MAGNESIUM_GENERATOR",
            HeadTexture.GENERATOR,
            "&cGenerator Magnezowy",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(36));

    // 别删
    public static final SlimefunItemStack CRAFTER_SMART_PORT = new SlimefunItemStack(
            "CRAFTER_SMART_PORT", Material.LIME_STAINED_GLASS, "&aInteligentny Port Rzemieślniczy", "", "&5Rozdziela składniki wg receptury", "&5i posiada dedykowany slot wyjściowy");

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
