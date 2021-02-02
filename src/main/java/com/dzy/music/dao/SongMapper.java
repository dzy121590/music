package com.dzy.music.dao;

import com.dzy.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 董志远
 */
@Repository
public interface SongMapper {
    /**
     * 增加歌曲
     *
     * @param song
     * @return
     */
    public int insert(Song song);

    /**
     * 修改歌曲
     *
     * @param id
     * @return
     */
    public int delete(Integer id);

    /**
     * 删除歌曲
     *
     * @param song
     * @return
     */
    public int update(Song song);

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
     * 根据歌手id查询
     *
     * @param singerId
     * @return
     */
    public List<Song> selectOfSingerId(Integer singerId);
}
