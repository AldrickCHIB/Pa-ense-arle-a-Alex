package com.example.demo.Config.exceptions;



import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse {
    private String message;
    private boolean error;
    private HttpStatus httpStatus;
    private Object object;
//    private Long userId;


    public ApiResponse() {
    }

    public ApiResponse(Object object, HttpStatus httpStatus) {
        this.object = object;
        this.httpStatus = httpStatus;
    }

    public ApiResponse(String message, boolean error, HttpStatus httpStatus, Object object) {
        this.message = message;
        this.error = error;
        this.httpStatus = httpStatus;
        this.object = object;
    }

    public ApiResponse(String message, boolean error, HttpStatus httpStatus, Object object,Long userId) {
        this.message = message;
        this.error = error;
        this.httpStatus = httpStatus;
        this.object = object;
//        this.userId = userId;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
}
