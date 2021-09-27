package com.frank.advanced.phase2;

/**
 *
 *
 * @author cy
 * @version IsAlphanumeric.java, v 0.1 2021年09月27日 3:16 下午 cy Exp $
 */
public class IsAlphanumeric {

    /**
     * @param c: A character.
     * @return: The character is alphanumeric or not.
     */
    public static boolean isAlphanumeric(char c) {
        // write your code here
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')|| (c >= 'a' && c <= 'z');
    }


    public static void main(String[] args) {
        System.out.println(isAlphanumeric('&'));;
    }

}
