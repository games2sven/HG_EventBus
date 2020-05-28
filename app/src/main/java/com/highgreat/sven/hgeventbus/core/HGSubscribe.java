package com.highgreat.sven.hgeventbus.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface HGSubscribe {
    //线程模式
    HGThreadMode threadMode() default HGThreadMode.POSTING;
}
