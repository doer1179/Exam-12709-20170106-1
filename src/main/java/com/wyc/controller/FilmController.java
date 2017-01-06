package com.wyc.controller;

import com.wyc.pojo.Film;
import com.wyc.pojo.Page;
import com.wyc.pojo.ResponseData;
import com.wyc.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yc on 2017/1/5.
 */


@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @RequestMapping(value ="/listFilms",method = RequestMethod.GET)
    public ResponseData<Film> query(@RequestParam(name = "title", required = false, defaultValue = "") String title,
                                    @RequestParam(name = "page",required = false, defaultValue = "1") int page,
                                    @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Film film=new Film();
        film.setTitle(title);

        Page arg = new Page().setPage(page).setPageSize(pageSize).setEntity(film);
        return filmService.query(arg);
    }

    /*
    public List<Film> getAllFilms(){
        return  filmService.getAllFilms();
    }*/

    @RequestMapping(value ="/addFilm",method = RequestMethod.GET)
    public String add(@RequestParam(name = "title", required = false, defaultValue = "") String title,
                   @RequestParam(name = "description", required = false, defaultValue = "") String description,
                   @RequestParam(name = "languageId",required = false, defaultValue = "1") int languageId){
        Film film = new Film();
        film.setDescription(description);
        film.setLanguageId(languageId);
        film.setTitle(title);
        int temp= filmService.add(film);
        if(temp==1){
            return "新增成功！";
            //return "{\"msg\":\"新增成功\"}";
        }
        return "新增失败";
        //return"{\"msg\":\"新增失败\"}";
    }
    @RequestMapping(value ="/getFilmById",method = RequestMethod.GET)
    public Film getFilmById(@RequestParam(name = "filmId",required = false) int filmId){
        return filmService.getFilmById(filmId);
    }
    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    public String delete(@RequestParam(name = "filmId",required = false) int filmId){
        int count=filmService.delete(filmId);
        if(count==1){
            return "删除成功！";
        }return "删除失败！";
    }

    @RequestMapping(value ="/updateFilm",method = RequestMethod.GET)
    public String update (@RequestParam(name = "filmId", required = false, defaultValue = "") int filmId,
                          @RequestParam(name = "title", required = false, defaultValue = "") String title,
                          @RequestParam(name = "description", required = false, defaultValue = "") String description,
                          @RequestParam(name = "languageId",required = false, defaultValue = "1") int languageId){

        Film film = new Film();
        film.setFilmId(filmId);
        film.setDescription(description);
        film.setLanguageId(languageId);
        film.setTitle(title);
        int temp=filmService.update(film);
        if(temp==1){
            return "修改成功！";
            //return "{\"msg\":\"新增成功\"}";
        }
        return "修改失败~";
        //return"{\"msg\":\"新增失败\"}";

    }

}
