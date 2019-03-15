package com.db.datasource;

/**
 * Created by Administrator on 2019/1/1.
 */
public class DataSourceSelector {

    private static ThreadLocal<String> localRouteKey = new ThreadLocal<String>();

    public void setRouteKey(String routeKey){
        localRouteKey.set(routeKey);
    }

    public String getRouteKey(){
        return localRouteKey.get();
    }

    public void clearDB(){
        localRouteKey.remove();
    }

}
