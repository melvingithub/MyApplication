package com.example.myapplication.Room2;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class BioViewModel extends AndroidViewModel{

    BioRepository repository;
    private LiveData<List<BioData>> bioData;

    public BioViewModel(@NonNull Application application) {
        super(application);
        repository=new BioRepository(application);
        bioData=repository.getAllBioData();
    }

    public LiveData<List<BioData>> getAllBioData(){
        return bioData;
    }
}
