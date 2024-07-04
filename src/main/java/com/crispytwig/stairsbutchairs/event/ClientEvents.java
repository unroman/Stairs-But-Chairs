package com.crispytwig.stairsbutchairs.event;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import com.crispytwig.stairsbutchairs.client.renderer.SeatRenderer;
import com.crispytwig.stairsbutchairs.registry.SBCBlocks;
import com.crispytwig.stairsbutchairs.registry.SBCEntityType;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

@Mod.EventBusSubscriber(modid = StairsButChairs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    private static final Function<ItemLike, ItemStack> FUNCTION = ItemStack::new;

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(SBCEntityType.SEAT.get(), SeatRenderer::new);
    }

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.OAK_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.SPRUCE_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.BIRCH_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.JUNGLE_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.ACACIA_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.DARK_OAK_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.CRIMSON_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.WARPED_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.BAMBOO_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.CHERRY_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(SBCBlocks.MANGROVE_CHAIR.get(), RenderType.cutout());
    }

    private static void addAfter(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> map, ItemLike after, ItemLike... block) {
        List<ItemLike> stream = Lists.newArrayList(Arrays.stream(block).toList());
        Collections.reverse(stream);
        stream.forEach(blk -> addAfter(map, after, blk));
    }

    private static void addBefore(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> map, ItemLike before, ItemLike... block) {
        List<ItemLike> stream = Lists.newArrayList(Arrays.stream(block).toList());
        Collections.reverse(stream);
        stream.forEach(blk -> addBefore(map, before, blk));
    }

    private static void addAfter(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> map, ItemLike after, ItemLike block) {
        map.putAfter(FUNCTION.apply(after), FUNCTION.apply(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void addBefore(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> map, ItemLike before, ItemLike block) {
        map.putBefore(FUNCTION.apply(before), FUNCTION.apply(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    @SubscribeEvent
    public static void buildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {
        MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> entries = event.getEntries();
        ResourceKey<CreativeModeTab> tabKey = event.getTabKey();
        if (tabKey.equals(CreativeModeTabs.BUILDING_BLOCKS)) {
            addAfter(entries, Items.OAK_STAIRS, SBCBlocks.OAK_CHAIR.get());
            addAfter(entries, Items.SPRUCE_STAIRS, SBCBlocks.SPRUCE_CHAIR.get());
            addAfter(entries, Items.BIRCH_STAIRS, SBCBlocks.BIRCH_CHAIR.get());
            addAfter(entries, Items.JUNGLE_STAIRS, SBCBlocks.JUNGLE_CHAIR.get());
            addAfter(entries, Items.ACACIA_STAIRS, SBCBlocks.ACACIA_CHAIR.get());
            addAfter(entries, Items.DARK_OAK_STAIRS, SBCBlocks.DARK_OAK_CHAIR.get());
            addAfter(entries, Items.CRIMSON_STAIRS, SBCBlocks.CRIMSON_CHAIR.get());
            addAfter(entries, Items.WARPED_STAIRS, SBCBlocks.WARPED_CHAIR.get());
            addAfter(entries, Items.BAMBOO_STAIRS, SBCBlocks.BAMBOO_CHAIR.get());
            addAfter(entries, Items.CHERRY_STAIRS, SBCBlocks.CHERRY_CHAIR.get());
            addAfter(entries, Items.MANGROVE_STAIRS, SBCBlocks.MANGROVE_CHAIR.get());
        }
    }

}
