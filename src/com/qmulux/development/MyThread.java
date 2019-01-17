package com.qmulux.development;

public class MyThread extends Thread {
    @Override
    public void run() {
        int index = 1;

        while(true){
            System.out.println(index);
            index++;
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

            if(index>10)
                break;
        }
        System.out.println("Get out of my Thread");
    }
}
