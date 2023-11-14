package com.example.alogtraining.dsa.theRefreash.recurtion;

import java.util.ArrayList;
import java.util.Arrays;

public class FibRecursion {
    /*给定一个斐波那契数列 0, 1, 1, 2, 3, 5, 8, 13, … ，求该数列的第 𝑛 个数字。
        设斐波那契数列的第 𝑛 个数字为 𝑓(𝑛) ，易得两个结论。
        ‧ 数列的前两个数字为 𝑓(1) = 0 和 𝑓(2) = 1 。
        ‧ 数列中的每个数字是前两个数字的和，即 𝑓(𝑛) = 𝑓(𝑛 − 1) + 𝑓(𝑛 − 2) 。
        按照递推关系进行递归调用，将前两个数字作为终止条件，便可写出递归代码。调用 fib(n) 即可得到斐波那
        契数列的第 𝑛 个数字。

    **/
    public static void main(String[] args) {
        System.out.println(theFibRecursion(5));
        System.out.println(Arrays.toString(theFibRecursionArray(10)));
        System.out.println(theFibRecursionToGetIt(10));
    }
    public static int theFibRecursion(int num){
        if (num==1){
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return theFibRecursion(num-1)+theFibRecursion(num-2);
    }

    public static int theFibRecursionToGetIt(int num) {
        if (num == 1 || num == 2){
            return num-1;
        }
        int res=theFibRecursionToGetIt(num-1)+theFibRecursionToGetIt(num-2);
        return res;
    }
    public static Object[] theFibRecursionArray(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        //此处参数的i不能为0
        for (int i = 1; i <= num; i++) {
            int i1 = theFibRecursion(i);
            arr.add(i1);
        }
        return arr.toArray();
    }
    public static void theFibRecursionData(int num){
        for (int i = 1; i <= num; i++) {
            int i1=theFibRecursion(i);
            System.out.print(i1+" ");
        }
    }
}
