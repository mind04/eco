package com.willfp.eco.core.price;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * A price that a player should pay.
 */
public interface Price {
    /**
     * Get if the player can afford the price.
     *
     * @param player The player.
     * @return If the player can afford.
     */
    boolean canAfford(@NotNull Player player);

    /**
     * Make the player pay the price.
     * <p>
     * Only run this if the player can afford the price.
     *
     * @param player The player.
     */
    void pay(@NotNull Player player);

    /**
     * If the price is backed by a value, get it here.
     *
     * @return The value.
     */
    default double getValue() {
        return 0;
    }

    /**
     * If the price is backed by a value, set it here.
     *
     * @param value The value.
     */
    default void setValue(final double value) {
        // Override when needed.
    }
}
