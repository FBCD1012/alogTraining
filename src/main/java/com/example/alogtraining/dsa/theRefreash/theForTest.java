package com.example.alogtraining.dsa.theRefreash;

public class theForTest {
    public static void main(String[] args) {
        //求和算法的抽象理解
        System.out.println(ForInput(300));
        System.out.println(WhileInput(300));
        //程序的本质就是数学，利用数学来解释相关的问题是优质且必要的
        System.out.println(theDataInput(300));
    }
    //利用for循环进行求和运算
    public static int ForInput(int numLength){
        int sum=0;
        for (int i = 1; i <=numLength; i++) {
            //+=相当于是sum=sum+i
            //忽略了变量的操作
            sum+=i;
        }
        return sum;
    }
    public static int WhileInput(int numLength){
        int num=1;
        int sum=0;
        while (num<=numLength){
            sum+=num;
            num++;
            //两轮的灵活更新操作理解
            num*=2;
        }
        return sum;
    }
    public static  int theDataInput(int numLength){
        //等差数列求和操作，当然可以实现数列操作！
        return (1+numLength)*numLength/2;
    }
}
