/*
 *  Copyright © 2018, Cognizant Technology Solutions.
 *  Written under contract by Robosoft Technologies Pvt. Ltd.
 */

package com.example.myapplication.recycler_adapter;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.RecyclerView;



import java.lang.ref.WeakReference;

import butterknife.ButterKnife;


/**
 * Base ViewHolder class to extend in subclasses.
 *
 * @author Aleksandar Gotev
 */
public abstract class RecyclerAdapterViewHolder extends RecyclerView.ViewHolder {

    private final WeakReference<RecyclerAdapterNotifier> adapter;

    private ViewDataBinding binding;

    private RxBus mRxBus;
    private String mPageId;


    public RecyclerAdapterViewHolder(ViewDataBinding itemView, RecyclerAdapterNotifier adapter) {
        super(itemView.getRoot());
        ButterKnife.bind(this, itemView.getRoot());
        this.binding = itemView;
        this.adapter = new WeakReference<>(adapter);
        mRxBus = adapter.getRxBus();
        mPageId = adapter.getPageId();
    }

    protected void bind(Object object) {
        if (object != null) {
            //binding.setVariable(BR.data, object);
            binding.executePendingBindings();
        }
    }

    /**
     * Sends an event to the adapter.
     *
     * @param data additional event data
     */
    protected final void sendEvent(Bundle data) {
        this.adapter.get().sendEvent(this, data);
    }

    protected final View findViewById(int id) {
        return itemView.findViewById(id);
    }

    public ViewDataBinding getBinder() {
        return binding;
    }

    public RxBus getRxBus() {
        return mRxBus;
    }

    public String getPageId() {
        return mPageId;
    }

}
