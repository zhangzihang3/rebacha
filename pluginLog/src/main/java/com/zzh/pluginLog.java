package com.zzh;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class pluginLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Log");
    }

    public static void main(String[] args) {
        System.out.println("日志");
    }
    public pluginLog() {
    }
}


