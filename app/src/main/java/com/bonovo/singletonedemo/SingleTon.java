package com.bonovo.singletonedemo;

/**
 * Created by Administrator on 2017/8/17.
 */

public class SingleTon {
    private static SingleTon singleTon;
    public SingleTon() {
    }
 //懒汉式，线程非安全
    public static SingleTon getSingleTonInsatance(){
        if (singleTon == null){
           singleTon = new SingleTon();
        }
        return singleTon;
  }


  //懒汉式，线程安全 ,耗费资源
    public static  synchronized SingleTon getInstance(){
       if (singleTon == null){
           singleTon = new SingleTon();
       }
      return  singleTon;
    }


    //懒汉式，线程安全，第一次加载是同步,优先使用
    public static  SingleTon getInstanceSingleton(){
        if (singleTon == null){
            synchronized (SingleTon.class){
                if (singleTon==null){
                    singleTon = new SingleTon();
                }
            }
        }
        return  singleTon;
    }


    private static  SingleTon INSTANCE = new SingleTon();

    //饿汉式，天生线程安全
    public static SingleTon getSingletoneInstance(){
        return INSTANCE;
    }

}