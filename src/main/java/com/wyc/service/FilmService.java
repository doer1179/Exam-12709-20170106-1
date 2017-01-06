package com.wyc.service;

import com.wyc.pojo.Film;
import com.wyc.pojo.Page;
import com.wyc.pojo.ResponseData;

import java.util.List;

/**
 * Created by Yc on 2017/1/5.
 */
public interface FilmService {
List<Film> getAllFilms(Page page);
ResponseData<Film> query(Page<Film> page);
int selectCount(Film film);
int add(Film film);
int update(Film film);
Film getFilmById(int filmId);
int delete(int filmId);

}
