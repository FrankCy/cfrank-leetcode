package com.frank.advanced.phase2;

/**
 *
 * ASCII编码表中，A=65，a=97，以此类推，每个小写字母与大写字母间隔32，所以小写字母转大写字母，直接小写字母-32就ok，大写字母转小写字母的话就+32
 *
 * @author cy
 * @version LowercaseToUppercase.java, v 0.1 2021年09月27日 4:21 下午 cy Exp $
 */
public class LowercaseToUppercase {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        return character -= 32;
    }
}
