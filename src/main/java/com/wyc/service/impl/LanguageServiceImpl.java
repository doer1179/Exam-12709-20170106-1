package com.wyc.service.impl;

import com.wyc.mapper.LanguageMapper;
import com.wyc.pojo.Language;
import com.wyc.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Yc on 2017/1/6.
 */
@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageMapper languageMapper;

    @Override
    public List<Language> getLanguage() {
        return languageMapper.getLanguage();
    }
}
