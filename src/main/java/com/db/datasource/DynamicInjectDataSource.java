package com.db.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/1/1.
 */
@Aspect
@Component
public class DynamicInjectDataSource {
    @Resource(name = "dynamicDataSourceSelector")
    private DataSourceSelector dynamicDataSourceSelector;

    @Pointcut("execution(public * com.db.service.*.*(..))")
    public void db(){}

    @Before("db()")
    public void beforeSwitchDS(JoinPoint point){
        String s =   (String)point.getArgs()[0];
        dynamicDataSourceSelector.setRouteKey(s);
    }
    @After("db()")
    public void afterSwitchDS(JoinPoint point){
        dynamicDataSourceSelector.clearDB();
    }

}
