package com.example.sportsapp.data.db.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sportsapp.data.db.room.entities.FavoriteTeams;


@Database(entities = {FavoriteTeams.class}, version = 1)
public abstract class UsersDatabase extends RoomDatabase {
    private static UsersDatabase INSTANCE;
    public abstract FavoriteTeamsDao favoriteTeamsDao();

    public static synchronized UsersDatabase getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    UsersDatabase.class,
                    "users_database"
            )
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;

    }
}
