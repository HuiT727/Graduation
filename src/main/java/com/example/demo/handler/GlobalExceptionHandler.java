package com.example.demo.handler;

import com.example.demo.common.CommonResult;
import com.example.demo.common.CustomException;
import com.example.demo.common.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.validation.BindException;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     *  * @param e
     * <br/>
     * 处理自定义异常
     * @return graduation.project.demo.common.CommonResult
     * @author HuiT
     * @date 2020/4/12 0:32
     */
    @ExceptionHandler(CustomException.class)
    public CommonResult handleException(CustomException e){
        //打印异常信息
        log.error("#### 异常信息：{}###",e.getMessage());
        return new CommonResult(e.getResultCode());
    }


    /**
     *  * @param e
     * <br/>
     * 参数错误异常
     * @return graduation.project.demo.common.CommonResult
     * @author HuiT
     * @date 2020/4/12 0:46
     */

    @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class})
    public CommonResult handleException(Exception e){
        if(e instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException validException = (MethodArgumentNotValidException) e;
            BindingResult result = validException.getBindingResult();
            StringBuffer errorMsg = new StringBuffer();
            if(result.hasErrors()){
                List<ObjectError> errors = result.getAllErrors();
                errors.forEach(p->{
                    FieldError fieldError = (FieldError) p;
                    errorMsg.append(fieldError.getDefaultMessage()).append(",");
                    log.error("###请求参数错误：{"+fieldError.getObjectName()+"},field{"+fieldError.getField()+"},errorMessage{"+fieldError.getDefaultMessage()+"}");});

            }
        }else if(e instanceof BindException){
            BindException bindException = (BindException) e;
            if(bindException.hasErrors()){
                log.error("###请求参数错误:{}",bindException.getAllErrors());
            }
        }
        return new CommonResult(ResultCode.PARAM_IS_INVALID);
    }

    /**
     *  * @param e
     * <br/>
     * 处理不可知的异常
     * @return graduation.project.demo.common.CommonResult
     * @author HuiT
     * @date 2020/4/12 0:47
     */
    public CommonResult handleOtherException(Exception e){
        e.printStackTrace();
        log.error("### 不可知的异常：{} ###",e.getMessage());
        return new CommonResult(ResultCode.SYSTEM_INNER_ERROR);
    }

}
