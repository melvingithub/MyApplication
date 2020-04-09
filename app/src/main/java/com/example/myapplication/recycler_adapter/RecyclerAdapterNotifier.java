/*
 *  Copyright © 2018, Cognizant Technology Solutions.
 *  Written under contract by Robosoft Technologies Pvt. Ltd.
 */

package com.example.myapplication.recycler_adapter;

import android.os.Bundle;



/**
 * Contains methods to notify the adapter.
 *
 * @author Aleksandar Gotev
 */
public interface RecyclerAdapterNotifier {
    void sendEvent(RecyclerAdapterViewHolder holder, Bundle data);

    RxBus getRxBus();

    String getPageId();

}
