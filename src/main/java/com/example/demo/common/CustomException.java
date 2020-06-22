package com.example.demo.common;

import java.text.MessageFormat;

/**
 *  * @param null
 * <br/>
 * 自定义异常
 * @return
 * @author HuiT
 * @date 2020/4/11 21:00
 */
public class CustomException extends RuntimeException {

    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }

    public CustomException(ResultCode resultCode,Object...args){
        super(resultCode.getMessage());
        String message = MessageFormat.format(resultCode.getMessage(),args);
        resultCode.setMessage(message);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return  resultCode;

    }
}
