package io.github.DraconicAxolotl.lampsbarsbricks.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class ChiseledStoneTileBlock extends TemplateBlock {
    public static int chiseled_stonetile;
    public static int chiseled_stonetile_top;

    public ChiseledStoneTileBlock(Identifier identifier) {
        super(identifier, Material.STONE);
    }

    @Override
    public int getTexture(int side){
        if (side == 0 || side == 1) {
            return chiseled_stonetile_top;
        } else
    return chiseled_stonetile;
    }
}
