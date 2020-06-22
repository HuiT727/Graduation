package com.example.demo.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 *  * @param null
 * <br/>

 * @return 通用返回对象
 * @author HuiT
 * @date 2020/3/13 16:58
 */

public class CommonResult<T> {
    //操作码
    private long code;
    //提示信息
    private  String message;
    //结果数据
    private T data;

    protected  CommonResult(){
    }


    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(ResultCode resultCode) {

        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public CommonResult(long code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <T> CommonResult<T> success(){
        return new CommonResult<T>(ResultCode.SUCCESS);
    }
    public static <T> CommonResult<T> success(T data){
        /**
         *  * @param data	 获取的数据
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:35
         */
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),data);
    }

    public static<T>  CommonResult<T> success(T data,String message){
        /**
         * 成功返回结果
         *  * @param data	获取的数据
         * @param message	提示信息
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:33
         */
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),message,data);
    }

    public static<T> CommonResult<T> failed(IErrorCode errorCode){
        /**
         *  * @param errorCode	错误码
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:41
         */
        return new CommonResult<T>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    public static<T> CommonResult<T> failed(IErrorCode errorCode,String message){
        /**
         *  * @param errorCode	错误码
         * @param message	错误信息
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:37
         */
        return new CommonResult<T>(errorCode.getCode(),message,null);
    }

    public static<T> CommonResult<T> failed(String message){
        /**
         *  * @param message	 错误信息
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:38
         */
        return new CommonResult<T>(ResultCode.FAILED.getCode(),message,null);
    }

    public static<T> CommonResult<T> failed(){
        /**
         *  * @param
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:42
         */
        return failed(ResultCode.FAILED);
    }

    public static<T> CommonResult<T> validateFailed(String message){
        /**
         *  * @param message
         * <br/>
         * 参数验证失败返回结果
         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:49
         */
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(),message,null);
    }

    public static<T> CommonResult<T> validateFailed(){
        /**
         *  * @param 	参数验证失败返回结果
         * <br/>
         *
         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:53
         */
        return failed(ResultCode.VALIDATE_FAILED);
    }

    public static<T> CommonResult<T> unauthoried(T data){
        /**
         *  * @param data
         * <br/>

         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:55
         */
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(),data);
    }

    public static<T> CommonResult<T> forbidden(T data){
        /**
         *  * @param data
         * <br/>
         * 未授权返回结果
         * @return com.example.demo.Common.api.CommonResult<T>
         * @author HuiT
         * @date 2020/3/13 17:57
         */
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),data);
    }

    public long getCode(){
        return code;
    }

    public void setCode(long code){
        this.code = code;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public T getData(){
        return  data;
    }

    public void setData(T data){
        this.data = data;
    }
}
