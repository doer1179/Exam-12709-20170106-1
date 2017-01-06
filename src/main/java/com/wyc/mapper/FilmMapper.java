package com.wyc.mapper;

import com.wyc.pojo.Film;
import com.wyc.pojo.Page;

import java.util.List;

/**
 * Created by Yc on 2017/1/5.
 */
public interface FilmMapper {

    List<Film> getAllFilms(Page page);

    int selectCount(Film film);

    Film getFilmById(int filmId);

    int add(Film film) throws Exception;

    int update(Film film)throws Exception;

    int delete(int filmId) throws Exception;

}
