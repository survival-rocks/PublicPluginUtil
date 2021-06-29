package me.justeli.util;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by Eli on June 28, 2021.
 * PublicPluginUtil: me.justeli.util
 */
public class CancellableEvent
        extends Event
        implements Cancellable
{
    // - - - - - - Cancellable Boilerplate - - - - - -

    private boolean cancelled = false;

    @Override
    public boolean isCancelled ()
    {
        return cancelled;
    }

    @Override
    public void setCancelled (boolean cancelled)
    {
        this.cancelled = cancelled;
    }

    // - - - - - - HanderList Boilerplate - - - - - -

    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList ()
    {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers ()
    {
        return HANDLERS;
    }
}
