package com.flotares.resourcefulanimals.events;

import com.flotares.resourcefulanimals.ResourcefulAnimals;
import com.flotares.resourcefulanimals.entity.ModEntityTypes;
import com.flotares.resourcefulanimals.entity.custom.cow.IronCowEntity;
import com.flotares.resourcefulanimals.item.custom.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ResourcefulAnimals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.IRON_COW.get(), IronCowEntity.registerAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent<EntityType<?>> event){
        ModSpawnEggItem.initSpawnEggs();
    }

}
