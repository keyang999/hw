package com.test;

import java.math.BigDecimal;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=  9.29;
		double d2=100;
		System.out.println(d);
		System.out.println(d2);
		
		BigDecimal b1=new BigDecimal(Double.toString(d));
	    BigDecimal b2=new BigDecimal(Double.toString(d2));
	      
	    System.out.println(b1);
	    System.out.println(b2);
	    System.out.println( b1.multiply(b2).doubleValue());

	}

}
