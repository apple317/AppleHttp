package com.base.applehttp.listener.error;

/**
 * Created by Administrator on 2017/7/17.
 */

public class AppNoDataException extends Throwable {
    public AppNoDataException() {
        super();
    }

    public AppNoDataException(String message) {
        super(message);
    }

    public AppNoDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
