package com.driver;

public class Main {
    public static void main (String[]args){
        RWOnly obj=new RWOnly();
//        obj.name="tushar";
//        java: name has private access in com.driver.RWOnly
        obj.setName("tushar");
        System.out.println(obj.getName());
    }
}