package com.flotares.resourcefulanimals.entity;

import com.flotares.resourcefulanimals.ResourcefulAnimals;
import com.flotares.resourcefulanimals.entity.custom.cow.IronCowEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, ResourcefulAnimals.MOD_ID);

    public static final RegistryObject<EntityType<IronCowEntity>> IRON_COW
            = ENTITY_TYPES.register("iron_cow",
            () -> EntityType.Builder.create(IronCowEntity::new,
                    EntityClassification.CREATURE).size(0.9f, 1.4f)
                    .build(new ResourceLocation(ResourcefulAnimals.MOD_ID, "iron_cow").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
