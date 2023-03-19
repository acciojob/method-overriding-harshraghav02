package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        String a = b.meth();
        System.out.println(a);
        String c = b.meth();
        System.out.println(c);

    }

    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }

    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
}


