package com.iridium.iridiumenchants.conditions;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class TargetHealth implements Condition {
    @Override
    public boolean apply(LivingEntity player, LivingEntity target, String[] args, ItemStack item) {
        int health;
        try {
            health = Integer.parseInt(args[2]);
        } catch (NumberFormatException exception) {
            health = 1;
        }
        switch (args[1]) {
            case "==":
                return target.getHealth() == health;
            case "!=":
                return target.getHealth() != health;
            case ">":
                return target.getHealth() > health;
            case ">=":
                return target.getHealth() >= health;
            case "<":
                return target.getHealth() < health;
            case "<=":
                return target.getHealth() <= health;
            default:
                return true;
        }
    }
}
