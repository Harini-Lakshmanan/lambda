package com.io.lambdas;

public class MethodReferenceEx1 {
    public static void main(String[] args) {
        Thread t = new Thread(MethodReferenceEx1::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello..");
    }
}
