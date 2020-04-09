/*
 *  Copyright © 2018, Cognizant Technology Solutions.
 *  Written under contract by Robosoft Technologies Pvt. Ltd.
 */

package com.example.myapplication.recycler_adapter;

/**
 * Listener methods called when the user performs swipe gesture on one of the adapter items.
 *
 * @author Aleksandar Gotev
 */
public interface SwipeListener {
    /**
     * Called when the user swipes out one element
     *
     * @param position  position in the adapter
     * @param direction direction. Refer to ItemTouchHelper class constants.
     */
    void onItemSwiped(int position, int direction);
}
