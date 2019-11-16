package com.example.demo.first_day;

/**
 * Created by Lenovo on 2019/11/17.
 */
public class test_stringbuilder {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        stringBuilder.append("hhh");
                    }
                }
            }).start();
        }

        Thread.sleep(1000);

        System.out.println(stringBuilder.length());
    }

}
