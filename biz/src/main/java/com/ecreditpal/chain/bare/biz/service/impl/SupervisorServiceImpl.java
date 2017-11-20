package com.ecreditpal.chain.bare.biz.service.impl;

import com.ecreditpal.chain.bare.biz.service.SupervisorService;
import com.ecreditpal.chain.bare.dal.mapper.SupervisorsMapper;
import com.ecreditpal.chain.bare.model.po.SupervisorsPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lifeng
 * @version 1.0 on 2017/10/10.
 */
@Service("supervisorService")
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    SupervisorsMapper supervisorsMapper;

    @Override
    public SupervisorsPO getByAccount(String accountName) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", accountName);
        List<SupervisorsPO> supervisors = supervisorsMapper.select(map);
        if (supervisors != null && supervisors.size() > 0) {
            return supervisors.get(0);
        } else return null;
    }
}
