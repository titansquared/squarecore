package net.titanreborn.squared.core.design

import net.kyori.adventure.text.format.TextColor
import java.awt.Color

enum class SquaredPalette(color: Color) {
    PRIMARY(Color(0xF59E0B)),
    SECONDARY(Color(0x10B981)),
    TERTIARY(Color(0x2563EB)),
    QUATERNARY(Color(0x6D28D9)),

    SUCCESS(Color(0x10B981)),
    WARNING(Color(0xF59E0B)),
    DANGER(Color(0xEF4444)),

    WHITE(Color(0xFFFFFF)),
    BLACK(Color(0x000000)),
    GRAY(Color(0x6B7280)),

    LIGHT(Color(0xF3F4F6)),
    DARK(Color(0x1F2937)),

    RED(Color(0xEF4444)),
    ORANGE(Color(0xF59E0B)),
    YELLOW(Color(0xFBBF24)),
    GREEN(Color(0x10B981)),
    TEAL(Color(0x06B6D4)),
    BLUE(Color(0x2563EB)),
    INDIGO(Color(0x3B82F6)),
    PURPLE(Color(0x6D28D9)),
    PINK(Color(0xEC4899));

    val hex: String = String.format("#%02x%02x%02x", color.red, color.green, color.blue);
    val textColor: TextColor = TextColor.color(color.red, color.green, color.blue);
}