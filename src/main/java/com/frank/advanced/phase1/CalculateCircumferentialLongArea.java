package com.frank.advanced.phase1;

/**
 *
 *
 * @author cy
 * @version CalculateCircumferentialLongArea.java, v 0.1 2021年09月24日 5:10 下午 cy Exp $
 */
public class CalculateCircumferentialLongArea {
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public double[] calculate(int r) {
        // write your code here
        double PI=3.14;
        double[] d= new double[2];
        // 周长等于直径乘以圆周率
        d[0]=2*PI*r;
        // PI，R的平方等于面积
        d[1]=PI*r*r;
        return d;
    }

}
