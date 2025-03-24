package com.Venkat.junitdemo;

import java.util.List;

public class DemoUtils {

    private String name = "Venkat";
    private String nameDuplicate = name;
    private String[] myName = {"Mani", "Venkat", "K"};
    private List<String> myNameinList = List.of("Mani", "Venkat", "K");

    public List<String> getMyNameinList() {
        return myNameinList;
    }

    public String getName() {
        return name;
    }

    public String getNameDuplicate() {
        return nameDuplicate;
    }

    public String[] getMyName() {
        return myName;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public Object checkNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        return null;
    }

    public Boolean isGreater(int n1, int n2) {
        if (n1 > n2) {
            return true;
        }
        return false;
    }

    public String throwException(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Value should be greater than or equal to 0");
        }
        return "Value is greater than or equal to 0";
    }

    public void checkTimeout() throws InterruptedException {
        System.out.println("I am going to sleep");
        Thread.sleep(2000);
        System.out.println("Sleeping over");
    }

}
