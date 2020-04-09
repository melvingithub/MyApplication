package com.example.myapplication.Room2;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {BioData.class}, version = 1)
public abstract class BioDatabase extends RoomDatabase {

    private static BioDatabase instance;
    public abstract BioDAO getDAO();

    public static synchronized BioDatabase getinstance(Application application) {
        if (instance == null) {
            instance= Room.databaseBuilder(application.getApplicationContext(),BioDatabase.class,"bio_database")
                    .addCallback(myCallback)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }


    public static RoomDatabase.Callback myCallback=new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new insertt(instance).execute();
        }
    };

    public static class insertt extends AsyncTask<Void,Void,Void>{

        BioDAO bioDAO;

        public insertt(BioDatabase instance) {
            this.bioDAO=instance.getDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            bioDAO.insertBio(new BioData("melvin","bangalore india",18));
            bioDAO.insertBio(new BioData("binoy","kerala india",28));
            return null;
        }
    }


}
