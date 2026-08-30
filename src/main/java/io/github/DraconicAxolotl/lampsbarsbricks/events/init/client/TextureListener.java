package io.github.DraconicAxolotl.lampsbarsbricks.events.init.client;

import io.github.DraconicAxolotl.lampsbarsbricks.block.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.util.Namespace;

import java.lang.invoke.MethodHandles;

public class TextureListener {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    @EventListener
    private static void registerTextures(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getTerrain();

        ThatchBlock.thatch = terrain.addTexture(NAMESPACE.id("block/thatch")).index;
        // StoneBricks
        StoneBrickBlock.stonebricks = terrain.addTexture(NAMESPACE.id("block/stonebricks")).index;
        MossyStoneBrickBlock.mossy_stonebricks = terrain.addTexture(NAMESPACE.id("block/mossy_stonebricks")).index;
        CrackedStoneBrickBlock.cracked_stonebricks = terrain.addTexture(NAMESPACE.id("block/cracked_stonebricks")).index;
        ChiseledStoneBrickBlock.chiseled_stonebricks = terrain.addTexture(NAMESPACE.id("block/chiseled_stonebricks")).index;
        // Tiles
        StoneTileBlock.stonetile = terrain.addTexture(NAMESPACE.id("block/stonetiles")).index;
        MossyStoneTileBlock.mossy_stonetile = terrain.addTexture(NAMESPACE.id("block/mossy_stonetiles")).index;
        CrackedStoneTileBlock.cracked_stonetile = terrain.addTexture(NAMESPACE.id("block/cracked_stonetiles")).index;
        ChiseledStoneTileBlock.chiseled_stonetile = terrain.addTexture(NAMESPACE.id("block/chiseled_stonetile")).index;
        ChiseledStoneTileBlock.chiseled_stonetile_top = terrain.addTexture(NAMESPACE.id("block/chiseled_stonetile_nocreeper")).index;
    }
}
