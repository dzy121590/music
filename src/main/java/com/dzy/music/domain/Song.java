package com.dzy.music.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 董志远
 */
@Data
public class Song implements Serializable {

    private Integer id;
    private Integer singerId;
    private String name;
    private String introduction;
    private Date createTime;
    private Date updateTime;
    private String pic;
    private String lyric;
    private String url;

}
