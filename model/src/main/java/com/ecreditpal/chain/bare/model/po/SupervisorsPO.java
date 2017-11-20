package com.ecreditpal.chain.bare.model.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class SupervisorsPO extends BasePO {

    private String name;//用户昵称
    private String realityName;//真实姓名
    private String password;//录登密码
    private Long passwordContinuousErrors;//密码连续错误次数
    private Boolean ifPasswordErrorLocked;//密码连续错误被锁定
    private Date passwordErrorLockedTime;//密码连续错误被锁定时间
    private Boolean ifAllowLogin;//是否允许登录
    private Integer loginCount;//登录次数
    private Date lastLoginTime;//上次登录时间
    private String lastLoginIp;//上次登录ip
    private Date lastLogoutTime;//上次退出时间
    private String lastLoginCity;//${item.comment}
    private String email;//邮箱
    private String mobile;//办公电话
    private Integer level;//0普通管理员，1超级管理员
    private Boolean ifErased;//'0
    private Boolean ifCustomer;//'是否客服
    private String customerNum;//客服编号
}
