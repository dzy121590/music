package com.dzy.music.dao;

import com.dzy.music.domain.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 董志远
 */
@Repository
public interface SingerMapper {
    /**
     * 增加歌曲
     *
     * @param singer
     * @return
     */
    public int insert(Singer singer);

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
     * @param singer
     * @return
     */
    public int update(Singer singer);

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
