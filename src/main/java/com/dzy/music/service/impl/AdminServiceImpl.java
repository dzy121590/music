package com.dzy.music.service.impl;

import com.dzy.music.dao.AdminMapper;
import com.dzy.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 董志远
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean veriftyPassword(String name, String password) {
        return adminMapper.veriftyPassword(name, password) > 0;
    }
}
