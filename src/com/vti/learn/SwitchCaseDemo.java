package com.vti.learn;

public class SwitchCaseDemo {
    public static void main(String[] args) {
//        switchCaseDemo();
//        forLoop();
//        foreachLoop();
//        whileLoop();
//        doWhileLoop();
        tinhtong( 100, 1);
    }

    public static void switchCaseDemo(){
        int x = 15;

        switch (x) {
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            default:
                System.out.println("Chỉ hỗ trợ số từ 1 -> 5");
                break;
        }
    }

    public static void forLoop(){
        //in ra từ 1 đến 10
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }

    public static void foreachLoop(){
        int[] diems = {1, 3, 5, 7, 9};

        for (int a: diems) {
            System.out.println(a);
        }
    }

    public static void whileLoop(){
        int x = 1;
        while (x <= 10){
            System.out.println(x);
            x++;
        }
    }

    public static void doWhileLoop(){
        int x = 1;
        do {
            System.out.println("Lần lặp thứ: " + x);
        } while (x < 1);
    }

    public static void tinhtong(int a, int b){
        System.out.println(a + b);
    }
}
