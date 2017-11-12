package com.yb.user.handle;

import com.yb.base.util.ResultUtil;
import com.yb.user.exception.TokenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 80657 on 2017/11/8.
 */
@ControllerAdvice
public class ExceptionHandle {

    public static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ModelMap handler(Exception ex){

        if (ex instanceof TokenException){
            LOGGER.error("Token异常"+ex.getMessage());
            return ResultUtil.getResult(false,ex.getMessage());
        }else
        {

            LOGGER.error("系统异常{}",ex.getMessage());
            return ResultUtil.getResult(false,"系统异常:"+ex.getMessage());

        }



    }

}
