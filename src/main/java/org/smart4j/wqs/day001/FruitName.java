package org.smart4j.wqs.day001;

import java.lang.annotation.*;

/**
 * FruitName
 *
 * @Title: FruitName.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-12 17:34
 * @Author 90
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented  //@Documented：用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化
public @interface FruitName {
    String value() default "";
}
