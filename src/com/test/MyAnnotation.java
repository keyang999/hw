package com.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
public @interface MyAnnotation  
{  
 String hello() default "gege";  
  String world();  
  int[] array() default { 2, 4, 5, 6 };  
 
  //TestAnnotation lannotation() default @TestAnnotation(value = "ddd");  
  Class style() default String.class;  
} 