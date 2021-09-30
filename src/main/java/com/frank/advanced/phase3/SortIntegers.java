package com.frank.advanced.phase3;

/**
 *
 *  O(n2)
 * @author cy
 * @version SortIntegers.java, v 0.1 2021年09月30日 11:13 上午 cy Exp $
 */
public class SortIntegers {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public static void sortIntegers(int[] A) {
        // 记录临时变量
        int temp;
        // 数组大小
        int size = A.length;
        for (int i = 0; i < size - 1; i++) {
            // 索引不同的两层for循环
            for (int j = i + 1; j < size; j++) {
                // 交互数据从大到小排列顺序  大的放前面
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        int[] A = {5,4,6,3,4,1};
        while (true) {
            sortIntegers(A);
        }
    }
}
