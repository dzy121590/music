package com.dzy.music.service;

import com.dzy.music.domain.Singer;

import java.util.List;

/**
 * @author 董志远
 */
public interface SingerService {

    /**
     * 增加歌曲
     *
     * @param singer
     * @return
     */
    public boolean insert(Singer singer);

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
     * @param singer
     * @return
     */
    public boolean update(Singer singer);

    /**
     * 根据主键查找
     *
     * @param id
     * @return
     */
    public Singer selectByPrimaryKey(Integer id);

    /**
     * 查找全部
     *
     * @return
     */
    public List<Singer> allSinger();

    /**
     * 根据歌手名模糊查询
     *
     * @param name
     * @return
     */
    public List<Singer> selectOfName(String name);

    /**
     * 根据男女查询
     *
     * @param sex
     * @return
     */
    public List<Singer> selectOfSex(Integer sex);
}
