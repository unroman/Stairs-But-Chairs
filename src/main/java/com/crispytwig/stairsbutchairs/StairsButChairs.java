package com.crispytwig.stairsbutchairs;

import com.google.common.reflect.Reflection;
import com.crispytwig.stairsbutchairs.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

import static com.crispytwig.stairsbutchairs.registry.SBCItems.*;


public class StairsButChairs implements ModInitializer {
	public static final String MOD_ID = "stairsbutchairs";

	@Override
	public void onInitialize() {
		Reflection.initialize(
				SBCItems.class,
				SBCBlocks.class,
				SBCEntityType.class
		);
		SBCVanillaIntegration.serverInit();

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
			entries.addAfter(Items.OAK_STAIRS, OAK_CHAIR);
			entries.addAfter(Items.SPRUCE_STAIRS, SPRUCE_CHAIR);
			entries.addAfter(Items.BIRCH_STAIRS, BIRCH_CHAIR);
			entries.addAfter(Items.JUNGLE_STAIRS, JUNGLE_CHAIR);
			entries.addAfter(Items.ACACIA_STAIRS, ACACIA_CHAIR);
			entries.addAfter(Items.DARK_OAK_STAIRS, DARK_OAK_CHAIR);
			entries.addAfter(Items.CRIMSON_STAIRS, CRIMSON_CHAIR);
			entries.addAfter(Items.WARPED_STAIRS, WARPED_CHAIR);
			entries.addAfter(Items.CHERRY_STAIRS, CHERRY_CHAIR);
			entries.addAfter(Items.MANGROVE_STAIRS, MANGROVE_CHAIR);
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
			entries.addAfter(Items.SCAFFOLDING, BAMBOO_CHAIR);
		});
	}
}