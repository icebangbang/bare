package com.ecreditpal.chain.bare.web.controller;


import com.ecreditpal.chain.bare.biz.base.Result;
import com.ecreditpal.chain.bare.biz.service.SupervisorService;
import com.ecreditpal.chain.bare.model.po.SupervisorsPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by lifeng on 16/8/22.
 */
@Controller
@Slf4j
@RequestMapping(value = "public/test")
public class TestController {

    @Autowired
    private SupervisorService supervisorService;




//    @RequestMapping("email")
//    public Result sendEmail() {
//        EmailBO bo = new EmailBO();
//        bo.setReceiverEmail(Lists.newArrayList("787036156@qq.com"));
//        bo.setContent("你好");
//        long value = redisCache.putEmailQueue(bo);
//
//        return Result.wrapSuccessfulResult(value);
//    }

    @RequestMapping("email")
    @ResponseBody
    public Result<Date> sendEmail() {
        if (1==1)
        throw new RuntimeException("hello");
        return Result.wrapSuccessfulResult(new Date());
    }


    @RequestMapping("error")
    @ResponseBody
    public Result<SupervisorsPO> throwError() {
       return Result.wrapSuccessfulResult(supervisorService.getByAccount("dd"));
    }

    @RequestMapping("login")
    public ModelAndView testLogin() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }

}
