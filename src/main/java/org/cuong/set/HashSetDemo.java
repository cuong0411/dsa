package org.cuong.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ana");
        names.add("Topson");
        names.add("Ceb");
        System.out.println(names.add("Ana"));
        System.out.println(names);
    }
}
