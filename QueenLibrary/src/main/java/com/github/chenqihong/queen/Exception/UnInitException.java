package com.github.chenqihong.queen.Exception;

/**
 * Created by ChenQihong on 2016/2/3.
 */
public class UnInitException extends Exception {
    public UnInitException(){
        super("Queen is not initialized");
    }
    public UnInitException(String msg){
        super(msg);
    }

    public UnInitException(Exception e){
        super("Queen is not initialized",e);
    }

    public UnInitException(String msg , Exception e){
        super(msg,e);
    }
}
