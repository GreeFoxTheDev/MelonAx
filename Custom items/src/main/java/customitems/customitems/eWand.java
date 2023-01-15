package customitems.customitems;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;

public class ewandItem {
    public static ItemStack ewand;
    public static void init(){
    }
    private static void createEwand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();

        ArrayList<Component>() tijng = new ArrayList<>()
        meta.lore();