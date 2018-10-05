package com.zzwtec.watchdog.jni;

import com.zzwtec.watchdog.model.DogFood;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

/**
 * 看门狗jni接口
 * @author onew
 * */
public class WatchDogImp {
    /**
     * 看门狗动态库名称
     * */
    private static final String DLL_NAME = "dog.dll";

    /***
     * 初始化,用于加载动态库
     * */
    public void init(){
        URI url;
        try {
            url = this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI();
            url = url.resolve("./lib/" + DLL_NAME);
            String path = Paths.get(url).toString();
            System.load(path);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    /**
     * 喂狗
     * @param dogFood 狗粮
     * @return 返回一个状态码,0代表成功,其余值代表异常
     * */
    public native int FeedDog(DogFood dogFood);
}
