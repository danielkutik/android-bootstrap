package com.donnfelker.android.bootstrap.events;

/**
 * Pub/Sub event used to communicate between fragment and activity.
 * Subscription occurs in the {@link com.donnfelker.android.bootstrap.ui.MainActivity}
 */
public class NavItemSelectedEvent {
    private final int itemPosition;

    public NavItemSelectedEvent(final int itemPosition) {
        this.itemPosition = itemPosition;
    }

    public int getItemPosition() {
        return itemPosition;
    }
}
