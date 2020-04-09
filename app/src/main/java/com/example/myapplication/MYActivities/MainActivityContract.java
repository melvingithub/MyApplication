package com.example.myapplication.MYActivities;

import com.example.myapplication.TemperatureData;

public interface MainActivityContract {
    public interface Presenter {
        void onClickShowData(TemperatureData temperatureData);
        void showList();
    }

    public interface View {
        void showData(TemperatureData temperatureData);
    }

}
