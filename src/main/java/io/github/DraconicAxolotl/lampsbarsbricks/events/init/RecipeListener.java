package io.github.DraconicAxolotl.lampsbarsbricks.events.init;

import net.glasslauncher.mods.gcapi3.mixin.client.MinecraftAccessor;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.LeavesBlockItem;
import net.minecraft.item.SeedsItem;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.util.Namespace;

import java.lang.invoke.MethodHandles;

public class RecipeListener {

    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    @EventListener
    public static void registerRecipe(RecipeRegisterEvent event) {
        RecipeRegisterEvent.Vanilla type = RecipeRegisterEvent.Vanilla.fromType(event.recipeId);
        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED) {
            CraftingRegistry.addShapedRecipe(
                    new ItemStack(ItemListener.MOSS_BALL, 1),
                    "LS ", "SL ",
                    'S', new ItemStack(SeedsItem.SEEDS), 'L', (LeavesBlock.LEAVES)
            );
        }
    }
}
