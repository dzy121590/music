package com.dzy.music.service;

import com.dzy.music.domain.Song;

import java.util.List;

/**
 * @author 董志远
 */
public interface SongService {

    /**
     * 增加歌曲
     *
     * @param song
     * @return
     */
    public boolean insert(Song song);

    /**
     * 修改歌曲
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 删除歌曲
     *
     * @param song
     * @return
     */
    public boolean update(Song song);

    /**
     * 根据主键查找
     *
     * @param id
     * @return
     */
    public Song selectByPrimaryKey(Integer id);

    /**
     * 查找全部
     *
     * @return
     */
    public List<Song> allSong();

    /**
     * 根据歌手名模糊查询
     *
     * @param name
     * @return
     */
    public List<Song> selectOfName(String name);

    /**
     * 根据男女查询
     *
     * @param singerId
     * @return
     */
    public List<Song> selectOfSingerId(Integer singerId);
}
