package com.example.demo.common;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class GlobalExceHandler {
    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public CommonResult handle(ApiException e){
        if(e.getErrorCode() != null){
            return CommonResult.failed(e.getErrorCode());
        }
        return  CommonResult.failed(e.getMessage());
    }
}
