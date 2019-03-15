package com.db.dao;

/**
 * Created by Administrator on 2019/1/1.
 */

import java.util.List;
import java.util.Map;
public interface TestMapper {

    List<Map<String,Object>> db1GetAll();

     List<Map<String,Object>> db2GetAll();
}
