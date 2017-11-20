package com.ecreditpal.chain.bare.biz.permission;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;

/**
 * Created by lifeng on 16/9/17.
 */
@Slf4j
public class MyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return null;
    }

//    @Resource
//    UserService userService;
//
//    public static final String USER_KEY = "currentUser";
//
//    /**
//     * 用户权限校验
//     *
//     * @param principals 用户登录凭证
//     * @return 校验信息
//     */
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRole("123");
//
//        return simpleAuthorizationInfo;
//    }
//
//    /**
//     * shiro用户校验
//     *
//     * @param token 用户登录凭证
//     * @return 校验信息
//     * @throws AuthenticationException
//     */
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        if (token.getPrincipal() == null) {
//            return null;
//        }
//        String account = token.getPrincipal().toString();
//
//        UserPO user;
//        //判断用户是否用邮箱登录
//        if (CheckUtils.checkEmail(account)) {
//            user = userService.getUserByEmail(account);
//        } else {
//            user = userService.getUserByMobile(account);
//        }
//        if (user == null) {
//            throw new UnknownAccountException();
//        }
//        log.info("{},登录系统", account);
//        this.putIntoSession(USER_KEY, user);
//        //返回验证信息,尝试与给出的用户名密码匹配
//        return new SimpleAuthenticationInfo(account, user.getUserPassword(), getName());
//    }
//
//    /**
//     * 将对象放入session当中
//     *
//     * @param key   键
//     * @param value 值
//     */
//    public void putIntoSession(Object key, Object value) {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject != null) {
//            Session session = subject.getSession();
//            session.setAttribute(key, value);
//        }
//    }
//
//    /**
//     * 从session中获取对象
//     *
//     * @param key 键
//     * @return 缓存对象
//     */
//    private Object getSessionValue(Object key) {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject != null) {
//            Session session = subject.getSession();
//            return session.getAttribute(key);
//        }
//        return null;
//    }
//
//    public UserPO getCurrentUser() {
//        return (UserPO) this.getSessionValue(USER_KEY);
//    }

}
