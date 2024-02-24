package org.cuong.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddTo100 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(50);
        list.add(90);
        list.add(1);
        // System.out.println(func(list));
        System.out.println(func2(list));

        // Map<Integer, Integer> memo = new HashMap<>();
        // System.out.println(func(list, memo));
    }

    static int func(List<Integer> a) {
        if (a.isEmpty())
            return 0;
        if (a.get(0) + func(a.subList(1, a.size())) > 100) {
            return func(a.subList(1, a.size()));
        } else {
            return a.get(0) + func(a.subList(1, a.size()));
        }
    }

    static int func2(List<Integer> a) {
        if (a.isEmpty()) {
            return 0;
        }
        int sumOfRemainingNumber = func(a.subList(1, a.size()));
        if (a.get(0) + sumOfRemainingNumber > 100) {
            return sumOfRemainingNumber;
        } else {
            return a.get(0) + sumOfRemainingNumber;
        }
    }

    /*
     * overthinking
     */
    static int func(List<Integer> a, Map<Integer, Integer> memo) {
        if (a.isEmpty()) {
            return 0;
        }
        if (memo.get(a.size()) == null) {
            memo.put(a.size(), func(a.subList(1, a.size()), memo));
        }
        if (a.get(0) + memo.get(a.size()) > 100) {
            return memo.get(a.size());
        } else {
            return a.get(0) + memo.get(a.size());
        }
    }
}
