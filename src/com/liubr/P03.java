/**
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
 * 其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，
 * 因为153=1的三次方＋    5的三次方＋3的三次方
 */
package com.liubr;

public class P03 {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int i1=i/100%10;
            int i2=i/10%10;
            int i3=i%10;
            if (Math.pow(i1,3)+Math.pow(i2,3)+Math.pow(i3,3)==i){
                System.out.println(i);
            }
        }
    }
}
