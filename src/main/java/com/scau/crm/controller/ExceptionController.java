package com.scau.crm.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ExceptionController:全局错误处理器
 *
 * @author chen
 * @date 2019/03/06
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = Exception.class)
    public String handle(Exception ex){
        ex.printStackTrace();
        return "error/5xx";
    }
}
