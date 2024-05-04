package ru.itis.inf304.Emulator;

import java.util.ArrayList;
import java.util.Collections;

public class BeginningOfWork extends BAZE {
    public BeginningOfWork(String name, int days, Thread... threads) {
        super(name, days, threads);
    }


//    private String name = "Начало работы";
//    private int days = 0;
//    ArrayList<Thread> threads;
//
//    public BeginningOfWork(Thread... threads){
//        Collections.addAll(this.threads, threads);
//    }
//
//    public void wwait(){
//        for (int i = 0; i < threads.size(); i++) {
//            try {
//                threads.get(i).join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//
//    @Override
//    public void run() {
//        wwait();
//        System.out.println("Start-> " + name);
//        try {
//            Thread.sleep(1000 * days);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("End-> " + name);
//    }
}
