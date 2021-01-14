package com.dzy.music.service.impl;

import com.dzy.music.dao.SingerMapper;
import com.dzy.music.domain.Singer;
import com.dzy.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董志远
 */
@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public boolean insert(Singer singer) {
        return singerMapper.insert(singer) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return singerMapper.delete(id) > 0;
    }

    @Override
    public boolean update(Singer singer) {
        return singerMapper.update(singer) > 0;
    }

    @Override
    public Singer selectByPrimaryKey(Integer id) {
        return singerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Singer> allSinger() {
        return singerMapper.allSinger();
    }

    @Override
    public List<Singer> selectOfName(String name) {
        return singerMapper.selectOfName(name);
    }

    @Override
    public List<Singer> selectOfSex(Integer sex) {
        return singerMapper.selectOfSex(sex);
    }
}
