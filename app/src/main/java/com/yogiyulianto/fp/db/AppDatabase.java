package com.yogiyulianto.fp.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.yogiyulianto.fp.model.MovieItem;
import com.yogiyulianto.fp.model.TvShowItem;

@Database(entities = {MovieItem.class, TvShowItem.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MovieFavDAO movieFavDAO();

    private static AppDatabase appDatabase;

    public static AppDatabase getDatabase(Context context) {
        synchronized (AppDatabase.class) {
            if (appDatabase == null) {
                appDatabase = Room.databaseBuilder(context, AppDatabase.class, "dbMovieFav").allowMainThreadQueries().build();
            }
        }
        return appDatabase;
    }
}