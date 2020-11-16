/**
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
package com.liubr;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("请输入学习成绩：");
        int num = input.nextInt();

        if (num<0||num>100){
            System.out.println("您输入的成绩不合法，请重新输入！");
        }else {
            String score = num>=90?"A":num>=60?"B":"C";
            System.out.println("您的成绩为："+score);
        }
    }
}
