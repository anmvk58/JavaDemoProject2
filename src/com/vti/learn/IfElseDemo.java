package com.vti.learn;

public class IfElseDemo {

    public static void main(String[] args) {
        int x = 0, y = 10;

        //thực hiện lệnh rẽ nhánh
//        if( x > y ){
//            System.out.println("X lớn hơn");
//        } else if ( y > x) {
//            System.out.println("Y lớn hơn");
//        } else {
//            System.out.println("X và Y bằng nhau");
//        }

        System.out.println((x >= y) ? "X lớn hơn hoặc bằng Y" : "Y lớn hơn X");
    }
}
