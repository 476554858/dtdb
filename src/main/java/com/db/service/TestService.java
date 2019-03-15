package com.db.service;

import com.db.dao.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
/**
 * Created by Administrator on 2019/1/1.
 */
@Service
public class TestService {
    @Resource
    TestMapper testMapper;

    public void db1GetAll(String s){
        List<Map<String,Object>> list = testMapper.db1GetAll();
        for(Map<String,Object> map:list){
            System.out.println(map.toString());
        }
    }

    public void db2GetAll(String s){
        List<Map<String,Object>> list = testMapper.db2GetAll();
        for(Map<String,Object> map:list){
            System.out.println(map.toString());
        }
    }


}
