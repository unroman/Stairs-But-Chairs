package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

public class SBCItems {
    public static final Item OAK_CHAIR = register("oak_chair", new BlockItem(SBCBlocks.OAK_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item SPRUCE_CHAIR = register("spruce_chair", new BlockItem(SBCBlocks.SPRUCE_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item BIRCH_CHAIR = register("birch_chair", new BlockItem(SBCBlocks.BIRCH_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item JUNGLE_CHAIR = register("jungle_chair", new BlockItem(SBCBlocks.JUNGLE_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item ACACIA_CHAIR = register("acacia_chair", new BlockItem(SBCBlocks.ACACIA_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item DARK_OAK_CHAIR = register("dark_oak_chair", new BlockItem(SBCBlocks.DARK_OAK_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item CRIMSON_CHAIR = register("crimson_chair", new BlockItem(SBCBlocks.CRIMSON_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item WARPED_CHAIR = register("warped_chair", new BlockItem(SBCBlocks.WARPED_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item CHERRY_CHAIR = register("cherry_chair", new BlockItem(SBCBlocks.CHERRY_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item BAMBOO_CHAIR = register("bamboo_chair", new BlockItem(SBCBlocks.BAMBOO_CHAIR, new Item.Properties().stacksTo(64)));
    public static final Item MANGROVE_CHAIR = register("mangrove_chair", new BlockItem(SBCBlocks.MANGROVE_CHAIR, new Item.Properties().stacksTo(64)));

    private static Item register(String id, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(StairsButChairs.MOD_ID, id), item);
    }
}
