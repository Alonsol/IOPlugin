package com.sing.baselibrary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yy on 2019/9/10.
 * function: View注解annotation
 */

@Target(ElementType.FIELD)//代表annotation属性的位置 FIELD代表属性
@Retention(RetentionPolicy.RUNTIME)//代表什么时候生效,此处是运行时
public @interface ViewById {

    /**
     * @ViewById(R.id.test_tv)
     * @return
     */
    int value();
}
