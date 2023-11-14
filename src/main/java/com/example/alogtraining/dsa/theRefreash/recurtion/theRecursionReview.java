package com.example.alogtraining.dsa.theRefreash.recurtion;

public class theRecursionReview{
    public static void main(String[] args) {
        //计算10以内奇数的阶乘
        //利用两种递归操作
        System.out.println(theNormallyRecursion(10));
        System.out.println(theTailRecursion(10));
    }
    //普通递归
    public static int theNormallyRecursion(int num){
        //先实现普通阶乘操作
        if (num ==1){
            return num;
        }
        int Normal= theNormallyRecursion(num-1);
        return Normal*num;
    }

    private static  int Normal=1;
    public static int theTailRecursion(int num){
        if (num == 1) {
            return Normal;
        }
        Normal=Normal*num;
        return theTailRecursion(num-1);
    }
}
