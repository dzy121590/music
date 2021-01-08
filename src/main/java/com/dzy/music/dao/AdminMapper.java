package com.dzy.music.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 董志远
 */
@Repository
public interface AdminMapper {
    /**
     * 验证密码是否正确
     */

    public int veriftyPassword(String name, String password);
}
