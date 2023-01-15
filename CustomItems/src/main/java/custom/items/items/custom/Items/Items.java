package custom.items.items.custom.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Items extends JavaPlugin {

    public static void init() {
        createCompressedMelon();
        createCompressedMelon1();
        createCompressedMelon2();
        createCompressedMelon3();
        createCompressedMelon4();
        createMelonAx();
    }
    public static ItemStack compressedMelon;
    //first compression
    private static void createCompressedMelon(){
        ItemStack item = new ItemStack(Material.MELON, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fA little compressed melon");
        List<String> lores = new ArrayList<String>();
        lores.add("§5Little bit compressed melon.");
        im.setLore(lores);
        item.setItemMeta(im);
        compressedMelon = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("compressed_melon0"), item);
        sr.shape("XXX", "XXX", "XXX");
        sr.setIngredient('X', Material.MELON);
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack compressedMelon1;
    //second compression
    private static void createCompressedMelon1(){
        ItemStack item = new ItemStack(Material.MELON, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§b§lMore Compressed Melon");
        List<String> lores = new ArrayList<String>();
        lores.add("§5More compressed melon!");
        im.setLore(lores);
        im.addEnchant(Enchantment.LUCK, 1, false);
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(im);
        compressedMelon1 = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("compressed_melon1"), item);
        sr.shape("XXX", "XXX", "XXX");
        sr.setIngredient('X', new RecipeChoice.ExactChoice(compressedMelon));
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack compressedMelon2;
    //third compression
    private static void createCompressedMelon2(){
        ItemStack item = new ItemStack(Material.MELON, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§l§aKinda goodly compressed melon.");
        List<String> lores = new ArrayList<String>();
        lores.add("§5You are taking MelonAx seriously");
        lores.add("§5and making kinda good progress!");
        im.setLore(lores);
        im.addEnchant(Enchantment.LUCK, 1, false);
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(im);
        compressedMelon2 = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("compressed_melon2"), item);
        sr.shape("XXX", "XXX", "XXX");
        sr.setIngredient('X', new RecipeChoice.ExactChoice(compressedMelon1));
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack compressedMelon3;
    private static void createCompressedMelon3(){
        ItemStack item = new ItemStack(Material.MELON, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§e§lVery Compressed Melon");
        List<String> lores = new ArrayList<String>();
        lores.add("§5You are NoLife,");
        lores.add("§5change my mind");
        im.setLore(lores);
        im.addEnchant(Enchantment.LUCK, 1, false);
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(im);
        compressedMelon3 = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("compressed_melon3"), item);
        sr.shape("XXX", "XXX", "XXX");
        sr.setIngredient('X', new RecipeChoice.ExactChoice(compressedMelon2));
        Bukkit.getServer().addRecipe(sr);
    }
    public static ItemStack compressedMelon4;
    private static void createCompressedMelon4(){
        ItemStack item = new ItemStack(Material.MELON, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§5§lFINAL MELON");
        List<String>lores = new ArrayList<String>();
        lores.add("§6I CAN FELL THE");
        lores.add("§l§4POWER!!!");
        im.addEnchant(Enchantment.LUCK, 1, false);
        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        compressedMelon4 = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("compressed_melon_final"), item);
        sr.shape("XXX", "XYX", "XXX");
        sr.setIngredient('Y', Material.NETHERITE_INGOT);
        sr.setIngredient('X', new RecipeChoice.ExactChoice(compressedMelon3));
        Bukkit.addRecipe(sr);
    }
    public static ItemStack melonAx;
    private static void createMelonAx(){
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§l§aMelonAx");
        List<String> lores = new ArrayList<String>();
        lores.add("§3This axe is made of"); //lore, line 1
        lores.add("§3REALLY compressed melons!"); //lore, line 2
        im.setLore(lores); //add the lores of course
        im.addEnchant(Enchantment.DIG_SPEED, 10, false);
        im.addEnchant(Enchantment.DAMAGE_ALL, 5, false);
        item.setItemMeta(im);
        melonAx = item;
        SmithingRecipe smr = new SmithingRecipe(NamespacedKey.minecraft("melon_ax"), item,
                new RecipeChoice.MaterialChoice(Material.NETHERITE_AXE), new RecipeChoice.ExactChoice(compressedMelon4));
        Bukkit.getServer().addRecipe(smr);
    }
}