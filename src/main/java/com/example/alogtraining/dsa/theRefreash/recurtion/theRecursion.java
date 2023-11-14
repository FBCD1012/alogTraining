package com.example.alogtraining.dsa.theRefreash.recurtion;

public class theRecursion {
    //设置常量进行变量的操作理解，这样的操作就不会让内存空间多次赋值了
    private static int innerNum;
    private static int theMutiNum=1;
    public static void main(String[] args) {
        //过深的栈可能会导致栈溢出的情况，这和堆栈空间的数量是息息相关的！千万需要注意！
        System.out.println(theAddMethod(100));
        //堆栈空间之间的操作实现也是需要进行理解的，每一次调用函数在内存空间中都会开辟一个内存空间，如果空间开辟过多则会导致栈溢出!
        System.out.println(theMutiMethod(10));
        System.out.println(Normal(10));
    }
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
    //实现乘法的操作理解
    //阶乘的操作实现需要对数据进行限制，过大可能无法进行操作
    public static int theMutiMethod(int num){
        if (num!=0){
            theMutiNum*=num;
        }
        if (num == 0) {
            return theMutiNum;
        }
        //这是一种尾递归的理解
        return theMutiMethod(num-1);
    }
    public static int Normal(int num){
        //如何实现普通递归操作呢？
        if (num==1) {
            return 1;
        }
        int innerNum=Normal(num-1);
        return num+innerNum;
    }
}
