package com.crispytwig.stairsbutchairs;

import com.crispytwig.stairsbutchairs.registry.SBCBlocks;
import com.crispytwig.stairsbutchairs.registry.SBCEntityType;
import com.crispytwig.stairsbutchairs.registry.SBCItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(StairsButChairs.MOD_ID)
public class StairsButChairs {
	public static final String MOD_ID = "stairsbutchairs";

	public StairsButChairs() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		IEventBus eventBus = MinecraftForge.EVENT_BUS;

		SBCBlocks.BLOCKS.register(modEventBus);
		SBCItems.ITEMS.register(modEventBus);
		SBCEntityType.ENTITY_TYPES.register(modEventBus);

		modEventBus.addListener(this::commonSetup);
		eventBus.register(this);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
		event.enqueueWork(SBCVanillaIntegration::serverInit);
	}

}