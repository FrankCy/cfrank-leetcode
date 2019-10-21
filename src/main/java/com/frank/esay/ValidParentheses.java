package com.frank.esay;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidParentheses {

    /**
     * 解题思路：
     * - 使用后进先出的Stack栈对象
     * - 将括号字符串转换为charArray
     * - 迭代数组，将首次迭代的值放入栈头
     * - 非首次迭代时，获取栈头保存的char，与当前迭代char进行比较，是否是"结对"的括号，如果是，则删除栈头，进行下次的比较，如果不是，将当前迭代子放入栈头
     * - 注意：这种解法的思路是判断左右括号是否对称，所以栈头是右边的括号就绝对是false，isSym的判断就是一定要左括号与右括号结对！
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        // Stack 后进先出的栈
        Stack<Character> stack = new Stack<Character>();
        // 将字符串转换为char类型的数组
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stack.size() == 0) {
                stack.push(aChar);
            } else
            if ( // peek:查看堆栈顶部的对象，但不从堆栈中移除它。
                isSym(stack.peek(), aChar)) {
                // pop:移除堆栈顶部的对象，并作为此函数的值返回该对象。
                stack.pop();
            } else {
                // push:把项压入堆栈顶部。
                stack.push(aChar);
            }
        }
        return stack.size() == 0;
    }

    private boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') ||
                (c1 == '[' && c2 == ']') ||
                (c1 == '{' && c2 == '}');
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{[}"));
        System.out.println("{}{}{}[]".toCharArray());
    }
}
