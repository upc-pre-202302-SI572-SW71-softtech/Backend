package com.softtech.backendapi.shared.domain.service.communication;

import lombok.Getter;
import org.apache.logging.log4j.util.Strings;

@Getter
public class BaseResponse<T>{
    private boolean success;
    private String message;
    private T data;

    public BaseResponse(String message){
        this.success = false;
        this.message = message;
        this.data = null;
    }

    public BaseResponse(T data){
        this.success = true;
        this.message = Strings.EMPTY;
        this.data = data;
    }
}
