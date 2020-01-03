package com.yogiyulianto.fp.receiver;

import android.content.Context;

import com.yogiyulianto.fp.model.MovieItem;
import com.yogiyulianto.fp.model.TvShowItem;

import java.util.ArrayList;

public interface ReminderView {
    interface View {
        void setMovies(Context context, ArrayList<MovieItem> movies, int notifId);

        void setTvShow(Context context, ArrayList<TvShowItem> tvShow, int notifId);
    }

    interface Presenter {
        void requestMovies(String date);

        void requestTvShows(String date);
    }
}
