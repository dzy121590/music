package com.dzy.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.dzy.music.domain.Song;
import com.dzy.music.service.SongService;
import com.dzy.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 歌曲管理
 * @author 董志远
 */
@RestController
@RequestMapping("/song")
public class SongController {

    @Autowired
    private SongService songService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addSong(HttpServletRequest request, @RequestParam("file")MultipartFile mpFile){
        JSONObject jsonObject = new JSONObject();
        //获取前端传来的参数
        String singerId = request.getParameter("singerId").trim();
        String name = request.getParameter("name").trim();
        String introduction = request.getParameter("introduction").trim();
        String pic = "/img/songPic/tubiao.jpg";
        String lyric = request.getParameter("lyric").trim();
        //上传歌曲文件
        if(mpFile.isEmpty()){
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"歌曲上传失败");
            return jsonObject;
        }
        //文件名=当前时间到毫秒+原来的文件名
        String fileName = System.currentTimeMillis()+mpFile.getOriginalFilename();
        //文件路径
        String filePath = System.getProperty("user.dir")+System.getProperty("file.separator")+"song";
        //如果文件路径不存在，新增该路径
        File file1 = new File(filePath);
        if(!file1.exists()){
            file1.mkdir();
        }
        //实际的文件地址
        File dest = new File(filePath+System.getProperty("file.separator")+fileName);
        //存储到数据库里的相对文件地址
        String storeUrlPath = "/song/"+fileName;
        try {
            mpFile.transferTo(dest);
            Song song = new Song();
            song.setSingerId(Integer.parseInt(singerId));
            song.setName(name);
            song.setIntroduction(introduction);
            song.setPic(pic);
            song.setLyric(lyric);
            song.setUrl(storeUrlPath);
            boolean flag = songService.insert(song);
            if(flag){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"保存成功");
                jsonObject.put("avator",storeUrlPath);
                return jsonObject;
            }
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"保存失败");
            return jsonObject;
        } catch (IOException e) {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"保存失败"+e.getMessage());
        }finally {
            return jsonObject;
        }
    }

    /**
     * 查找全部
     * @return
     */
    @RequestMapping(value = "/allSong",method = RequestMethod.GET)
    public Object allSong(){

        return songService.allSong();
    }

    /**
     * 根据歌手id查找
     */
    @RequestMapping(value = "/singer/detail",method = RequestMethod.GET)
    public Object songOfSingerId(HttpServletRequest request){
        String singerId=request.getParameter("singerId");
        return songService.selectOfSingerId(Integer.parseInt(singerId));
    }
}
