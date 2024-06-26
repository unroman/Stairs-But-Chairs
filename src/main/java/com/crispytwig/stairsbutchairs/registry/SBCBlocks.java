package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import com.crispytwig.stairsbutchairs.blocks.StairChairBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class SBCBlocks {

    public static final Block OAK_CHAIR = register("oak_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Block SPRUCE_CHAIR = register("spruce_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).noOcclusion()));
    public static final Block BIRCH_CHAIR = register("birch_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).noOcclusion()));
    public static final Block JUNGLE_CHAIR = register("jungle_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).noOcclusion()));
    public static final Block ACACIA_CHAIR = register("acacia_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).noOcclusion()));
    public static final Block DARK_OAK_CHAIR = register("dark_oak_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).noOcclusion()));
    public static final Block CRIMSON_CHAIR = register("crimson_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).noOcclusion()));
    public static final Block WARPED_CHAIR = register("warped_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).noOcclusion()));
    public static final Block CHERRY_CHAIR = register("cherry_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).noOcclusion()));
    public static final Block BAMBOO_CHAIR = register("bamboo_chair", new StairChairBlock(FabricBlockSettings.create().noOcclusion().sound(SoundType.SCAFFOLDING).dynamicShape().isValidSpawn(Blocks::never).pushReaction(PushReaction.DESTROY).isRedstoneConductor(Blocks::never)));
    public static final Block MANGROVE_CHAIR = register("mangrove_chair", new StairChairBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).noOcclusion()));

    private static Block register(String id, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(StairsButChairs.MOD_ID, id), block);
    }
}
