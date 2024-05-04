package ru.itis.inf304.Emulator;

import java.util.ArrayList;
import java.util.Collections;

public class Workers extends Thread{
    private String name;
    ArrayList<Thread> threads = new ArrayList<>();
    ArrayList<Long> times = new ArrayList<>();
    private long start = 0;
    private long end = 0;

    public Workers(String name, Thread... threads){
        this.name = name;
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
        this.start = System.currentTimeMillis();
        System.out.println("Start-> " + name);
        if(!threads.isEmpty()) wwait();
        System.out.println("End-> " + name);
        this.end = System.currentTimeMillis();
    }



    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }
    public long getTime() {
        return (end-start)/1000;
    }
}
