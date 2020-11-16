/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 */

package com.liubr;

public class P02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=101;i<=200;i++){
            for (int n=2;n<i-1;n++){
                if (i % n ==0){
                    break;
                }else {
                    if (n==i-2){
                        System.out.println("质数："+i);
                        sum++;
                    }
                }
            }
        }
        System.out.println("总数为："+sum);
    }
}
