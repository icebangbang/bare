package com.ecreditpal.chain.bare.biz.service;

import com.ecreditpal.chain.bare.model.po.SupervisorsPO;

/**
 * @author lifeng
 * @version 1.0 on 2017/10/10.
 */
public interface SupervisorService {
    public SupervisorsPO getByAccount(String accountName);
}
