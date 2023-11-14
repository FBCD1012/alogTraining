package com.example.alogtraining.dsa;

public class whileTest {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        //此处的判定条件是ture再进行操作 false就不进行操作
        while (n<=200){
            sum+=n;
            n++;
        }
        System.out.println(sum);
    }
}
