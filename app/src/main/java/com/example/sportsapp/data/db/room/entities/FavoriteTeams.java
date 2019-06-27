package com.example.sportsapp.data.db.room.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favorites_table")
public class FavoriteTeams {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "team")
    private String team;

    public FavoriteTeams(String team){
        this.team = team;
    }

    @NonNull
    public String getTeam() {
        return this.team;
    }
}
