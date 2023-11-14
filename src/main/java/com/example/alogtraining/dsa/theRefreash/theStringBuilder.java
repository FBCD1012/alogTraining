package com.example.alogtraining.dsa.theRefreash;

public class theStringBuilder {
    public static void main(String[] args) {
        System.out.println(theStringBuilderMethod(300));
    }
    public static String  theStringBuilderMethod(int theNumLength){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < theNumLength; i++) {
            //保持状态的循环操作，此处的循环理解是需要进行理解的，i=0等到内层循环操作完毕了之后再进行外部更新
            for (int j = 0; j < theNumLength; j++) {
                stringBuilder.append("("+i+","+j+")");
            }
        }
        return stringBuilder.toString();
    }
}
