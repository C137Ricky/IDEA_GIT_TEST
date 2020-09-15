package sort;

import java.util.Scanner;

public class Test123 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a number:");
        num=sc.nextInt();
        char a[]=new char[8];
        int len=a.length-1;
        for(int i=0;i<8;i++) {//内存中最大数位为32位，八个十六进制位，所以最多循环八次
            int n=num%16;
            if(n>9)
                a[len]=(char)(n-10+'A');//最好不要使用a[i],数字是反的
            else
                a[len]=(char)(n+'0');
            len--;
            num=num>>>4;
        }
        System.out.print("the final result is: 0x");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]);//输出结果为0x形式
        }
    }
}

