package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import com.crispytwig.stairsbutchairs.blocks.StairChairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = StairsButChairs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SBCBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StairsButChairs.MOD_ID);

    public static final RegistryObject<Block> OAK_CHAIR = BLOCKS.register("oak_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> SPRUCE_CHAIR = BLOCKS.register("spruce_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> BIRCH_CHAIR = BLOCKS.register("birch_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> JUNGLE_CHAIR = BLOCKS.register("jungle_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> ACACIA_CHAIR = BLOCKS.register("acacia_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> DARK_OAK_CHAIR = BLOCKS.register("dark_oak_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> CRIMSON_CHAIR = BLOCKS.register("crimson_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> WARPED_CHAIR = BLOCKS.register("warped_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> BAMBOO_CHAIR = BLOCKS.register("bamboo_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> CHERRY_CHAIR = BLOCKS.register("cherry_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_STAIRS).noOcclusion()));
    public static final RegistryObject<Block> MANGROVE_CHAIR = BLOCKS.register("mangrove_chair", () -> new StairChairBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_STAIRS).noOcclusion()));

}
