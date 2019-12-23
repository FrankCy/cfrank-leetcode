package com.frank.other;

/**
 * 实现斐波那契数列的输出
 */
public class PrintFib {

    /**
     * 基本实现方式（实现一侧的输出）
     */
    public static void basicMethod() {
        //定义第一个加数a，初始值为1；定义第二个加数b，初始值为1；定义两个加数之和为c，初始值为0
        int a = 1;
        int b = 1;
        int c = 0;
        //首先在控制台打印出数列中第一个数和第二个数的值
        System.out.print(a + "\t" + b + "\t");
        //建立一个for循环，用于循环输出数列中第三位至第十位的数字
        for (int i = 3; i <= 10; i++) {
            //第三个数即为c，a+b等于c的值
            c = a + b;
            //将第一个加数a赋值为数列中的第二个数b的值
            a = b;
            //将第二个加数b赋值为数列中的第三个数c的值
            b = c;
            //在第二次循环打印时，将打印数列中的第四个数为：b + c = b + (a + b)
            System.out.print(c + "\t");
        }
    }

    /**
     * 同basicMethod的间写法
     */
    public static void basicMethodSimple() {
        int a = 1;
        int b = 1;
        for(int i = 1;i <= 5;i++) {
            //循环打印a,b两个数，即两个两个打印
            System.out.print(a + "\t" + b + "\t");
            //打印第三、四个数
            a = a + b;
            b = a + b;
        }
    }

    /**
     * 建立数组并打印的方式实现
     */
    public static void arrayMethodSimple() {
        //建立一个长度为10的数组用于存放数列中的数
        int[] arr = new int[10];
        //先定义数列中的第一个和第二个数
        arr[0] = 1;
        arr[1] = 1;
        //建立一个for循环，打印数组中的元素
        for(int i = 0;i < arr.length;i++) {
            //判断：当打印第三个数前，给第三个数赋值
            if(i > 1) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 建立一个函数，用于计算数列中的每一项
     * @param num
     * @return
     */
    public static int fib(int num) {
        //判断：是否是第一个数和第二个数
        if(num == 1 || num == 2) {
            return 1;
        }else {
            //循环调用本函数
            return fib(num - 2) + fib(num - 1);
        }
    }


    public static void main(String[] args) {
        arrayMethodSimple();

        //建立一个for循环，用于打印第一个至第十个数字
        for(int i = 1;i <= 10;i++) {
            //调用函数进行打印
            System.out.print(fib(i) + "\t");
        }
    }

}
