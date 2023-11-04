package com.example.alogtraining.dsa.theRefreash.recurtion;

public class theRecurtion {
    public static void main(String[] args) {
        System.out.println(theAddMethod(100));
    }
    private static int innerNum;
    public static int theAddMethod(int num){
        //递归操作，如何实现此处的理解呢？
        //递 数据先递 归 数据后归还
        innerNum+=num;
        if (num==0){
            return innerNum;
        }
        //返回值操作自动将此处的代码进行忽略了，始终会对其中的操作进行理解的
        return theAddMethod(num-1);
    }
}
