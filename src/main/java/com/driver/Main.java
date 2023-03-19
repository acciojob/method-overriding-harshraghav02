package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        String a = b.meth();
        System.out.println(a);
        String c = b.meth();
        System.out.println(c);

    }
}

