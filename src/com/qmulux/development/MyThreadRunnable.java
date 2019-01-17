package com.qmulux.development;

public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        int index = 100;
        while(true){
            System.out.println(index);
            index++;
            if(index>110)
                break;
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("get out from Thread Runnable");
    }
}
