package com.test;  

import java.lang.reflect.Method;

public class MyTargetTest  
{  
 @MyTarget(value = "")  
 public void doSomething()  
 {  
  System.out.println("hello world");  
 }  
 
 @Override
 public String toString(){
	 System.out.println("123");
	 return "123";
 }
 
 public static void main(String[] args) throws SecurityException, NoSuchMethodException  
 {  
  Method method = MyTargetTest.class.getMethod("doSomething",null);  
  if(method.isAnnotationPresent(MyTarget.class))//���doSomething�����ϴ���ע��@MyTarget����Ϊtrue  
  {  
   System.out.println(method.getAnnotation(MyTarget.class));  
  
  }  
  }  
}  