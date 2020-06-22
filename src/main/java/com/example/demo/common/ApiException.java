package com.example.demo.common;

public class ApiException extends RuntimeException {
    /**
     *  * @param null
     * <br/>
     * 自定义Api异常
     * @return
     * @author HuiT
     * @date 2020/4/6 22:50
     */

    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message){
        super(message);
    }

    public ApiException(Throwable cause){
        super(cause);
    }

    public ApiException(String message,Throwable cause){
        super(message,cause);
    }

    public IErrorCode getErrorCode(){
        return errorCode;
    }
}

