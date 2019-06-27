package com.example.sportsapp;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.sportsapp.data.db.room.entities.FavoriteTeams;
import com.example.sportsapp.data.db.room.repositories.MainRepository;

import java.util.List;

public class UserviewModel extends AndroidViewModel {

    private MainRepository repository;
    private LiveData<List<FavoriteTeams>> teams;

    public LiveData<List<FavoriteTeams>> getTeams() {
        return teams;
    }

    public UserviewModel(Application application){
        super(application);
        repository = new MainRepository(application);
        teams = repository.getTeams();
    }

    public void  insert(FavoriteTeams teams){
        repository.insert(teams);
    }


}
