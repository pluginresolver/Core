package net.cogzmc.coreessentials;

import lombok.Getter;
import net.cogzmc.core.Core;
import net.cogzmc.core.modular.ModularPlugin;
import net.cogzmc.core.modular.ModuleMeta;

@ModuleMeta(
        name = "Core Essentials",
        description = "Provides essential end user commands and overrides for Bukkit that Core cannot properly " +
                "provide (as it is not a module). This plugin *should* be included on any running Core server " +
                "instances."
)
public final class CoreEssentials extends ModularPlugin {
    @Getter private TabColorManager tabColorManager;

    @Override
    protected void onModuleEnable() {
        registerCommand(new PluginsCommand());
        registerCommand(new NickNameCommand());
        tabColorManager = new TabColorManager();
        Core.getPermissionsManager().registerObserver(tabColorManager);
        registerListener(tabColorManager);
    }
}