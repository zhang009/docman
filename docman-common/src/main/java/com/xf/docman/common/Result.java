package com.xf.docman.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 *
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(
            notes = "如果是false：说明接口处理有问题,就提示用户msg信息，如果是true：获取data数据"
    )
    private boolean success;

    private String errorCode;

    private String msg;

    private T data;


    public static <T> Result<T> fail(T data, String errorCode, String msg) {
        Result result = new Result();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


    public static <T> Result<T> success(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
