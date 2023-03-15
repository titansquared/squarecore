package net.titanreborn.squared.core.plugin

import org.bukkit.plugin.java.JavaPlugin

abstract class SquaredPlugin(name: String) : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        enable()
    }

    override fun onDisable() {
        // Plugin shutdown logic
        disable()
    }

    abstract fun enable()
    abstract fun disable()
}