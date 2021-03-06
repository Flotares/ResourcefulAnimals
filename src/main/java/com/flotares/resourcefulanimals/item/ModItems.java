package com.flotares.resourcefulanimals.item;

import com.flotares.resourcefulanimals.ResourcefulAnimals;
import com.flotares.resourcefulanimals.entity.ModEntityTypes;
import com.flotares.resourcefulanimals.item.custom.ModSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResourcefulAnimals.MOD_ID);

    public static final RegistryObject<ModSpawnEggItem> IRON_COW_SPAWN_EGG = ITEMS.register("iron_cow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_COW, 0x545253, 0xF2F2F2,
                    new Item.Properties().group(ItemGroup.MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
