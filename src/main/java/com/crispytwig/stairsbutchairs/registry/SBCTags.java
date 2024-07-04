package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public interface SBCTags {

    class BlockTags {
        public static final TagKey<Block> ABOVE_BYPASSES_SEAT_CHECK = tag("above_bypasses_seat_check");

        private static TagKey<Block> tag(String name) {
            return TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation(StairsButChairs.MOD_ID, name));
        }
    }

    class EntityTags {
        public static final TagKey<EntityType<?>> CAN_SIT_IN_SEATS = tag("can_sit_in_seats");

        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(StairsButChairs.MOD_ID, name));
        }
    }

    class ItemTags {

        private static TagKey<Item> tag(String name) {
            return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(StairsButChairs.MOD_ID, name));
        }
    }

}
