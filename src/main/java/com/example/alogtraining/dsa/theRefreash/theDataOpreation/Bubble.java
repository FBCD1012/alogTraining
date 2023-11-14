package com.example.alogtraining.dsa.theRefreash.theDataOpreation;

public class Bubble {
    public static void main(String[] args) {
        int[] num = {
            3,2,4,44,55,76,7,9
        };

    }

    //计算冒泡的算法次数
    public  static void theBubble(int [] num){
        //一次操作实现
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i]-num[j]>0){
                    int temp;
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
