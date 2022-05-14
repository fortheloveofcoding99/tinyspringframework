package com.upgrad;

public interface MathService {

    public default void operate(int x, int y){

       int z = x+y;
       System.out.println(z);

    }
}


