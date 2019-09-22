package com.rx.vo;

public class ApiResponse{
    private  Integer code;
    private String message;
    private Object data;


    public ApiResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }






}
