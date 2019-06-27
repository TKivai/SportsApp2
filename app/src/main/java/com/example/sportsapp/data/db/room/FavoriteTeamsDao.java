package com.example.sportsapp.data.db.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.sportsapp.data.db.room.entities.FavoriteTeams;

import java.util.List;

@Dao
public interface FavoriteTeamsDao {

    @Insert
    void insert(FavoriteTeams team);

    @Query("DELETE FROM favorites_table")
    void deleteAll();

    @Query("SELECT * FROM favorites_table ORDER BY team ASC")
    LiveData<List<FavoriteTeams>> getAllTeams();
}
