package net.mcreator.antichanpi.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.antichanpi.AntichanpiModElements;
import net.mcreator.antichanpi.AntichanpiMod;

import java.util.function.Supplier;
import java.util.Map;

@AntichanpiModElements.ModElement.Tag
public class ChampiterapiQuandLeGUIEstFermeProcedure extends AntichanpiModElements.ModElement {
	public ChampiterapiQuandLeGUIEstFermeProcedure(AntichanpiModElements instance) {
		super(instance, 44);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AntichanpiMod.LOGGER.warn("Failed to load dependency entity for procedure ChampiterapiQuandLeGUIEstFerme!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof ServerPlayerEntity) {
			Container _current = ((ServerPlayerEntity) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
					_current.detectAndSendChanges();
				}
			}
		}
	}
}
