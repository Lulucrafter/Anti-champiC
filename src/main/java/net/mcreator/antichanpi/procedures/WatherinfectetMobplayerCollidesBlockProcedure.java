package net.mcreator.antichanpi.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.antichanpi.potion.WhaterinfectPotion;
import net.mcreator.antichanpi.AntichanpiModElements;
import net.mcreator.antichanpi.AntichanpiMod;

import java.util.Map;

@AntichanpiModElements.ModElement.Tag
public class WatherinfectetMobplayerCollidesBlockProcedure extends AntichanpiModElements.ModElement {
	public WatherinfectetMobplayerCollidesBlockProcedure(AntichanpiModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AntichanpiMod.LOGGER.warn("Failed to load dependency entity for procedure WatherinfectetMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(WhaterinfectPotion.potion, (int) 60, (int) 1));
	}
}
