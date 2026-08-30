package io.github.DraconicAxolotl.lampsbarsbricks.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class CrackedStoneTileBlock extends TemplateBlock {
    public static int cracked_stonetile;

    public CrackedStoneTileBlock(Identifier identifier) {
        super(identifier, Material.STONE);
    }

    @Override
    public int getTexture(int side){
    return cracked_stonetile;
    }
}
