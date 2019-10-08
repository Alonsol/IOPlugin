package com.sing.mytest.annotationdemo;

import java.lang.reflect.Field;

public class BindValueProcessor {

    public static void bind(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            //通过field.getAnnotation拿到BindValue注解信息
            //method,class等都有getAnnotation方法获取注解信息
            BindValue bindValue = field.getAnnotation(BindValue.class);
            try {
                if (bindValue!=null){
                    //给field赋值为@BindValue注解上的value值
                    //如果field是private，则需要调用setAccessible
                    field.setAccessible(true);
                    field.set(object,bindValue.value());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
