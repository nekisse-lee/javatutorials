package org.opentutorials.javatutorials.ch6Class.sec15_annotation.exam01_anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;

}
