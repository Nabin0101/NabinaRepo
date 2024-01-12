package com.nextstep.demo.basic;

public class ThreadExample {

    public static void main(String[] args) {
        Runnable oddNumberRunnable = new OddNumberRunnable();
        Thread threadA = new Thread(oddNumberRunnable);
        threadA.start();
    }
}

class OddNumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i=i+2) {
            System.out.println("Thread A: " + i);
            try {
                //Delay to see output
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

