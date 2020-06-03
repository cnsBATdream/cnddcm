package com.cnddcm.promise.common;

import com.cnddcm.promise.util.IMOOCJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Liuming
 * @date 2020/6/3
 * @description 统一异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler {
  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public IMOOCJSONResult error(Exception e) {
    e.printStackTrace();
    return new IMOOCJSONResult(500, IMOOCJSONResult.errorMsg("执行出错").getMsg(), null);
  }
}
