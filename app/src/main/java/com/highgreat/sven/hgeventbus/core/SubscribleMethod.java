package com.highgreat.sven.hgeventbus.core;

import java.lang.reflect.Method;

//注册类中的注册方法信息
public class SubscribleMethod {
    //注册方法
    private Method method;
    //线程类型
    private HGThreadMode threadMode;

    //参数类型
    private Class<?> eventType;

    public SubscribleMethod(Method method, HGThreadMode threadMode, Class<?> eventType) {
        this.method = method;
        this.threadMode = threadMode;
        this.eventType = eventType;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public HGThreadMode getThreadMode() {
        return threadMode;
    }

    public void setThreadMode(HGThreadMode threadMode) {
        this.threadMode = threadMode;
    }

    public Class<?> getEventType() {
        return eventType;
    }

    public void setEventType(Class<?> eventType) {
        this.eventType = eventType;
    }
}
