package com.db.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/1/1.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Resource(name = "dynamicDataSourceSelector")
    private DataSourceSelector dynamicDataSourceSelector;
    @Override
    protected Object determineCurrentLookupKey() {
        return dynamicDataSourceSelector.getRouteKey();
    }
}
