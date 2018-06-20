package com.mode.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * properties文件读取类
 * Created by Administrator on 2017/7/5.
 */
public class PropertiesReader {

    public Map<String,String> getProperties(){
        Map<String,String> map = new HashMap<String, String>();
        try {
            Properties prop = new Properties();
            InputStream inputStream = getClass().getResourceAsStream("type.properties");
            prop.load(inputStream);
            Enumeration enumeration = prop.propertyNames();
            while(enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String value = prop.getProperty(key);
                map.put(key,value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
