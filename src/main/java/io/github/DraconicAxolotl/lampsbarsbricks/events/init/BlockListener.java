package io.github.DraconicAxolotl.lampsbarsbricks.events.init;

import io.github.DraconicAxolotl.lampsbarsbricks.block.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.template.block.TemplateStairsBlock;
import net.modificationstation.stationapi.api.util.Namespace;

import java.lang.invoke.MethodHandles;

public class BlockListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static Block THATCH;
    public static Block THATCH_STAIRS;
    // STONEBRICKS
    public static Block STONEBRICK;
    public static Block STONEBRICK_STAIRS;
    public static Block MOSSYSTONEBRICK;
    public static Block MOSSYSTONEBRICK_STAIRS;
    public static Block CRACKED_STONEBRICKS;
    public static Block CRACKED_STONEBRICK_STAIRS;
    public static Block CHISELED_STONEBRICKS;
    // STONE TILES
    public static Block STONETILE;
    public static Block STONETILE_STAIRS;
    public static Block MOSSY_STONETILE;
    public static Block MOSSY_STONETILE_STAIRS;
    public static Block CRACKED_STONETILE;
    public static Block CRACKED_STONETILE_STAIRS;
    public static Block CHISELED_STONETILES;
    // REDSTONE LAMP
    public static Block REDSTONELAMP;


    @EventListener
    private static void registerBlocks(BlockRegistryEvent event) {
        THATCH = new ThatchBlock(NAMESPACE.id("thatch"))
                .setTranslationKey(NAMESPACE.id("thatch"))
                .setSoundGroup(Block.DIRT_SOUND_GROUP)
                .setHardness(0.6F)
                .setResistance(0.1F);
        THATCH_STAIRS = new TemplateStairsBlock(NAMESPACE.id("thatch_stairs"), THATCH)
                .setTranslationKey(NAMESPACE.id("thatch_stairs"));
        // STONEBRICKS
        STONEBRICK = new StoneBrickBlock(NAMESPACE.id("stonebricks"))
                .setTranslationKey(NAMESPACE.id("stonebricks"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        STONEBRICK_STAIRS = new TemplateStairsBlock(NAMESPACE.id("stonebrick_stairs"), STONEBRICK)
                .setTranslationKey(NAMESPACE.id("stonebrick_stairs"));
        MOSSYSTONEBRICK = new MossyStoneBrickBlock(NAMESPACE.id("mossy_stonebricks"))
                .setTranslationKey(NAMESPACE.id("mossy_stonebricks"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        MOSSYSTONEBRICK_STAIRS = new TemplateStairsBlock(NAMESPACE.id("mossy_stonebrick_stairs"), MOSSYSTONEBRICK)
                .setTranslationKey(NAMESPACE.id("mossy_stonebrick_stairs"));
        CRACKED_STONEBRICKS = new CrackedStoneBrickBlock(NAMESPACE.id("cracked_stonebricks"))
                .setTranslationKey(NAMESPACE.id("cracked_stonebricks"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        CRACKED_STONEBRICK_STAIRS = new TemplateStairsBlock(NAMESPACE.id("cracked_stonebrick_stairs"), CRACKED_STONEBRICKS)
                .setTranslationKey(NAMESPACE.id("cracked_stonebrick_stairs"));

        CHISELED_STONEBRICKS = new ChiseledStoneBrickBlock(NAMESPACE.id("chiseled_stonebricks"))
                .setTranslationKey(NAMESPACE.id("chiseled_stonebricks"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        // TILES
        STONETILE = new StoneTileBlock(NAMESPACE.id("stonetile"))
                .setTranslationKey(NAMESPACE.id("stonetile"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.6F)
                .setResistance(6F);
        STONETILE_STAIRS = new TemplateStairsBlock(NAMESPACE.id("stonetile_stairs"), STONETILE)
                .setTranslationKey(NAMESPACE.id("stonetile_stairs"));

        MOSSY_STONETILE = new MossyStoneTileBlock(NAMESPACE.id("mossy_stonetile"))
                .setTranslationKey(NAMESPACE.id("mossy_stonetile"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        MOSSY_STONETILE_STAIRS = new TemplateStairsBlock(NAMESPACE.id("mossy_stonetile_stairs"), MOSSY_STONETILE)
                .setTranslationKey(NAMESPACE.id("mossy_stonetile_stairs"));
        CRACKED_STONETILE = new CrackedStoneTileBlock(NAMESPACE.id("cracked_stonetile"))
                .setTranslationKey(NAMESPACE.id("cracked_stonetile"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        CRACKED_STONETILE_STAIRS = new TemplateStairsBlock(NAMESPACE.id("cracked_stonetile_stairs"), CRACKED_STONETILE)
                .setTranslationKey(NAMESPACE.id("cracked_stonetile_stairs"));
        CHISELED_STONETILES = new ChiseledStoneTileBlock(NAMESPACE.id("chiseled_stonetiles"))
                .setTranslationKey(NAMESPACE.id("chiseled_stonetiles"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5F)
                .setResistance(6F);
        //REDSTONE LAMP
        REDSTONELAMP = new TemplateBlock(NAMESPACE.id("redstone_lamp"), Material.SPONGE)
                .setTranslationKey(NAMESPACE.id("redstone_lamp"))
                .setSoundGroup(Block.GLASS_SOUND_GROUP)
                .setHardness(0.3F)
                .setResistance(0.3F);

    }
}
