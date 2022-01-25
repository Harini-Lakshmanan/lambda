package com.io.lambdas;

public class ClosuresExample {
    public static void main(String[] args) {
    int a=10;
    doProcess(a, p-> System.out.println(p));
    }

    public static void doProcess(int i,Process p){
        p.process(i);
    }

    interface Process{
        void process(int i);
    }
}
