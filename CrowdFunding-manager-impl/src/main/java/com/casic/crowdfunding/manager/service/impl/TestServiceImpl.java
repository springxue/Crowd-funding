package com.casic.crowdfunding.manager.service.impl;

import com.casic.crowdfunding.manager.dao.TestDao;
import com.casic.crowdfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    public void insert() {
        Map map=new HashMap();
        map.put("name","薛振春");
        System.out.println("插入");
        try{
            testDao.insertName(map);
        }catch (Exception e
        ){
            e.printStackTrace();
        }
        System.out.println("完成");
    }


}
