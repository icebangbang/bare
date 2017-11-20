package com.ecreditpal.chain.bare.model.exception;

import lombok.Getter;

/**
 * @author lifeng
 * @version 2.0 on 16/10/11.
 */
@Getter
public enum CustomErrorCode {
    //业务警告100开头
    USER_VALID_FAIL("100001","用户验证失败"),
    EMAIL_ALREADY_REGISTERED("100002","邮箱已被注册"),
    NO_CODE_FROM_TENCENT("100003","从腾讯获取登录凭证失败"),
    NO_TOKEN_FROM_TENCENT("100004","无法获取令牌"),
    NO_CODE_FROM_SINA("100005","从新浪获取登录凭证失败"),
    NO_PACKAGE("100006","没有对应的套餐"),
    NO_ENOUGH_BALANCE("100007","余额不足"),

    //代码错误警告200开头
    JSON_PARSE_FAIL("200001","json解析失败");
    private String code;
    private String message;

    CustomErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
