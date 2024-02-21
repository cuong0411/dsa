package org.cuong.intro;

public class IntroToDsa {
    public static void main(String[] args) {
        var demo = new TimeComplexityDemo();

        long now = System.currentTimeMillis();
        System.out.println(demo.findSum2(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milisecs.");
    }
}

class TimeComplexityDemo {
    long findSum(int n) {
        return (long) n * (n + 1) / 2;
    }

    long findSum2(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}