package com.example.myapplication.Room2;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BioDAO {

    @Insert
    void insertBio(BioData bioData);

    @Query("SELECT * FROM BIODATA_TABLE")
    LiveData<List<BioData>> readAllBioDatas();

}
