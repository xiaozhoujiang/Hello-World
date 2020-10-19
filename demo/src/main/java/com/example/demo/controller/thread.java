package com.example.demo.controller;

//public class thread {
//        public static void main(String [] args){
//            Thread Xc1 = new Thread(new ThreadController());//模拟两个车站在卖车票，竞争共同的线程资源
//            Xc1.start();
//            Thread Xc2 = new Thread(new ThreadController());//模拟两个车站在卖车票，竞争共同的线程资源
//            Xc2.start();
//
//    }
//}

public class thread extends Thread {
    public thread(String name) {
        this.name = name;
    }

    private String name;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}





