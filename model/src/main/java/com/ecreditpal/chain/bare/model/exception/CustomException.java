package com.ecreditpal.chain.bare.model.exception;

import lombok.Getter;

/**
 * 自定义异常
 * @author lifeng
 * @version 2.0 on 16/10/11.
 */
@Getter
public class CustomException extends RuntimeException{
    private static final long serialVersionUID = -6240882424188571335L;

    private String code;
    private String message;

    public CustomException(CustomErrorCode customErrorCode) {
        this(customErrorCode.getMessage());
        this.code = customErrorCode.getCode();
        this.message = customErrorCode.getMessage();
    }

    public CustomException(CustomErrorCode customErrorCode, Exception e) {
        this(customErrorCode.getMessage());
        this.code = customErrorCode.getCode();
        this.message = customErrorCode.getMessage();
        this.addSuppressed(e);
    }

    public CustomException(String code, String message) {
        this.code = code;
        this.message = message;
    }


    private CustomException(String s) {
        super(s);
    }

}
