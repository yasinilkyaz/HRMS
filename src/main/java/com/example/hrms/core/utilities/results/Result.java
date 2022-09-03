package com.example.hrms.core.utilities.results;

import java.security.interfaces.RSAKey;

public class Result {
    private boolean success;
    private String message;

    public Result(boolean success){
        this.success=success;
    }

    public Result(boolean success,String message){
        this.success=success;
        this.message=message;
    }
    public boolean isSuccess(){
        return this.success;
    }
    public String getMessage(){
        return this.message;
    }
}
