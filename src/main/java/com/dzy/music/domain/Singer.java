package com.dzy.music.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 董志远
 */
@Data
public class Singer implements Serializable {

    private int id;
    private String name;
    private Byte sex;
    private String pic;
    private Date birth;
    private String location;
    private String introduction;
}
