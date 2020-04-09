/*
 *  Copyright © 2018, Cognizant Technology Solutions.
 *  Written under contract by Robosoft Technologies Pvt. Ltd.
 */

package com.example.myapplication.recycler_adapter;

/**
 * Listener invoked for every element that is going to be removed.
 *
 * @author Aleksandar Gotev
 */

public interface RemoveListener {
    boolean hasToBeRemoved(AdapterItem item);
}
