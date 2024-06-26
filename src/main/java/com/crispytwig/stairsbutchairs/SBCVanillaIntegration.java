package com.crispytwig.stairsbutchairs;

import com.crispytwig.stairsbutchairs.client.renderer.SeatRenderer;
import com.crispytwig.stairsbutchairs.registry.SBCBlocks;
import com.crispytwig.stairsbutchairs.registry.SBCEntityType;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public class SBCVanillaIntegration {

    public static void serverInit() {
    }

    @Environment(EnvType.CLIENT)
    public static class Client {

        public static void clientInit() {
            registerBlockRenderLayers();
            registerRenderers();
        }

        private static void registerRenderers() {
            registerEntityRenderers(SBCEntityType.SEAT, SeatRenderer::new);
        }

        private static void registerBlockRenderLayers() {
            BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                    SBCBlocks.OAK_CHAIR, SBCBlocks.SPRUCE_CHAIR, SBCBlocks.BIRCH_CHAIR, SBCBlocks.JUNGLE_CHAIR, SBCBlocks.ACACIA_CHAIR, SBCBlocks.DARK_OAK_CHAIR, SBCBlocks.MANGROVE_CHAIR, SBCBlocks.CHERRY_CHAIR, SBCBlocks.BAMBOO_CHAIR, SBCBlocks.CRIMSON_CHAIR, SBCBlocks.WARPED_CHAIR
            );
        }
    }

    public static <T extends Entity> void registerEntityRenderers(Supplier<EntityType<T>> type, EntityRendererProvider<T> renderProvider) {
        EntityRendererRegistry.register(type.get(), renderProvider);
    }
}
