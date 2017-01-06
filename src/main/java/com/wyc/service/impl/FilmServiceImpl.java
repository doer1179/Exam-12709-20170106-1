package com.wyc.service.impl;

import com.wyc.mapper.FilmMapper;
import com.wyc.pojo.Film;
import com.wyc.pojo.Page;
import com.wyc.pojo.ResponseData;
import com.wyc.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yc on 2017/1/5.
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<Film> getAllFilms(Page page) {

        return filmMapper.getAllFilms(page);
    }

    @Override
    public ResponseData<Film> query(Page<Film> page) {

        ResponseData<Film> responseData = new ResponseData<>();
        responseData.setRows(filmMapper.getAllFilms(page));
        responseData.setTotal(filmMapper.selectCount(page.getEntity()));
        return responseData;
    }

    @Override
    public int selectCount(Film film) {
        return filmMapper.selectCount(film);
    }

    @Override
    public int add(Film film) {
        try{
            return filmMapper.add(film);
        }
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int update(Film film) {

        try{
            return filmMapper.update(film);
        }
        catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Film getFilmById(int filmId) {
        return filmMapper.getFilmById(filmId);
    }

    @Override
    public int delete(int filmId)  {
        try {
            return filmMapper.delete(filmId);
        }catch (Exception e ){
            return 0;
        }

    }


}
