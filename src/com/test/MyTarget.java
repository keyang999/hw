package com.test;

import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  

  
@Retention(RetentionPolicy.RUNTIME)  
public @interface MyTarget{
      String value();
}  

