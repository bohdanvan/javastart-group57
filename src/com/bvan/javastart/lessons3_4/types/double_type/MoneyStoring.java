package com.bvan.javastart.lessons3_4.types.double_type;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 260423449;
        double moneyForOutput = (double)money/10_000_000;

        System.out.println(moneyForOutput);
    }
}
