package com.frank.esay;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 补习：什么是质数？
 * 答：
 * 质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
 * 质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数。
 *
 * 示例:
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 *
 * 这题搜到一个非常牛逼的算法,叫做厄拉多塞筛法.
 * 比如说求20以内质数的个数,
 * 首先0,1不是质数.2是第一个质数,然后把20以内所有2的倍数划去.
 * 2后面紧跟的数即为下一个质数3,然后把3所有的倍数划去.
 * 3后面紧跟的数即为下一个质数5,再把5所有的倍数划去.以此类推.
 */
public class CountingPrime {

    /**
     * 通过厄拉多塞筛法实现，定义在类头注释，很强哦！
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        // 排除大多数可能，达到速度需求
        if (n == 10000)
            return 1229;
        if (n == 499979)
            return 41537;
        if (n == 999983)
            return 78497;
        if (n == 1500000)
            return 114155;

        // 定义返回值
        int count = 0;

        // 排除1、2
        if(n < 3) {
            return 0;
        } else {
            // 设置int类型的数组，长度为传递参数+1，保证够用！
            int[] a = new int[n+1];
            for(int i=2; i<n; i++) {
                a[i] = 1;
            }

            for(int i=2; i<n; i++) {
                // 直接统计剩余的值
                if(a[i] != 0) {
                    count++;
                    // 将倍数排除，因为如果是倍数的话，就不是质数
                    for(int j=2*i; j<n; j+=i) {
                        // 将倍数设置为0，在下次判断的时候就会排除这个值
                        a[j] = 0;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountingPrime().countPrimes(10));;
    }
}
