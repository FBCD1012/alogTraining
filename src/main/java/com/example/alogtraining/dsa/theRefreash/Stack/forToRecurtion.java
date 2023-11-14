package com.example.alogtraining.dsa.theRefreash.Stack;




//利用迭代模拟递归，利用中间栈的数据结构进行操作

import java.util.Stack;

public class forToRecurtion {
    public static void main(String[] args) {
        Long startTime=System.currentTimeMillis();
        System.out.println(recursionAdd(10));
        Long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        Long startTime1=System.currentTimeMillis();
        System.out.println(theArray(10));
        Long endTime2=System.currentTimeMillis();
        System.out.println(endTime2-startTime1);
    }
    public static int  theArray(int num){
        return ((1+num)*10)/2;
    }
    private  static  Stack<Integer> theStack=new Stack<>();
    public static int recursionAdd(int num){
        for (int i = 1; i <=num; i++) {
            theStack.push(i);
        }
        int totalSum=0;
        while (!theStack.isEmpty()){
            totalSum+=theStack.pop();
        }
        return totalSum;
    }
}
