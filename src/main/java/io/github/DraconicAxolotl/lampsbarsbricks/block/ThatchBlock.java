package io.github.DraconicAxolotl.lampsbarsbricks.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class ThatchBlock extends TemplateBlock {
    public static int thatch;

    public ThatchBlock(Identifier identifier) {
        super(identifier, Material.LEAVES);
    }

    @Override
    public int getTexture(int side){
        return thatch;
    }
}
