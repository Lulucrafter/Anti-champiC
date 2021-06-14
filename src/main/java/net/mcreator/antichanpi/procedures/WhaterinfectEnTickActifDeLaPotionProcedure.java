package net.mcreator.antichanpi.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.antichanpi.item.AnticeliumCArmorItem;
import net.mcreator.antichanpi.entity.ChampicEntity;
import net.mcreator.antichanpi.AntichanpiModElements;
import net.mcreator.antichanpi.AntichanpiMod;

import java.util.Map;

@AntichanpiModElements.ModElement.Tag
public class WhaterinfectEnTickActifDeLaPotionProcedure extends AntichanpiModElements.ModElement {
	public WhaterinfectEnTickActifDeLaPotionProcedure(AntichanpiModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AntichanpiMod.LOGGER.warn("Failed to load dependency entity for procedure WhaterinfectEnTickActifDeLaPotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof ChampicEntity.CustomEntity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 1));
		} else {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, (int) 60, (int) 1));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 60, (int) 6));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 60, (int) 6));
		}
		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(AnticeliumCArmorItem.helmet, (int) (1)))
				: false)) {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(AnticeliumCArmorItem.body, (int) (1)))
					: false)) {
				if (((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(AnticeliumCArmorItem.legs, (int) (1)))
						: false)) {
					if (((entity instanceof PlayerEntity)
							? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(AnticeliumCArmorItem.boots, (int) (1)))
							: false)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 1));
					}
				}
			}
		}
	}
}
