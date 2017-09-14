package com.bonovo.singletonedemo;

/**
 * Created by Administrator on 2017/8/17.
 */

public class TestSingleton {
    String Name = null;

    public TestSingleton() {
    }

    private static volatile TestSingleton instance = null;

    public static TestSingleton getTestSingleTonInstance(){
        if(instance == null){
            synchronized (TestSingleton.class) {
                if (instance == null){
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String toString(){
        return getName();
    }
}
