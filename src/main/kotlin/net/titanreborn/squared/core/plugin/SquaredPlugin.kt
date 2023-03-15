package net.titanreborn.squared.core.plugin

import org.bukkit.plugin.java.JavaPlugin

/**
 * SquaredPlugin is the base class for all TitanSquared plugins. It provides the ability to access a variety of useful
 * methods and utilities that are not provided by Bukkit or Paper, and integrates with other SquaredPlugins easily.
 *
 * @param name The name of the plugin. This is used to identify the plugin in the console and in the plugin.yml file.
 */
abstract class SquaredPlugin(name: String) : JavaPlugin() {
    companion object {
        private val plugins = mutableMapOf<Class<out SquaredPlugin>, SquaredPlugin>()
    }

    override fun onEnable() {
        // Plugin startup logic
        enable()
    }

    override fun onDisable() {
        // Plugin shutdown logic
        disable()
    }

    /**
     * Enables the plugin. This is called when the plugin is enabled.
     */
    abstract fun enable()

    /**
     * Disables the plugin. This is called when the plugin is disabled.
     */
    abstract fun disable()
}