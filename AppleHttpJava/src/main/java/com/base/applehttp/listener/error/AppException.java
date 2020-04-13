package com.base.applehttp.listener.error;

/**
 * Created by Administrator on 2017/7/17.
 */

public class AppException extends Throwable {
    public AppException() {
        super();
    }
    /*错误码*/
    private int code;
    public AppException(String message,int Code) {
        super(message);
        this.code=Code;
    }


    @CodeException.CodeEp
    public int getCode() {
        return code;
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
