package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = StairsButChairs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SBCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StairsButChairs.MOD_ID);

    // Oak, Spruce, Birch, Jungle, Acacia, Dark Oak, Crimson, Warped, Bamboo, Cherry, Mangrove
    public static final RegistryObject<Item> OAK_CHAIR = ITEMS.register("oak_chair", () -> new BlockItem(SBCBlocks.OAK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_CHAIR = ITEMS.register("spruce_chair", () -> new BlockItem(SBCBlocks.SPRUCE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_CHAIR = ITEMS.register("birch_chair", () -> new BlockItem(SBCBlocks.BIRCH_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHAIR = ITEMS.register("jungle_chair", () -> new BlockItem(SBCBlocks.JUNGLE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHAIR = ITEMS.register("acacia_chair", () -> new BlockItem(SBCBlocks.ACACIA_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_CHAIR = ITEMS.register("dark_oak_chair", () -> new BlockItem(SBCBlocks.DARK_OAK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHAIR = ITEMS.register("crimson_chair", () -> new BlockItem(SBCBlocks.CRIMSON_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_CHAIR = ITEMS.register("warped_chair", () -> new BlockItem(SBCBlocks.WARPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHAIR = ITEMS.register("bamboo_chair", () -> new BlockItem(SBCBlocks.BAMBOO_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CHAIR = ITEMS.register("cherry_chair", () -> new BlockItem(SBCBlocks.CHERRY_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHAIR = ITEMS.register("mangrove_chair", () -> new BlockItem(SBCBlocks.MANGROVE_CHAIR.get(), new Item.Properties()));
    //}
}
