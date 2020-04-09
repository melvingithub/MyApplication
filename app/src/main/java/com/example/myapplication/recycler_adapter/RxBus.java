/*
 *  Copyright © 2018, Cognizant Technology Solutions.
 *  Written under contract by Robosoft Technologies Pvt. Ltd.
 */

package com.example.myapplication.recycler_adapter;

import io.reactivex.Observable;

public interface RxBus {

    void send(final Object event);

    Observable<Object> toObservable();

    boolean hasObservers();
}