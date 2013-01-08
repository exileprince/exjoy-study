package cn.exjoy.study;

import java.util.*;

/**
 * Hello world!
 */
public class CollectionStudy {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<String>();

        set.add("123456dddd");
        set.add("123456");
        set.add("this is a string");

        Map<String,String> data = new LinkedHashMap<String, String>();

        data.put("1", "1");
        data.put("2", "2");
        data.put("3", "3");
        data.put("4", "4");

        System.out.println(data);

        System.out.println(set);

        System.out.println("Hello World!");
    }
}
