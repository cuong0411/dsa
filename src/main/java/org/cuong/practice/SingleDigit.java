package org.cuong.practice;

public class SingleDigit {
    public static void main(String[] args) {
        System.out.println(singleDigit(57));
    }

    static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int singleDigit(int n) {
        int result = sumDigits(n);
        if (result < 10)
            return result;
        return sumDigits(result);
    }
}
