package com.flotares.resourcefulanimals.entity.render.cow;

import com.flotares.resourcefulanimals.ResourcefulAnimals;
import com.flotares.resourcefulanimals.entity.custom.cow.IronCowEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.util.ResourceLocation;

public class IronCowRenderer extends MobRenderer<IronCowEntity, CowModel<IronCowEntity>> {

    public static final ResourceLocation TEXTURE =
            new ResourceLocation(ResourcefulAnimals.MOD_ID, "textures/entity/iron_cow.png");

    public IronCowRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CowModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(IronCowEntity entity) {
        return TEXTURE;
    }
}
