package com.fzg.myspring;

public class Test {
    public static void main(String[] args) {
        MyAnnotationConfigApplicationContext context = new MyAnnotationConfigApplicationContext("com.fzg.myspring.entity");
        System.out.println("account===="+context.getBean("account"));
        System.out.println("order======"+context.getBean("myOrder"));
    }
}
