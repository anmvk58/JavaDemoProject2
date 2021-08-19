package com.vti.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws ParseException {
//        intInputDemo();
        convertStringToDate();
    }

    public static void intInputDemo(){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số tuổi ");
        if(scanner.hasNextInt()){
            a  = scanner.nextInt();
            System.out.println("Năm sinh của bạn là: " + (2021-a));
        } else {
            System.out.println("Bạn đã nhập sai định dạng");
        }
        scanner.close();
    }

    public static void convertStringToDate() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập vào một ngày định dạng MM-dd-yyyy:");
        String inputDate = scanner.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = simpleDateFormat.parse(inputDate);
        System.out.println("Ngày vừa nhập: " + date);

        scanner.close();
    }
}
