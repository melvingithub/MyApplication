package com.example.myapplication.Room2;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.myapplication.RoomExample.NoteDao;
import com.example.myapplication.RoomExample.NoteDatabase;

import java.util.List;

public class BioRepository {

    private LiveData<List<BioData>> bioData;
    private BioDAO bioDao;

    public BioRepository(Application application) {
        BioDatabase bioDatabase=BioDatabase.getinstance(application);
        bioDao=bioDatabase.getDAO();
        bioDao.readAllBioDatas();
    }

    public LiveData<List<BioData>> getAllBioData(){
        return bioDao.readAllBioDatas();
    }
}
