package me.mina.lab11;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyCache myCache = new MyCache();
        for(int i = 0; i < 5; i++){
            myCache.addObject("init_key" + i, "value" + i, 1000);
        }
        myCache.start();
        for (int i = 0; i < 100; i++) {
            myCache.addObject("key" + i, "value" + i, 200);
//            myCache.printCache();
            Thread.sleep(100);
        }


    }
}
