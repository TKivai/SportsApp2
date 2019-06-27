package com.example.sportsapp.data.db.room.repositories;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.sportsapp.data.db.room.FavoriteTeamsDao;
import com.example.sportsapp.data.db.room.UsersDatabase;
import com.example.sportsapp.data.db.room.entities.FavoriteTeams;

import java.util.List;

public class MainRepository {

    private FavoriteTeamsDao favoriteTeamsDao;
    private LiveData<List<FavoriteTeams>> teams;

    public MainRepository(Application application) {
        UsersDatabase db = UsersDatabase.getInstance(application);
        favoriteTeamsDao = db.favoriteTeamsDao();
        teams = favoriteTeamsDao.getAllTeams();
    }

    public LiveData<List<FavoriteTeams>> getTeams() {
        return teams;
    }

    public void insert(FavoriteTeams teams){
        new insertAsyncTask(favoriteTeamsDao).execute();
    }

    public static class insertAsyncTask extends AsyncTask<FavoriteTeams,Void,Void> {

        private FavoriteTeamsDao asynctaskDao;

        public insertAsyncTask(FavoriteTeamsDao asynctaskDao) {
            this.asynctaskDao = asynctaskDao;
        }

        @Override
        protected Void doInBackground(FavoriteTeams... favoriteTeams) {
            asynctaskDao.insert(favoriteTeams[0]);
            return null;
        }
    }
}
