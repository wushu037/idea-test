package com.mirage.java;

import java.util.HashMap;

/**
 * @author Mirage
 * @create 2019-05-19 17:58
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    HashMap<String,String> map = new HashMap<>();
    map.put("name","Tom");
    map.put("age","12");
    map.put("school","Tsinghua");
    map.put("major","computer");

    String age = map.get("age");
    System.out.println("age = " + age);

    map.remove("maioar");
    System.out.println(map);


    }



}
