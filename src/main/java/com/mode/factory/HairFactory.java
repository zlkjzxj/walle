package com.mode.factory;

import com.walle.factory.HairInterface;
import com.walle.factory.LeftHair;
import com.walle.factory.PropertiesReader;
import com.walle.factory.RightHair;

import java.util.Map;

/**
 *
 * 工厂模式：实例化对象，用工厂方法代替new操作
 * 有一组类似的对象需要创建
 * Created by Administrator on 2017/7/5.
 */
public class HairFactory {

    //工厂来做获取发型的工作
    public HairInterface getHair(String hair){
        if ("left".equals(hair)){
            return new LeftHair();
        }else if("right".equals(hair)){
            return new RightHair();
        }

        return null;
    }

    //根据类的名称来返回类
    public HairInterface getHairByClass(String className){
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return  hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    //读取配置文件的方法
    public HairInterface getHairByProperties(String key){
        HairInterface hair = null;
        try {
            PropertiesReader propertiesReader = new PropertiesReader();
            Map<String,String> map =  propertiesReader.getProperties();
            hair = (HairInterface) Class.forName(map.get(key)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  hair;
    }
}
