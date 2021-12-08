package com.kuang.reflection;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        int bai,shi,ge;
        Scanner in=new Scanner(System.in);
        int zong = 0;
        while( in.hasNext())
        {
            zong = 0;
            num = in.nextInt();
            bai = num/100;
            shi = num % 100 / 10;
            ge = num%10;
            zong = bai*bai*bai+shi*shi*shi+ge*ge*ge;
            System.out.print(zong);
        }

    }
}