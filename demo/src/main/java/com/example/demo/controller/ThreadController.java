//package com.example.demo.controller;
//
//public class ThreadController  {
//    public static int count;
//
//
//    public void test() throws InterruptedException{
//        ThreadOne[] threads = new ThreadOne[1000];
//        for(int i =0 ;i<100;i++){
//            threads[i] = new ThreadOne();
//            threads[i].start();
//        }
//        for(int j=0;j<100;j++){
//            threads[j].join();
//        }
//        System.out.println(count);
//    }
//
////    public static int ticket = 100;
////    @Override
////    public void run(){
////        while (true) {
////            synchronized (" ") {//在需要加锁保证完整运行的代码块旁边加上synchronized (" "){}包裹代码，即可锁起来该部分代码，()内的字符串随意定义
////                if(ticket>0){
////                    System.out.println("第" + Thread.currentThread().getName() + "个车站正在卖出第" + (101-ticket) + "张车票");
////                    --ticket;
////                }else{
////                    break;
////                }
////            }
////        }
////    }
////}
//
//
//    static class ThreadOne extends Thread {
//        @Override
//        public void run() {
//            try {
//                this.sleep((long) (Math.random() * 200));
//                count++;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}




