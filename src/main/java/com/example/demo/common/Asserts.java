package com.example.demo.common;

public class Asserts {
    /**
     *  * @param message
     * <br/>
     * 断言处理类，用于抛出各种Api异常
     * @return void
     * @author HuiT
     * @date 2020/4/6 22:51
     */

    public static void fail(String message){
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode){
        throw new ApiException(errorCode);
    }
}
