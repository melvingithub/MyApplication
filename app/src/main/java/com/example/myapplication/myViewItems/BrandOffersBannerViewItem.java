package com.example.myapplication.myViewItems;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ItemBrandOffersBannerBinding;
import com.example.myapplication.recycler_adapter.AdapterItem;
import com.example.myapplication.recycler_adapter.RecyclerAdapter;
import com.example.myapplication.recycler_adapter.RecyclerAdapterNotifier;
import com.example.myapplication.recycler_adapter.RecyclerAdapterViewHolder;

public class BrandOffersBannerViewItem extends AdapterItem<BrandOffersBannerViewItem.Holder> {

    /*private HomeTileAsset mHomeTileAsset;
    private HomeTileAssetItem tileAssetItem;*/
    private int screenType;

    @Override
    public int getLayoutId() {
        return R.layout.item_brand_offers_banner;
    }



    @Override
    public Object getData() {
       // return mHomeTileAsset;
        return null;
    }

    @Override
    public void setData(Object obj) {
        //mHomeTileAsset = (HomeTileAsset) obj;
    }

    @Override
    protected void bindData(BrandOffersBannerViewItem.Holder holder, Object data, int position) {
        ItemBrandOffersBannerBinding binding = (ItemBrandOffersBannerBinding) holder.getBinder();
        /*binding.setData(mHomeTileAsset);
        binding.tabIndicator.removeAllTabs();
        for (int i = 0; i < mHomeTileAsset.getTrayItems().size(); i++) {
            binding.tabIndicator.addTab(binding.tabIndicator.newTab());
        }
        binding.brandPromisesList.scrollToPosition(0);

        binding.brandPromisesList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int itemPosition = 0;
                if (manager != null) {
                    itemPosition = manager.findFirstCompletelyVisibleItemPosition();
                    if (itemPosition < 0) return;
                    TabLayout.Tab tab = binding.tabIndicator.getTabAt(itemPosition);
                    if (tab != null) {
                        tab.select();
                    }
                }
            }
        });*/
    }

    @Override
    protected void onViewRecycled(BrandOffersBannerViewItem.Holder holder) {

    }

    @Override
    protected void onClear() {

    }

    public static class Holder extends RecyclerAdapterViewHolder {
        public Holder(ViewDataBinding itemView, RecyclerAdapterNotifier adapter) {
            super(itemView, adapter);
            ItemBrandOffersBannerBinding binding = (ItemBrandOffersBannerBinding) itemView;
            setUpRecyclerView(binding);
            //setTileHtWd(binding);

        }

        private void setUpRecyclerView(ItemBrandOffersBannerBinding binding) {
            RecyclerAdapter adapter = new RecyclerAdapter(getRxBus(), String.valueOf(this.hashCode()));
            RecyclerView.LayoutManager manager = new LinearLayoutManager(binding.brandPromisesList.getContext(),
                    LinearLayoutManager.HORIZONTAL, false);
            binding.brandPromisesList.setLayoutManager(manager);
            binding.brandPromisesList.setAdapter(adapter);
        }

        /*private void setTileHtWd(ItemBrandOffersBannerBinding binder) {
            float ratio = 425.0f/360.0f;
            int width = (int) (DeviceUtil.getDeviceWidth(itemView.getContext()));
            int height = (int) (width * ratio);
            //int height = 1200;
            ViewGroup.LayoutParams params = binder.getRoot().getLayoutParams();
            params.width = width;
            params.height = height;
            binder.getRoot().setLayoutParams(params);

        }*/
    }

}
