package com.itheima;

import java.util.ArrayList;

public class Hello {
	//这只是个测试类
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello,");
        arrayList.add("git");
        arrayList.add("!");
        arrayList.add("???");

        String s = "";
        for(String str : arrayList ){
            s += str;
        }
        System.out.println(s);
    }
}
