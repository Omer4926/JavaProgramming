package day32_Constructor;

import day25_CustomMethods_Overloading.MainMethodOverloading;

public class Test {

    public Test(){// A
        System.out.println("A");
    }

    public Test(int a){// A B
        this();
        System.out.println("B");
    }

    public Test(double a){ // A B C
        this(10);
        System.out.println("C");
    }
    public Test(String str){// A B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java");
    }
}
