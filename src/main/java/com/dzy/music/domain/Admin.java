package com.dzy.music.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员
 * @author 董志远
 */
@Data
public class Admin implements Serializable {

    private int id;
    private String name;
    private String password;

}
