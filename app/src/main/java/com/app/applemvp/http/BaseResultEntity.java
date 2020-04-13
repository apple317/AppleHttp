package com.app.applemvp.http;


public  class BaseResultEntity<T> {

    public T result;
    public int code;
    public String message;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }


    public void setResult(T result) {
        this.result = result;
    }


    public T getResult() {
        return result;
    }
}
