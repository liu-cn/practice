/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
package com.liubr;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要被分解的质因数：");
        int num = input.nextInt();
        System.out.print(num + "=");
        for (int i = 2; i < num + 1; i++) {
            while (num % i == 0 && num != i) {
                num = num / i;
                System.out.print(i + "*");
            }
            if (num == i) {
                System.out.println(i);
                break;
            }
        }
    }
}
