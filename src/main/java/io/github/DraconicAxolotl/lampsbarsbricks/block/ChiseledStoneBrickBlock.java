package io.github.DraconicAxolotl.lampsbarsbricks.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class ChiseledStoneBrickBlock extends TemplateBlock {
    public static int chiseled_stonebricks;

    public ChiseledStoneBrickBlock(Identifier identifier) {
        super(identifier, Material.STONE);
    }

    @Override
    public int getTexture(int side){
    return chiseled_stonebricks;
    }
}
