package com.yogiyulianto.fp.ui.tvshow;

import com.yogiyulianto.fp.model.TvShowItem;

import java.util.ArrayList;

public interface TvShowView {
    void showLoad();

    void finishLoad();

    void showList(ArrayList<TvShowItem> listTvShow);

    void noData();
}
