package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.entities.SeatEntity;
import com.crispytwig.stairsbutchairs.StairsButChairs;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;

import java.util.function.Supplier;

public class SBCEntityType {

    // region ENTITIES

    public static final Supplier<EntityType<SeatEntity>> SEAT = registerEntityType("seat", (type, world)
            -> new SeatEntity(world), MobCategory.MISC, 0.0F, 0.0F);

    // endregion

    private static <T extends Entity> EntityType<T> register(String id, FabricEntityTypeBuilder<T> entityType) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(StairsButChairs.MOD_ID, id), entityType.build());
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String name, EntityType.EntityFactory<T> factory, MobCategory category, float width, float height) {
        var registry = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(StairsButChairs.MOD_ID, name), FabricEntityTypeBuilder.create(category, factory).dimensions(EntityDimensions.fixed(width, height)).build());
        return () -> registry;
    }
}
