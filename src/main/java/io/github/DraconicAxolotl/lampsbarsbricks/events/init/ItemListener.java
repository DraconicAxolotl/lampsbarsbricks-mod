package io.github.DraconicAxolotl.lampsbarsbricks.events.init;

import net.glasslauncher.mods.alwaysmoreitems.api.ItemRegistry;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Namespace;

import java.lang.invoke.MethodHandles;

public class ItemListener {

    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static Item MOSS_BALL;

    @EventListener
    private static void registerItems(ItemRegistryEvent event) {
        MOSS_BALL = new TemplateItem(NAMESPACE.id("moss_ball"))
                  .setTranslationKey(NAMESPACE.id("moss_ball"));
    }
}
