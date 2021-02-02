package com.dzy.music.service.impl;

import com.dzy.music.dao.SongMapper;
import com.dzy.music.domain.Song;
import com.dzy.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 董志远
 */
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    @Override
    public boolean insert(Song song) {
        return songMapper.insert(song) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return songMapper.delete(id) > 0;
    }

    @Override
    public boolean update(Song song) {
        return songMapper.update(song) > 0;
    }

    @Override
    public Song selectByPrimaryKey(Integer id) {
        return songMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Song> allSong() {
        return songMapper.allSong();
    }

    @Override
    public List<Song> selectOfName(String name) {
        return songMapper.selectOfName(name);
    }

    @Override
    public List<Song> selectOfSingerId(Integer singerId) {
        return songMapper.selectOfSingerId(singerId);
    }
}
