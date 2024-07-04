package com.crispytwig.stairsbutchairs.registry;

import com.crispytwig.stairsbutchairs.StairsButChairs;
import com.crispytwig.stairsbutchairs.entities.SeatEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = StairsButChairs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SBCEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StairsButChairs.MOD_ID);

    public static final RegistryObject<EntityType<SeatEntity>> SEAT = ENTITY_TYPES.register(
            "seat", () ->
                    EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MISC)
                            .sized(0.0F, 0.0F)
                            .build(new ResourceLocation(StairsButChairs.MOD_ID, "seat").toString()));
}
