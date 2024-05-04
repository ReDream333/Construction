package ru.itis.inf304.Emulator;

import java.util.ArrayList;
import java.util.Collections;

public class BAZE extends Thread {
    private String name;
    private int days;
    ArrayList<Thread> threads = new ArrayList<>();

    public BAZE(String name, int days, Thread... threads){
        this.name = name;
        this.days = days;
        if(threads != null){Collections.addAll(this.threads, threads);}
    }

    public void wwait(){
        for (int i = 0; i < threads.size(); i++) {
            try {
                threads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {

        if(!threads.isEmpty()) wwait();

        System.out.println("Start-> " + name);
        try {
            Thread.sleep(1000 * days);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End-> " + name);

    }

}
