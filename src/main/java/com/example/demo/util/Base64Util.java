package com.example.demo.util;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

@Slf4j
public class Base64Util {
    private static final String charset = "utf-8";

    /**
     *  * @param data
     * <br/>
     * 解密
     * @return java.lang.String
     * @author HuiT
     * @date 2020/4/11 22:52
     */
    public static String decode(String data){
        try{
            if(null == data){
                return null;
            }
            return new String(Base64.decodeBase64(data.getBytes(charset)),charset);
        }catch (UnsupportedEncodingException e){
            log.error(String.format("字符串:%s,解密异常",data),e);
        }
        return  null;
    }

    public static String encode(String data){
        try {
            if(null==data){
                return null;
            }
            return new String(Base64.encodeBase64(data.getBytes(charset)),charset);
        }catch (UnsupportedEncodingException e){
            log.error(String.format("字符串:%s,加密异常",data),e);
        }
        return null;
    }
}
